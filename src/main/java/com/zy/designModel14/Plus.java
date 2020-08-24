package com.zy.designModel14;

public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
		System.out.println("plus calculate");
        return num1 + num2;
    }
}