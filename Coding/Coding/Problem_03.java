package Coding;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Problem_03 {
    public static List<BigInteger> computeFibonacci(int n) {
        List<BigInteger> fibonacciNumbers = new ArrayList<>();

        if (n <= 0) {
            return fibonacciNumbers;
        }

        // First Fibonacci number
        fibonacciNumbers.add(BigInteger.ZERO);

        if (n == 1) {
            return fibonacciNumbers;
        }

        // Second Fibonacci number
        fibonacciNumbers.add(BigInteger.ONE);

        for (int i = 2; i < n; i++) {
            BigInteger nextFib = fibonacciNumbers.get(i - 1).add(fibonacciNumbers.get(i - 2));
            fibonacciNumbers.add(nextFib);
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        List<BigInteger> first100Fibonacci = computeFibonacci(100);

        System.out.println("The first 100 Fibonacci numbers are:");
        for (int i = 0; i < first100Fibonacci.size(); i++) {
            System.out.println((i + 1) + ": " + first100Fibonacci.get(i));
        }
    }
  }


