package i0.j.b.t.j.b;

import h0.v.a.g;
import i0.j.b.p.b;
import java.util.List;

/* compiled from: VisitedScreensDiffUtils */
public class a extends g.b {
    public final List<b> a;
    public final List<b> b;

    public a(List<b> list, List<b> list2) {
        this.a = list;
        this.b = list2;
    }

    public boolean a(int i, int i2) {
        return this.b.get(i2).equals(this.a.get(i));
    }

    public boolean b(int i, int i2) {
        return this.a.get(i).a == this.b.get(i2).a;
    }

    public int d() {
        return this.b.size();
    }

    public int e() {
        return this.a.size();
    }
}
