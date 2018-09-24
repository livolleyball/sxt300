package unit_3;

/*
函数重载主要是为了解决两个问题。
（1）可变参数类型。
（2） 可变参数个数。

重载：一个类的两个方法拥有相同的名字，但是有不同的参数列表。
        Java编译器根据方法签名判断哪个方法应该被调用。
        方法重载可以让程序更清晰易读。执行密切相关任务的方法应该使用相同的名字。
        重载的方法必须拥有不同的参数列表。你不能仅仅依据修饰符或者返回类型的不同来重载方法。*/

public class TestOverload {
    public static int add(int a,int b){
        int result;
        result=a+b;
        return result;
    }
    // 方法名相同，参数个数不同，构成重载
    public static int add(int a,int b,int c){
        int result;
        result=a+b+c;
        return result;
    }
    // 参数类型不同
    public static double add(double a,int b){
        double result;
        result=a+b+1;
        return result;
    }
    //参数顺序不同
    public static double add(int a,double b){
        double result;
        result=a+b+2;
        return result;
    }

/*  只有返回值不同，不能构成重载
    public static double add(int a,int b){
        double result;
        result=a+b;
        return result;
    } */

/*  只有参数名称不同，不能构成重载
public static int add(int c,int b){
        int result;
        result=c+b;
        return result;
    }*/
    public static void main(String[] args){
        System.out.println("两个参数："+add(10,20));
        System.out.println("三个参数："+add(10,20,30));
        System.out.println("两个参数,参数类型不同："+add(10.0,20)); //31.0
        System.out.println("两个参数，参数顺序不同："+add(10,20.0)); //32.0
    }
}
