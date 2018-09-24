package unit_5;

public class TestEncapsulation {
    public static void main(String[] args){
        Human h=new Human();
    }

}

class Human{
    private int age;  //表示私有，只有自己类能访问
    protected int id;  //表示可以被同一个包的类以及其他包中的子类访问
    String name;      //表示没有修饰符修饰，只有同一个包的类能访问
//    public表示可以被该项目的所有包中的所有类访问
    void sayAge(){
        System.out.println(age);
    }
}


class Boy extends Human{
    void sayHello(){
        System.out.printf("hello , %d year old boy ",name);
//        System.out.printf("hello , %d year old boy ",age);  // 子类无法使用父类的私有属性和方法
        System.out.printf("hello , id is  %d  ",id);
    }

}