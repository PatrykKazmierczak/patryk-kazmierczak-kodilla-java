package com.kodilla.rps;

import static com.kodilla.rps.UserSelection.*;
import static com.kodilla.rps.Winner.*;

public class RpsGame {
    public Winner selectWinner(UserSelection computerSelection, UserSelection userSelection) {
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

        Winner winner = selectWinner(computerSelection, userSelection);
            if (winner == COMPUTER) {
                computerScore++;
            } else if (winner == HUMAN) {
                 humanScore++;
            } else {
                 computerScore++;
                 humandScore++;
            }
    }
