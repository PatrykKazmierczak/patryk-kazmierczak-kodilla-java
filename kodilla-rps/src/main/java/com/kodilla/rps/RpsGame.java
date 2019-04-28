package com.kodilla.rps;


import java.util.Scanner;

import static com.kodilla.rps.UserSelection.*;
import static com.kodilla.rps.Winner.*;

public class RpsGame {


    private UserSelection computerSelection;
    private UserSelection userSelection;
    private int computerScore = 0;
    private int humanScore = 0;

    public Winner playGame() {

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
        System.out.println(RpsDialog.getSecondMenu());

        Winner winner = selectWinner(computerSelection, userSelection);
        if (winner == COMPUTER) {
            computerScore++;
        } else if (winner == HUMAN) {
            humanScore++;
        } else {
            computerScore++;
            humanScore++;
        }
    private Winner selectWinner(UserSelection computerSelection, UserSelection userSelection) {
        if (userSelection == ROCK) {
            if (computerSelection == PAPER) {
                return COMPUTER;
            } else if (computerSelection == SCISSORS) {
                return HUMAN;
            } else {
                return BOTH;

            } else if (userSelection == PAPER) {
                if (computerSelection == SCISSORS) {
                    return COMPUTER;
                } else if (computerSelection == ROCK) {
                    return HUMAN;
                } else {
                    return BOTH;

                } else if (userSelection == SCISSORS) {
                    if (computerSelection == ROCK) {
                        return COMPUTER;
                    } else if (computerSelection == PAPER) {
                        return HUMAN;
                    } else {
                        return BOTH;
                    }
                }
            }
        }
        return null;
        }
    }
}











