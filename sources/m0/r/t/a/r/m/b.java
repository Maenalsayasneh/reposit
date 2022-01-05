package m0.r.t.a.r.m;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.j.d;
import m0.r.t.a.r.l.l;

/* compiled from: AbstractClassTypeConstructor */
public abstract class b extends AbstractTypeConstructor implements j0 {
    public int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        super(lVar);
        if (lVar != null) {
            this.b = 0;
            return;
        }
        o(0);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void o(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "descriptor"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "hasMeaningfulFqName"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.m.b.o(int):void");
    }

    public static boolean q(f fVar) {
        if (fVar != null) {
            return !p.j(fVar) && !d.t(fVar);
        }
        o(2);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0) || obj.hashCode() != hashCode()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (j0Var.getParameters().size() != getParameters().size()) {
            return false;
        }
        m0.r.t.a.r.c.d p = c();
        f c = j0Var.c();
        if (!q(p) || ((c != null && !q(c)) || !(c instanceof m0.r.t.a.r.c.d))) {
            return false;
        }
        m0.r.t.a.r.c.d dVar = (m0.r.t.a.r.c.d) c;
        if (p.getName().equals(dVar.getName())) {
            i b2 = p.b();
            i b3 = dVar.b();
            while (b2 != null && b3 != null) {
                if (b2 instanceof u) {
                    return b3 instanceof u;
                }
                if (!(b3 instanceof u)) {
                    if (b2 instanceof v) {
                        if ((b3 instanceof v) && ((v) b2).d().equals(((v) b3).d())) {
                            return true;
                        }
                    } else if (!(b3 instanceof v) && b2.getName().equals(b3.getName())) {
                        b2 = b2.b();
                        b3 = b3.b();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public v h() {
        if (m0.r.t.a.r.b.f.J(c())) {
            return null;
        }
        return m().f();
    }

    public final int hashCode() {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            return i2;
        }
        m0.r.t.a.r.c.d p = c();
        if (q(p)) {
            i = d.g(p).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.b = i;
        return i;
    }

    public Collection<v> i(boolean z) {
        i b2 = c().b();
        if (!(b2 instanceof m0.r.t.a.r.c.d)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            o(3);
            throw null;
        }
        m0.r.t.a.r.o.i iVar = new m0.r.t.a.r.o.i();
        m0.r.t.a.r.c.d dVar = (m0.r.t.a.r.c.d) b2;
        iVar.add(dVar.q());
        m0.r.t.a.r.c.d S = dVar.S();
        if (z && S != null) {
            iVar.add(S.q());
        }
        return iVar;
    }

    public m0.r.t.a.r.b.f m() {
        m0.r.t.a.r.b.f f = DescriptorUtilsKt.f(c());
        if (f != null) {
            return f;
        }
        o(1);
        throw null;
    }

    /* renamed from: p */
    public abstract m0.r.t.a.r.c.d c();
}
