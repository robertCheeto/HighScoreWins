package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the two team names and score in the exact example format below.");
        System.out.print("Home:Away|21:9 ");
        String boxScoreInput = keyboard.nextLine();

        String boxScoreInfo[] = boxScoreInput.split("\\|");
        String teamNames[] = boxScoreInfo.split("\\:");
        String teamScores[] = boxScoreInfo.split("\\:");

        System.out.println(teamNames[0] + "<- team names | scores -> " + teamScores[0]);

    } // end main
}
