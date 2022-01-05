package m0.r.t.a.r.f.b;

import i0.j.f.p.h;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.d;
import m0.q.e;

/* compiled from: BuiltInsBinaryVersion.kt */
public final class a extends m0.r.t.a.r.f.c.a {
    public static final C0264a f = new C0264a((f) null);
    public static final a g = new a(1, 0, 7);

    /* renamed from: m0.r.t.a.r.f.b.a$a  reason: collision with other inner class name */
    /* compiled from: BuiltInsBinaryVersion.kt */
    public static final class C0264a {
        public C0264a(f fVar) {
        }

        public final a a(InputStream inputStream) {
            i.e(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            e eVar = new e(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(h.K(eVar, 10));
            Iterator it = eVar.iterator();
            while (((d) it).d) {
                ((o) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] u02 = g.u0(arrayList);
            int[] iArr = new int[u02.length];
            System.arraycopy(u02, 0, iArr, 0, u02.length);
            return new a(iArr);
        }
    }

    static {
        int[] iArr = new int[0];
        i.e(iArr, "numbers");
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
    public a(int... r4) {
        /*
            r3 = this;
            java.lang.String r0 = "numbers"
            m0.n.b.i.e(r4, r0)
            int r0 = r4.length
            int[] r0 = new int[r0]
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.f.b.a.<init>(int[]):void");
    }
}
