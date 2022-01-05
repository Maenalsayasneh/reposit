package h0.u;

import androidx.paging.LoadType;
import androidx.paging.PageEvent;
import h0.u.h0;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;

/* compiled from: PagePresenter.kt */
public final class s<T> implements o<T> {
    public static final s<Object> a = new s<>(PageEvent.Insert.a);
    public static final a b = new a((f) null);
    public final List<f0<T>> c;
    public int d;
    public int e;
    public int f;

    /* compiled from: PagePresenter.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: PagePresenter.kt */
    public interface b {
        void a(LoadType loadType, boolean z, j jVar);
    }

    static {
        PageEvent.Insert.a aVar = PageEvent.Insert.b;
    }

    public s(PageEvent.Insert<T> insert) {
        i.e(insert, "insertEvent");
        this.c = g.A0(insert.d);
        this.d = h(insert.d);
        this.e = insert.e;
        this.f = insert.f;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public T d(int i) {
        int size = this.c.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = this.c.get(i2).d.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return this.c.get(i2).d.get(i);
    }

    public int e() {
        return this.e + this.d + this.f;
    }

    public final h0.a f(int i) {
        int i2 = i - this.e;
        int i3 = 0;
        while (i2 >= this.c.get(i3).d.size() && i3 < g.y(this.c)) {
            i2 -= this.c.get(i3).d.size();
            i3++;
        }
        f0 f0Var = this.c.get(i3);
        int i4 = i - this.e;
        int e2 = ((e() - i) - this.f) - 1;
        int i5 = i();
        int j = j();
        int i6 = f0Var.e;
        List<Integer> list = f0Var.f;
        if (list != null && g.x(list).k(i2)) {
            i2 = f0Var.f.get(i2).intValue();
        }
        return new h0.a(i6, i2, i4, e2, i5, j);
    }

    public final int g(e eVar) {
        boolean z;
        Iterator<f0<T>> it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            f0 next = it.next();
            int[] iArr = next.c;
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                } else if (eVar.k(iArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                i += next.d.size();
                it.remove();
            }
        }
        return i;
    }

    public final int h(List<f0<T>> list) {
        int i = 0;
        for (f0 f0Var : list) {
            i += f0Var.d.size();
        }
        return i;
    }

    public final int i() {
        Integer num;
        int[] iArr = ((f0) g.u(this.c)).c;
        i.e(iArr, "$this$minOrNull");
        int i = 1;
        if (iArr.length == 0) {
            num = null;
        } else {
            int i2 = iArr[0];
            int s1 = h.s1(iArr);
            if (1 <= s1) {
                while (true) {
                    int i3 = iArr[i];
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    if (i == s1) {
                        break;
                    }
                    i++;
                }
            }
            num = Integer.valueOf(i2);
        }
        i.c(num);
        return num.intValue();
    }

    public final int j() {
        Integer num;
        int[] iArr = ((f0) g.G(this.c)).c;
        i.e(iArr, "$this$maxOrNull");
        int i = 1;
        if (iArr.length == 0) {
            num = null;
        } else {
            int i2 = iArr[0];
            int s1 = h.s1(iArr);
            if (1 <= s1) {
                while (true) {
                    int i3 = iArr[i];
                    if (i2 < i3) {
                        i2 = i3;
                    }
                    if (i == s1) {
                        break;
                    }
                    i++;
                }
            }
            num = Integer.valueOf(i2);
        }
        i.c(num);
        return num.intValue();
    }

    public String toString() {
        int i = this.d;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(d(i2));
        }
        String E = g.E(arrayList, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63);
        StringBuilder P0 = i0.d.a.a.a.P0("[(");
        P0.append(this.e);
        P0.append(" placeholders), ");
        P0.append(E);
        P0.append(", (");
        return i0.d.a.a.a.u0(P0, this.f, " placeholders)]");
    }
}
