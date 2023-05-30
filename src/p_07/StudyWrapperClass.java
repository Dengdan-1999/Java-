package p_07;

public class StudyWrapperClass {
    public static void main(String[] args) {
        Integer i=new Integer(10);      //从java9开始被废弃
        Integer j=Integer.valueOf(50);//官方推荐

        Test test=new Test();
        test.testInteger();
    }
}

class Test{
    void testInteger(){
        Integer int1=new Integer(10);
        Integer int2=Integer.valueOf(20);
        int a=int1.intValue();
        Integer int3=Integer.parseInt("334");
        Integer int4=new Integer("999");
        String str1=int3.toString();
        System.out.println("int能表示的最大整数："+Integer.MAX_VALUE);
    }
}

//包装类的缓存测试
class Test3{
    public void fun(){
        Integer in1=-128;
        Integer in2=-128;
        System.out.println(in1==in2);//true,因为123在缓存范围内
        System.out.println(in1.equals(in2));//true
        Integer in3=1234;
        Integer in4=1234;
        System.out.println(in3==in4);//false,因为1234不在缓存范围内
        System.out.println(in3.equals(in4));//true
    }
}

//自定义一个简单的包装类
class MyInteger{
    private int value;
    private static MyInteger[] cache=new MyInteger[256];

    public static final int LOW=-128;
    public static final int HIGH=127;

    static{
        for(int i=MyInteger.LOW;i<=HIGH;i++){
            cache[i+128]=new MyInteger(i);
        }
    }

    public static MyInteger valueOf(int i){
        if(i>=LOW&&i<=HIGH){
            return cache[i+128];
        }
        return new MyInteger(i);
    }

    @Override
    public String toString(){
        return this.value+"";
    }

    public int intValue(){
        return value;
    }
    private MyInteger(int i){
        this.value=i;
    }
}