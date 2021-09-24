package Praktika.t09;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str = "Привет привет, дядя привет, привет, дядя";

        String str2 = "привет";
        int quantity = 0;
        String []str1 =str.split("[ ,]+");
        for (String s: str1) {
            s=s.toLowerCase();
            if(s.equals(str2))

                quantity++;
        }
        System.out.println(quantity);
    }
}
