package p_04;

public class Exercise02 {
    public static void main(String[] args) {
        int a=(int)(Math.random()*6)+1;
        int b=(int)(Math.random()*6)+1;
        int c=(int)(Math.random()*6)+1;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        int count;
        count=a+b+c;
        if(count>15){
            System.out.println("今天手气不错");
        }else if(count>10){
            System.out.println("今天手气一般");
        }else{
            System.out.println("今天手气不好");
        }


    }
}
