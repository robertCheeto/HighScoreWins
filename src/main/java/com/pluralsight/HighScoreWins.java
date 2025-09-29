package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the two team names and score in the exact example format below.");
        System.out.print("\"Home:Away|21:9\" - ");
        String boxScoreInput = keyboard.nextLine();

        String boxScoreInfo[] = boxScoreInput.split("\\|");
        String[] teamNames = boxScoreInfo[0].split("\\:");
        String[] teamScores = boxScoreInfo[1].split("\\:");

        // below is a test statement to see if the boxScoreInfo[] was able to be broken into two separate arrays
        //System.out.println(teamNames[0] + " " + teamNames[1] + "<- team names | scores -> " + teamScores[0] + " " + teamScores[1]);

        //converting scores to Ints
        int homeTeamScore = Integer.parseInt(teamScores[0]);
        int awayTeamScore = Integer.parseInt(teamScores[1]);

        if (homeTeamScore > awayTeamScore) {
            System.out.printf("Winner: %s\nFinal Score: %d-%d", teamNames[0], homeTeamScore, awayTeamScore);
        } // end of if statement
        else if (homeTeamScore < awayTeamScore) {
            System.out.printf("Winner: %s\nFinal Score: %d-%d", teamNames[1], awayTeamScore, homeTeamScore);
        } // end of else if
        else {
            System.out.printf("Both teams tied at: %d-%d", homeTeamScore, awayTeamScore);
        } // end of else

    } // end main
}
