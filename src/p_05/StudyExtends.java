package p_05;

public class StudyExtends {
    public static void main(String[] args) {
        Student s=new Student("dengdan",163,"计算机技术");
        s.rest();
        s.study();
    }
}

class Person{
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }
}

class Student extends Person{
    String major;
    public void study(){
        System.out.println("在尚学堂，学习java");
    }
    public Student(String name,int height,String major){
        this.name=name;
        this.height=height;
        this.major=major;
    }
}