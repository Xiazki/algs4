package chapter_1_fundamentals.chapter_1_5_unionfind;

/**
 * Created by xiang on 2016/12/21.
 * 触点 :id[],数组索引代表每个触点
 * id[i]表示触点的标识
 * id[i] = id[j] 说明 i 和 j 是连通的
 */
public class QuickFind extends UF{

    public QuickFind(int N) {
        super(N);
    }

    @Override
    public int count() {
        return this.count;
    }

    /**
     * quck-find
     * 每次只用查找一次数组
     * @param p
     * @return
     */
    @Override
    public int find(int p) {
        return this.id[p];
    }

    /**
     * 缺点 每次都要遍历全部数组
     * @param p
     * @param q 连通触点 p 和 q
     */
    @Override
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if(pid == qid) {
            return;
        }
        for (int i = 0;i<id.length;i++){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
        count-- ;
    }
}
