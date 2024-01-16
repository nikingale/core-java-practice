package com.github.nikingale.java8.lambda;

public class LambdaExpression {
    public static void main(String[] args) {
        Operation addition = (a, b) -> a + b;

        int result = addition.operate(2,3);

        System.out.println(result);
    }
}
