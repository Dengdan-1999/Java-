package p_05;

public class StudyThis {
    int a,b,c;

    StudyThis(){
        System.out.println("正要初始化一个Hello对象");
    }

    StudyThis(int a,int b){
        this();
        a=a;
        this.a=a;
        this.b=b;
    }

    StudyThis(int a,int b,int c){
        this(a,b);
        this.c=c;
    }

    void sing(){

    }

    void eat(){
        this.sing();
        System.out.println("你妈喊你回家吃饭！");
    }

    public static void main(String[] args) {
        StudyThis st=new StudyThis(2,3);
        st.eat();
    }
}
