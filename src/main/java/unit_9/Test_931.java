package unit_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_931 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println(list.isEmpty()); // 判断容器中有没有元素
        list.add("libai");
        System.out.println(list.isEmpty()); // 判断容器中有没有元素
        list.add("baijuyi");
        list.add("dufu");
        System.out.println(list);
        System.out.println("list 的大小 :" + list.size());
        System.out.println("是否包含指定元素：" + list.contains("libai"));
        list.remove("高淇");
        System.out.println(list);
        Object[] objs = list.toArray();
        System.out.println("转化成Object数组：" + Arrays.toString(objs));
        list.clear();
        System.out.println("清空所有元素：" + list);


    }

}

