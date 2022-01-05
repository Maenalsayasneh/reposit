package h0.u;

import h0.v.a.g;

/* compiled from: NullPaddedListDiffHelper.kt */
public final class p extends g.b {
    public final /* synthetic */ o a;
    public final /* synthetic */ o b;
    public final /* synthetic */ g.e c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public p(o<T> oVar, o oVar2, g.e eVar, int i, int i2) {
        this.a = oVar;
        this.b = oVar2;
        this.c = eVar;
        this.d = i;
        this.e = i2;
    }

    public boolean a(int i, int i2) {
        Object d2 = this.a.d(i);
        Object d3 = this.b.d(i2);
        if (d2 == d3) {
            return true;
        }
        return this.c.a(d2, d3);
    }

    public boolean b(int i, int i2) {
        Object d2 = this.a.d(i);
        Object d3 = this.b.d(i2);
        if (d2 == d3) {
            return true;
        }
        return this.c.b(d2, d3);
    }

    public Object c(int i, int i2) {
        Object d2 = this.a.d(i);
        Object d3 = this.b.d(i2);
        if (d2 == d3) {
            return Boolean.TRUE;
        }
        return this.c.c(d2, d3);
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.d;
    }
}
