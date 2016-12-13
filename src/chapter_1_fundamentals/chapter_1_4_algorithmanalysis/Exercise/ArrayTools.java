package chapter_1_fundamentals.chapter_1_4_algorithmanalysis.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by xiang on 2016/12/13.
 */
public class ArrayTools {

    /**
     * 找出数组中差值最小的两个数，要求时间复杂度是线性对数级别的
     *
     * @param array
     * @return 返回差值最小的两个数和及其索引
     */
    public static int[] getSmallestDifference(int[] array) {
        if (array.length < 2) {
            throw new IndexOutOfBoundsException("array length must be greater than 2");
        }
        Arrays.sort(array);
        int min = Math.abs(array[0] - array[1]);
        int[] temp = new int[2];
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i] - array[i + 1]) < min) {
                min = Math.abs(array[i] - array[i + 1]);
                temp[0] = array[i];
                temp[1] = array[i + 1];
            }
        }
        return temp;
    }

    /**
     * 找出最远的一对 线性复杂度
     *
     * @param array
     * @return
     */
    public static int[] getFarestTwoNum(int[] array) {
        if (array.length < 2) {
            throw new IndexOutOfBoundsException("array length must greater than 2");
        }
        int max = array[0];
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            } else if (array[i] <= min) {
                min = array[i];
            }
        }
        int[] ret = new int[2];
        ret[0] = min;
        ret[1] = max;
        return ret;
    }

    /**
     * 找到局部最小值
     *a[i]<a[i-1]&&a[i]<a[i+1] 且 a[i]!=a[i+1]
     * a[-1]=a[n]=无限大
     * @param array
     * @return
     */
    public static int findPeakElement(int[] array) {
        if (array.length == 1) {
            return 0;
        }
        if (array[0] < array[1]) {
            return 0;
        }
        if (array[array.length - 1] < array[array.length - 2]) {
            return array.length - 1;
        }
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if(array[mid]<array[mid-1]&&array[mid]<array[mid+1]){
                return mid;
            }else if(array[mid]>array[mid+1]){
                low = mid+1;
            }else if(array[mid-1]<array[mid]){
                high = mid-1;
            }
        }
        return low;
    }
}
