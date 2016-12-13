package chapter_1_fundamentals.chapter_1_4_algorithmanalysis.Exercise;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xiang on 2016/12/13.
 */
public class ArrayToolsTest {

    @Test
    public void testGetSmallestDifference(){
        int [] data = {-1,3,2,4,1,56,77,88,44,22,11,211,2,33,43};
        for(int temp : ArrayTools.getSmallestDifference(data)){
            System.out.println(temp);
        }
    }
    @Test
    public void testFindPeakElement(){
        int[] data = {-4,-5,-2,-1,4,3,1,2};
        System.out.println(ArrayTools.findPeakElement(data));
    }
}