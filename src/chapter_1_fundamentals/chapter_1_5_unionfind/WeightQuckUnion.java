package chapter_1_fundamentals.chapter_1_5_unionfind;

/**
 * Created by xiang on 2016/12/21.
 * quck-union优化 加权quck-union
 * 每次union()都将小树连接的大树上这样深度不会像quck-union那么大
 */
public class WeightQuckUnion extends UF {

    private int[] sz;

    public WeightQuckUnion(int N) {
        super(N);
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public int find(int p) {
        int temp1 = p,temp2;
        while (p != id[p]) {
            p = id[p];
        }
        //路径压缩
        while(temp1!=id[p]){
            temp2 = temp1;
            temp1 = id[temp1];
            id[temp2] = id[p];
        }

        return p;
    }

    /**
     * 每次都连接到小树上
     * @param p
     * @param q 连通触点 p 和 q
     */
    @Override
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if (pid == qid) {
            return;
        }
        if (sz[pid] < sz[qid]) {
            id[pid] = qid;
            sz[qid]+=sz[pid];

        } else {
            id[qid] = pid;
            sz[pid]+= sz[qid];
        }
        count--;
    }
}
