package kotlinx.coroutines.channels;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.c0;
import n0.a.f0;
import n0.a.f2.k;
import n0.a.f2.n;

/* compiled from: Produce.kt */
public final class ProduceKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: m0.n.a.a<m0.i>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(n0.a.f2.l<?> r4, m0.n.a.a<m0.i> r5, m0.l.c<? super m0.i> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r4 = r0.d
            r5 = r4
            m0.n.a.a r5 = (m0.n.a.a) r5
            java.lang.Object r4 = r0.c
            n0.a.f2.l r4 = (n0.a.f2.l) r4
            i0.j.f.p.h.d4(r6)     // Catch:{ all -> 0x0030 }
            goto L_0x0078
        L_0x0030:
            r4 = move-exception
            goto L_0x007e
        L_0x0032:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003a:
            i0.j.f.p.h.d4(r6)
            m0.l.e r6 = r0.getContext()
            int r2 = n0.a.f1.k
            n0.a.f1$a r2 = n0.a.f1.a.c
            m0.l.e$a r6 = r6.get(r2)
            if (r6 != r4) goto L_0x004d
            r6 = r3
            goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            if (r6 == 0) goto L_0x0082
            r0.c = r4     // Catch:{ all -> 0x0030 }
            r0.d = r5     // Catch:{ all -> 0x0030 }
            r0.x = r3     // Catch:{ all -> 0x0030 }
            n0.a.n r6 = new n0.a.n     // Catch:{ all -> 0x0030 }
            m0.l.c r2 = i0.j.f.p.h.b2(r0)     // Catch:{ all -> 0x0030 }
            r6.<init>(r2, r3)     // Catch:{ all -> 0x0030 }
            r6.q()     // Catch:{ all -> 0x0030 }
            kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1 r2 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1     // Catch:{ all -> 0x0030 }
            r2.<init>(r6)     // Catch:{ all -> 0x0030 }
            r4.r(r2)     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r6.o()     // Catch:{ all -> 0x0030 }
            if (r4 != r1) goto L_0x0075
            java.lang.String r6 = "frame"
            m0.n.b.i.e(r0, r6)     // Catch:{ all -> 0x0030 }
        L_0x0075:
            if (r4 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r5.invoke()
            m0.i r4 = m0.i.a
            return r4
        L_0x007e:
            r5.invoke()
            throw r4
        L_0x0082:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ProduceKt.a(n0.a.f2.l, m0.n.a.a, m0.l.c):java.lang.Object");
    }

    public static final <E> n<E> b(f0 f0Var, e eVar, int i, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, l<? super Throwable, i> lVar, p<? super n0.a.f2.l<? super E>, ? super c<? super i>, ? extends Object> pVar) {
        k kVar = new k(c0.a(f0Var, eVar), a.d(i, bufferOverflow, (l) null, 4));
        if (lVar != null) {
            kVar.q(false, true, lVar);
        }
        coroutineStart.invoke(pVar, kVar, kVar);
        return kVar;
    }

    public static n c(f0 f0Var, e eVar, int i, p pVar, int i2) {
        EmptyCoroutineContext emptyCoroutineContext = (i2 & 1) != 0 ? EmptyCoroutineContext.c : null;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return b(f0Var, emptyCoroutineContext, i, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, (l<? super Throwable, i>) null, pVar);
    }
}
