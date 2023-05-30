package p_05_2;

public class StudyAnonymousInnerClass {

    public void test1(A_anony a){
        a.run();
    }

    public static void main(String[] args) {
        StudyAnonymousInnerClass tac=new StudyAnonymousInnerClass();
        tac.test1(new A_anony(){
            @Override
            public void run(){
                System.out.println("匿名内部类测试！我是新定义的第一个匿名内部类！");
            }
        });

        tac.test1(new A_anony(){
            @Override
            public void run(){
                System.out.println("我是新定义的第二个匿名内部类");
            }
        });
    }
}

interface A_anony{
    void run();
}