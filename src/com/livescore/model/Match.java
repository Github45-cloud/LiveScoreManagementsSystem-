/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.livescore.model;

/**
 *
 * @author Lenovo
 */
import java.util.List;
import java.util.ArrayList;

public class Match {
    // Static list to store all matches
    public static List<Match> matches = new ArrayList<>();
    
    private String matchId;
    private String team1;
    private int team1Score;
    private String team2;
    private int team2Score;
    private String status;
    private String venue;

    // Constructor
    public Match(String matchId, String team1, int team1Score, String team2, int team2Score, String status, String venue) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team1Score = team1Score;
        this.team2 = team2;
        this.team2Score = team2Score;
        this.status = status;
        this.venue = venue;
    }
    
    

    // Getters for the match data
    public String getMatchId() { return matchId; }
    public String getTeam1() { return team1; }
    public int getTeam1Score() { return team1Score; }
    public String getTeam2() { return team2; }
    public int getTeam2Score() { return team2Score; }
    public String getStatus() { return status; }
    public String getVenue() { return venue; }
    
    public void setTeam1Score(int team1Score) {
    this.team1Score = team1Score;
}

    public void setTeam2Score(int team2Score) {
    this.team2Score = team2Score;
}

public void setStatus(String status) {
    this.status = status;
}

    
}

    

