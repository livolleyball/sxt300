package unit_3;

public class TestLabelContinue {
    public static void main(String args[]) {
        // 打印 101～150 之间所有的质数
        outer:
        for (int i = 101; i < 150; i++) {
            for (int j = 2; j <= (int) (i / 2); j++) {
                if (i % j == 0) {
                    continue outer; // 出现一个整除，就跳至外层循环
                }
            }
            System.out.println(i);
        }
    }
}
