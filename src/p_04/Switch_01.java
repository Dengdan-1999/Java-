package p_04;

public class Switch_01 {
    public static void main(String[] args) {
        int grade=1;
        if(grade==1){
            System.out.println("大学一年级，可以放松一下，学着谈谈恋爱");
        }else if(grade==2){
            System.out.println("大学二年级，少玩点游戏，不空虚，不慌嘛？");
        }else if(grade==3){
            System.out.println("大学三年级，专业课开始了，好好学，找份好工作");
        }else{
            System.out.println("大四了，要毕业了，因为有在好好学习，所以好工作搞定");
        }

        switch(grade){
            case 1:
                System.out.println("大学一年级");
                break;
            case 2:
                System.out.println("大学二年级");
                break;
            case 3:
                System.out.println("大学三年级");
                break;
            default:
                System.out.println("大四了，要毕业了");
                break;
        }
    }
}
