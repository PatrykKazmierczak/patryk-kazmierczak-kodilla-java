package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        RpsDialog rpsDialog = new RpsDialog();
        System.out.println(rpsDialog.getNumberOfRounds());
        System.out.println(rpsDialog.getUserSelection());
        System.out.println(rpsDialog.getComputerSelection());
    }
}