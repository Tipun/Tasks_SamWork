package Praktika.t04;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = a;
        int i = 0;
        int d;
        while (a2 > 0){
            a2 /=10;
            i++;
        }
        int per = 0;
        while (a > 0){
            d = a%10;
            a /=10;
            per += d * Math.pow(10,i-1);
            i--;
        }
        System.out.println(per);
    }
}
