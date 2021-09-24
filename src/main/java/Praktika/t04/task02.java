package Praktika.t04;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        System.out.println("Введите число состоящее из четырех цифр.");
        Scanner sc = new Scanner(System.in);
        int i;
        int a;
        do {
            i = 0;
            a = sc.nextInt();
            int a2 = a;
            while (a2 > 0){
                a2 = a2 / 10;
                i++;
            }
            if(i != 4)
                System.out.println("Введенное вами число состоит не из четырех цифр. Повторите ввод");
        }while ( i!= 4);

        int comp = 1;
        int d;
        while (a > 0){
            d = a%10;
            a = a / 10;
            comp *= d;
        }
        System.out.println(comp);

    }
}
