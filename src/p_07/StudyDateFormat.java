package p_07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudyDateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat s1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd");
        String daytime=s1.format(new Date());
        System.out.println(daytime);
        System.out.println(s2.format(new Date()));
        System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
        //将符合指定格式的字符串转成时间对象，字符串格式需要和指定格式一致
        String time="2049-10-1";
        Date date=s2.parse(time);
        System.out.println("data1:"+date);
        time="2049-10-1 20:15:30";
        date=s1.parse(time);
        System.out.println("date2:"+date);

        StudyDateFormat sd=new StudyDateFormat();
        sd.fun();
    }

    public void fun(){
        SimpleDateFormat s1=new SimpleDateFormat("d");
        String daytime=s1.format(new Date());
        System.out.println(daytime);
    }
}
