package Praktika.t09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //char[] arr = str.toCharArray();


      /*  ArrayList<Character> arL = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            arL.add(arr[i]);
        }
        Collections.reverse(arL);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arL.get(i);
        }
        str = new String(arr);
        System.out.println(str);*/

        //str = new String(arr);
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
