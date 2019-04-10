package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.util.Objects;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator(8,4);

        int result1 = calculator.add();
        int result2 = calculator.substract();

        if(Objects.equals(result1, 12)) {
            System.out.println("test ok");
        }else{
            System.out.println("error");
        }
        if(Objects.equals(result2, 32)) {
            System.out.println("test ok");
        }else{
            System.out.println("error");
        }
    }
}