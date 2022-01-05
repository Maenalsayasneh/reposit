package com.clubhouse.android.data.network;

import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.g0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import n0.a.g2.d;
import n0.a.g2.p;
import n0.a.g2.u;

/* compiled from: RefreshableDataSource.kt */
public abstract class RefreshableDataSource<T> {
    public final long a;
    public b<Long> b;
    public final p<T> c;
    public final d<T> d;

    public RefreshableDataSource() {
        this(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0086, code lost:
        throw r7;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x002b, B:27:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0085 A[ExcHandler: CancellationException (r7v2 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:27:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super m0.i> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.data.network.RefreshableDataSource$fetch$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.data.network.RefreshableDataSource$fetch$1 r0 = (com.clubhouse.android.data.network.RefreshableDataSource$fetch$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.network.RefreshableDataSource$fetch$1 r0 = new com.clubhouse.android.data.network.RefreshableDataSource$fetch$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.network.RefreshableDataSource r0 = (com.clubhouse.android.data.network.RefreshableDataSource) r0
            i0.j.f.p.h.d4(r7)     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            goto L_0x0068
        L_0x002f:
            r7 = move-exception
            goto L_0x007b
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0039:
            java.lang.Object r2 = r0.c
            com.clubhouse.android.data.network.RefreshableDataSource r2 = (com.clubhouse.android.data.network.RefreshableDataSource) r2
            i0.j.f.p.h.d4(r7)     // Catch:{ CancellationException -> 0x0085, all -> 0x0041 }
            goto L_0x005a
        L_0x0041:
            r7 = move-exception
            r0 = r2
            goto L_0x007b
        L_0x0044:
            i0.j.f.p.h.d4(r7)
            i0.b.b.f r7 = new i0.b.b.f     // Catch:{ CancellationException -> 0x0085, all -> 0x0079 }
            r7.<init>(r3, r5)     // Catch:{ CancellationException -> 0x0085, all -> 0x0079 }
            r6.b = r7     // Catch:{ CancellationException -> 0x0085, all -> 0x0079 }
            r0.c = r6     // Catch:{ CancellationException -> 0x0085, all -> 0x0079 }
            r0.x = r5     // Catch:{ CancellationException -> 0x0085, all -> 0x0079 }
            java.lang.Object r7 = r6.c(r0)     // Catch:{ CancellationException -> 0x0085, all -> 0x0079 }
            if (r7 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r2 = r6
        L_0x005a:
            n0.a.g2.p<T> r5 = r2.c     // Catch:{ CancellationException -> 0x0085, all -> 0x0041 }
            r0.c = r2     // Catch:{ CancellationException -> 0x0085, all -> 0x0041 }
            r0.x = r4     // Catch:{ CancellationException -> 0x0085, all -> 0x0041 }
            java.lang.Object r7 = r5.emit(r7, r0)     // Catch:{ CancellationException -> 0x0085, all -> 0x0041 }
            if (r7 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r0 = r2
        L_0x0068:
            i0.b.b.f0 r7 = new i0.b.b.f0     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            java.lang.Long r5 = new java.lang.Long     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            r5.<init>(r1)     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            r7.<init>(r5)     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            r0.b = r7     // Catch:{ CancellationException -> 0x0085, all -> 0x002f }
            goto L_0x0082
        L_0x0079:
            r7 = move-exception
            r0 = r6
        L_0x007b:
            i0.b.b.c r1 = new i0.b.b.c
            r1.<init>(r7, r3, r4)
            r0.b = r1
        L_0x0082:
            m0.i r7 = m0.i.a
            return r7
        L_0x0085:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.network.RefreshableDataSource.a(m0.l.c):java.lang.Object");
    }

    public final Object b(c<? super i> cVar) {
        long j = 0;
        if (this.a == 0 && !(this.b instanceof g0)) {
            return i.a;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long a2 = this.b.a();
        if (a2 != null) {
            j = a2.longValue();
        }
        if (currentTimeMillis - j <= this.a || (this.b instanceof f)) {
            return i.a;
        }
        Object a3 = a(cVar);
        if (a3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a3;
        }
        return i.a;
    }

    public abstract Object c(c<? super T> cVar);

    public RefreshableDataSource(long j) {
        this.a = j;
        this.b = g0.b;
        p<T> b2 = u.b(1, 0, BufferOverflow.DROP_OLDEST, 2);
        this.c = b2;
        this.d = b2;
    }
}
