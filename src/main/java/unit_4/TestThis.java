package unit_4;

/*
创建一个对象分为以下4步：
1 分配对象空间，并将对象成员变量初始化为0 或者空
2 执行属性值的显式执行
3 执行构造方法
4 返回对象的地址给相关的变量

this 的本质是 创建好的对象的地址。 在构造方法中也可以使用this 代表"当前对象"
this 不能用于 static 方法中
*/


public class TestThis {
    int a,b,c;
    TestThis(int a ,int b){
        this.a=a;
        this.b=b;
    }

    TestThis(int a,int b,int c){
        this(a,b);  // 调用本类中构造方法
        this.c=c;
    }

    void sing(){
        System.out.println("唱歌");
    }

    void singAndEat(){
        this.sing();  // 调用本类中的方法
        System.out.println("吃饭");
    }

    public static void main(String[] args){
        TestThis hi = new TestThis(2,3,1);
        hi.singAndEat();
    }

}
