package com.task3;


public class Operators{
    public static void main(String[] args) {

        int a = 10, b = 3;
        
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        int x = 5;
        x++;   
        x--;   
        int positive = +x;
        int negative = -x;

        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;

        boolean logicalAnd = (a > 5 && b < 5);
        boolean logicalOr = (a > 10 || b < 5);
        boolean logicalNot = !(a == b);

        int num = 10;
        num += 5; 
        num -= 3; 
        num *= 2; 
        num /= 4; 

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int leftShift = a << 1;
        int rightShift = a >> 1;
        int unsignedRight = a >>> 1;
        
        String result = (a > b) ? "a is greater" : "b is greater";

        System.out.println("Sum = " + sum);
        System.out.println("Sub = " + sub);
        System.out.println("Mul = " + mul);
        System.out.println("Div = " + div);
        System.out.println("Mod = " + mod);

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);

        System.out.println("isGreater = " + isGreater);
        System.out.println("isLess = " + isLess);
        System.out.println("isEqual = " + isEqual);
        System.out.println("isNotEqual = " + isNotEqual);

        System.out.println("logicalAnd = " + logicalAnd);
        System.out.println("logicalOr = " + logicalOr);
        System.out.println("logicalNot = " + logicalNot);

        System.out.println("num = " + num);

        System.out.println("and = " + and);
        System.out.println("or = " + or);
        System.out.println("xor = " + xor);
        System.out.println("leftShift = " + leftShift);
        System.out.println("rightShift = " + rightShift);
        System.out.println("unsignedRight = " + unsignedRight);

        System.out.println("Result = " + result);
    }
}
