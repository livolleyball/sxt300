package unit_13.sxt.game02;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    Image bg = GameUtil.getImage("images/bg.jpg");
    Image planet = GameUtil.getImage("images/plane.png");

    int planeX=250,planeY=250;

    private Image offScreenImage = null;

    public void update(Graphics g) {
        if(offScreenImage == null)
            offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度

        Graphics gOff = offScreenImage.getGraphics();
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }

    //paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();

        g.setColor(Color.red);
        g.drawImage(bg, 0, 0, null);
        g.drawImage(planet, planeX, planeY, null);
        planeX++;

    }

    class PaintThread extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("窗口重画一次");
                repaint();
                try {

                    Thread.sleep(40);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void launchFrame() {
        this.setTitle("Game01");
        this.setVisible(true); // 窗口可见
        this.setSize(800, 700); // 大小
        this.setLocation(300, 300);  // 位置

//        匿名内部类
        this.addWindowListener(new WindowAdapter() {
            // 重写窗口关闭的方法
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new PaintThread().start();  //启动重画线程

    }


    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
