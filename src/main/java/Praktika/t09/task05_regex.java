package Praktika.t09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task05_regex {
    public static void main(String[] args) {
        String str = "в лесной тишине изредка 5 слышались звуки: шорох листьев, 4 свист крыльев, постукивание дятла," +
                " песня 8 зарянки! деревья, дороги, дома-всё 12 окутал туман... везде: над головой, под ногами, рядом с" +
                " тобой - живёт железо. я 15 умею играть в футбол, а Катя нет?";
        StringBuilder sb = new StringBuilder(str);
        Pattern pattern = Pattern.compile("[\\.!?]");
        Matcher matcher = pattern.matcher(sb);

        while (matcher.find()){

            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
            if((sb.charAt(matcher.start()) == '.'|| sb.charAt(matcher.start()) == '!'||sb.charAt(matcher.start()) == '?')&& matcher.start()!=sb.length()-1){
            sb.setCharAt(matcher.start()+2, Character.toUpperCase(sb.charAt(matcher.start()+2)));}

        }
        System.out.println(sb);


    }
}
