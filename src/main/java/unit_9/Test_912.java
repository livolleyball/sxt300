package unit_9;



import java.util.*;

/*
容器相关类都定义了泛型，我们在开发和工作中，在使用容器类时都要使用泛型。这样，在容器的存储数据、读取数据时都避免了大量的类型判断，非常便捷。
*/

public class Test_912 {

    public static void main(String[] args) {

        // 以下代码中List、Set、Map、Iterator都是与容器相关的接口;
        List<String> list = new ArrayList<String>();
 
        Set<Man> mans =new HashSet<Man>();
        Map<Integer, Man> maps = new HashMap<Integer, Man>();
        Iterator<Man> iterator = mans.iterator();
    }
}

class Man {

}