package chapter_1_fundamentals.chapter_1_4_algorithmanalysis.Exercise;


import java.util.Arrays;

/**
 * Created by xiang on 2016/12/9.
 * 1.4 练习1.4.8 统计数组中相等的整数对数
 * 时间复杂度对数数量级
 */
public class PartOfIntegerCount {

    /**
     *
     * @param datas
     * @return
     * <p>
     *     数组 datas 中 整数对个数
     * </p>
     */
    public static int count(int [] datas){

        int ret = 0;
        Arrays.sort(datas);
        for(int i = 0;i<datas.length-1;i++ ){
            if(datas[i] == datas[i+1]){
                ret++;
            }
        }
        return ret;
    }

}
