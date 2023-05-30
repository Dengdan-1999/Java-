package p_08;

public class StudyException {
    public static void main(String[] args) {
        System.out.println("111");
        int a=1/0;
        System.out.println("222");

        System.out.println("111");
        try{
            int b=1/0;
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("222");
    }
}

