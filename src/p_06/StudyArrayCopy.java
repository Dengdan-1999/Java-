package p_06;

public class StudyArrayCopy {
    public static void main(String[] args) {
        String[] s={"阿里","腾讯","字节","携程","拼多多"};
        String[] sBak=new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        for(int i=0;i<sBak.length;i++){
            System.out.print(sBak[i]+"\t");
        }
    }
}
