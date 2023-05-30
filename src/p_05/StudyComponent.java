package p_05;

public class StudyComponent {
    public static void main(String[] args) {
        Student2 s=new Student2("dengdan",162,"java");
        s.person.rest();
        s.study();
    }
}

class Person2{
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }
}

class Student2{
    Person2 person=new Person2();
    String major;

    public Student2(String name,int height,String major){
        this.person.name=name;
        this.person.height=height;
        this.person.rest();
        this.major=major;
    }

    public void study(){
        System.out.println("学习中...");
    }

}