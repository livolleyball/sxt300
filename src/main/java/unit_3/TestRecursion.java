package unit_3;
/*
 * 递归
 *    方法本身自己调用自己
 * 结构
 *   递归头 ： 定义不调用自身的情况
 *   递归体 ： 什么时候需要调用自身方法
 *
 * 尽量不要用递归
 * */


public class TestRecursion {
    public static void main(String[] agrs) {
//        a();
        long d1 = System.currentTimeMillis();
        System.out.println(factorial(20));
        long d2 = System.currentTimeMillis();
        System.out.println("递归耗时： " + (d2 - d1));


        long d3 = System.currentTimeMillis();
        System.out.println(factorialLoop(20));
        long d4 = System.currentTimeMillis();
        System.out.println("普通循环耗时： " + (d4 - d3));
    }

    static int cnt = 1;

    static void a() {
        System.out.println("a");
        cnt++;
        System.out.println("count is : " + cnt);
        if (cnt < 10) { // 递归体
            a();
        } else {
            return;   // 递归头
        }
    }

    // 递归函数 factorial
    static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            System.out.println("当前值是" + n);
            return n * factorial(n - 1);
        }

    }

    // 普通循环
    static long factorialLoop(int a) {
        long result = 1;
        while (a >= 2) {
            result *= a * (a - 1);
            a -= 2;
        }
        return result;
    }
}
