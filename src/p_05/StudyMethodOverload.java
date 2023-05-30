package p_05;

public class StudyMethodOverload {

}

class User{
    int id;
    String name;
    String pwd;
    public User(){

    }

    public User(int id,String name){
        this.id=id;
        this.name=name;
    }

    public User(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }

    public static void main(String[] args) {
        User u1=new User();
        User u2=new User(101,"高小七");
        User u3=new User(100,"高企","123456");
    }
}