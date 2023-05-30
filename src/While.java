public class While {
    public static void main(String[] args) {
        int i=0;
        int sum=0,sum1=0,sum2=0;
        while(i<=100){
            sum+=i;
            if(i%2==0)
                sum2+=i;
            else
                sum1+=i;
            i++;
        }
        System.out.println("sum="+sum);
        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
    }
}
