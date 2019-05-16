package com.kodilla.rps;

import java.sql.SQLOutput;

import static com.kodilla.rps.UserSelection.*;
import static com.kodilla.rps.Winner.*;

public class RpsGame {

    private int computerScore = 0;
    private int humanScore = 0;
    private UserSelection computerSelection;
    private UserSelection userSelection;
    private String userName;
    private int rounds;
    private int round = 1;

    public void playGame() {
        rounds = RpsDialog.getRounds();
        userName = RpsDialog.getUserName();
        while (round <= rounds) {
            userSelection = RpsDialog.getUserSelection();
            if(userSelection == QUIT) return;
            if(userSelection == RESTART){
                restart();
            } else {
                computerSelection = RpsDialog.getComputerSelection();
                Winner winner = selectWinner(computerSelection, userSelection);
                if (winner == COMPUTER) {
                    computerScore++;
                } else if (winner == HUMAN) {
                    humanScore++;
                } else {
                    computerScore++;
                    humanScore++;
                }
                RpsDialog.showStatistics(
                        rounds, userSelection, computerSelection, winner, round, computerScore, humanScore);
                round++;
            }
        }
    }
    public void selectWinnerOfGame() {
        int humanWins = humanScore++;
        int computerWins = computerScore++;
        if(humanWins<computerWins) {
            System.out.println("Computer win the game");
        } else {
            System.out.println("Human win the game");
        }
    }
    private void restart() {
        humanScore = 0;
        computerScore = 0;
        RpsDialog.showRestartInfo();
    }
    private Winner selectWinner(UserSelection userSelection, UserSelection computerSelection) {
        if (userSelection == ROCK) {
            return computeWinnerWhenUserRock(computerSelection);
        } else if (userSelection == PAPER) {
            return computeWinnerWhenUserPaper(computerSelection);
        } else {
            return computeWinnerWhenUserScissors(computerSelection);
        }
    }
    private Winner computeWinnerWhenUserRock(UserSelection computerSelection) {
        if (computerSelection == PAPER) {
            return COMPUTER;
        } else if (computerSelection == SCISSORS) {
            return HUMAN;
        } else {
            return BOTH;
        }
    }
    private Winner computeWinnerWhenUserPaper(UserSelection computerSelection) {
        if (computerSelection == SCISSORS) {
            return COMPUTER;
        } else if (computerSelection == ROCK) {
            return HUMAN;
        } else {
            return BOTH;
        }
    }

    private Winner computeWinnerWhenUserScissors(UserSelection computerSelection) {
        if (computerSelection == ROCK) {
            return COMPUTER;
        } else if (computerSelection == PAPER) {
            return HUMAN;
        } else {
            return BOTH;
        }
    }
}























