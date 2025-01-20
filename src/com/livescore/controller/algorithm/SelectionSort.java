/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.livescore.controller.algorithm;
import java.util.List;
import com.livescore.model.Match; 

/**
 *
 * @author Lenovo
 */

public class SelectionSort {
    // Ascending order
    public static void sortAscending(List<Match> matches) {
        // Sorting logic for ascending order
        for (int i = 0; i < matches.size() - 1; i++) {
            for (int j = i + 1; j < matches.size(); j++) {
                if (matches.get(i).getMatchId().compareTo(matches.get(j).getMatchId()) > 0) {
                    // Swap the elements
                    Match temp = matches.get(i);
                    matches.set(i, matches.get(j));
                    matches.set(j, temp);
                }
            }
        }
    }

    // Descending order
    public static void sortDescending(List<Match> matches) {
        // Sorting logic for descending order
        for (int i = 0; i < matches.size() - 1; i++) {
            for (int j = i + 1; j < matches.size(); j++) {
                if (matches.get(i).getMatchId().compareTo(matches.get(j).getMatchId()) < 0) {
                    // Swap the elements
                    Match temp = matches.get(i);
                    matches.set(i, matches.get(j));
                    matches.set(j, temp);
                }
            }
        }
    }
}

