package p_05;

public class StudyAbstract {
    public static void main(String[] args) {
        Dog01 a=new Dog01();
        a.shout();
        a.seeDoor();
    }
}

abstract class Animal01{
    abstract public void shout();
}

class Dog01 extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门中......");
    }
}

