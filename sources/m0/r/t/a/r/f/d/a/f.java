package m0.r.t.a.r.f.d.a;

import i0.j.f.p.h;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.f.c.a;

/* compiled from: JvmMetadataVersion.kt */
public final class f extends a {
    public static final f f = new f(1, 4, 2);
    public final boolean g;

    static {
        int[] iArr = new int[0];
        i.e(iArr, "numbers");
        i.e(iArr, "versionArray");
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        i.e(iArr2, "numbers");
        Integer w1 = h.w1(iArr2, 0);
        if (w1 != null) {
            w1.intValue();
        }
        Integer w12 = h.w1(iArr2, 1);
        if (w12 != null) {
            w12.intValue();
        }
        Integer w13 = h.w1(iArr2, 2);
        if (w13 != null) {
            w13.intValue();
        }
        if (iArr2.length > 3) {
            i.e(iArr2, "$this$asList");
            g.v0(new m0.j.f(iArr2).subList(3, iArr2.length));
            return;
        }
        EmptyList emptyList = EmptyList.c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(int[] r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "versionArray"
            m0.n.b.i.e(r4, r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.<init>(r0)
            r3.g = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.f.d.a.f.<init>(int[], boolean):void");
    }

    public boolean c() {
        boolean z;
        int i = this.b;
        if (i == 1 && this.c == 0) {
            return false;
        }
        if (this.g) {
            z = b(f);
        } else {
            f fVar = f;
            z = i == fVar.b && this.c <= fVar.c + 1;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(int... iArr) {
        this(iArr, false);
        i.e(iArr, "numbers");
    }
}
