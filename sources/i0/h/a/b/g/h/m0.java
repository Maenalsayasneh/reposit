package i0.h.a.b.g.h;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class m0 extends k0 {
    public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public m0(j0 j0Var) {
        super((j0) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: i0.h.a.b.g.h.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: i0.h.a.b.g.h.i0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: i0.h.a.b.g.h.i0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <E> void a(java.lang.Object r5, java.lang.Object r6, long r7) {
        /*
            r4 = this;
            java.lang.Object r6 = i0.h.a.b.g.h.d2.p(r6, r7)
            java.util.List r6 = (java.util.List) r6
            int r0 = r6.size()
            java.lang.Object r1 = i0.h.a.b.g.h.d2.p(r5, r7)
            java.util.List r1 = (java.util.List) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0029
            boolean r1 = r1 instanceof i0.h.a.b.g.h.h0
            if (r1 == 0) goto L_0x0020
            i0.h.a.b.g.h.i0 r1 = new i0.h.a.b.g.h.i0
            r1.<init>((int) r0)
            goto L_0x0025
        L_0x0020:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L_0x0025:
            i0.h.a.b.g.h.d2.e(r5, r7, r1)
            goto L_0x0062
        L_0x0029:
            java.lang.Class<?> r2 = c
            java.lang.Class r3 = r1.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L_0x0047
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>(r3)
            r2.addAll(r1)
            i0.h.a.b.g.h.d2.e(r5, r7, r2)
        L_0x0045:
            r1 = r2
            goto L_0x0062
        L_0x0047:
            boolean r2 = r1 instanceof i0.h.a.b.g.h.y1
            if (r2 == 0) goto L_0x0062
            i0.h.a.b.g.h.i0 r2 = new i0.h.a.b.g.h.i0
            int r3 = r1.size()
            int r3 = r3 + r0
            r2.<init>((int) r3)
            i0.h.a.b.g.h.y1 r1 = (i0.h.a.b.g.h.y1) r1
            int r0 = r2.size()
            r2.addAll(r0, r1)
            i0.h.a.b.g.h.d2.e(r5, r7, r2)
            goto L_0x0045
        L_0x0062:
            int r0 = r1.size()
            int r2 = r6.size()
            if (r0 <= 0) goto L_0x0071
            if (r2 <= 0) goto L_0x0071
            r1.addAll(r6)
        L_0x0071:
            if (r0 <= 0) goto L_0x0074
            r6 = r1
        L_0x0074:
            i0.h.a.b.g.h.d2.e(r5, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.m0.a(java.lang.Object, java.lang.Object, long):void");
    }

    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) d2.p(obj, j);
        if (list instanceof h0) {
            obj2 = ((h0) list).l();
        } else if (!c.isAssignableFrom(list.getClass())) {
            obj2 = Collections.unmodifiableList(list);
        } else {
            return;
        }
        d2.e(obj, j, obj2);
    }
}
