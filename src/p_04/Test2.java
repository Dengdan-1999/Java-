package p_04;

public class Test2 {
    public static void main(String[] args) {
        double r=4*Math.random();
        double area=3.14*r*r;
        double circle=2*Math.PI*r;
        System.out.println("半径为："+r);
        System.out.println("面积为："+area);
        System.out.println("周长为："+circle);
        if(area>=circle){
            System.out.println("面积大于等于周长");
        }else{
            System.out.println("周长大于面积");
        }

    }
}
