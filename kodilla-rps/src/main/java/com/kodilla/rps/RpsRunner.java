package com.kodilla.rps;


import java.util.Scanner;

public class RpsRunner {



    public static void main(String[] args) {

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
        System.out.println("The winner is: "  );

        

    }
}














