package p_04;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double r;
        r=scanner.nextDouble();
        double area,circle;
        area=Math.PI*r*r;
        circle=2*Math.PI*r;
        System.out.println("area="+area);
        System.out.println("circle="+circle);



    }
}
