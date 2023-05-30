package p_05_2;

public class StudyInterfaceStaticMethod {
    public static void main(String[] args) {
        A01.staticMethod();
        Test_A01.staticMethod();
        A01 a=new Test_A01();
        a.moren();

    }
}

interface A01{
    public default void moren(){
        // 默认方法中可以调用静态方法
        staticMethod();
        System.out.println("A01.moren");
    }
    public static void staticMethod(){
        System.out.println("A.staticMethod");
    }
}

class Test_A01 implements A01{
    public static void staticMethod(){
        System.out.println("Test_A.staticMethod");
    }
}