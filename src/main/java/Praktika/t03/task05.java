package Praktika.t03;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        System.out.println("Введите сторону квадрата");
        Scanner sc = new Scanner(System.in);
        double side = sc.nextDouble();
        System.out.println("Площадь квадрата равна:");
        System.out.println(side * side);
    }
}
