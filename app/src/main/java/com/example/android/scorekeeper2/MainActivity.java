package com.example.android.scorekeeper2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // global variables for home and guest scores
    int homeScore = 0;
    int guestScore = 0;
    //global variables for the home and guest TextViews
    TextView homeScoreTextView;
    TextView guestScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // assign values to the textView variables
        homeScoreTextView = (TextView) findViewById(R.id.homeScoreTextView);
        guestScoreTextView = (TextView) findViewById(R.id.guestScoreTextView);
    }

    /**
     * add 5 to homeScore
     */
    public void addFiveHome(View v) {
        homeScore += 5;
        displayHomeScore();
    }

    /**
     * add 3 to homeScore
     */
    public void addThreeHome(View v) {
        homeScore += 3;
        displayHomeScore();
    }

    /**
     * add 2 to homeScore
     */
    public void addTwoHome(View v) {
        homeScore += 2;
        displayHomeScore();
    }

    /**
     * add 5 to guestScore
     */
    public void addFiveGuest(View v) {
        guestScore += 5;
        displayGuestScore();
    }

    /**
     * add 3 to guestScore
     */
    public void addThreeGuest(View v) {
        guestScore += 3;
        displayGuestScore();
    }

    /**
     * add 2 to guestScore
     */
    public void addTwoGuest(View v) {
        guestScore += 2;
        displayGuestScore();
    }

    /**
     * set score variables to zero and update the displayed values
     */
    public void resetGame(View v) {
        homeScore = 0;
        guestScore = 0;
        displayHomeScore();
        displayGuestScore();
    }

    /**
     * update the home score textview with the current value of homeScore
     */
    private void displayHomeScore() {
        homeScoreTextView.setText(String.valueOf(homeScore));
    }

    /**
     * update the guest score TextView with the current value of guestScore
     */
    private void displayGuestScore() {
        guestScoreTextView.setText(String.valueOf(guestScore));
    }

    /**
     * save the current homeScore and guestScore variable values
     * if the configuration changes or the activity is destroyed
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("homeScore", homeScore);
        outState.putInt("guestScore", guestScore);
    }

    /**
     * restore the homeScore and guestScore variables and the values shown
     * in the respective TextViews
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        homeScore = savedInstanceState.getInt("homeScore");
        guestScore = savedInstanceState.getInt("guestScore");
        displayHomeScore();
        displayGuestScore();
    }

}


