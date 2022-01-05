package n0.a.f2;

import i0.d.a.a.a;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.UndeliveredElementException;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import n0.a.h2.k;

/* compiled from: ArrayChannel.kt */
public class c<E> extends AbstractChannel<E> {
    public final ReentrantLock Y1;
    public Object[] Z1;
    public int a2;
    private volatile /* synthetic */ int size;
    public final int x;
    public final BufferOverflow y;

    public c(int i, BufferOverflow bufferOverflow, l<? super E, i> lVar) {
        super(lVar);
        this.x = i;
        this.y = bufferOverflow;
        if (i < 1 ? false : true) {
            this.Y1 = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i, 8)];
            g.q(objArr, a.a, 0, 0, 6);
            this.Z1 = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(a.g0("ArrayChannel capacity must be at least 1, but ", i, " was specified").toString());
    }

    public boolean A() {
        ReentrantLock reentrantLock = this.Y1;
        reentrantLock.lock();
        try {
            return super.A();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public void B(boolean z) {
        l<E, i> lVar = this.d;
        ReentrantLock reentrantLock = this.Y1;
        reentrantLock.lock();
        try {
            int i = this.size;
            UndeliveredElementException undeliveredElementException = null;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = this.Z1[this.a2];
                if (!(lVar == null || obj == a.a)) {
                    undeliveredElementException = m0.r.t.a.r.m.a1.a.i0(lVar, obj, undeliveredElementException);
                }
                Object[] objArr = this.Z1;
                int i3 = this.a2;
                objArr[i3] = a.a;
                this.a2 = (i3 + 1) % objArr.length;
            }
            this.size = 0;
            reentrantLock.unlock();
            super.B(z);
            if (undeliveredElementException != null) {
                throw undeliveredElementException;
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Object D() {
        ReentrantLock reentrantLock = this.Y1;
        reentrantLock.lock();
        try {
            int i = this.size;
            if (i == 0) {
                Object f = f();
                if (f == null) {
                    f = a.d;
                }
                return f;
            }
            Object[] objArr = this.Z1;
            int i2 = this.a2;
            Object obj = objArr[i2];
            q qVar = null;
            objArr[i2] = null;
            this.size = i - 1;
            Object obj2 = a.d;
            boolean z = false;
            if (i == this.x) {
                q qVar2 = null;
                while (true) {
                    q v = v();
                    if (v == null) {
                        qVar = qVar2;
                        break;
                    } else if (v.L((k.c) null) != null) {
                        obj2 = v.J();
                        z = true;
                        qVar = v;
                        break;
                    } else {
                        v.M();
                        qVar2 = v;
                    }
                }
            }
            if (obj2 != a.d && !(obj2 instanceof h)) {
                this.size = i;
                Object[] objArr2 = this.Z1;
                objArr2[(this.a2 + i) % objArr2.length] = obj2;
            }
            this.a2 = (this.a2 + 1) % this.Z1.length;
            reentrantLock.unlock();
            if (z) {
                m0.n.b.i.c(qVar);
                qVar.H();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r2 = n0.a.j2.d.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (r7 != n0.a.j2.d.b) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r8.size = r1;
        r8.Z1[r8.a2] = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r0.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if ((r7 instanceof n0.a.f2.h) == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        r3 = true;
        r2 = r7;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        throw new java.lang.IllegalStateException(m0.n.b.i.k("performAtomicTrySelect(describeTryOffer) returned ", r7).toString());
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[Catch:{ all -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A[Catch:{ all -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object E(n0.a.j2.c<?> r9) {
        /*
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.Y1
            r0.lock()
            int r1 = r8.size     // Catch:{ all -> 0x00bc }
            if (r1 != 0) goto L_0x0015
            n0.a.f2.h r9 = r8.f()     // Catch:{ all -> 0x00bc }
            if (r9 != 0) goto L_0x0011
            n0.a.h2.t r9 = n0.a.f2.a.d     // Catch:{ all -> 0x00bc }
        L_0x0011:
            r0.unlock()
            return r9
        L_0x0015:
            java.lang.Object[] r2 = r8.Z1     // Catch:{ all -> 0x00bc }
            int r3 = r8.a2     // Catch:{ all -> 0x00bc }
            r4 = r2[r3]     // Catch:{ all -> 0x00bc }
            r5 = 0
            r2[r3] = r5     // Catch:{ all -> 0x00bc }
            int r2 = r1 + -1
            r8.size = r2     // Catch:{ all -> 0x00bc }
            n0.a.h2.t r2 = n0.a.f2.a.d     // Catch:{ all -> 0x00bc }
            int r3 = r8.x     // Catch:{ all -> 0x00bc }
            r6 = 1
            if (r1 != r3) goto L_0x007a
        L_0x0029:
            kotlinx.coroutines.channels.AbstractChannel$g r3 = new kotlinx.coroutines.channels.AbstractChannel$g     // Catch:{ all -> 0x00bc }
            n0.a.h2.i r7 = r8.q     // Catch:{ all -> 0x00bc }
            r3.<init>(r7)     // Catch:{ all -> 0x00bc }
            java.lang.Object r7 = r9.n(r3)     // Catch:{ all -> 0x00bc }
            if (r7 != 0) goto L_0x0046
            java.lang.Object r5 = r3.m()     // Catch:{ all -> 0x00bc }
            m0.n.b.i.c(r5)     // Catch:{ all -> 0x00bc }
            r2 = r5
            n0.a.f2.q r2 = (n0.a.f2.q) r2     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r2.J()     // Catch:{ all -> 0x00bc }
            r3 = r6
            goto L_0x007b
        L_0x0046:
            n0.a.h2.t r3 = n0.a.f2.a.d     // Catch:{ all -> 0x00bc }
            if (r7 != r3) goto L_0x004b
            goto L_0x007a
        L_0x004b:
            java.lang.Object r3 = n0.a.h2.c.b     // Catch:{ all -> 0x00bc }
            if (r7 != r3) goto L_0x0050
            goto L_0x0029
        L_0x0050:
            java.lang.Object r2 = n0.a.j2.d.a     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = n0.a.j2.d.b     // Catch:{ all -> 0x00bc }
            if (r7 != r2) goto L_0x0062
            r8.size = r1     // Catch:{ all -> 0x00bc }
            java.lang.Object[] r9 = r8.Z1     // Catch:{ all -> 0x00bc }
            int r1 = r8.a2     // Catch:{ all -> 0x00bc }
            r9[r1] = r4     // Catch:{ all -> 0x00bc }
            r0.unlock()
            return r7
        L_0x0062:
            boolean r2 = r7 instanceof n0.a.f2.h     // Catch:{ all -> 0x00bc }
            if (r2 == 0) goto L_0x006a
            r3 = r6
            r2 = r7
            r5 = r2
            goto L_0x007b
        L_0x006a:
            java.lang.String r9 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.String r9 = m0.n.b.i.k(r9, r7)     // Catch:{ all -> 0x00bc }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00bc }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x00bc }
            r1.<init>(r9)     // Catch:{ all -> 0x00bc }
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x007a:
            r3 = 0
        L_0x007b:
            n0.a.h2.t r7 = n0.a.f2.a.d     // Catch:{ all -> 0x00bc }
            if (r2 == r7) goto L_0x008f
            boolean r7 = r2 instanceof n0.a.f2.h     // Catch:{ all -> 0x00bc }
            if (r7 != 0) goto L_0x008f
            r8.size = r1     // Catch:{ all -> 0x00bc }
            java.lang.Object[] r9 = r8.Z1     // Catch:{ all -> 0x00bc }
            int r7 = r8.a2     // Catch:{ all -> 0x00bc }
            int r7 = r7 + r1
            int r1 = r9.length     // Catch:{ all -> 0x00bc }
            int r7 = r7 % r1
            r9[r7] = r2     // Catch:{ all -> 0x00bc }
            goto L_0x00a5
        L_0x008f:
            boolean r9 = r9.e()     // Catch:{ all -> 0x00bc }
            if (r9 != 0) goto L_0x00a5
            r8.size = r1     // Catch:{ all -> 0x00bc }
            java.lang.Object[] r9 = r8.Z1     // Catch:{ all -> 0x00bc }
            int r1 = r8.a2     // Catch:{ all -> 0x00bc }
            r9[r1] = r4     // Catch:{ all -> 0x00bc }
            java.lang.Object r9 = n0.a.j2.d.a     // Catch:{ all -> 0x00bc }
            java.lang.Object r9 = n0.a.j2.d.b     // Catch:{ all -> 0x00bc }
            r0.unlock()
            return r9
        L_0x00a5:
            int r9 = r8.a2     // Catch:{ all -> 0x00bc }
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.Z1     // Catch:{ all -> 0x00bc }
            int r1 = r1.length     // Catch:{ all -> 0x00bc }
            int r9 = r9 % r1
            r8.a2 = r9     // Catch:{ all -> 0x00bc }
            r0.unlock()
            if (r3 == 0) goto L_0x00bb
            m0.n.b.i.c(r5)
            n0.a.f2.q r5 = (n0.a.f2.q) r5
            r5.H()
        L_0x00bb:
            return r4
        L_0x00bc:
            r9 = move-exception
            r0.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.f2.c.E(n0.a.j2.c):java.lang.Object");
    }

    public final void F(int i, E e) {
        int i2 = this.x;
        if (i < i2) {
            Object[] objArr = this.Z1;
            if (i >= objArr.length) {
                int min = Math.min(objArr.length * 2, i2);
                Object[] objArr2 = new Object[min];
                if (i > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        Object[] objArr3 = this.Z1;
                        objArr2[i3] = objArr3[(this.a2 + i3) % objArr3.length];
                        if (i4 >= i) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                g.p(objArr2, a.a, i, min);
                this.Z1 = objArr2;
                this.a2 = 0;
            }
            Object[] objArr4 = this.Z1;
            objArr4[(this.a2 + i) % objArr4.length] = e;
            return;
        }
        Object[] objArr5 = this.Z1;
        int i5 = this.a2;
        objArr5[i5 % objArr5.length] = null;
        objArr5[(i + i5) % objArr5.length] = e;
        this.a2 = (i5 + 1) % objArr5.length;
    }

    public Object c(q qVar) {
        ReentrantLock reentrantLock = this.Y1;
        reentrantLock.lock();
        try {
            return super.c(qVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public String d() {
        StringBuilder P0 = a.P0("(buffer:capacity=");
        P0.append(this.x);
        P0.append(",size=");
        return a.s0(P0, this.size, ')');
    }

    public final boolean k() {
        return false;
    }

    public final boolean l() {
        return this.size == this.x && this.y == BufferOverflow.SUSPEND;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034 A[Catch:{ all -> 0x006b }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object p(E r6) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.Y1
            r0.lock()
            int r1 = r5.size     // Catch:{ all -> 0x006b }
            n0.a.f2.h r2 = r5.f()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x0067
            int r2 = r5.x     // Catch:{ all -> 0x006b }
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L_0x0018
            int r2 = r1 + 1
            r5.size = r2     // Catch:{ all -> 0x006b }
            goto L_0x002e
        L_0x0018:
            kotlinx.coroutines.channels.BufferOverflow r2 = r5.y     // Catch:{ all -> 0x006b }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0030
            if (r2 == r3) goto L_0x002e
            r3 = 2
            if (r2 != r3) goto L_0x0028
            n0.a.h2.t r2 = n0.a.f2.a.b     // Catch:{ all -> 0x006b }
            goto L_0x0032
        L_0x0028:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x006b }
            r6.<init>()     // Catch:{ all -> 0x006b }
            throw r6     // Catch:{ all -> 0x006b }
        L_0x002e:
            r2 = r4
            goto L_0x0032
        L_0x0030:
            n0.a.h2.t r2 = n0.a.f2.a.c     // Catch:{ all -> 0x006b }
        L_0x0032:
            if (r2 != 0) goto L_0x0063
            if (r1 != 0) goto L_0x005a
        L_0x0036:
            n0.a.f2.o r2 = r5.q()     // Catch:{ all -> 0x006b }
            if (r2 != 0) goto L_0x003d
            goto L_0x005a
        L_0x003d:
            boolean r3 = r2 instanceof n0.a.f2.h     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0047
            r5.size = r1     // Catch:{ all -> 0x006b }
            r0.unlock()
            return r2
        L_0x0047:
            n0.a.h2.t r3 = r2.o(r6, r4)     // Catch:{ all -> 0x006b }
            if (r3 == 0) goto L_0x0036
            r5.size = r1     // Catch:{ all -> 0x006b }
            r0.unlock()
            r2.k(r6)
            java.lang.Object r6 = r2.d()
            return r6
        L_0x005a:
            r5.F(r1, r6)     // Catch:{ all -> 0x006b }
            n0.a.h2.t r6 = n0.a.f2.a.b     // Catch:{ all -> 0x006b }
            r0.unlock()
            return r6
        L_0x0063:
            r0.unlock()
            return r2
        L_0x0067:
            r0.unlock()
            return r2
        L_0x006b:
            r6 = move-exception
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.a.f2.c.p(java.lang.Object):java.lang.Object");
    }

    public boolean x(m<? super E> mVar) {
        ReentrantLock reentrantLock = this.Y1;
        reentrantLock.lock();
        try {
            return super.x(mVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean y() {
        return false;
    }

    public final boolean z() {
        return this.size == 0;
    }
}
