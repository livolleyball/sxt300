package arrayTest;

import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] score = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第 " + i + " 个学生的成绩：");
            int num = sc.nextInt();
            score[i - 1] = num;
            sum += num;
        }
        System.out.println(sum);
        System.out.println(sum / 5);
        for (int n : score) {
            System.out.println(n);
            System.out.print(",");
        }
    }
}
