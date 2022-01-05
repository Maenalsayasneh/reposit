package n0.a.h2;

import m0.r.t.a.r.m.a1.a;
import n0.a.l1;

/* compiled from: MainDispatchers.kt */
public final class o {
    public static final o a;
    public static final boolean b;
    public static final l1 c;

    static {
        o oVar = new o();
        a = oVar;
        String P3 = a.P3("kotlinx.coroutines.fast.service.loader");
        b = P3 == null ? true : Boolean.parseBoolean(P3);
        c = oVar.a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlinx.coroutines.internal.MainDispatcherFactory} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n0.a.l1 a() {
        /*
            r7 = this;
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            java.util.Iterator r1 = defpackage.a.b()     // Catch:{ all -> 0x0057 }
            m0.s.h r1 = m0.r.t.a.r.m.a1.a.X(r1)     // Catch:{ all -> 0x0057 }
            java.util.List r1 = kotlin.sequences.SequencesKt___SequencesKt.j(r1)     // Catch:{ all -> 0x0057 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0057 }
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0057 }
            if (r3 != 0) goto L_0x001a
            r2 = 0
            goto L_0x0043
        L_0x001a:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0057 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0057 }
            if (r4 != 0) goto L_0x0026
        L_0x0024:
            r2 = r3
            goto L_0x0043
        L_0x0026:
            r4 = r3
            kotlinx.coroutines.internal.MainDispatcherFactory r4 = (kotlinx.coroutines.internal.MainDispatcherFactory) r4     // Catch:{ all -> 0x0057 }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x0057 }
        L_0x002d:
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0057 }
            r6 = r5
            kotlinx.coroutines.internal.MainDispatcherFactory r6 = (kotlinx.coroutines.internal.MainDispatcherFactory) r6     // Catch:{ all -> 0x0057 }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x0057 }
            if (r4 >= r6) goto L_0x003c
            r3 = r5
            r4 = r6
        L_0x003c:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0057 }
            if (r5 != 0) goto L_0x002d
            goto L_0x0024
        L_0x0043:
            kotlinx.coroutines.internal.MainDispatcherFactory r2 = (kotlinx.coroutines.internal.MainDispatcherFactory) r2     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0051
            n0.a.l1 r0 = r2.createDispatcher(r1)     // Catch:{ all -> 0x004c }
            return r0
        L_0x004c:
            r0 = move-exception
            r2.hintOnError()     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0051:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0057 }
            r1.<init>(r0)     // Catch:{ all -> 0x0057 }
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.h2.o.a():n0.a.l1");
    }
}
