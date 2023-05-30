package p_05;

public class StudySuper02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个childclass02对象");
        new ChildClass02();
    }
}

class FatherClass02{
    public FatherClass02(){
        System.out.println("创建FatherClass02");
    }
}

class ChildClass02 extends FatherClass02{
    public ChildClass02(){
        System.out.println("创建childclass02");
    }
}
