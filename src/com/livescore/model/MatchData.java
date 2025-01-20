/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.livescore.model;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;


public class MatchData {
    // A static list to hold all match data
    private static List<Match> matches = new ArrayList<>();
    
    static {
        // Add predefined matches
        matches.add(new Match("004", "FCB", 10, "RM", 0, "Completed", "Camp nou"));
        matches.add(new Match("003", "MU", 1, "MC", 8, "Live", "Etihad"));
        matches.add(new Match("006", "BM", 3, "LFC", 5, "Completed", "Anfield"));
    }


    public static void addMatch(Match match) {
        matches.add(match);
    }
    
    public static Match getMatchById(String matchId) {
        for (Match match : matches) {
            if (match.getMatchId().equals(matchId)) {
                return match;  // Return the match if the matchId matches
            }
        }
        return null;  // Return null if no match is found
    }

    public static List<Match> getAllMatches() {
        return matches;
    }
}


    
