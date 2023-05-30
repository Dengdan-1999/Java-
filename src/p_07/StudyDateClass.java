package p_07;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudyDateClass {
    public static void main(String[] args) {
        long nowNum=System.currentTimeMillis(); //当前时刻对应的毫秒数
        System.out.println(nowNum);
        Date d=new Date();                      //当前时刻的对象
        System.out.println(d.getTime());        //返回时间对应的毫秒数
        Date d2=new Date(1000l*3600*24*365*150);//距离1970年150年
        System.out.println(d2);

    }
}

