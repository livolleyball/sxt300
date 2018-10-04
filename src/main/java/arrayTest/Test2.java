package arrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] score = new int[]{2,5,6,7,10};
        int maxNum = score[0];
        int maxIndex =0;
        System.out.println(Arrays.toString(score));


        for (int i=0;i<score.length;i++) {
            if(score[i]>maxNum){
                maxNum=score[i];
                maxIndex=i;
            }

        }
        System.out.println(maxIndex +"  " + maxNum);
    }
}