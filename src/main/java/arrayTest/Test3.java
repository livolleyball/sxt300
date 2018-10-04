package arrayTest;

/*

1）精辟阐述：
        可以将 ArrayList想象成一种“会自动扩增容量的Array”。

        2）Array（[]）：最高效；但是其容量固定且无法动态改变；
        ArrayList：  容量可动态增长；但牺牲效率；

        3）建议：
        基于效率和类型检验，应尽可能使用Array，无法确定数组大小时才使用ArrayList！
        不过当你试着解决更一般化的问题时，Array的功能就可能过于受限。
*/

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<Integer> score = new ArrayList<Integer>();
        score.clear();
        score.add(0, 1);
        score.add(1, 3);

        System.out.println("Before " + score.toString());
        score.remove(1);
        System.out.println("After " + score.toString());
    }
}
