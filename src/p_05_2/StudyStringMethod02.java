package p_05_2;

public class StudyStringMethod02 {
    public static void main(String[] args) {
        String s="";
        String s1="how are you?";
        System.out.println(s1.startsWith("how"));//true
        System.out.println(s1.endsWith("you"));//false
        s=s1.substring(4);//
        System.out.println(s);// are you?
        s=s1.substring(4,7);
        System.out.println(s);// are
        s=s1.toLowerCase();
        System.out.println(s);//how are you?
        s=s1.toUpperCase();
        System.out.println(s);//HOW ARE YOU?
        String s2=" How old are you!";
        s=s2.trim();
        System.out.println(s);//How old are you!
        System.out.println(s2);//  How old are you!
    }
}
