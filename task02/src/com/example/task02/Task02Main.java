package com.example.task02;

import java.util.stream.IntStream;

public class Task02Main {

    public static void main(String[] args) {

        /*
        cycleGrayCode(2)
                .limit(10)
                .forEach(System.out::println);
        */

    }

    public static IntStream cycleGrayCode(int n) {
        if(n == 0 || n > 16) throw new IllegalArgumentException();

        return IntStream.iterate(0, x -> x < (int)Math.pow(2, n) - 1 ? x + 1 : 0).map(operand -> operand ^ (operand >> 1));

    }

}
