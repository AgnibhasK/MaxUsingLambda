package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class max {
    public int max(int firstNumber, int secondNumber){
        List<Integer> list = Arrays.asList(firstNumber,secondNumber);
        Optional<Integer> op = list.stream().max((a, b) -> {
            int compare = Integer.compare(a, b);
            return compare;
        });
        int result = op.get();
        return result;

    }
}
