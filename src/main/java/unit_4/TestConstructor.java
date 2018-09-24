package unit_4;

/*
要点
1 通过new关键字调用；
2 构造器虽然有返回值，但是不能定义返回值类型（返回值的类型肯定是本类），不能在构造器里使用return 返回某个值；
3 如果我们没有定义构造器，则编译器会自动定义一个无参数的构造器。如果已定以则编译器不会自动添加！
4 构造器的方法名必须和类名一致；
*/

/*
构造方法重载规则和函数重载规则一致
*/



class Point{
    double x,y,z;

    // 构造方法 方法名称必须和类名保持一致
    public Point(double _x, double _y ){
        x=_x;
        y=_y;
    }

    public Point(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public double getDistance(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
    }

    public double getDistance3D(Point p){
        return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
    }

}

public class TestConstructor {
    public static void main(String[] args){
        Point p=new Point(3.0,4.0);
        Point origin = new Point(0.0,0.0);
        System.out.println(origin.getDistance(p));
        System.out.println(p.getDistance(origin));

        Point p3=new Point(3.0,4.0,5.0);
        Point origin3 = new Point(0.0,0.0,0.0);
        System.out.println(p3.getDistance(origin3));
        System.out.println(p3.getDistance3D(origin3));

    }
}
