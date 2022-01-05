package kotlinx.coroutines.flow;

import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import n0.a.g2.d;
import n0.a.g2.d0.b;
import n0.a.g2.d0.k;
import n0.a.g2.p;
import n0.a.g2.u;
import n0.a.g2.v;
import n0.a.h2.t;
import n0.a.n;
import n0.a.o0;
import n0.a.p0;

/* compiled from: SharedFlow.kt */
public final class SharedFlowImpl<T> extends n0.a.g2.d0.a<v> implements p<T>, k<T>, k {
    public final int Y1;
    public final BufferOverflow Z1;
    public Object[] a2;
    public long b2;
    public long c2;
    public int d2;
    public int e2;
    public final int y;

    /* compiled from: SharedFlow.kt */
    public static final class a implements o0 {
        public final SharedFlowImpl<?> c;
        public long d;
        public final Object q;
        public final c<i> x;

        public a(SharedFlowImpl<?> sharedFlowImpl, long j, Object obj, c<? super i> cVar) {
            this.c = sharedFlowImpl;
            this.d = j;
            this.q = obj;
            this.x = cVar;
        }

        public void dispose() {
            SharedFlowImpl<?> sharedFlowImpl = this.c;
            synchronized (sharedFlowImpl) {
                if (this.d >= sharedFlowImpl.p()) {
                    Object[] objArr = sharedFlowImpl.a2;
                    m0.n.b.i.c(objArr);
                    int i = (int) this.d;
                    if (objArr[(objArr.length - 1) & i] == this) {
                        objArr[i & (objArr.length - 1)] = u.a;
                        sharedFlowImpl.k();
                    }
                }
            }
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.y = i;
        this.Y1 = i2;
        this.Z1 = bufferOverflow;
    }

    public void b() {
        synchronized (this) {
            v(o(), this.c2, o(), p() + ((long) this.d2) + ((long) this.e2));
        }
    }

    public d<T> c(e eVar, int i, BufferOverflow bufferOverflow) {
        return u.c(this, eVar, i, bufferOverflow);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: n0.a.g2.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: kotlinx.coroutines.flow.SharedFlowImpl} */
    /* JADX WARNING: type inference failed for: r10v9, types: [n0.a.g2.d0.c] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c7 A[Catch:{ all -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8 A[EDGE_INSN: B:54:0x00a8->B:37:0x00a8 ?: BREAK  , SYNTHETIC] */
    public java.lang.Object collect(n0.a.g2.e<? super T> r9, m0.l.c<? super m0.i> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) r0
            int r1 = r0.Z1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z1 = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.y
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.Z1
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x006f
            if (r2 == r5) goto L_0x005b
            if (r2 == r4) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r9 = r0.x
            n0.a.f1 r9 = (n0.a.f1) r9
            java.lang.Object r2 = r0.q
            n0.a.g2.v r2 = (n0.a.g2.v) r2
            java.lang.Object r5 = r0.d
            n0.a.g2.e r5 = (n0.a.g2.e) r5
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.flow.SharedFlowImpl r6 = (kotlinx.coroutines.flow.SharedFlowImpl) r6
            i0.j.f.p.h.d4(r10)     // Catch:{ all -> 0x006d }
        L_0x003c:
            r10 = r9
            r9 = r5
            goto L_0x009e
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0047:
            java.lang.Object r9 = r0.x
            n0.a.f1 r9 = (n0.a.f1) r9
            java.lang.Object r2 = r0.q
            n0.a.g2.v r2 = (n0.a.g2.v) r2
            java.lang.Object r5 = r0.d
            n0.a.g2.e r5 = (n0.a.g2.e) r5
            java.lang.Object r6 = r0.c
            kotlinx.coroutines.flow.SharedFlowImpl r6 = (kotlinx.coroutines.flow.SharedFlowImpl) r6
            i0.j.f.p.h.d4(r10)     // Catch:{ all -> 0x006d }
            goto L_0x00a0
        L_0x005b:
            java.lang.Object r9 = r0.q
            r2 = r9
            n0.a.g2.v r2 = (n0.a.g2.v) r2
            java.lang.Object r9 = r0.d
            n0.a.g2.e r9 = (n0.a.g2.e) r9
            java.lang.Object r5 = r0.c
            r6 = r5
            kotlinx.coroutines.flow.SharedFlowImpl r6 = (kotlinx.coroutines.flow.SharedFlowImpl) r6
            i0.j.f.p.h.d4(r10)     // Catch:{ all -> 0x006d }
            goto L_0x0090
        L_0x006d:
            r9 = move-exception
            goto L_0x00da
        L_0x006f:
            i0.j.f.p.h.d4(r10)
            n0.a.g2.d0.c r10 = r8.f()
            r2 = r10
            n0.a.g2.v r2 = (n0.a.g2.v) r2
            boolean r10 = r9 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00d8 }
            if (r10 == 0) goto L_0x008f
            r10 = r9
            kotlinx.coroutines.flow.SubscribedFlowCollector r10 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r10     // Catch:{ all -> 0x00d8 }
            r0.c = r8     // Catch:{ all -> 0x00d8 }
            r0.d = r9     // Catch:{ all -> 0x00d8 }
            r0.q = r2     // Catch:{ all -> 0x00d8 }
            r0.Z1 = r5     // Catch:{ all -> 0x00d8 }
            java.lang.Object r10 = r10.c(r0)     // Catch:{ all -> 0x00d8 }
            if (r10 != r1) goto L_0x008f
            return r1
        L_0x008f:
            r6 = r8
        L_0x0090:
            m0.l.e r10 = r0.getContext()     // Catch:{ all -> 0x006d }
            int r5 = n0.a.f1.k     // Catch:{ all -> 0x006d }
            n0.a.f1$a r5 = n0.a.f1.a.c     // Catch:{ all -> 0x006d }
            m0.l.e$a r10 = r10.get(r5)     // Catch:{ all -> 0x006d }
            n0.a.f1 r10 = (n0.a.f1) r10     // Catch:{ all -> 0x006d }
        L_0x009e:
            r5 = r9
            r9 = r10
        L_0x00a0:
            java.lang.Object r10 = r6.u(r2)     // Catch:{ all -> 0x006d }
            n0.a.h2.t r7 = n0.a.g2.u.a     // Catch:{ all -> 0x006d }
            if (r10 == r7) goto L_0x00c7
            if (r9 != 0) goto L_0x00ab
            goto L_0x00b1
        L_0x00ab:
            boolean r7 = r9.a()     // Catch:{ all -> 0x006d }
            if (r7 == 0) goto L_0x00c2
        L_0x00b1:
            r0.c = r6     // Catch:{ all -> 0x006d }
            r0.d = r5     // Catch:{ all -> 0x006d }
            r0.q = r2     // Catch:{ all -> 0x006d }
            r0.x = r9     // Catch:{ all -> 0x006d }
            r0.Z1 = r3     // Catch:{ all -> 0x006d }
            java.lang.Object r10 = r5.emit(r10, r0)     // Catch:{ all -> 0x006d }
            if (r10 != r1) goto L_0x003c
            return r1
        L_0x00c2:
            java.util.concurrent.CancellationException r9 = r9.v()     // Catch:{ all -> 0x006d }
            throw r9     // Catch:{ all -> 0x006d }
        L_0x00c7:
            r0.c = r6     // Catch:{ all -> 0x006d }
            r0.d = r5     // Catch:{ all -> 0x006d }
            r0.q = r2     // Catch:{ all -> 0x006d }
            r0.x = r9     // Catch:{ all -> 0x006d }
            r0.Z1 = r4     // Catch:{ all -> 0x006d }
            java.lang.Object r10 = r6.j(r2, r0)     // Catch:{ all -> 0x006d }
            if (r10 != r1) goto L_0x00a0
            return r1
        L_0x00d8:
            r9 = move-exception
            r6 = r8
        L_0x00da:
            r6.i(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect(n0.a.g2.e, m0.l.c):java.lang.Object");
    }

    public boolean d(T t) {
        int i;
        boolean z;
        c<i>[] cVarArr = b.a;
        synchronized (this) {
            i = 0;
            if (s(t)) {
                cVarArr = n(cVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = cVarArr.length;
        while (i < length) {
            c<i> cVar = cVarArr[i];
            i++;
            if (cVar != null) {
                cVar.resumeWith(i.a);
            }
        }
        return z;
    }

    public Object emit(T t, c<? super i> cVar) {
        c<i>[] cVarArr;
        a aVar;
        if (d(t)) {
            return i.a;
        }
        n nVar = new n(h.b2(cVar), 1);
        nVar.q();
        c<i>[] cVarArr2 = b.a;
        synchronized (this) {
            if (s(t)) {
                nVar.resumeWith(i.a);
                cVarArr = n(cVarArr2);
                aVar = null;
            } else {
                a aVar2 = new a(this, ((long) q()) + p(), t, nVar);
                m(aVar2);
                this.e2++;
                if (this.Y1 == 0) {
                    cVarArr2 = n(cVarArr2);
                }
                cVarArr = cVarArr2;
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            nVar.p(new p0(aVar));
        }
        int i = 0;
        int length = cVarArr.length;
        while (i < length) {
            c<i> cVar2 = cVarArr[i];
            i++;
            if (cVar2 != null) {
                cVar2.resumeWith(i.a);
            }
        }
        Object o = nVar.o();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o == coroutineSingletons) {
            m0.n.b.i.e(cVar, "frame");
        }
        if (o != coroutineSingletons) {
            o = i.a;
        }
        if (o == coroutineSingletons) {
            return o;
        }
        return i.a;
    }

    public n0.a.g2.d0.c g() {
        return new v();
    }

    public n0.a.g2.d0.c[] h(int i) {
        return new v[i];
    }

    public final Object j(v vVar, c<? super i> cVar) {
        i iVar;
        n nVar = new n(h.b2(cVar), 1);
        nVar.q();
        synchronized (this) {
            if (t(vVar) < 0) {
                vVar.b = nVar;
                vVar.b = nVar;
            } else {
                nVar.resumeWith(i.a);
            }
            iVar = i.a;
        }
        Object o = nVar.o();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o == coroutineSingletons) {
            m0.n.b.i.e(cVar, "frame");
        }
        return o == coroutineSingletons ? o : iVar;
    }

    public final void k() {
        if (this.Y1 != 0 || this.e2 > 1) {
            Object[] objArr = this.a2;
            m0.n.b.i.c(objArr);
            while (this.e2 > 0 && objArr[((int) ((p() + ((long) q())) - 1)) & (objArr.length - 1)] == u.a) {
                this.e2--;
                objArr[((int) (p() + ((long) q()))) & (objArr.length - 1)] = null;
            }
        }
    }

    public final void l() {
        S[] sArr;
        Object[] objArr = this.a2;
        m0.n.b.i.c(objArr);
        objArr[((int) p()) & (objArr.length - 1)] = null;
        this.d2--;
        long p = p() + 1;
        if (this.b2 < p) {
            this.b2 = p;
        }
        if (this.c2 < p) {
            if (!(this.d == 0 || (sArr = this.c) == null)) {
                for (S s : sArr) {
                    if (s != null) {
                        v vVar = (v) s;
                        long j = vVar.a;
                        if (j >= 0 && j < p) {
                            vVar.a = p;
                        }
                    }
                }
            }
            this.c2 = p;
        }
    }

    public final void m(Object obj) {
        int q = q();
        Object[] objArr = this.a2;
        if (objArr == null) {
            objArr = r((Object[]) null, 0, 2);
        } else if (q >= objArr.length) {
            objArr = r(objArr, q, objArr.length * 2);
        }
        objArr[((int) (p() + ((long) q))) & (objArr.length - 1)] = obj;
    }

    /* JADX WARNING: type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final m0.l.c<m0.i>[] n(m0.l.c<m0.i>[] r11) {
        /*
            r10 = this;
            int r0 = r11.length
            int r1 = r10.d
            if (r1 != 0) goto L_0x0006
            goto L_0x0046
        L_0x0006:
            S[] r1 = r10.c
            if (r1 != 0) goto L_0x000b
            goto L_0x0046
        L_0x000b:
            int r2 = r1.length
            r3 = 0
        L_0x000d:
            if (r3 >= r2) goto L_0x0046
            r4 = r1[r3]
            if (r4 == 0) goto L_0x0043
            n0.a.g2.v r4 = (n0.a.g2.v) r4
            m0.l.c<? super m0.i> r5 = r4.b
            if (r5 != 0) goto L_0x001a
            goto L_0x0043
        L_0x001a:
            long r6 = r10.t(r4)
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0025
            goto L_0x0043
        L_0x0025:
            int r6 = r11.length
            if (r0 < r6) goto L_0x0038
            int r6 = r11.length
            r7 = 2
            int r6 = r6 * r7
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r6)
            java.lang.String r6 = "java.util.Arrays.copyOf(this, newSize)"
            m0.n.b.i.d(r11, r6)
        L_0x0038:
            r6 = r11
            m0.l.c[] r6 = (m0.l.c[]) r6
            int r7 = r0 + 1
            r6[r0] = r5
            r0 = 0
            r4.b = r0
            r0 = r7
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0046:
            m0.l.c[] r11 = (m0.l.c[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.n(m0.l.c[]):m0.l.c[]");
    }

    public final long o() {
        return p() + ((long) this.d2);
    }

    public final long p() {
        return Math.min(this.c2, this.b2);
    }

    public final int q() {
        return this.d2 + this.e2;
    }

    public final Object[] r(Object[] objArr, int i, int i2) {
        int i3 = 0;
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.a2 = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long p = p();
            if (i > 0) {
                while (true) {
                    int i4 = i3 + 1;
                    int i5 = (int) (((long) i3) + p);
                    objArr2[i5 & (i2 - 1)] = objArr[(objArr.length - 1) & i5];
                    if (i4 >= i) {
                        break;
                    }
                    i3 = i4;
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean s(T t) {
        if (this.d == 0) {
            if (this.y != 0) {
                m(t);
                int i = this.d2 + 1;
                this.d2 = i;
                if (i > this.y) {
                    l();
                }
                this.c2 = p() + ((long) this.d2);
            }
            return true;
        }
        if (this.d2 >= this.Y1 && this.c2 <= this.b2) {
            int ordinal = this.Z1.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        m(t);
        int i2 = this.d2 + 1;
        this.d2 = i2;
        if (i2 > this.Y1) {
            l();
        }
        long p = p() + ((long) this.d2);
        long j = this.b2;
        if (((int) (p - j)) > this.y) {
            v(j + 1, this.c2, o(), p() + ((long) this.d2) + ((long) this.e2));
        }
        return true;
    }

    public final long t(v vVar) {
        long j = vVar.a;
        if (j < o()) {
            return j;
        }
        if (this.Y1 <= 0 && j <= p() && this.e2 != 0) {
            return j;
        }
        return -1;
    }

    public final Object u(v vVar) {
        Object obj;
        c<i>[] cVarArr = b.a;
        synchronized (this) {
            long t = t(vVar);
            if (t < 0) {
                obj = u.a;
            } else {
                long j = vVar.a;
                Object[] objArr = this.a2;
                m0.n.b.i.c(objArr);
                Object obj2 = objArr[((int) t) & (objArr.length - 1)];
                if (obj2 instanceof a) {
                    obj2 = ((a) obj2).q;
                }
                vVar.a = t + 1;
                Object obj3 = obj2;
                cVarArr = w(j);
                obj = obj3;
            }
        }
        int i = 0;
        int length = cVarArr.length;
        while (i < length) {
            c<i> cVar = cVarArr[i];
            i++;
            if (cVar != null) {
                cVar.resumeWith(i.a);
            }
        }
        return obj;
    }

    public final void v(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long min = Math.min(j6, j);
        long p = p();
        if (p < min) {
            while (true) {
                long j7 = 1 + p;
                Object[] objArr = this.a2;
                m0.n.b.i.c(objArr);
                objArr[((int) p) & (objArr.length - 1)] = null;
                if (j7 >= min) {
                    break;
                }
                p = j7;
            }
        }
        this.b2 = j5;
        this.c2 = j6;
        this.d2 = (int) (j3 - min);
        this.e2 = (int) (j4 - j3);
    }

    public final c<i>[] w(long j) {
        int i;
        S[] sArr;
        if (j > this.c2) {
            return b.a;
        }
        long p = p();
        long j2 = ((long) this.d2) + p;
        long j3 = 1;
        if (this.Y1 == 0 && this.e2 > 0) {
            j2++;
        }
        if (!(this.d == 0 || (sArr = this.c) == null)) {
            for (S s : sArr) {
                if (s != null) {
                    long j4 = ((v) s).a;
                    if (j4 >= 0 && j4 < j2) {
                        j2 = j4;
                    }
                }
            }
        }
        if (j2 <= this.c2) {
            return b.a;
        }
        long o = o();
        if (this.d > 0) {
            i = Math.min(this.e2, this.Y1 - ((int) (o - j2)));
        } else {
            i = this.e2;
        }
        c<i>[] cVarArr = b.a;
        long j5 = ((long) this.e2) + o;
        if (i > 0) {
            cVarArr = new c[i];
            Object[] objArr = this.a2;
            m0.n.b.i.c(objArr);
            if (o < j5) {
                long j6 = o;
                int i2 = 0;
                while (true) {
                    long j7 = o + j3;
                    int i3 = (int) o;
                    Object obj = objArr[(objArr.length - 1) & i3];
                    t tVar = u.a;
                    if (obj != tVar) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) obj;
                        int i4 = i2 + 1;
                        cVarArr[i2] = aVar.x;
                        objArr[(objArr.length - 1) & i3] = tVar;
                        long j8 = j6;
                        objArr[((int) j8) & (objArr.length - 1)] = aVar.q;
                        o = j8 + 1;
                        if (i4 >= i) {
                            break;
                        }
                        i2 = i4;
                        j6 = o;
                    } else {
                        long j9 = j6;
                    }
                    if (j7 >= j5) {
                        o = j6;
                        break;
                    }
                    o = j7;
                    j3 = 1;
                }
            }
        }
        int i5 = (int) (o - p);
        long j10 = this.d == 0 ? o : j2;
        long max = Math.max(this.b2, o - ((long) Math.min(this.y, i5)));
        if (this.Y1 == 0 && max < j5) {
            Object[] objArr2 = this.a2;
            m0.n.b.i.c(objArr2);
            if (m0.n.b.i.a(objArr2[((int) max) & (objArr2.length - 1)], u.a)) {
                o++;
                max++;
            }
        }
        v(max, j10, o, j5);
        k();
        return (cVarArr.length == 0) ^ true ? n(cVarArr) : cVarArr;
    }
}
