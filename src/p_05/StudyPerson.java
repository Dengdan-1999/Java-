package p_05;

public class StudyPerson {
    String name;
    int age;
    public void show(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        StudyPerson p1=new StudyPerson();
        p1.age=24;
        p1.name="张三";
        p1.show();

        StudyPerson p2=new StudyPerson();
        p2.age=35;
        p2.name="李四";
        p2.show();

        StudyPerson p3=p1;
        StudyPerson p4=p1;
        p4.age=80;

    }
}
