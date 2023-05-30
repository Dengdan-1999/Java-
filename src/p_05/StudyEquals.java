package p_05;
//自定义类重写equals方法
public class StudyEquals {
    public static void main(String[] args) {
        Person4 p1=new Person4(123,"mary");
        Person4 p2=new Person4(124,"laiangnuoer");
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        String s1=new String("尚学堂");
        String s2=new String("尚学堂");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

class Person4{
    int id;
    String name;
    public Person4(int id,String name){
        this.id=id;
        this.name=name;
    }

    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }else{
            if(obj instanceof Person4){
                Person4 c=(Person4)obj;
                if(c.id==this.id){
                    return true;
                }
            }
        }
        return false;
    }

}