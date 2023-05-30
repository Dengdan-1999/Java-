import javax.swing.JFrame;
import java.awt.*;

public class BallGame extends JFrame {
    //窗口加载

    Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x=100;
    double y=100;
    boolean right=true;
    double degree=3.14/3;

    public void paint(Graphics g){
        System.out.println("窗口被画了一次！");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        x=x+10*Math.cos(degree);
        y=y+10*Math.sin(degree);

        if(right){
            x=x+10;
        }else{
            x=x-10;
        }

        if(y>500-40-30||y<40+40){
            degree=-degree;
        }
        if(x<40||x>856-40-30){
            degree=3.14-degree;
        }
    }

    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

        while(true){
            repaint();
            try{
                Thread.sleep(40);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        System.out.println("我是尚学堂高琪，这个游戏项目让大家体验编程的快感，寓教于乐");
        BallGame game=new BallGame();
        game.launchFrame();
    }

}
