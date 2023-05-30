package p_05;

public class StudyStatic {
    int id;
    String name;
    String pwd;
    static String company="北京尚学堂";
    public StudyStatic(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void login(){
        System.out.println(name);
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        StudyStatic st=new StudyStatic(101,"高小七");
        StudyStatic.printCompany();
        StudyStatic.company="深圳腾讯总部";
        StudyStatic.printCompany();
    }

}
