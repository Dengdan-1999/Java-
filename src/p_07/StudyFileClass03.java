package p_07;

import java.io.File;

public class StudyFileClass03 {
    public static void main(String[] args) throws Exception{
        File f=new File("d:/c.txt");
        f.createNewFile();  //会在d盘下面生成c.txt文件
        f.delete();//将该文件或目录从硬盘上删除
        File f2=new File("d:/电影/华语/大陆");
        boolean flag=f2.mkdir();//目录结构中有一个不存在，则不会创建整个目录树
        System.out.println(flag);//创建失败

        File f3=new File("d:/c.txt");
        f3.createNewFile();
        f3.delete();

        File f4=new File("d:/电影/华语/大陆");
        boolean flag2=f4.mkdirs();//目录结构中有一个不存在也没关系；创建整个目录
        System.out.println(flag2);

        File f5=new File("d:/电影");
        printFile(f5,0);

    }
/*
打印文件信息
@param file 文件名词
@param level 层次数(实际就是：第几次递归调用)
 */
    static void printFile(File file,int level){
        for(int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(file.getName());
        if(file.isDirectory()){
            File[] files=file.listFiles();
            for(File temp:files){
                printFile(temp,level+1);
            }
        }
    }
}
