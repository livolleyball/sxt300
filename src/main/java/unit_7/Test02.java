package unit_7;

/*
静态初始化
      除了用new关键字来产生数组以外，还可以直接在定义数组的同时就为数组元素分配空间并赋值。
动态初始化
        数组定义与为数组元素分配空间并赋值的操作分开进行。

        */
public class Test02 {
    public static void main(String[] args) {
        int[] b = {1, 2, 3}; // 静态初始化

        int[] a1 = new int[2];//动态初始化数组，先分配空间；
        a1[0] = 1;//给数组元素赋值；
        a1[1] = 2;//给数组元素赋值；

        Man[] a = {new Man(1, 2),
                new Man(3, 4),
                new Man(5, 6)};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("#########################");

/*        1. for-each增强for循环在遍历数组过程中不能修改数组中某元素的值。
        2. for-each仅适用于遍历，不涉及有关索引(下标)的操作。*/

        for (Man m : a) {
            System.out.println(m);
        }
    }
}
