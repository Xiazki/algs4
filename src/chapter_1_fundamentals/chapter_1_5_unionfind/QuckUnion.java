package chapter_1_fundamentals.chapter_1_5_unionfind;

/**
 * Created by xiang on 2016/12/21.
 * 将触点id[]连通抽象成森林,树的大小为其结点的个数，每次find()找出根结点
 * union每次只连接根结点
 * 随着树的深度的增加，其find()查找访问数组次数越来越来多 每次约2N+1次
 */
public class QuckUnion extends UF {

    public QuckUnion(int N) {
        super(N);
    }

    @Override
    public int count() {
        return count;
    }

    /**
     * @param p
     * @return 触点的根节点的标识
     */
    @Override
    public int find(int p) {
        //寻找根结点，根节点id[i] == i
        while (p != id[p]) {
            p = id[p];
        }
        return p;
    }

    /**
     * 每次只将根节点进行连接，但是会造成每次连接可能将大树连接到小树上造成深度的额外增加
     * @param p
     * @param q 连通触点 p 和 q
     *
     */
    @Override
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);

        if (pid == qid){
            return;
        }
        id[p] = qid;
        count--;
    }
}
