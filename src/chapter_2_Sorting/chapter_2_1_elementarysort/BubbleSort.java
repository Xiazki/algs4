package chapter_2_Sorting.chapter_2_1_elementarysort;

/**
 * Created by xiang
 * 冒泡排序
 * 每次比较都进行交换
 * 最好、最坏、平均 O(n^2)
 */
public class BubbleSort {

    public static void sort(Comparable[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) < 0) {
                    Comparable temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
