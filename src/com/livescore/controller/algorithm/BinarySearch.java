package com.livescore.controller.algorithm;

import java.util.List;
import com.livescore.model.Match;

public class BinarySearch {
    public static Match search(List<Match> matches, String searchQuery, String searchField) {
        int left = 0;
        int right = matches.size() - 1;
        // Perform binary search based on the search field (matchId, team1, team2)
        while (left <= right) {
            int mid = left + (right - left) / 2;
            Match midMatch = matches.get(mid);
            String midField = "";
            // Determine the field to compare
            if (searchField.equalsIgnoreCase("matchId")) {
                midField = midMatch.getMatchId();
            } else if (searchField.equalsIgnoreCase("team1")) {
                midField = midMatch.getTeam1();
            } else if (searchField.equalsIgnoreCase("team2")) {
                midField = midMatch.getTeam2();
            }
            // Compare the midField with the search query
            if (midField.equalsIgnoreCase(searchQuery)) {
                return midMatch; // Match found
            } else if (midField.compareToIgnoreCase(searchQuery) < 0) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return null; // No match found
    }
}
