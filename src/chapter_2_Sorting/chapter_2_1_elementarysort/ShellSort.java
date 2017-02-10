package chapter_2_Sorting.chapter_2_1_elementarysort;

/**
 * Created by xiang.
 * 希尔排序的思想是间隔h的数组是有序的
 * 最好O(n)
 * 最坏O(n^2)
 */
public class ShellSort {

    public static void sort(Comparable[] a){
        int N = a.length;
        int h = 1;
        while (h<N/3) h=3*h+1;
        while (h>=1){
            for(int i = h;i<N;i++){
                for(int j = h;j>=h&&a[j].compareTo(a[j-1])<0;j-=h){
                    Comparable temp = a[j];
                    a[j] = a[j-h];
                    a[j-h] = temp;
                }
            }
        }
        h/=3;
    }
}
