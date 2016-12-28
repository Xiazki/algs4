package chapter_1_fundamentals.chapter_1_5_unionfind.exercise;

import chapter_1_fundamentals.chapter_1_5_unionfind.UF;
import chapter_1_fundamentals.chapter_1_5_unionfind.WeightQuckUnion;

import java.util.Random;

/**
 * Created by xiang on 2016/12/28.
 */
public class ErdosRenyi {

    public static int count(int N){
        int eages = 0;
        UF uf = new WeightQuckUnion(N);
        Random r = new Random();
        while(uf.count()>1){
            int i = r.nextInt(N);
            int j = r.nextInt(N);
            if(!uf.connected(i,j)){
                uf.union(i,j);
            }
            eages++;
        }
        return eages;
    }

    public static void main(String[] args) {
        int N = 20;
        int ret = count(N);
        System.out.println(ret);
    }

}
