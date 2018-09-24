package unit_5;


/*
构造方法调用顺序：
        构造方法第一句总是：super(…)来调用父类对应的构造方法。所以，流程就是：
        先向上追溯到Object，
        然后再依次向下执行类的初始化块和构造方法，
        直到当前子类为止。

        object -> fatherclass -> children
        */

public class TestSuper02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass02对象......");
        new ChildClass02(); // 先调用父类构造器
    }
}
class FatherClass02 {
    public FatherClass02() {
        System.out.println("创建FatherClass02");
    }
}
class ChildClass02 extends FatherClass02 {
    public ChildClass02() {
        System.out.println("创建ChildClass02");
    }
}