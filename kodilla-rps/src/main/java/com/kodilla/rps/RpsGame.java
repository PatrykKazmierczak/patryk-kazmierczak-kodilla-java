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
            } else if ( ... ) {
           ...
            }
        ...
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
