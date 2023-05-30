package p_04;

import java.util.Scanner;

public class ExerciseMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minute=scanner.nextInt();
        punish(minute);
    }
    public static void punish(int minute){
        if(minute<=10){
            System.out.println("警告");
        }else if(minute<=20){
            System.out.println("罚款100元");
        }else if(minute<=30){
            System.out.println("罚款200元");
        }else if(minute<=60){
            System.out.println("扣除半天工资");
        }else{
            System.out.println("按照矿工计算，扣除3天工资");
        }
    }
}

