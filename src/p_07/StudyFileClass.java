package p_07;

import java.io.File;
//使用File类构建文件

public class StudyFileClass {
    public static void main(String[] args) throws Exception{
        System.out.println(System.getProperty("p_07"));
        File f=new File("a.txt");
        f.createNewFile();
        File f2=new File("b.txt");
        f2.createNewFile();

    }
}
