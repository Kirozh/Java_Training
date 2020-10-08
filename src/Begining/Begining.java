package Begining;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.floorMod;

public class Begining {
    /**
     * Печатает число в двоичной,, восьмиричной и шестнадцатиричной системах счисления
     * @param
     * @return
     */
    public static void printToNumSystems() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести число");

        int num = scanner.nextInt();

        System.out.println("In bin: " + Integer.toString(num,2));
        System.out.println("In oct: " + Integer.toString(num,8));
        System.out.println("In hex: " + Integer.toString(num,16));
    }

    public static void angleDivide(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести число");

        int num = scanner.nextInt();

        System.out.println("Divide " + num + " = " + num % 360);
        System.out.println("Divide " + num + " = " + floorMod(num, 360));
    }

    public static void maximumOfThree(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввести число 1");
        int number1 = scanner.nextInt();

        System.out.println("Ввести число 2");
        int number2 = scanner.nextInt();

        System.out.println("Ввести число 3");
        int number3 = scanner.nextInt();

        int maximum = number1;

        if (number1 > number2)
            if (number1 > number3)
                maximum = number1;
            else
                maximum = number3;
        else
            if (number2 > number3)
                maximum = number2;
            else
                maximum = number3;

        System.out.println(maximum);

    }

    public static BigInteger calculateFaktorial(int num){
        BigInteger biNum = BigInteger.valueOf(1);
        for (int i = 1; i< num; i++)
            biNum = biNum.multiply(BigInteger.valueOf(i));
        return biNum;
    }

}
