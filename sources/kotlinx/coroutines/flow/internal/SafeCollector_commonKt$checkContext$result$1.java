package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.p;

/* compiled from: SafeCollector.common.kt */
public final class SafeCollector_commonKt$checkContext$result$1 extends Lambda implements p<Integer, e.a, Integer> {
    public final /* synthetic */ SafeCollector<?> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SafeCollector_commonKt$checkContext$result$1(SafeCollector<?> safeCollector) {
        super(2);
        this.c = safeCollector;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r1 == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            m0.l.e$a r5 = (m0.l.e.a) r5
            m0.l.e$b r0 = r5.getKey()
            kotlinx.coroutines.flow.internal.SafeCollector<?> r1 = r3.c
            m0.l.e r1 = r1.d
            m0.l.e$a r1 = r1.get(r0)
            int r2 = n0.a.f1.k
            n0.a.f1$a r2 = n0.a.f1.a.c
            if (r0 == r2) goto L_0x0022
            if (r5 == r1) goto L_0x001f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0036
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0036
        L_0x0022:
            n0.a.f1 r1 = (n0.a.f1) r1
            n0.a.f1 r5 = (n0.a.f1) r5
        L_0x0026:
            r0 = 0
            if (r5 != 0) goto L_0x002b
            r5 = r0
            goto L_0x0032
        L_0x002b:
            if (r5 != r1) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            boolean r2 = r5 instanceof n0.a.h2.r
            if (r2 != 0) goto L_0x0063
        L_0x0032:
            if (r5 != r1) goto L_0x003b
            if (r1 != 0) goto L_0x001f
        L_0x0036:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            return r4
        L_0x003b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r5 = ", expected child of "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L_0x0063:
            n0.a.h2.r r5 = (n0.a.h2.r) r5
            n0.a.r r5 = r5.Z()
            if (r5 != 0) goto L_0x006d
            r5 = r0
            goto L_0x0026
        L_0x006d:
            n0.a.f1 r5 = r5.getParent()
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
