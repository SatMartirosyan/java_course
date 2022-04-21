package chapter2;

import java.util.Scanner;
public class GrossPayCalculator {

    static void CheckAge(int age) {
        //if age is less then 18-print access denied
        if (age < 18) {
            System.out.println("access denied");
        }
        //else print-hello
        else {
            System.out.println("hello");
        }
    }
    public static void main (String[] args){
        CheckAge(10);
    }
}

