/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.livescore.util;

import java.util.regex.Pattern;

public class ValidationUtil {

    // Regular expression patterns
    private static final Pattern TEAM_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$"); // Only letters and spaces
    private static final Pattern MATCH_ID_PATTERN = Pattern.compile("^\\d{2,5}$"); // Match IDs with 2-5 digits
    private static final Pattern SCORE_PATTERN = Pattern.compile("^\\d+$"); // Only positive integers for scores

    /**
     * Validates if a string is null or empty.
     *
     * @param value the string to validate
     * @return true if the string is null or empty, otherwise false
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Validates if the team name contains only alphabets and spaces.
     *
     * @param teamName the team name to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidTeamName(String teamName) {
        return !isNullOrEmpty(teamName) && TEAM_NAME_PATTERN.matcher(teamName).matches();
    }

    /**
     * Validates if the match ID contains 5-10 digits.
     *
     * @param matchId the match ID to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidMatchId(String matchId) {
        return !isNullOrEmpty(matchId) && MATCH_ID_PATTERN.matcher(matchId).matches();
    }

    /**
     * Validates if the score is a positive integer.
     *
     * @param score the score to validate
     * @return true if valid, otherwise false
     */
    public static boolean isValidScore(String score) {
        return !isNullOrEmpty(score) && SCORE_PATTERN.matcher(score).matches();
    }

    /**
     * Generic field validation utility that checks for non-empty and specific criteria.
     *
     * @param value      the field value to validate
     * @param isCriteria the specific criteria to validate against
     * @return true if both non-empty and criteria validation pass, otherwise false
     */
    public static boolean validateField(String value, boolean isCriteria) {
        return !isNullOrEmpty(value) && isCriteria;
    }
    // Check if the input is empty
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    // Validate if a string contains only numeric characters
    public static boolean isNumeric(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validate if scores are non-negative integers
    public static boolean areScoresValid(int score1, int score2) {
        return score1 >= 0 && score2 >= 0;
    }
    
    // Check if the team name contains any numbers
    public static boolean containsNumbers(String input) {
        return input.matches(".*\\d.*");  // Regex checks for any digits in the string
    }
    
}
