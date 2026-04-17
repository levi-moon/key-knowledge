package com.levi.java;

/**
 * @ClassName: NearestFiveOrZero
 * @Description: TODO
 * @Author: Levi
 * @Date: 2025/9/30 9:09
 */
public class NearestFiveOrZero {

    public static void main(String[] args) {
        int number = 17; // 示例数字
        int[] ints = findNearest(number);
        System.out.println(5 % 10); // 5
        System.out.println("最近的较大个位数是5或0的数字是: " + ints[0]); // 最近的较大个位数是5或0的数字是: 20
        System.out.println("最近的较小个位数是5或0的数字是: " + ints[1]); // 最近的较小个位数是5或0的数字是: 10
    }

    public static int[] findNearest(int number) {
        int lastDigit = number % 10; // 获取个位数
        int nearestBigFiveOrZero;
        int nearestSmallFiveOrZero;

        if (lastDigit == 5 || lastDigit == 0) {
            // 如果已经是5或0，则不需要调整
            nearestBigFiveOrZero = number + 5;
            nearestSmallFiveOrZero = number - 5;
        } else if (lastDigit < 5) {
            // 如果个位数小于5，则最近的5或0是5
            nearestBigFiveOrZero = number + (5 - lastDigit);
            if(number < 5){
                nearestSmallFiveOrZero = 0;
            }else {
                nearestSmallFiveOrZero = number - lastDigit;
            }
        } else {
            // 如果个位数大于等于5，则最近的5或0是0（除非已经是0，否则总是增加到下一个0）
            nearestBigFiveOrZero = number + (10 - lastDigit);
            nearestSmallFiveOrZero = number - lastDigit;
        }
        int[] ints = new int[]{nearestBigFiveOrZero, nearestSmallFiveOrZero};
        return ints;
    }


}
