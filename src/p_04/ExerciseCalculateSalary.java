package p_04;

import java.util.Scanner;

public class ExerciseCalculateSalary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            int monthSalary;
            int n;
            int x;
            System.out.println("请输入您的月薪：");
            monthSalary=scanner.nextInt();
            System.out.println("请输入您每年几个月的薪水：");
            n=scanner.nextInt();
            int yearSalary;
            yearSalary=monthSalary*n;
            if(yearSalary>=200000){
                System.out.println("恭喜你超越了98%的国人");
            }else if(yearSalary>=100000){
                System.out.println("恭喜你超越了90%的国人");
            }else{
                System.out.println("加油，好好干！");
            }
            System.out.println("输入一个数字来决定");

            x=scanner.nextInt();
            if(x==88){
                break;
            } else if(x==66){
                System.out.println("重新开始计算...");
                continue;
            }

        }
    }
}
