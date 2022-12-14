package KosulluIfadeler;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Girin : ");
        year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.print(year + " bir artık yıldır.");
            } else {
                System.out.print(year + " bir artık yıl değildir.");
            }
        } else if (year % 4 == 0) {
            System.out.print(year + " bir artık yıldır.");
        } else {
            System.out.print(year + " bir artık yıl değildir.");
        }
    }
}
