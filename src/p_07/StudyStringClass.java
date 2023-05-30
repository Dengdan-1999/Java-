package p_07;

public class StudyStringClass {
    public static void main(String[] args) {
        String s1=new String("abcdef");
        String s2=s1.substring(2,4);
        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(Integer.toHexString(s2.hashCode()));

        TestString2 t2=new TestString2();
        t2.fun();
    }
}

//字符串常量拼接时的优化
class TestString2{
    public void fun(){
        //编译器做了优化，直接在编译的时候将字符串进行拼接，相当于str1="hello java"
        String str1="hello"+"java";
        String str2="hellojava";
        System.out.println(str1==str2);//true
        String str3="hello";
        String str4="java";
        //编译的时候不知道变量中存储的是什么，所有没有办法在编译的时候优化
        String str5=str3+str4;
        System.out.println(str2==str5);//false
    }
}