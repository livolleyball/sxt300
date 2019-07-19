package unit_7;

/*
java.util.Arrays类

排序、查找、填充、打印内容等常见的操作

*/
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

public class Test734 {
    public static void main(String[] args) {

        int[] a={1,2};
        System.out.println(a); // 打印数组引用的值
        System.out.println(Arrays.toString(a)); // 打印数组元素的值


        int[] paixu = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(paixu));
        Arrays.sort(paixu);
        System.out.println(Arrays.toString(paixu));

        //数组元素是引用类型的排序(Comparable接口的应用)
        Man[] msMans = { new Man(3, 20), new Man(60, 30), new Man(2, 25) };
        Arrays.sort(msMans);
        System.out.println(Arrays.toString(msMans));

        // 二分查找
        System.out.println(Arrays.toString(paixu));
        Arrays.sort(paixu);   //使用二分法查找，必须先对数组进行排序;
        System.out.println(Arrays.toString(paixu));
        //返回排序后新的索引位置,若未找到返回负数。
        System.out.println("该元素的索引："+Arrays.binarySearch(paixu, 23));

        // 数组填充
        int[] b= {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(b));
        Arrays.fill(b, 2, 4, 100);  //将2到4索引的元素替换为100;
        System.out.println(Arrays.toString(b));

    }
}
