package p_05_2;

public class StudyString {
    public static void main(String[] args) {
        String e="";
        String greeting="hello world";

        int age=18;
        String str="age is"+age;
        System.out.println("age is"+age);

        String g1="北京尚学堂";
        String g2="北京尚学堂";
        String g3=new String("北京尚学堂");

        System.out.println(g1==g2);
        System.out.println(g1==g3);
        System.out.println(g1.equals(g3));
    }
}
