package arrayTest;

import java.util.Arrays;

public class bubbleSort {
    public static void bubbleSort(int[] numbers) {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1])  //交换两数位置
                {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] score = new int[]{12,5,6,6,-7,10};
        bubbleSort(score);
        System.out.println(Arrays.toString(score));
    }

}
