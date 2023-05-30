package p_05;

public class ExerciseEncapsulation {
    public static void main(String[] args) {
        Person03 p1=new Person03();
        p1.setName("小红");
        p1.setAge(-45);
        System.out.println(p1);

        Person03 p2=new Person03("小白",300);
        System.out.println(p2);
    }
}

class Person03{
    private String name;
    private int age;
    public Person03(){

    }
    public Person03(String name,int age){
        this.name=name;
        setAge(age);
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>130||age<0){
            this.age=18;
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "person [name="+name+", age="+age+"]";
    }
}