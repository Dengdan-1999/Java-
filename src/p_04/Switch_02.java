package p_04;

public class Switch_02 {
    public static void main(String[] args) {
        int month=2;
        if(month==1||month==2||month==3){
            System.out.println("春季");
        }else if(month==3||month==5||month==6){
            System.out.println("夏季");
        }else if(month==7||month==8||month==9){
            System.out.println("秋季");
        }else{
            System.out.println("冬季");
        }

        System.out.println("========使用switch改造上面的代码，switch特别适合多值判断========");
        switch(month){
            case 1:
            case 2:
            case 3:
                System.out.println("春季");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏季");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋季");
                break;
            default:
                System.out.println("冬季");
        }

        String str="audi";
        switch(str){
            case "audi":
                System.out.println("我买了个奥迪车");
                break;
            case "benz":
                System.out.println("我买了个奔驰车");
                break;
            default:
                System.out.println("比亚迪，挺好！");
        }
    }
}
