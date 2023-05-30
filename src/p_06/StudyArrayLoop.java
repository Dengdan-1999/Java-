package p_06;

public class StudyArrayLoop {
    public static void main(String[] args) {
        int[] a=new int[4];
        for(int i=0;i<a.length;i++){
            a[i]=100*i;
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        String[] ss={"aa","bb","cc","dd"};
        for(String temp:ss){
            System.out.println(temp);
        }

    }
}
