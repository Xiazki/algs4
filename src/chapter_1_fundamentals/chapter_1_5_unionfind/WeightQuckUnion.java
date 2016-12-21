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
            sz[i] = i;
        }
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
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
        if (sz[p] < sz[q]) {
            id[q] = pid;
        } else {
            id[p] = qid;
        }
        count--;
    }
}
