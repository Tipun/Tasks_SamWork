package Praktika.t09;

public class task04 {
    public static void main(String[] args) {
        String str = "казак";
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        String strP = new String(s);

        if(str.toLowerCase().equals(strP.toLowerCase())){
            System.out.println("полиндром");
        }
        else {
            System.out.println("не полиндром");
        }
    }
}
