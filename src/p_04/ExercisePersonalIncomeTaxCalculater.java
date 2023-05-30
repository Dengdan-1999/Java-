/*
个税计算器：
直到键盘输入“exit”，退出程序；
应缴纳所得额=工资收入金额-各项社会保险费-起征点(5000)
级数              应缴纳所得额              税率              速算扣除数
1                   《=3000                3                 0
2                    <=12000               10                  210
3                    <=25000               20                 1410
4                    <=35000               25                  2660
5                    <=55000               30                4410
6                    <=80000               35                 7160
7                    >80000                45                  15160

 */

package p_04;

import java.util.Scanner;

public class ExercisePersonalIncomeTaxCalculater {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("请输入月薪：");
            double slary=scanner.nextInt();
            double jiao=slary-5000;
            double shui=0;
            if(jiao<0){
                System.out.println("个税起征点为5000元，不需要纳税");
            }else if(jiao<=3000){
                shui=jiao*0.03;
                slary-=shui;
            }else if(jiao<=12000){
                shui=jiao*0.1-210;
                slary-=shui;
            }else if(jiao<=25000){
                shui=jiao*0.2-1410;
                slary-=shui;
            }else if(jiao<=35000){
                shui=jiao*0.25-2660;
                slary-=shui;
            }else if(jiao<=55000){
                shui=jiao*0.3-4410;
                slary-=shui;
            }
            System.out.println("应纳税所得额："+jiao+"元\t"+"纳税税额"+shui+"元\t"+"实发工资"+slary+"元");
            System.out.println("输入exit退出程序，其他继续计算");
            int cmd=scanner.nextInt();
            if(cmd==88){
                System.out.println("程序结束，退出");
                break;
            }else{
                continue;
            }
        }
    }
}
