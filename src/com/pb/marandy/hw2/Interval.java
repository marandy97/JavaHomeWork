package com.pb.marandy.hw2;
import java.util.Scanner;
public class Interval {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число:");
        int xs = in.nextInt();
        if (xs < 0) {
            System.out.print("Число меньше 0");
        }
        if (xs > 0 && xs <= 14) {
            System.out.print("Число в промежутке от 0 до 14");
        }
        else if (xs >= 15 && xs <= 35) {
            System.out.print("Число в промежутке от 15 до 35");
        }
        else if (xs >= 36 && xs <= 50) {
            System.out.print("Число в промежутке от 36 до 50");
        }
        else if (xs >= 50 ) {
            System.out.print("Число в промежутке больше 50");
        }

    }
}