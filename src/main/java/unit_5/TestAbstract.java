package unit_5;

/*
·抽象方法
        使用abstract修饰的方法，没有方法体，只有声明。定义的是一种“规范”，就是告诉子类必须要给抽象方法提供具体的实现。
·抽象类
        包含抽象方法的类就是抽象类。通过abstract方法定义规范，然后要求子类必须定义具体实现。通过抽象类，
        我们就可以做到严格限制子类的设计，使子类之间更加通用。

有抽象方法的类只能定义成抽象类
抽象类不能实例化，即不能用new来实例化抽象类。
抽象类可以包含属性、方法、构造方法。但是构造方法不能用来new实例，只能用来被子类调用
抽象类只能用来被继承。
抽象方法必须被子类实现。
*/

//抽象类
abstract class Animal01 {
    abstract public void shout();  //抽象方法
}
class Dog01 extends Animal01 {
    //子类必须实现父类的抽象方法，否则编译错误
    public void shout() {
        System.out.println("汪汪汪！");
    }
    public void seeDoor(){
        System.out.println("看门中....");
    }
}
public class TestAbstract {
    public static void main(String[] args) {
        Dog01 a = new Dog01();
        a.shout();
        a.seeDoor();
    }
}
