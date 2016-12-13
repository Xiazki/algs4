package chapter_1_fundamentals.chapter_1_4_algorithmanalysis;

import org.junit.Test;
import org.junit.runners.Parameterized;


import java.util.Arrays;
import java.util.Calendar;

import static org.junit.Assert.*;

/**
 * Created by xiang on 2016/12/9.
 */
public class BinarySearchTest {

    @Test
    public void testRankMin(){
        int [] a = {1,2,1,5,6,7,3,5,3,2,5,9,8};
        Arrays.sort(a);
        for(int i = 0; i < a.length ; i++){
            System.out.print(a[i]+" \n"+i);
        }

        System.out.println(new BinarySearch().rankMin(a,5));
    }

    @Test
    public void test(){
       // System.out.println(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
        System.out.println(Integer.parseInt("09"));
    }
}