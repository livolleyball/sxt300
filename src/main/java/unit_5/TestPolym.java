package unit_5;


/*   多态的要点：
           1. 多态是方法的多态，不是属性的多态(多态与属性无关)。
           2. 多态的存在要有3个必要条件：继承，方法重写，父类引用指向子类对象。
           3. 父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了。*/

/*
final关键字的作用：
        1. 修饰变量: 被他修饰的变量不可改变。一旦赋了初值，就不能被重新赋值。
final  int   MAX_SPEED = 120;
        2. 修饰方法：该方法不可被子类重写。但是可以被重载! 参考 TestOverload
final  void  study(){}
        3. 修饰类: 修饰的类不能被继承。比如：Math、String等。
        */

class Animal {
    public  void shout() {
        System.out.println("叫了一声！");
    }
    public final int add(int a,int b){
        int result;
        result=a+b;
        return result;
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }

    public final int add(int a,int b,int c){  //  被子类重载
        int result;
        result=a+b+c;
        return result;
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}
public class TestPolym {
    public static void main(String[] args) {
        Animal a1 = new Cat(); // 向上可以自动转型
        //传的具体是哪一个类就调用哪一个类的方法。大大提高了程序的可扩展性。
        animalCry(a1);
        a1.shout();
        Animal a2 = new Dog();
        a2.shout();
        animalCry(a2);//a2为编译类型，Dog对象才是运行时类型。
//        a2.seeDoor();
        ((Dog) a2).seeDoor();

        //编写程序时，如果想调用运行时类型的方法，只能进行强制类型转换。
        // 否则通不过编译器的检查。
        Dog dog = (Dog)a2;//向下需要强制类型转换 将 animal 转换成dog
        dog.seeDoor();
    }

    // 有了多态，只需要让增加的这个类继承Animal类就可以了。
    static void animalCry(Animal a) {
        a.shout();
    }

    /* 如果没有多态，我们这里需要写很多重载的方法。
     * 每增加一种动物，就需要重载一种动物的喊叫方法。非常麻烦。
    static void animalCry(Dog d) {
        d.shout();
    }
    static void animalCry(Cat c) {
        c.shout();
    }*/
}