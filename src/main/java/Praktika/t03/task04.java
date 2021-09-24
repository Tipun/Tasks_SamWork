package Praktika;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int pers = sc.nextInt();

        double rez = number * pers / 100;
        System.out.println(rez);
    }
}
