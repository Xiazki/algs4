package chapter_1_fundamentals.chapter_1_4_algorithmanalysis.Exercise;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xiang on 2016/12/9.
 */
public class PartOfIntegerCountTest {

    @Test
    public void testCount() throws Exception {
        int [] a = new int[]{1,2,4,2,5,7,8,9,34,3,5,2,6,3,22,3,45,67,2,12,11,34,2,22};
        System.out.println(new PartOfIntegerCount().count(a));
    }
}