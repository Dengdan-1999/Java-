package p_05_2;

public class StudyOuterClass {
    public static void main(String[] args) {
        Outer2.Inner2 inner=new Outer2.Inner2();
        inner.test();

    }

}

class Outer{
    private int age=10;
    public void show(){
        System.out.println(age);
    }
    public class Inner{
        private int age=20;
        public void show(){
            System.out.println(age);
        }
    }
}

class Outer1{
    private int age=10;
    public void show(){
        System.out.println(age);
    }
    public class Inner1{
        private int age=20;
        public void show(){
            System.out.println(age);
            System.out.println(Outer1.this.age);
        }
    }
}

class Outer2{
    private int a=10;
    private static int b=20;
    static class Inner2{
        public void test(){
            System.out.println(b);
        }
    }
}