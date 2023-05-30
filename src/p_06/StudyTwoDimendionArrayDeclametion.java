package p_06;

import java.util.Arrays;

public class StudyTwoDimendionArrayDeclametion {
    public static void main(String[] args) {
        //二维数组的声明
        int[][] a=new int[3][];
        a[0]=new int[2];
        a[1]=new int[4];
        a[2]=new int[3];

        //二维数组的静态初始化
        int[][] b={{1,2,3},{3,4},{3,5,6,7}};
        System.out.println(b[2][3]);

        //二维数组的动态初始化
        int[][] c=new int[3][];
        a[0]=new int[]{1,2};
        a[1]=new int[]{2,2};
        a[2]=new int[]{2,2,3,4};
        System.out.println(a[2][3]);
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));

        //使用二维数组保存表格数据
        Object[] a1={1001,"高淇",18,"讲师","2-14"};
        Object[] a2={1002,"高小七",19,"助教","10-10"};
        Object[] a3={1003,"邓丹",20,"班主任","5-5"};
        Object[][] emps=new Object[3][];
        emps[0]=a1;
        emps[1]=a2;
        emps[2]=a3;
        System.out.println(Arrays.toString(emps[0]));
        System.out.println(Arrays.toString(emps[1]));
        System.out.println(Arrays.toString(emps[2]));

        //使用javabean和一维数组保存表格信息
        Emp[] emps02={
                new Emp(1001,"高淇",18,"讲师","2-14"),
                new Emp(1002,"mary",19,"助教","10-10"),
                new Emp(1003,"katty",20,"班主任","5-5")
        };
        for(Emp e:emps02){
            System.out.println(e);
        }

    }
}

class Emp{
    private int id;
    private String name;
    private int age;
    private String job;
    private String hiredate;

    public Emp(int id,String name,int age,String job,String hiredate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.job=job;
        this.hiredate=hiredate;
    }

    @Override
    public String toString(){
        return "["+id+","+age+","+job+","+hiredate+"]";
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getJob(){
        return job;
    }

    public void setJob(String job){
        this.job=job;
    }

    public String getHiredate(){
        return hiredate;
    }

    public void setHiredata(String hiredate){
        this.hiredate=hiredate;
    }

}