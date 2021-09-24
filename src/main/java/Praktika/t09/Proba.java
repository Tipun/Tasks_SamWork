package Praktika.t09;

public class Proba {
    public static void main(String[] args) {
        String text = "FIFA will never regret it";
        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
        for (int i = 0; i <1000 ; i++) {
            System.out.println(i);
        }
        for(String word : words) {
            System.out.println(word);
        }
    }
}
