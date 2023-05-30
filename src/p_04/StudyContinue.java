package p_04;

public class StudyContinue {
    public static void main(String[] args) {
        int count=0;
        for(int i=100;i<150;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+"、");
            count++;
            if(count%5==0){
                System.out.println();
            }
        }

        //带标签的continue
        outer: for(int i=101;i<150;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    continue outer;
                }
            }
            System.out.print(i+" ");
        }
    }
}
