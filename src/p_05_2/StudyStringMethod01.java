package p_05_2;

public class StudyStringMethod01 {
    public static void main(String[] args) {
        String s1="core java";
        String s2="Core java";
        System.out.println(s1.charAt(3)); //e
        System.out.println(s2.length());//9
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//ture
        System.out.println(s1.indexOf("java"));//5
        System.out.println(s1.indexOf("apple"));//-1
        String s=s1.replace(' ','&');
        System.out.println("the result is: "+s);//the result is: core&java




    }
}
