package unit_13.sxt.game01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    Image bg= GameUtil.getImage("images/bg.jpg");

    //paint方法作用是：画出整个窗口及内部内容。被系统自动调用。
    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();

        g.setColor(Color.red);
        g.drawImage(bg,0,0,null);
        //从坐标点(100,50)到(400,400)画出直线
        g.drawLine(100, 50, 400, 400);
        //画出矩形。矩形左上角顶点坐标(100,50)，宽度300，高度300
        g.drawRect(100, 50, 300, 300);
        //画出椭圆。椭圆外切矩形为：左上角顶点(100,50),宽度300，高度300
        g.drawOval(100, 50, 300, 300);
        // 填充矩形
        g.fillRect(100, 50, 40, 40);
//        g.drawString("1", 200, 200);

        g.setColor(c);
    }

    public void launchFrame() {
        this.setTitle("Game01");
        this.setVisible(true); // 窗口可见
        this.setSize(500, 500); // 大小
        this.setLocation(300, 300);  // 位置

//        匿名内部类
        this.addWindowListener(new WindowAdapter() {
            // 重写窗口关闭的方法
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }


        });

    }


    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
