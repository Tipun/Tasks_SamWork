package Praktika.t09;

public class task05 {
    public static void main(String[] args) {
        String str = "в лесной тишине изредка 5 слышались звуки: шорох листьев, 4 свист крыльев, постукивание дятла," +
                " песня 8 зарянки. деревья, дороги, дома-всё 12 окутал туман. дезде: над головой, под ногами, рядом с" +
                " тобой - живёт железо. я 15 умею играть в футбол, а Катя нет.";
        StringBuilder sb = new StringBuilder(str);
        //1
//        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
//        for (int i = 0; i < sb.length(); i++) {
//            if((sb.charAt(i) == '.'|| sb.charAt(i) == '!'||sb.charAt(i) == '?')&& i!=sb.length()-1){
//                sb.setCharAt(i+2, Character.toUpperCase(sb.charAt(i+2)));
//            }
//        }
//        System.out.println(sb);
        //2
//        int qNum = 0;
//        for (int i = 0; i < sb.length(); i++) {
//            if((sb.charAt(i) == '0'|| sb.charAt(i) == '1'||sb.charAt(i) == '2'|| sb.charAt(i) == '3'||sb.charAt(i) == '4'||
//                    sb.charAt(i) == '5'|| sb.charAt(i) == '6'||sb.charAt(i) == '7'|| sb.charAt(i) == '8'||sb.charAt(i) == '9')
//            && sb.charAt(i+1) == ' ') {
//                qNum ++;
//            }
//        }
//        System.out.println(qNum);
        //3
//        int qSign = 0;
//        for (int i = 0; i < sb.length(); i++) {
//            if(sb.charAt(i) == ':'|| sb.charAt(i) == ','||sb.charAt(i) == '.'|| sb.charAt(i) == '-')
//            {
//                qSign ++;
//            }
//        }
//        System.out.println(qSign);
        //4
        int qSug = 0;
        for (int i = 0; i < sb.length(); i++) {
            if((sb.charAt(i) == '.'|| sb.charAt(i) == '!'||sb.charAt(i) == '?') && sb.charAt(i-1) != '.'){

                qSug ++;
            }
        }
        System.out.println(qSug);
    }
}
