package p_05;
//toString 方法
class Person3{
    String name;
    int age;
    public String toString(){
        return name+",年龄："+age;
    }
}


public class StudyToString {
    public static void main(String[] args) {
        Person3 p=new Person3();
        p.age=20;
        p.name="邓丹";
        System.out.println("info:"+p);

        StudyToString st=new StudyToString();
        System.out.println(st);
    }
}


