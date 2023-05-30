package p_05_2;

public class StudyInterface {
    public static void main(String[] args) {
        Volant volant=new Angel();
        volant.fly();
        System.out.println(Volant.FLY_HIGHT);

        Honest honest=new GoodMan();
        honest.helpOther();
    }
}

interface Volant{
    int FLY_HIGHT=100;
    void fly();
}

interface Honest{
    void helpOther();
}

class Angel implements Volant,Honest{
    public void fly(){
        System.out.println("我是天使，我会飞");
    }
    public void helpOther(){
        System.out.println("扶老奶奶过马路");
    }
}

class GoodMan implements Honest{
    public void helpOther(){
        System.out.println("扶老奶奶过马路");
    }
}
class BirdMan implements Volant{
    public void fly(){
        System.out.println("我是鸟人，正在飞");
    }
}