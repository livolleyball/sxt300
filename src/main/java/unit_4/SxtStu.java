package unit_4;

/*
结构体
    class 父类 {
    }

    class 子类 extends 父类 {
    }

继承的特性
子类拥有父类非private的属性，方法。
子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。
子类可以用自己的方式实现父类的方法。
Java的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如A类继承B类，B类继承C类，
所以按照关系就是C类是B类的父类，B类是A类的父类，这是java继承区别于C++继承的一个特性。
提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。



*/

public class SxtStu {

    // 属性
    int id;
    String name;
    int age;

    Computer comp;
    // 方法
    void Study(){
        System.out.println(this.name + " is studying use " + comp.brand);
    }

    void Play(){
        System.out.println(this.name + " need to take a rest for one hour ");
    }

    // 主程序
    public static void main(String[] args ){
        SxtStu stu = new SxtStu(); // 创建一个对象
        stu.id=1001;
        stu.name = "Tom";
        stu.age =18;
        Computer c1=new Computer();
        c1.brand="sony";
        stu.comp=c1;

        stu.Play();
        stu.Study();
    }

}

class Computer{
    String brand;
}
