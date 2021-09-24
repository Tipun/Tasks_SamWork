package Praktika.t04;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        System.out.println("Введите количество метров");
        Scanner sc = new Scanner(System.in);
        double metr = sc.nextInt();

        System.out.println( metr + " метров равно " + metr * 100 + " сантиметров");
        System.out.println( metr + " метров равно " + metr * 10 + " дециметров");
        System.out.println( metr + " метров равно " + metr * 1000 + " милиметов");
        double mile = metr / 1609.34;
        System.out.printf( metr + " метров равно %.5f миль", mile);
    }
}
