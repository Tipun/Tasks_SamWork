package Praktika.t09;

import java.util.Arrays;
import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        int[]arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        average = sum / arr.length;
        System.out.println(sum);
        System.out.println(average);
        System.out.println(Arrays.toString(arr));
    }
}
