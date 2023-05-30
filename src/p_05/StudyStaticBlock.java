package p_05;

public class StudyStaticBlock {
    static String company;
    static{
        System.out.println("执行类的初始化工作");
        company="北京尚学堂";
        printCompany();
    }
    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args){

    }
}
