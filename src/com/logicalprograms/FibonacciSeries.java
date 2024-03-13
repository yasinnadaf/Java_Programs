package com.logicalprograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10;
        int n1 = 0, n2 = 1;
        System.out.println("Fibonacci Series of " +num+ " number:");

        for (int i = 1; i <= num; ++i){
            System.out.println(n1+ " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
