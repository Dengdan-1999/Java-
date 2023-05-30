package p_04;

public class Exercise04 {
    public static void main(String[] args) {
        double r=Math.random();
        double t;
        t=r*121;
        int age=(int)t;
        if(age<6){
            System.out.println("上幼儿园的小朋友");
        }else if(age<12){
            System.out.println("上小学的小孩");
        }else if(age<18){
            System.out.println("上中学的大小孩");
        }else if(age<25){
            System.out.println("上大学的青年");
        }else if(age<45){
            System.out.println("中青年人");
        }else if(age<65){
            System.out.println("中年人");
        }else if(age<85){
            System.out.println("老年人，多注意身体");
        }else{
            System.out.println("长寿老人");
        }

    }
}
