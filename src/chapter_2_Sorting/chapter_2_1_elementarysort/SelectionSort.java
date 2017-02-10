package chapter_2_Sorting.chapter_2_1_elementarysort;

/**
 * Created by xiang
 * 选择排序是一种较初级的排序
 * 首先找到最小的放在第一个，然后从第二个开始找到最小的放在第二个，依次类推。
 * 最好O(n^2)
 * 最坏O(n^2)
 * 平均O(n^2)
 */
public class SelectionSort {

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            Comparable min = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(min) < 0) {
                    min = a[j];
                }
            }
            a[i] = min;
        }
    }
}
