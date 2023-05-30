package p_04;

public class StudyMultiFor01 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j<10?(" "+i*j):i*j)+" ");
            }
            System.out.println();
        }
    }
}
