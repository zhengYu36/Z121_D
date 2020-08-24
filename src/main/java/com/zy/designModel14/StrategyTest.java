package com.zy.designModel14;

/**
 * 14 模板方法模式
 * 就是在一个抽象类里面有一个方法
 * 是由相关的子类来实现的
 */
public class StrategyTest {

    public static void main(String[] args) {
        String exp = "8+9";
        AbstractCalculator cal = new Minus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}