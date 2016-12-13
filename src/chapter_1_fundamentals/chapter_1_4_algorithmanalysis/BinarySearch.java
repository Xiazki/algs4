package chapter_1_fundamentals.chapter_1_4_algorithmanalysis;

import java.util.Arrays;

/**
 * Created by xiang on 2016/12/5.
 * 二分查找，数组必须是有序的
 */
public class BinarySearch {

    /**
     * @return 返回数组array中value的位置，没有返回-1
     */
    public static int rank(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (array[mid] > value) {
                last = mid - 1;
            } else if (array[mid] < value) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 找到key的最小索引
     *
     * @param array
     * @param key
     * @return <p>
     * 返回key的最小索引值，没有返回-1
     * </p>
     */
    public static int rankMin(int[] array, int key) {
        int first = 0;
        int last = array.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] > key) {
                last = mid - 1;
            } else if (mid != 0 && array[mid - 1] == key) {
                last = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 练习1.4.22
     * 只使用加法或减法实现二分查找，运行时间与logN成正比
     * 这种方法也叫斐波那契查找或黄金分割法查找
     * 每次不是折半，而是按照F[n] = F[n-1] + F[n-2]将数组扩展成F[n]长度，并每次分割为F[n-1]和 F[n-2]
     * array为升序数组
     * @param array
     * @param key
     * @return <p> 有返回indx，没有返回 -1
     */
    public static int fibonacciSearch(int[] array, int key) {

        int[] f = fibonacci();
        int k = 0;
        while(array.length>f[k]-1) //f[k]数列是从1开始的，数组是从0开始的，所以需要-1
            ++k;
        int [] temp = Arrays.copyOf(array,f[k]-1);

        for(int i = array.length;i<f[k]-1;i++){
            temp[i] = array[array.length-1];
        }
        int low = 0;
        int high = array.length-1;
        while(low <= high){
            int mid = low + f[k-1]-1;//与折半查找的区别
            if(key < array[mid]){
                k-=1;
                high = mid-1;
            }else if(key > array[mid]){
                low = mid + 1;
                k -= 2;
            }else {
                if(mid<array.length){
                    return mid;
                }else {
                    return array.length-1;
                }
            }
        }

        return -1;
    }

    public static int[] fibonacci(){
        int f[] = new int[20];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2;i<f.length;i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f;
    }
}
