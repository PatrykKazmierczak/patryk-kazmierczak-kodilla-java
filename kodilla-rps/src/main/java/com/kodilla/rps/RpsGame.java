package com.kodilla.rps;


import java.util.Scanner;

import static com.kodilla.rps.ComputerSelection.ROCK;
import static com.kodilla.rps.UserSelection.PAPER;
import static com.kodilla.rps.UserSelection.SCISSORS;
import static com.kodilla.rps.Winner.*;

public class RpsGame {

    private Winner selectWinner;
    private int computerScore;
    private int humanScore;
    private UserSelection computerSelection;
    private UserSelection userSelection;


    public int playGame() {

        System.out.println("Welcome in the game");
        System.out.println("Enter number of games to win");
        Scanner scanner1 = new Scanner(System.in);
        int winsToEnd = scanner1.nextInt();

        System.out.println("Enter name of the player");
        Scanner scanner2 = new Scanner(System.in);
        String playerName = scanner2.nextLine();

        System.out.println("New game start");
        System.out.println(RpsDialog.getNumberOfRounds());
        System.out.println("User selection: " + RpsDialog.getUserSelection());
        System.out.println("Computer selection: " + RpsDialog.getComputerSelection());
        System.out.println("The winner is: ");


        Winner winner = selectWinner(computerSelection, userSelection);
        if (winner == COMPUTER) {
            computerScore++;
        } else if (winner == HUMAN) {
            humanScore++;
        } else {
            computerScore++;
            humanScore++;
        }
        return winsToEnd;
    }

    private Winner selectWinner(UserSelection computerSelection, UserSelection userSelection) {
        if (userSelection == ROCK) {
            return computeWinnerWhenUserRock(computerSelection);
        } else if (userSelection == PAPER) {
            return computeWinnerWhenUserPaper(computerSelection);
        } else {
            return computeWinnerWhenUserScissors(computerSelection);
            }
        }
    private Winner computeWinnerWhenUserRock ( UserSelection computerSelection){
        if (computerSelection == PAPER) {
            return COMPUTER;
        } else if (computerSelection == SCISSORS) {
            return HUMAN;
        } else {
            return BOTH;
        }
    }
    private Winner computeWinnerWhenUserPaper ( UserSelection computerSelection){
        if (computerSelection == SCISSORS) {
            return COMPUTER;
        } else if (computerSelection == ROCK) {
            return HUMAN;
        } else {
            return BOTH;
        }
    }
    private Winner computeWinnerWhenUserScissors ( UserSelection computerSelection){
        if (computerSelection == ROCK) {
            return COMPUTER;
        } else if (computerSelection == PAPER) {
            return HUMAN;
        } else {
            return BOTH;
        }
    }
}























