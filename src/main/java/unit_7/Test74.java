package unit_7;


/*多维数组*/


import java.util.Arrays;

public class Test74 {
    public static void main(String[] args) {
        //二维数组的声明
        // Java中多维数组的声明和初始化应按从低维到高维的顺序进行
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[4];
        a[2] = new int[3];
        // int a1[][]=new int[][4];//非法
        System.out.println(a[2][2]);
        System.out.println(Arrays.toString(a[2]));


        /*二维数组的静态初始化*/
        int[][] b = { { 1, 2, 3 }, { 3, 4 }, { 3, 5, 6, 7 } };
        System.out.println(b[2][3]);


        /*  二维数组的动态初始化*/
        int[][] c = new int[3][];
        // a[0] = {1,2,5}; //错误，没有声明类型就初始化
        c[0] = new int[] { 1, 2 };
        c[1] = new int[] { 2, 2 };
        c[2] = new int[] { 2, 2, 3, 4 };
        System.out.println(c[2][3]);
        System.out.println(Arrays.toString(c[0]));
        System.out.println(Arrays.toString(c[1]));
        System.out.println(Arrays.toString(c[2]));
    }
}
