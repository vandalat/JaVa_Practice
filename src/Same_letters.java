import java.util.Arrays;

/*
Write a return method that check if a string is build out of the same
letters as another string.
 */
public class Same_letters {
    public static void main(String[] args) {
        String str1 ="abc";
        String str2 ="bca";
        System.out.println(sameLetters1(str1, str2));

    }
    public static boolean sameLetters1(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a="";
        String b="";
        for (char c :ch1 ) {
            a+=c;
        }
        for (char c : ch2) {
            b+=c;
        }
        return a.equals(b);

    }
//    public static boolean sameLetters2(String str1, String str2){
//
//    }
//    public static boolean sameLetters3(String str1, String str2){
//
//    }



}
