package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    // Initially set points for both teams to 0

    public static class Team {
        int teamPoints = 0;

        public void setPoints(int points) {teamPoints = points; }
        public int getPoints() {return teamPoints; }
    }

    Team teamA = new Team();
    Team teamB = new Team();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected int add3PtsToTeam(Team myTeam){
        myTeam.setPoints(myTeam.getPoints()+3);
        return (myTeam.getPoints());
    }
    protected int add2PtsToTeam(Team myTeam){
        myTeam.setPoints(myTeam.getPoints()+2);
        return (myTeam.getPoints());
    }
    protected int addFreeThrowToTeam(Team myTeam){
        myTeam.setPoints(myTeam.getPoints()+1);
        return (myTeam.getPoints());
    }
    protected void resetPoints(){
        teamA.setPoints(0);
        teamB.setPoints(0);
    }
    private void displayScoreTeamA(int number) {
        TextView numPtsA = (TextView) findViewById(R.id.numPtsA);
        numPtsA.setText(NumberFormat.getNumberInstance().format(number));
    }
    private void displayScoreTeamB(int number) {
        TextView numPtsB = (TextView) findViewById(R.id.numPtsB);
        numPtsB.setText(NumberFormat.getNumberInstance().format(number));
    }
    /**
     * These methods are called when the Team A buttons are clicked.
     */
    public void teamA3PtButton(View view) {
        displayScoreTeamA(this.add3PtsToTeam(teamA));
    }
    public void teamA2PtButton(View view) {
        displayScoreTeamA(this.add2PtsToTeam(teamA));
    }
    public void teamAFreeThrowButton(View view) {
        displayScoreTeamA(this.addFreeThrowToTeam(teamA));
    }

    /**
     * These methods are called when the Team B buttons are clicked.
     */
    public void teamB3PtButton(View view) {
        displayScoreTeamB(this.add3PtsToTeam(teamB));
    }
    public void teamB2PtButton(View view) {
        displayScoreTeamB(this.add2PtsToTeam(teamB));
    }
    public void teamBFreeThrowButton(View view) {
        displayScoreTeamB(this.addFreeThrowToTeam(teamB));
    }

    /**
     * These methods are called when the Reset button is clicked.
     */
    public void resetButton(View view) {
        this.resetPoints();
        displayScoreTeamA(teamA.getPoints());
        displayScoreTeamB(teamB.getPoints());
    }


}
