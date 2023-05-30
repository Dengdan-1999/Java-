package p_05;

public class StudyInstance {
    public static void main(String[] args) {
        Student s=new Student("dengdan",163,"java");
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
    }
}


