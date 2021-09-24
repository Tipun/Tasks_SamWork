package Praktika.t09;

public class task03 {
    public static void main(String[] args) {
        String str = "Привет, привет, пока, пока, я очень буду ждать звонка.";
        String search = "пока";
        String repl = "досвидания";

        String strRep = str.replace("пока","досвидания");
        System.out.println(strRep);

//        String[]arr = str.split(" +");
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].equals(search)){
//                arr[i] = repl;
//            }
//            else if(arr[i].equals(search + ",")){
//                arr[i] = repl +",";
//            }
//        }
//
//        String str2 = "";
//        for (String s:arr) {
//            str2 += s+" ";
//        }
//        System.out.println(str2);
    }
}
