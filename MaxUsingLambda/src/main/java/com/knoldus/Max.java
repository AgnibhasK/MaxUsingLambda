package com.knoldus;

import java.util.function.IntBinaryOperator;

public class Max {
    public int max(String firstNumber, String secondNumber){
        IntBinaryOperator instance = Math::max;
        try {
            int result = instance.applyAsInt(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));

            return result;
        } catch (Exception e){
            System.out.println(" Please enter valid numbers :  "+e);
            throw new NumberFormatException();
        }

    }

}
