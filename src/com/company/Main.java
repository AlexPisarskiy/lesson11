package com.company;

import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = "0";
        float fnumber = 0;
        boolean result = false;

        while (result == false) {
            System.out.println("Введие числитель");
            number = scanner.next();
            try {
                fnumber = Float.valueOf(number);
                result = true;
            } catch (Exception exc) {
            }
        }

        while (result == true) {
            System.out.println("Введие знаменатель");
            number = scanner.next();
            try {
                fnumber = Float.valueOf(number);
                result = false;
            } catch (Exception etc) {
            }
        }



    }
}