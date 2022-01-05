package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import n0.a.g2.b0;
import n0.a.g2.d;
import n0.a.g2.d0.a;
import n0.a.g2.d0.k;
import n0.a.g2.d0.n;
import n0.a.g2.q;
import n0.a.g2.u;

/* compiled from: StateFlow.kt */
public final class StateFlowImpl<T> extends a<b0> implements q<T>, k<T>, k {
    private volatile /* synthetic */ Object _state;
    public int y;

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    public boolean a(T t, T t2) {
        if (t == null) {
            t = n.a;
        }
        if (t2 == null) {
            t2 = n.a;
        }
        return j(t, t2);
    }

    public void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    public d<T> c(e eVar, int i, BufferOverflow bufferOverflow) {
        boolean z = true;
        if (i < 0 || i > 1) {
            z = false;
        }
        if ((z || i == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            return this;
        }
        return u.c(this, eVar, i, bufferOverflow);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: n0.a.g2.b0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d2 A[Catch:{ all -> 0x0071 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e6 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00eb A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(n0.a.g2.e<? super T> r14, m0.l.c<? super m0.i> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r15
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.a2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.a2 = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.Y1
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.a2
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0074
            if (r2 == r6) goto L_0x005f
            if (r2 == r5) goto L_0x0048
            if (r2 != r4) goto L_0x0040
            java.lang.Object r14 = r0.y
            java.lang.Object r2 = r0.x
            n0.a.f1 r2 = (n0.a.f1) r2
            java.lang.Object r7 = r0.q
            n0.a.g2.b0 r7 = (n0.a.g2.b0) r7
            java.lang.Object r8 = r0.d
            n0.a.g2.e r8 = (n0.a.g2.e) r8
            java.lang.Object r9 = r0.c
            kotlinx.coroutines.flow.StateFlowImpl r9 = (kotlinx.coroutines.flow.StateFlowImpl) r9
            i0.j.f.p.h.d4(r15)     // Catch:{ all -> 0x0071 }
            goto L_0x00a6
        L_0x0040:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0048:
            java.lang.Object r14 = r0.y
            java.lang.Object r2 = r0.x
            n0.a.f1 r2 = (n0.a.f1) r2
            java.lang.Object r7 = r0.q
            n0.a.g2.b0 r7 = (n0.a.g2.b0) r7
            java.lang.Object r8 = r0.d
            n0.a.g2.e r8 = (n0.a.g2.e) r8
            java.lang.Object r9 = r0.c
            kotlinx.coroutines.flow.StateFlowImpl r9 = (kotlinx.coroutines.flow.StateFlowImpl) r9
            i0.j.f.p.h.d4(r15)     // Catch:{ all -> 0x0071 }
            goto L_0x00d4
        L_0x005f:
            java.lang.Object r14 = r0.q
            r7 = r14
            n0.a.g2.b0 r7 = (n0.a.g2.b0) r7
            java.lang.Object r14 = r0.d
            n0.a.g2.e r14 = (n0.a.g2.e) r14
            java.lang.Object r2 = r0.c
            r9 = r2
            kotlinx.coroutines.flow.StateFlowImpl r9 = (kotlinx.coroutines.flow.StateFlowImpl) r9
            i0.j.f.p.h.d4(r15)     // Catch:{ all -> 0x0071 }
            goto L_0x0095
        L_0x0071:
            r14 = move-exception
            goto L_0x012b
        L_0x0074:
            i0.j.f.p.h.d4(r15)
            n0.a.g2.d0.c r15 = r13.f()
            r7 = r15
            n0.a.g2.b0 r7 = (n0.a.g2.b0) r7
            boolean r15 = r14 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x0129 }
            if (r15 == 0) goto L_0x0094
            r15 = r14
            kotlinx.coroutines.flow.SubscribedFlowCollector r15 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r15     // Catch:{ all -> 0x0129 }
            r0.c = r13     // Catch:{ all -> 0x0129 }
            r0.d = r14     // Catch:{ all -> 0x0129 }
            r0.q = r7     // Catch:{ all -> 0x0129 }
            r0.a2 = r6     // Catch:{ all -> 0x0129 }
            java.lang.Object r15 = r15.c(r0)     // Catch:{ all -> 0x0129 }
            if (r15 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r9 = r13
        L_0x0095:
            m0.l.e r15 = r0.getContext()     // Catch:{ all -> 0x0071 }
            int r2 = n0.a.f1.k     // Catch:{ all -> 0x0071 }
            n0.a.f1$a r2 = n0.a.f1.a.c     // Catch:{ all -> 0x0071 }
            m0.l.e$a r15 = r15.get(r2)     // Catch:{ all -> 0x0071 }
            n0.a.f1 r15 = (n0.a.f1) r15     // Catch:{ all -> 0x0071 }
            r8 = r14
            r2 = r15
            r14 = r3
        L_0x00a6:
            java.lang.Object r15 = r9._state     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            boolean r10 = r2.a()     // Catch:{ all -> 0x0071 }
            if (r10 == 0) goto L_0x0124
        L_0x00b1:
            if (r14 == 0) goto L_0x00b9
            boolean r10 = m0.n.b.i.a(r14, r15)     // Catch:{ all -> 0x0071 }
            if (r10 != 0) goto L_0x00d4
        L_0x00b9:
            n0.a.h2.t r14 = n0.a.g2.d0.n.a     // Catch:{ all -> 0x0071 }
            if (r15 != r14) goto L_0x00bf
            r14 = r3
            goto L_0x00c0
        L_0x00bf:
            r14 = r15
        L_0x00c0:
            r0.c = r9     // Catch:{ all -> 0x0071 }
            r0.d = r8     // Catch:{ all -> 0x0071 }
            r0.q = r7     // Catch:{ all -> 0x0071 }
            r0.x = r2     // Catch:{ all -> 0x0071 }
            r0.y = r15     // Catch:{ all -> 0x0071 }
            r0.a2 = r5     // Catch:{ all -> 0x0071 }
            java.lang.Object r14 = r8.emit(r14, r0)     // Catch:{ all -> 0x0071 }
            if (r14 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r14 = r15
        L_0x00d4:
            java.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x0071 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r15 = n0.a.g2.b0.a     // Catch:{ all -> 0x0071 }
            n0.a.h2.t r10 = n0.a.g2.a0.a     // Catch:{ all -> 0x0071 }
            java.lang.Object r11 = r15.getAndSet(r7, r10)     // Catch:{ all -> 0x0071 }
            m0.n.b.i.c(r11)     // Catch:{ all -> 0x0071 }
            n0.a.h2.t r12 = n0.a.g2.a0.b     // Catch:{ all -> 0x0071 }
            if (r11 != r12) goto L_0x00e8
            r11 = r6
            goto L_0x00e9
        L_0x00e8:
            r11 = 0
        L_0x00e9:
            if (r11 != 0) goto L_0x00a6
            r0.c = r9     // Catch:{ all -> 0x0071 }
            r0.d = r8     // Catch:{ all -> 0x0071 }
            r0.q = r7     // Catch:{ all -> 0x0071 }
            r0.x = r2     // Catch:{ all -> 0x0071 }
            r0.y = r14     // Catch:{ all -> 0x0071 }
            r0.a2 = r4     // Catch:{ all -> 0x0071 }
            n0.a.n r11 = new n0.a.n     // Catch:{ all -> 0x0071 }
            m0.l.c r12 = i0.j.f.p.h.b2(r0)     // Catch:{ all -> 0x0071 }
            r11.<init>(r12, r6)     // Catch:{ all -> 0x0071 }
            r11.q()     // Catch:{ all -> 0x0071 }
            boolean r15 = r15.compareAndSet(r7, r10, r11)     // Catch:{ all -> 0x0071 }
            if (r15 == 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            m0.i r15 = m0.i.a     // Catch:{ all -> 0x0071 }
            r11.resumeWith(r15)     // Catch:{ all -> 0x0071 }
        L_0x010f:
            java.lang.Object r15 = r11.o()     // Catch:{ all -> 0x0071 }
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED     // Catch:{ all -> 0x0071 }
            if (r15 != r10) goto L_0x011c
            java.lang.String r11 = "frame"
            m0.n.b.i.e(r0, r11)     // Catch:{ all -> 0x0071 }
        L_0x011c:
            if (r15 != r10) goto L_0x011f
            goto L_0x0121
        L_0x011f:
            m0.i r15 = m0.i.a     // Catch:{ all -> 0x0071 }
        L_0x0121:
            if (r15 != r1) goto L_0x00a6
            return r1
        L_0x0124:
            java.util.concurrent.CancellationException r14 = r2.v()     // Catch:{ all -> 0x0071 }
            throw r14     // Catch:{ all -> 0x0071 }
        L_0x0129:
            r14 = move-exception
            r9 = r13
        L_0x012b:
            r9.i(r7)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }

    public boolean d(T t) {
        if (t == null) {
            t = n.a;
        }
        j((Object) null, t);
        return true;
    }

    public Object emit(T t, c<? super i> cVar) {
        if (t == null) {
            t = n.a;
        }
        j((Object) null, t);
        return i.a;
    }

    public n0.a.g2.d0.c g() {
        return new b0();
    }

    public T getValue() {
        T t = n.a;
        T t2 = this._state;
        if (t2 == t) {
            return null;
        }
        return t2;
    }

    public n0.a.g2.d0.c[] h(int i) {
        return new b0[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r11 = (n0.a.g2.b0[]) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        if (r11 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        r2 = r11.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r3 >= r2) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        r4 = r11[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0030, code lost:
        if (r4 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r5 = r4._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        r6 = n0.a.g2.a0.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r5 != r6) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
        r7 = n0.a.g2.a0.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003f, code lost:
        if (r5 != r7) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
        if (n0.a.g2.b0.a.compareAndSet(r4, r5, r6) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0050, code lost:
        if (n0.a.g2.b0.a.compareAndSet(r4, r5, r7) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
        ((n0.a.n) r5).resumeWith(m0.i.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005c, code lost:
        monitor-enter(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r11 = r9.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005f, code lost:
        if (r11 != r10) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0061, code lost:
        r9.y = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0064, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0065, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r10 = r9.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0068, code lost:
        monitor-exit(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0069, code lost:
        r8 = r11;
        r11 = r10;
        r10 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9._state     // Catch:{ all -> 0x0076 }
            r1 = 0
            if (r10 == 0) goto L_0x000e
            boolean r10 = m0.n.b.i.a(r0, r10)     // Catch:{ all -> 0x0076 }
            if (r10 != 0) goto L_0x000e
            monitor-exit(r9)
            return r1
        L_0x000e:
            boolean r10 = m0.n.b.i.a(r0, r11)     // Catch:{ all -> 0x0076 }
            r0 = 1
            if (r10 == 0) goto L_0x0017
            monitor-exit(r9)
            return r0
        L_0x0017:
            r9._state = r11     // Catch:{ all -> 0x0076 }
            int r10 = r9.y     // Catch:{ all -> 0x0076 }
            r11 = r10 & 1
            if (r11 != 0) goto L_0x0070
            int r10 = r10 + r0
            r9.y = r10     // Catch:{ all -> 0x0076 }
            S[] r11 = r9.c     // Catch:{ all -> 0x0076 }
            monitor-exit(r9)
        L_0x0025:
            n0.a.g2.b0[] r11 = (n0.a.g2.b0[]) r11
            if (r11 != 0) goto L_0x002a
            goto L_0x005c
        L_0x002a:
            int r2 = r11.length
            r3 = r1
        L_0x002c:
            if (r3 >= r2) goto L_0x005c
            r4 = r11[r3]
            if (r4 != 0) goto L_0x0033
            goto L_0x0059
        L_0x0033:
            java.lang.Object r5 = r4._state
            if (r5 != 0) goto L_0x0038
            goto L_0x0059
        L_0x0038:
            n0.a.h2.t r6 = n0.a.g2.a0.b
            if (r5 != r6) goto L_0x003d
            goto L_0x0059
        L_0x003d:
            n0.a.h2.t r7 = n0.a.g2.a0.a
            if (r5 != r7) goto L_0x004a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = n0.a.g2.b0.a
            boolean r5 = r7.compareAndSet(r4, r5, r6)
            if (r5 == 0) goto L_0x0033
            goto L_0x0059
        L_0x004a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = n0.a.g2.b0.a
            boolean r6 = r6.compareAndSet(r4, r5, r7)
            if (r6 == 0) goto L_0x0033
            n0.a.n r5 = (n0.a.n) r5
            m0.i r4 = m0.i.a
            r5.resumeWith(r4)
        L_0x0059:
            int r3 = r3 + 1
            goto L_0x002c
        L_0x005c:
            monitor-enter(r9)
            int r11 = r9.y     // Catch:{ all -> 0x006d }
            if (r11 != r10) goto L_0x0066
            int r10 = r10 + r0
            r9.y = r10     // Catch:{ all -> 0x006d }
            monitor-exit(r9)
            return r0
        L_0x0066:
            S[] r10 = r9.c     // Catch:{ all -> 0x006d }
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x0025
        L_0x006d:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L_0x0070:
            int r10 = r10 + 2
            r9.y = r10     // Catch:{ all -> 0x0076 }
            monitor-exit(r9)
            return r0
        L_0x0076:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.j(java.lang.Object, java.lang.Object):boolean");
    }

    public void setValue(T t) {
        if (t == null) {
            t = n.a;
        }
        j((Object) null, t);
    }
}
