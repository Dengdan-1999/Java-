package p_04;

public class StudyMethodRecursion {
    public static void main(String[] args) {
        long d1=System.currentTimeMillis();
        long sum;
        sum=factorial(10);
        long d2=System.currentTimeMillis();
        System.out.println("d1="+d1+", d2="+d2);
        System.out.printf("递归费时："+(d2-d1));
        System.out.println("sum="+sum);
    }
    static long factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
