package p_07;

import java.util.Random;

public class StudyRandomClass {
    public static void main(String[] args) {
        Random rand=new Random();
        System.out.println(rand.nextDouble());
        System.out.println(rand.nextInt());
        System.out.println(rand.nextFloat());
        System.out.println(rand.nextBoolean());
        //随机生成[0,10)之间的int类型的数据
        System.out.println(rand.nextInt(10));
        //随机生成[20,30)之间的int类型的数据
        System.out.println(20+rand.nextInt(10));
    }
}
