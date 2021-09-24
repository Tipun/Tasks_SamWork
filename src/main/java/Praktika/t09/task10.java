package Praktika.t09;

import java.util.Arrays;
import java.util.Random;

public class task10 {
    public static void main(String[] args) {
        int []arr = new int[10];
        int even = 0;
        int notEven = 0;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int) (-11 + Math.random()*21);
            if(arr[i] % 2 == 0){
                even++;
            }
            if(arr[i] % 2 != 0){
                notEven++;
            }
            if(arr[i] > 0 ){
                pos++;
            }
            if(arr[i] < 0 ){
                neg++;
            }
        }
        int[] arrEven = new int[even];
        int[] arrnotEven = new int[notEven];
        int[] arrPos = new int[pos];
        int[] arrNeg = new int[neg];
        int e = 0;
        int ne = 0;
        int p = 0;
        int n = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] % 2 == 0){
                arrEven[e] = arr[i];
                e++;
            }
            if(arr[i] % 2 != 0){
                arrnotEven[ne] = arr[i];
                ne++;
            }
            if(arr[i] >  0){
                arrPos[p] = arr[i];
                p++;
            }
            if(arr[i] <  0){
                arrNeg[n] = arr[i];
                n++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrEven));
        System.out.println(Arrays.toString(arrnotEven));
        System.out.println(Arrays.toString(arrPos));
        System.out.println(Arrays.toString(arrNeg));
    }
}
