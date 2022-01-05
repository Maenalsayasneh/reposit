package m0.r.t.a.r.o;

import m0.n.a.l;

/* compiled from: DFS */
public final class a extends b<N, Boolean> {
    public final /* synthetic */ l a;
    public final /* synthetic */ boolean[] b;

    public a(l lVar, boolean[] zArr) {
        this.a = lVar;
        this.b = zArr;
    }

    public Object a() {
        return Boolean.valueOf(this.b[0]);
    }

    public boolean c(N n) {
        if (((Boolean) this.a.invoke(n)).booleanValue()) {
            this.b[0] = true;
        }
        return !this.b[0];
    }
}
