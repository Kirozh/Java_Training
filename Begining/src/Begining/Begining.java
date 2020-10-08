package Begining;

import java.util.Scanner;
import java.lang.System;
import src.Main;

public class Begining {
    public static void printToNumSystems() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести число");

        int num = scanner.nextInt();

        System.out.println(Integer.toString(num,2));
        System.out.println(Integer.toString(num,8));
        System.out.println(Integer.toString(num,16));
    }


}
