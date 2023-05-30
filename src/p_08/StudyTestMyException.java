package p_08;

public class StudyTestMyException {
    public static void main(String[] args) {
        Person p=new Person();
        try{
            p.setName("Lincoln");
            p.setAge(-2);
        }catch(StudySelfException e){
            e.printStackTrace();
        }
        System.out.println(p);
    }
}


class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age)throws StudySelfException{
        if(age<0){
            throw new StudySelfException("人的年龄不应该为负数");
        }
        this.age=age;
    }

    public String toString(){
        return "name is"+name+" and age is"+age;
    }
}

