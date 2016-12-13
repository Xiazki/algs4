package chapter_1_fundamentals.chapter_1_4_algorithmanalysis;

import java.util.Arrays;

/**
 * Created by xiang on 2016/12/5.
 * 数组中某几个数相加等于0的个数
 */
public class ArraySumToZero {

    /**
     *
     * @param a
     * @return 数组中两个数相加等于0的个数。
     * 先将数组排序，再使用二分查找查找数值num(位置i) 的相反数 -num 的位置j,
     * 如果j>i说明 这个数有相反数，而且在这个数的后面。(左边是最小的，右边是最大的)
     * <p>
     *     时间复杂度:Nlog(N)的正比
     * </p>
     */
    public static int count_2(int[] a){
        int cnt = 0;
        Arrays.sort(a);//快速排序是基于分治算法所以时间复杂都Nlog(N)

        //单层for，时间复杂都为N
        //while（）二分法时间复杂都Log(N)
        for(int i=0;i<a.length;i++){
            if(BinarySearch.rank(a,-a[i])>i){
                cnt++;
            }
        }
        return cnt;
    }

    /**
     *
     * @param a
     * @return 数组a中三个数相加等于0的个数
     *  类似两个数相加的情况，只需将前两个数(第二个数的位置j)相加的值 num，查找其相反数的位置idx。若idx>j 说明这三个数相加==0
     *  <p>
     *      时间复杂度:N^2log(N)的正比
     *  </p>
     */
    public static int count_3(int[] a){
        int cnt = 0;
        Arrays.sort(a);
        //双层for N^2 下面的时间复杂度为N^2log(N)
        for(int i = 0;i<a.length;i++)
            for (int j = i+1;j< a.length;j++){
                if(BinarySearch.rank(a,-a[i]-a[j]) > j){
                    cnt++;
                }
            }
        return cnt;
    }

    public static void main(String[] args){
        int[] testSum_2 = new int[]{
          1,2,3,4,6,9,-2,-4,-1,-5,10,11,-13
        };
        int[] testSum_3 = new int[]{
          1,2,3,-3
        };
        System.out.println(count_2(testSum_2));
        System.out.println(count_3(testSum_3));
    }
}
