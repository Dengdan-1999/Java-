package p_04;

//方法重载的问题

public class StudyMethodOverload {
    public static void main(String[] args) {

    }

    public static int add(int n1,int n2){
        int sum=n1+n2;
        return sum;
    }
    public static int add(int n1,int n2,int n3){
        int sum=n1+n2+n3;
        return sum;
    }
    public static double add(double n1,int n2){
        double sum=n1+n2;
        return sum;
    }
    public static double add(int n1,double n2){
        double sum=n1+n2;
        return sum;
    }


}
