package m0.r.t.a.r.f.c;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.j.a;
import m0.j.f;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: BinaryVersion.kt */
public abstract class a {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List<Integer> e;

    public a(int... iArr) {
        List<Integer> list;
        i.e(iArr, "numbers");
        this.a = iArr;
        Integer w1 = h.w1(iArr, 0);
        int i = -1;
        this.b = w1 == null ? -1 : w1.intValue();
        Integer w12 = h.w1(iArr, 1);
        this.c = w12 == null ? -1 : w12.intValue();
        Integer w13 = h.w1(iArr, 2);
        this.d = w13 != null ? w13.intValue() : i;
        if (iArr.length > 3) {
            i.e(iArr, "$this$asList");
            list = g.v0(new a.c(new f(iArr), 3, iArr.length));
        } else {
            list = EmptyList.c;
        }
        this.e = list;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        if (i5 < i2) {
            return false;
        }
        if (this.d >= i3) {
            return true;
        }
        return false;
    }

    public final boolean b(a aVar) {
        i.e(aVar, "ourVersion");
        int i = this.b;
        if (i == 0) {
            if (aVar.b == 0 && this.c == aVar.c) {
                return true;
            }
        } else if (i == aVar.b && this.c <= aVar.c) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj != null && i.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && i.a(this.e, aVar.e);
        }
    }

    public int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public String toString() {
        int[] iArr = this.a;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : g.E(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }
}
