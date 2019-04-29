package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;


public class RpsDialog {

    public static int getNumberOfRounds() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number of rounds");
            String s = scanner.nextLine();
            try {
                int result = Integer.parseInt(s);
                if (result <= 0) {
                    System.out.println("Number must be greater than ZERO");
                } else {
                    return result;
                }
            } catch (Exception e) {
                System.out.println("Wrong number, try again");
            }
        }
    }

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move R - rock, S - scissors, P - paper or Q - quit/N - restart: ");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "S":
                    return UserSelection.SCISSORS;
                case "R":
                    return UserSelection.ROCK;
                case "P":
                    return UserSelection.PAPER;
                case "Q":
                    return UserSelection.QUIT;
                case "N":
                    return UserSelection.RESTART;
                default:
                    System.out.println("Wrong selection , try again");
            }
        }
    }

    public static UserSelection getComputerSelection() {
        Random random = new Random();
        int com = random.nextInt(3);
        while (true) {
            switch (com) {
                case 0:
                    return UserSelection.SCISSORS;
                case 1:
                    return UserSelection.ROCK;
                case 2:
                    return UserSelection.PAPER;
                default:
                    break;
            }
        }
    }
    public static void showStatistics(
            int numberOfRounds, UserSelection userSelection, UserSelection computerSelection,
            Winner winner, int round, int computerScore, int humanScore ) {
        System.out.println("Round: " + round + " of " + numberOfRounds);
        System.out.println("User selection: " + userSelection);
        System.out.println("Computer selection: " + computerSelection);
        System.out.println("The winner is: " + winner);
        System.out.println("Computer score: " + computerScore);
        System.out.println("Human score: " + humanScore);
    }
    public static String getUserName() {
        System.out.println("Enter name of the player");
        Scanner scanner2 = new Scanner(System.in);
        return scanner2.nextLine();
    }
    public static int getRounds() {
        System.out.println("Welcome in the game");
        System.out.println("Enter number of games to win");
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextInt();
    }
    public static void showRestartInfo() {
        System.out.println("Game has been restarted");
    }
}




























