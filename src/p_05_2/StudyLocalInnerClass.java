package p_05_2;
//测试局部内部类
public class StudyLocalInnerClass {
    public void show(){
        class Inner3{
            public void fun(){
                System.out.println("hello world");
            }
        }
        new Inner3().fun();
    }

    public static void main(String[] args) {
        new StudyLocalInnerClass().show();
    }
}
