package p_07;

import javax.jws.soap.SOAPBinding;

public class StudyStringBufferAndBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<7;i++){
            sb.append((char)('a'+i));//
        }
        System.out.println(sb.toString());
        sb.append(",I can sing my abc!");
        System.out.println(sb.toString());
        StringBuffer sb2=new StringBuffer("深圳腾讯总部大厦");
        sb2.insert(0,"要去").insert(0,"工作");
        System.out.println(sb2);
        sb2.delete(0,2);
        System.out.println(sb2);
        sb2.deleteCharAt(0).deleteCharAt(0);
        System.out.println(sb2.charAt(0));
        System.out.println(sb2.reverse());

        StringAndStringBuilderTest sas=new StringAndStringBuilderTest();
        sas.fun();
    }
}

class StringAndStringBuilderTest{
    public void fun(){
        String str8="";
        long num1=Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
        long time1=System.currentTimeMillis();//获取系统的当前时间
        for(int i=0;i<5000;i++){
            str8=str8+i;//相当于产生了5000个对象
        }
        long num2=Runtime.getRuntime().freeMemory();
        long time2=System.currentTimeMillis();
        System.out.println("num1="+num1+" num2="+num2);
        System.out.println("String占用内存："+(num1-num2));
        System.out.println("String占用时间："+(time2-time1));

        StringBuilder sb1=new StringBuilder("");
        long num3=Runtime.getRuntime().freeMemory();
        long time3=System.currentTimeMillis();
        for(int i=0;i<5000;i++){    //使用StringBuilder进行字符串的拼接
            sb1.append(i);
        }
        long num4=Runtime.getRuntime().freeMemory();
        long time4=System.currentTimeMillis();
        System.out.println("StringBuilder占用内存："+(num3-num4));
        System.out.println("StringBuilder占用时间："+(time4-time3));
    }
}