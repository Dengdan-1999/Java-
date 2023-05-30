package p_05;

public class StudyPolymorphism {
    public static void main(String[] args) {
        Animal a1=new Cat();
        animalCry(a1);
        Animal a2=new Dog();
        animalCry(a2);

        Dog dog=(Dog)a2;
        dog.seeDoor();
    }

    static void animalCry(Animal a){
        a.shout();
    }
}

class Animal{
    public void shout(){
        System.out.println("叫了一声！");
    }
}

class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门中......");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵喵");
    }
}