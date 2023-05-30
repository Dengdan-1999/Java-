package p_04;

public class Test1 {
    public static void main(String[] args) {
        //通过投掷三个骰子看看今天的手气如何？
        int i=(int)(6*Math.random())+1;
        int j=(int)(6*Math.random())+1;
        int k=(int)(6*Math.random())+1;
        int count=i+j+k;
        if(count>15){
            System.out.println("今天手气不错");
        }

        if(count>=10 && count<=15){
            System.out.println("今天手气很一般");
        }

        if(count<10){
            System.out.println("今天手气不怎么样");
        }
        System.out.println("得了"+count+"分");
    }
}
