package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number = ");
        String firstNumber = sc.nextLine();
        System.out.print("Enter the Second number = ");
        String secondNumber = sc.nextLine();

        Max object = new Max();
        int result = object.max(firstNumber, secondNumber);

        System.out.println("Maximum =" + result);

    }
}
