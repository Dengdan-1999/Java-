package p_04;

public class Exercise05 {
    public static void main(String[] args) {
        double r=Math.random();
        int score=(int)(r*101);
        if(score>=90){
            System.out.println("A+");
        }else if(score>=80){
            System.out.println("A");
        }else if(score>=70){
            System.out.println("B");
        }else if(score>=60){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
