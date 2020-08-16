package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            Calculator calc = new Calculator(in.nextLine());
            System.out.println(calc.getResult());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
