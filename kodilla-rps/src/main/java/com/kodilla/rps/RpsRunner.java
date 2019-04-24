package com.kodilla.rps;



public class RpsRunner {

    public static void main(String[] args) {
        RpsDialog rpsDialog = new RpsDialog();
        System.out.println("New game start");
        System.out.println(RpsDialog.getNumberOfRounds());
        System.out.println("User selection: " + RpsDialog.getUserSelection());
        System.out.println("Computer selection: " + RpsDialog.getComputerSelection());
        System.out.println("The winner is: " );
    }


}














