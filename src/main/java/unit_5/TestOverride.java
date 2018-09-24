package unit_5;

/*
方法的重写需要符合下面的三个要点：
        1.“==”： 方法名、形参列表相同。
        2.“≤”：返回值类型和声明异常类型，子类小于等于父类。
        3.“≥”： 访问权限，子类大于等于父类。
*/

public class TestOverride {
    public static void main(String[] args){
        Horse h = new Horse();
        h.run();  //跑 ～
        h.run(3);  // 马踏飞燕 3
    }
}


class Vehicle{
    public void run(){
        System.out.println("跑 ～");
    }

    public void stop(){
        System.out.println("停止～");
    }

    public Person p1(){
        return new Person();
    }
}

class Horse extends Vehicle{
    public void run(int cnt){
        System.out.println("马踏飞燕 "+cnt);
    }
    public Student p1(){
        return new Student("Tom",175,"computor");
    }

}