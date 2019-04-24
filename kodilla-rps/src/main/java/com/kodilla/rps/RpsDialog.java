package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.UserSelection.PAPER;
import static com.kodilla.rps.UserSelection.SCISSORS;


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
            System.out.println("Enter your move R - rock, S - scissors, P - pacer or Q - quit: ");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "S":
                    return SCISSORS;
                case "R":
                    return UserSelection.ROCK;
                case "P":
                    return PAPER;
                case "Q":
                    return UserSelection.QUIT;
                default:
                    System.out.println("Wrong selection , try again");
            }
        }
    }

    public static ComputerSelection getComputerSelection() {
        Random random = new Random();
        int com = random.nextInt(3);
        while (true) {
            switch (com) {
                case 0:
                    return ComputerSelection.SCISSORS;
                case 1:
                    return ComputerSelection.ROCK;
                case 2:
                    return ComputerSelection.PAPER;
                default:
                    break;
            }
        }
    }
}




















