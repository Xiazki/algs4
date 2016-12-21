package chapter_1_fundamentals.chapter_1_4_algorithmanalysis.Exercise;

/**
 * Created by xiang on 2016/12/15.
 * 双调数组
 */
public class BitonicMax {

    /**
     * 构造双调数组
     *
     * @param N
     * @return <p> 返回以个长度为n的双调数组</p>
     */
    public static int[] bitonic(int N) {
        return null;
    }

    /**
     * @return <p>返回双调数组中的最大值索引</p>
     */
    public static int max(int[] array, int start, int end) {
        if (start == end) return end;
        int mid = start + (end - start) / 2;
        if (array[mid] < array[mid + 1]) return max(array, mid + 1, end);
        if (array[mid] > array[mid + 1]) return max(array, start, mid);
        return mid;
    }

    /**
     * 双调数组是否包含key
     * 比较次数最多3lgN
     *
     * 找到最大(lgN)的然后分别进行二分查找(lgN)
     * @param array
     * @param key
     * @return
     */
    public static boolean contain(int[] array, int key) {
        int max = max(array, 0, array.length - 1);
        System.out.println("the max number of index is :"+max);
        if (key == array[max]) {
            return true;
        } else if (key > array[max]) {
            return false;
        } else {
            int low = 0;
            int high = max - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (array[mid] > key) {
                    high = mid - 1;
                } else if (array[mid] < key) {
                    low = mid + 1;
                } else
                    return true;
            }
            low = max + 1;
            high = array.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (array[mid] < key) {
                    high = mid - 1;
                } else if (array[mid] > key) {
                    low = mid + 1;
                } else
                    return true;
            }

            return false;
        }

    }


}
