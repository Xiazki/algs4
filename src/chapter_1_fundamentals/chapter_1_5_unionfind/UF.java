package chapter_1_fundamentals.chapter_1_5_unionfind;

/**
 * Created by xiang on 2016/12/21.
 * union-find api
 */
public abstract class UF {

    protected int count;
    protected int[] id;

    public UF(int N) {
        this.count = N;
        this.id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * @return 连通分量的个数
     */
    public abstract int count();

    /**
     * @param p
     * @param q
     * @return <p> p q 是否连通
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    ;

    /**
     * @param p
     * @return <p>
     * 返回触点p的标识
     * </p>
     */
    public abstract int find(int p);

    /**
     * @param p
     * @param q 连通触点 p 和 q
     */
    public abstract void union(int p, int q);
}
