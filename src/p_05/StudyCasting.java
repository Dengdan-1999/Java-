package p_05;

public class StudyCasting {
    public static void main(String[] args) {
        Object obj=new String("北京尚学堂");
        String str=(String)obj;
        System.out.println(str.charAt(0));
        System.out.println(obj==str);

//        if(obj instanceof String){
//            String str=(String)obj;
//            System.out.println(str.charAt(0));
//        }else if(obj instanceof StringBuffer){
//            StringBuffer str=(StringBuffer)obj;
//            System.out.println(str.charAt(0));
//        }
    }
}
