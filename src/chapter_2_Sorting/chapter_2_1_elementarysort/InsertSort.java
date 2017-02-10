package chapter_2_Sorting.chapter_2_1_elementarysort;

/**
 * Created by xiang
 * 插入排序将元素插入到前面已经排序的子数组中
 * 最坏O(n^2)
 * 最好O(n)
 * 平均O(n^2)
 */
public class InsertSort {
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
          for(int j = i;j>0&&a[j].compareTo(a[j-1])<0;j--){
              Comparable temp = a[j];
              a[j] = a[j-1];
              a[j-1] = a[i];
          }
        }
    }
}
