package p_04;

public class Exercise_while_02 {
    public static void main(String[] args) {
        int i=0;
        int j;
        while(i<=130){
            for(j=0;j<5;j++){
                System.out.printf((i+j)+" ");
            }
            System.out.println();
            i=i+j;
        }
    }
}
