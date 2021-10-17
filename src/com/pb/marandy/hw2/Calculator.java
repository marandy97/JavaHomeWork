package com.pb.marandy.hw2;
import java.util.Scanner;
class Calculator {
    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        int operand1, operand2;
        String sign;
        {
            System.out.println("Введите число:");
            operand1 = in.nextInt();
            System.out.println("Введите операцию:");
            sign = in.next();
            System.out.println("Введите второе число:");
            operand2 = in.nextInt();
            if (sign.equals("+")) {
                System.out.println(operand1 + operand2);
            } else if (sign.equals("-")) {
                System.out.println(operand1 - operand2);
            } else if (sign.equals("*")) {
                System.out.println(operand1 * operand2);
            } else if (sign.equals("/") && operand2 != 0) {
                System.out.println(operand1 / operand2);
            } else System.out.println("Введена не верная операция, либо попытка поделить на ноль");
        }
    }
}