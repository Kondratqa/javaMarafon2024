package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        int floorCount = scaner.nextInt();
        if (floorCount >= 1 && floorCount <= 4) {
            System.out.println("Мало этажный дом ");
        } else if (floorCount >= 5 && floorCount <= 8) {
            System.out.println("Средне этажный дом ");
        } else if (floorCount >= 9) {
            System.out.println("Много этажный дом");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}