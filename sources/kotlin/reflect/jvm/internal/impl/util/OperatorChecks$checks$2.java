package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r;

/* compiled from: modifierChecks.kt */
public final class OperatorChecks$checks$2 extends Lambda implements l<r, String> {
    public static final OperatorChecks$checks$2 c = new OperatorChecks$checks$2();

    public OperatorChecks$checks$2() {
        super(1);
    }

    public static final boolean a(i iVar) {
        if (iVar instanceof d) {
            m0.r.t.a.r.g.d dVar = f.a;
            if (f.c((d) iVar, g.a.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            m0.r.t.a.r.c.r r5 = (m0.r.t.a.r.c.r) r5
            java.lang.String r0 = "<this>"
            m0.n.b.i.e(r5, r0)
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r0 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.a
            m0.r.t.a.r.c.i r0 = r5.b()
            java.lang.String r1 = "containingDeclaration"
            m0.n.b.i.d(r0, r1)
            boolean r0 = a(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0050
            java.util.Collection r5 = r5.e()
            java.lang.String r0 = "overriddenDescriptors"
            m0.n.b.i.d(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x002a
            goto L_0x004b
        L_0x002a:
            java.util.Iterator r5 = r5.iterator()
        L_0x002e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r5.next()
            m0.r.t.a.r.c.r r0 = (m0.r.t.a.r.c.r) r0
            m0.r.t.a.r.c.i r0 = r0.b()
            java.lang.String r3 = "it.containingDeclaration"
            m0.n.b.i.d(r0, r3)
            boolean r0 = a(r0)
            if (r0 == 0) goto L_0x002e
            r5 = r1
            goto L_0x004c
        L_0x004b:
            r5 = r2
        L_0x004c:
            if (r5 == 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            if (r1 != 0) goto L_0x0055
            java.lang.String r5 = "must override ''equals()'' in Any"
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.invoke(java.lang.Object):java.lang.Object");
    }
}
