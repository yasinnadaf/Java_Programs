package com.logicalprograms;

public class Prime_Number {
    public static void main(String[] args) {
    int num = 11;
    int temp = 0;

    for(int i = 2; i < num - 1; i++ ){
        if(num % i == 0){
            temp = temp + 1;
        }
    }
    if(temp == 0){
        System.out.println(num+ " is prime number");
    }else {
        System.out.println(num+ " is not prime number");
    }
    }
}
