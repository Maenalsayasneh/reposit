package m0.r.t.a.r.n;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.util.Checks$2;
import kotlin.reflect.jvm.internal.impl.util.Checks$4;
import kotlin.text.Regex;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.r;

/* compiled from: modifierChecks.kt */
public final class d {
    public final m0.r.t.a.r.g.d a;
    public final Regex b;
    public final Collection<m0.r.t.a.r.g.d> c;
    public final l<r, String> d;
    public final b[] e;

    public d(m0.r.t.a.r.g.d dVar, Regex regex, Collection<m0.r.t.a.r.g.d> collection, l<? super r, String> lVar, b... bVarArr) {
        this.a = null;
        this.b = regex;
        this.c = collection;
        this.d = lVar;
        this.e = bVarArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m0.r.t.a.r.g.d dVar, b[] bVarArr, l lVar, int i) {
        this(dVar, bVarArr, (l<? super r, String>) (i & 4) != 0 ? Checks$2.c : null);
    }

    public d(m0.r.t.a.r.g.d dVar, b[] bVarArr, l<? super r, String> lVar) {
        i.e(dVar, "name");
        i.e(bVarArr, "checks");
        i.e(lVar, "additionalChecks");
        b[] bVarArr2 = new b[bVarArr.length];
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr.length);
        this.a = dVar;
        this.b = null;
        this.c = null;
        this.d = lVar;
        this.e = bVarArr2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Collection collection, b[] bVarArr, l lVar, int i) {
        this((Collection<m0.r.t.a.r.g.d>) collection, bVarArr, (l<? super r, String>) (i & 4) != 0 ? Checks$4.c : null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(java.util.Collection<m0.r.t.a.r.g.d> r8, m0.r.t.a.r.n.b[] r9, m0.n.a.l<? super m0.r.t.a.r.c.r, java.lang.String> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "nameList"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "checks"
            m0.n.b.i.e(r9, r0)
            java.lang.String r0 = "additionalChecks"
            m0.n.b.i.e(r10, r0)
            int r0 = r9.length
            m0.r.t.a.r.n.b[] r6 = new m0.r.t.a.r.n.b[r0]
            int r0 = r9.length
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r6, r1, r0)
            r2 = 0
            r3 = 0
            r1 = r7
            r4 = r8
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.n.d.<init>(java.util.Collection, m0.r.t.a.r.n.b[], m0.n.a.l):void");
    }
}
