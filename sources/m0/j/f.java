package m0.j;

import i0.j.f.p.h;
import java.util.RandomAccess;
import m0.n.b.i;

/* compiled from: _ArraysJvm.kt */
public final class f extends a<Integer> implements RandomAccess {
    public final /* synthetic */ int[] c;

    public f(int[] iArr) {
        this.c = iArr;
    }

    public int b() {
        return this.c.length;
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.c;
        i.e(iArr, "$this$contains");
        if (h.X1(iArr, intValue) >= 0) {
            return true;
        }
        return false;
    }

    public Object get(int i) {
        return Integer.valueOf(this.c[i]);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return h.X1(this.c, ((Number) obj).intValue());
    }

    public boolean isEmpty() {
        return this.c.length == 0;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.c;
        i.e(iArr, "$this$lastIndexOf");
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (intValue == iArr[length]) {
                return length;
            }
        }
        return -1;
    }
}
