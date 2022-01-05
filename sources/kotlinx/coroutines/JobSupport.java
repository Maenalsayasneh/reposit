package kotlinx.coroutines;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.i;
import m0.l.e;
import m0.n.a.l;
import n0.a.a1;
import n0.a.b1;
import n0.a.f1;
import n0.a.g;
import n0.a.g1;
import n0.a.h2.j;
import n0.a.h2.k;
import n0.a.h2.p;
import n0.a.i1;
import n0.a.j1;
import n0.a.m1;
import n0.a.n;
import n0.a.n1;
import n0.a.o0;
import n0.a.p1;
import n0.a.r;
import n0.a.r0;
import n0.a.s;
import n0.a.t;
import n0.a.w;
import n0.a.z;
import n0.a.z0;

/* compiled from: JobSupport.kt */
public class JobSupport implements f1, t, p1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    public static final class a<T> extends n<T> {
        public final JobSupport b2;

        public a(m0.l.c<? super T> cVar, JobSupport jobSupport) {
            super(cVar, 1);
            this.b2 = jobSupport;
        }

        public Throwable n(f1 f1Var) {
            Throwable d;
            Object a0 = this.b2.a0();
            if ((a0 instanceof c) && (d = ((c) a0).d()) != null) {
                return d;
            }
            if (a0 instanceof z) {
                return ((z) a0).b;
            }
            return ((JobSupport) f1Var).v();
        }

        public String u() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    public static final class b extends i1 {
        public final c Y1;
        public final s Z1;
        public final Object a2;
        public final JobSupport y;

        public b(JobSupport jobSupport, c cVar, s sVar, Object obj) {
            this.y = jobSupport;
            this.Y1 = cVar;
            this.Z1 = sVar;
            this.a2 = obj;
        }

        public void H(Throwable th) {
            JobSupport jobSupport = this.y;
            c cVar = this.Y1;
            s sVar = this.Z1;
            Object obj = this.a2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.c;
            s i02 = jobSupport.i0(sVar);
            if (i02 == null || !jobSupport.s0(cVar, i02, obj)) {
                jobSupport.D(jobSupport.U(cVar, obj));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            H((Throwable) obj);
            return i.a;
        }
    }

    /* compiled from: JobSupport.kt */
    public static final class c implements a1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;
        public final m1 c;

        public c(m1 m1Var, boolean z, Throwable th) {
            this.c = m1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        public boolean a() {
            return ((Throwable) this._rootCause) == null;
        }

        public final void b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList<Throwable> c2 = c();
                        c2.add(obj);
                        c2.add(th);
                        this._exceptionsHolder = c2;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(m0.n.b.i.k("State is ", obj).toString());
                }
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        public final boolean e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        public final boolean f() {
            return this._isCompleting;
        }

        public m1 g() {
            return this.c;
        }

        public final boolean h() {
            return this._exceptionsHolder == j1.e;
        }

        public final List<Throwable> i(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> c2 = c();
                c2.add(obj);
                arrayList = c2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(m0.n.b.i.k("State is ", obj).toString());
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !m0.n.b.i.a(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = j1.e;
            return arrayList;
        }

        public final void j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [int, boolean] */
        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Finishing[cancelling=");
            P0.append(e());
            P0.append(", completing=");
            P0.append(this._isCompleting);
            P0.append(", rootCause=");
            P0.append((Throwable) this._rootCause);
            P0.append(", exceptions=");
            P0.append(this._exceptionsHolder);
            P0.append(", list=");
            P0.append(this.c);
            P0.append(']');
            return P0.toString();
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    public static final class d extends k.b {
        public final /* synthetic */ JobSupport d;
        public final /* synthetic */ Object e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(k kVar, JobSupport jobSupport, Object obj) {
            super(kVar);
            this.d = jobSupport;
            this.e = obj;
        }

        public Object i(Object obj) {
            k kVar = (k) obj;
            if (this.d.a0() == this.e) {
                return null;
            }
            return j.a;
        }
    }

    public JobSupport(boolean z) {
        this._state = z ? j1.g : j1.f;
        this._parentHandle = null;
    }

    public static /* synthetic */ CancellationException q0(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        int i2 = i & 1;
        return jobSupport.p0(th, (String) null);
    }

    public final boolean B(Object obj, m1 m1Var, i1 i1Var) {
        int G;
        d dVar = new d(i1Var, this, obj);
        do {
            G = m1Var.y().G(i1Var, m1Var, dVar);
            if (G == 1) {
                return true;
            }
        } while (G != 2);
        return false;
    }

    public void D(Object obj) {
    }

    public final o0 E(l<? super Throwable, i> lVar) {
        return q(false, true, lVar);
    }

    public CancellationException J() {
        Throwable th;
        Object a0 = a0();
        CancellationException cancellationException = null;
        if (a0 instanceof c) {
            th = ((c) a0).d();
        } else if (a0 instanceof z) {
            th = ((z) a0).b;
        } else if (!(a0 instanceof a1)) {
            th = null;
        } else {
            throw new IllegalStateException(m0.n.b.i.k("Cannot be cancelling child in this state: ", a0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new JobCancellationException(m0.n.b.i.k("Parent job is ", o0(a0)), th, this) : cancellationException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0040 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(java.lang.Object r10) {
        /*
            r9 = this;
            n0.a.h2.t r0 = n0.a.j1.a
            boolean r1 = r9.X()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x003a
        L_0x000b:
            java.lang.Object r0 = r9.a0()
            boolean r1 = r0 instanceof n0.a.a1
            if (r1 == 0) goto L_0x0033
            boolean r1 = r0 instanceof kotlinx.coroutines.JobSupport.c
            if (r1 == 0) goto L_0x0021
            r1 = r0
            kotlinx.coroutines.JobSupport$c r1 = (kotlinx.coroutines.JobSupport.c) r1
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0021
            goto L_0x0033
        L_0x0021:
            n0.a.z r1 = new n0.a.z
            java.lang.Throwable r5 = r9.T(r10)
            r1.<init>(r5, r3, r2)
            java.lang.Object r0 = r9.r0(r0, r1)
            n0.a.h2.t r1 = n0.a.j1.c
            if (r0 == r1) goto L_0x000b
            goto L_0x0035
        L_0x0033:
            n0.a.h2.t r0 = n0.a.j1.a
        L_0x0035:
            n0.a.h2.t r1 = n0.a.j1.b
            if (r0 != r1) goto L_0x003a
            return r4
        L_0x003a:
            n0.a.h2.t r1 = n0.a.j1.a
            if (r0 != r1) goto L_0x00e5
            r0 = 0
            r1 = r0
        L_0x0040:
            java.lang.Object r5 = r9.a0()
            boolean r6 = r5 instanceof kotlinx.coroutines.JobSupport.c
            if (r6 == 0) goto L_0x008b
            monitor-enter(r5)
            r2 = r5
            kotlinx.coroutines.JobSupport$c r2 = (kotlinx.coroutines.JobSupport.c) r2     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.h()     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0057
            n0.a.h2.t r10 = n0.a.j1.d     // Catch:{ all -> 0x0088 }
            monitor-exit(r5)
            goto L_0x00e4
        L_0x0057:
            r2 = r5
            kotlinx.coroutines.JobSupport$c r2 = (kotlinx.coroutines.JobSupport.c) r2     // Catch:{ all -> 0x0088 }
            boolean r2 = r2.e()     // Catch:{ all -> 0x0088 }
            if (r10 != 0) goto L_0x0062
            if (r2 != 0) goto L_0x006e
        L_0x0062:
            if (r1 != 0) goto L_0x0068
            java.lang.Throwable r1 = r9.T(r10)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            r10 = r5
            kotlinx.coroutines.JobSupport$c r10 = (kotlinx.coroutines.JobSupport.c) r10     // Catch:{ all -> 0x0088 }
            r10.b(r1)     // Catch:{ all -> 0x0088 }
        L_0x006e:
            r10 = r5
            kotlinx.coroutines.JobSupport$c r10 = (kotlinx.coroutines.JobSupport.c) r10     // Catch:{ all -> 0x0088 }
            java.lang.Throwable r10 = r10.d()     // Catch:{ all -> 0x0088 }
            r1 = r2 ^ 1
            if (r1 == 0) goto L_0x007a
            r0 = r10
        L_0x007a:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            kotlinx.coroutines.JobSupport$c r5 = (kotlinx.coroutines.JobSupport.c) r5
            n0.a.m1 r10 = r5.c
            r9.j0(r10, r0)
        L_0x0085:
            n0.a.h2.t r10 = n0.a.j1.a
            goto L_0x00e4
        L_0x0088:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L_0x008b:
            boolean r6 = r5 instanceof n0.a.a1
            if (r6 == 0) goto L_0x00e2
            if (r1 != 0) goto L_0x0095
            java.lang.Throwable r1 = r9.T(r10)
        L_0x0095:
            r6 = r5
            n0.a.a1 r6 = (n0.a.a1) r6
            boolean r7 = r6.a()
            if (r7 == 0) goto L_0x00bd
            n0.a.m1 r5 = r9.Y(r6)
            if (r5 != 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            kotlinx.coroutines.JobSupport$c r7 = new kotlinx.coroutines.JobSupport$c
            r7.<init>(r5, r3, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = c
            boolean r6 = r8.compareAndSet(r9, r6, r7)
            if (r6 != 0) goto L_0x00b4
        L_0x00b2:
            r5 = r3
            goto L_0x00b8
        L_0x00b4:
            r9.j0(r5, r1)
            r5 = r4
        L_0x00b8:
            if (r5 == 0) goto L_0x0040
            n0.a.h2.t r10 = n0.a.j1.a
            goto L_0x00e4
        L_0x00bd:
            n0.a.z r6 = new n0.a.z
            r6.<init>(r1, r3, r2)
            java.lang.Object r6 = r9.r0(r5, r6)
            n0.a.h2.t r7 = n0.a.j1.a
            if (r6 == r7) goto L_0x00d2
            n0.a.h2.t r5 = n0.a.j1.c
            if (r6 != r5) goto L_0x00d0
            goto L_0x0040
        L_0x00d0:
            r0 = r6
            goto L_0x00e5
        L_0x00d2:
            java.lang.String r10 = "Cannot happen in "
            java.lang.String r10 = m0.n.b.i.k(r10, r5)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        L_0x00e2:
            n0.a.h2.t r10 = n0.a.j1.d
        L_0x00e4:
            r0 = r10
        L_0x00e5:
            n0.a.h2.t r10 = n0.a.j1.a
            if (r0 != r10) goto L_0x00eb
        L_0x00e9:
            r3 = r4
            goto L_0x00f9
        L_0x00eb:
            n0.a.h2.t r10 = n0.a.j1.b
            if (r0 != r10) goto L_0x00f0
            goto L_0x00e9
        L_0x00f0:
            n0.a.h2.t r10 = n0.a.j1.d
            if (r0 != r10) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            r9.D(r0)
            goto L_0x00e9
        L_0x00f9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.K(java.lang.Object):boolean");
    }

    public void L(Throwable th) {
        K(th);
    }

    public final r N(t tVar) {
        return (r) m0.r.t.a.r.m.a1.a.p2(this, true, false, new s(tVar), 2, (Object) null);
    }

    public final boolean P(Throwable th) {
        if (e0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        r rVar = (r) this._parentHandle;
        if (rVar == null || rVar == n1.c) {
            return z;
        }
        if (rVar.f(th) || z) {
            return true;
        }
        return false;
    }

    public String Q() {
        return "Job was cancelled";
    }

    public boolean R(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!K(th) || !W()) {
            return false;
        }
        return true;
    }

    public final void S(a1 a1Var, Object obj) {
        CompletionHandlerException completionHandlerException;
        r rVar = (r) this._parentHandle;
        if (rVar != null) {
            rVar.dispose();
            this._parentHandle = n1.c;
        }
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar == null ? null : zVar.b;
        if (a1Var instanceof i1) {
            try {
                ((i1) a1Var).H(th);
            } catch (Throwable th2) {
                c0(new CompletionHandlerException("Exception in completion handler " + a1Var + " for " + this, th2));
            }
        } else {
            m1 g = a1Var.g();
            if (g != null) {
                CompletionHandlerException completionHandlerException2 = null;
                for (k kVar = (k) g.v(); !m0.n.b.i.a(kVar, g); kVar = kVar.w()) {
                    if (kVar instanceof i1) {
                        i1 i1Var = (i1) kVar;
                        try {
                            i1Var.H(th);
                        } catch (Throwable th3) {
                            if (completionHandlerException2 == null) {
                                completionHandlerException = null;
                            } else {
                                h.m(completionHandlerException2, th3);
                                completionHandlerException = completionHandlerException2;
                            }
                            if (completionHandlerException == null) {
                                completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + i1Var + " for " + this, th3);
                            }
                        }
                    }
                }
                if (completionHandlerException2 != null) {
                    c0(completionHandlerException2);
                }
            }
        }
    }

    public final Throwable T(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(Q(), (Throwable) null, this);
            }
            return th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((p1) obj).J();
    }

    public final Object U(c cVar, Object obj) {
        Throwable V;
        Throwable th = null;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            th = zVar.b;
        }
        synchronized (cVar) {
            cVar.e();
            List<Throwable> i = cVar.i(th);
            V = V(cVar, i);
            if (V != null) {
                if (i.size() > 1) {
                    Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(i.size()));
                    for (Throwable next : i) {
                        if (next != V && next != V && !(next instanceof CancellationException) && newSetFromMap.add(next)) {
                            h.m(V, next);
                        }
                    }
                }
            }
        }
        if (!(V == null || V == th)) {
            obj = new z(V, false, 2);
        }
        if (V != null) {
            if (P(V) || b0(V)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                z.a.compareAndSet((z) obj, 0, 1);
            }
        }
        k0(obj);
        c.compareAndSet(this, cVar, obj instanceof a1 ? new b1((a1) obj) : obj);
        S(cVar, obj);
        return obj;
    }

    public final Throwable V(c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.e()) {
            return new JobCancellationException(Q(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    public boolean W() {
        return true;
    }

    public boolean X() {
        return this instanceof w;
    }

    public final m1 Y(a1 a1Var) {
        m1 g = a1Var.g();
        if (g != null) {
            return g;
        }
        if (a1Var instanceof r0) {
            return new m1();
        }
        if (a1Var instanceof i1) {
            m0((i1) a1Var);
            return null;
        }
        throw new IllegalStateException(m0.n.b.i.k("State should have list: ", a1Var).toString());
    }

    public final r Z() {
        return (r) this._parentHandle;
    }

    public boolean a() {
        Object a0 = a0();
        return (a0 instanceof a1) && ((a1) a0).a();
    }

    public final Object a0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).c(this);
        }
    }

    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(Q(), (Throwable) null, this);
        }
        L(cancellationException);
    }

    public boolean b0(Throwable th) {
        return false;
    }

    public void c0(Throwable th) {
        throw th;
    }

    public final void d0(f1 f1Var) {
        if (f1Var == null) {
            this._parentHandle = n1.c;
            return;
        }
        f1Var.start();
        r N = f1Var.N(this);
        this._parentHandle = N;
        if (!(a0() instanceof a1)) {
            N.dispose();
            this._parentHandle = n1.c;
        }
    }

    public boolean e0() {
        return this instanceof g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f0(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.a0()
            java.lang.Object r0 = r3.r0(r0, r4)
            n0.a.h2.t r1 = n0.a.j1.a
            if (r0 != r1) goto L_0x000e
            r4 = 0
            return r4
        L_0x000e:
            n0.a.h2.t r1 = n0.a.j1.b
            r2 = 1
            if (r0 != r1) goto L_0x0014
            return r2
        L_0x0014:
            n0.a.h2.t r1 = n0.a.j1.c
            if (r0 != r1) goto L_0x0019
            goto L_0x0000
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.f0(java.lang.Object):boolean");
    }

    public <R> R fold(R r, m0.n.a.p<? super R, ? super e.a, ? extends R> pVar) {
        return e.a.C0242a.a(this, r, pVar);
    }

    public final Object g0(Object obj) {
        Object r02;
        do {
            r02 = r0(a0(), obj);
            if (r02 == j1.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                z zVar = obj instanceof z ? (z) obj : null;
                if (zVar != null) {
                    th = zVar.b;
                }
                throw new IllegalStateException(str, th);
            }
        } while (r02 == j1.c);
        return r02;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        return e.a.C0242a.b(this, bVar);
    }

    public final m0.s.h<f1> getChildren() {
        JobSupport$children$1 jobSupport$children$1 = new JobSupport$children$1(this, (m0.l.c<? super JobSupport$children$1>) null);
        m0.n.b.i.e(jobSupport$children$1, "block");
        return new m0.s.k(jobSupport$children$1);
    }

    public final e.b<?> getKey() {
        return f1.a.c;
    }

    public String h0() {
        return getClass().getSimpleName();
    }

    public final s i0(k kVar) {
        while (kVar.D()) {
            kVar = kVar.y();
        }
        while (true) {
            kVar = kVar.w();
            if (!kVar.D()) {
                if (kVar instanceof s) {
                    return (s) kVar;
                }
                if (kVar instanceof m1) {
                    return null;
                }
            }
        }
    }

    public final boolean isCancelled() {
        Object a0 = a0();
        return (a0 instanceof z) || ((a0 instanceof c) && ((c) a0).e());
    }

    public final void j0(m1 m1Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (k kVar = (k) m1Var.v(); !m0.n.b.i.a(kVar, m1Var); kVar = kVar.w()) {
            if (kVar instanceof g1) {
                i1 i1Var = (i1) kVar;
                try {
                    i1Var.H(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        h.m(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + i1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            c0(completionHandlerException2);
        }
        P(th);
    }

    public void k0(Object obj) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(m0.l.c<? super m0.i> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4.a0()
            boolean r1 = r0 instanceof n0.a.a1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x000c
            r0 = r3
            goto L_0x0013
        L_0x000c:
            int r0 = r4.n0(r0)
            if (r0 < 0) goto L_0x0000
            r0 = r2
        L_0x0013:
            if (r0 != 0) goto L_0x001f
            m0.l.e r5 = r5.getContext()
            m0.r.t.a.r.m.a1.a.n1(r5)
            m0.i r5 = m0.i.a
            return r5
        L_0x001f:
            n0.a.n r0 = new n0.a.n
            m0.l.c r1 = i0.j.f.p.h.b2(r5)
            r0.<init>(r1, r2)
            r0.q()
            n0.a.s1 r1 = new n0.a.s1
            r1.<init>(r0)
            n0.a.o0 r1 = r4.q(r3, r2, r1)
            n0.a.p0 r2 = new n0.a.p0
            r2.<init>(r1)
            r0.p(r2)
            java.lang.Object r0 = r0.o()
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x0049
            java.lang.String r2 = "frame"
            m0.n.b.i.e(r5, r2)
        L_0x0049:
            if (r0 != r1) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            m0.i r0 = m0.i.a
        L_0x004e:
            if (r0 != r1) goto L_0x0051
            return r0
        L_0x0051:
            m0.i r5 = m0.i.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.l(m0.l.c):java.lang.Object");
    }

    public void l0() {
    }

    public final void m0(i1 i1Var) {
        m1 m1Var = new m1();
        k.d.lazySet(m1Var, i1Var);
        k.c.lazySet(m1Var, i1Var);
        while (true) {
            if (i1Var.v() == i1Var) {
                if (k.c.compareAndSet(i1Var, i1Var, m1Var)) {
                    m1Var.u(i1Var);
                    break;
                }
            } else {
                break;
            }
        }
        c.compareAndSet(this, i1Var, i1Var.w());
    }

    public e minusKey(e.b<?> bVar) {
        return e.a.C0242a.c(this, bVar);
    }

    public final int n0(Object obj) {
        if (obj instanceof r0) {
            if (((r0) obj).c) {
                return 0;
            }
            if (!c.compareAndSet(this, obj, j1.g)) {
                return -1;
            }
            l0();
            return 1;
        } else if (!(obj instanceof z0)) {
            return 0;
        } else {
            if (!c.compareAndSet(this, obj, ((z0) obj).c)) {
                return -1;
            }
            l0();
            return 1;
        }
    }

    public final String o0(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.e()) {
                return "Cancelling";
            }
            if (cVar.f()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof a1)) {
            return obj instanceof z ? "Cancelled" : "Completed";
        } else {
            if (((a1) obj).a()) {
                return "Active";
            }
            return "New";
        }
    }

    public final CancellationException p0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = Q();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    public e plus(e eVar) {
        return e.a.C0242a.d(this, eVar);
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [n0.a.z0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n0.a.o0 q(boolean r8, boolean r9, m0.n.a.l<? super java.lang.Throwable, m0.i> r10) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x0014
            boolean r1 = r10 instanceof n0.a.g1
            if (r1 == 0) goto L_0x000b
            r1 = r10
            n0.a.g1 r1 = (n0.a.g1) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0027
            n0.a.d1 r1 = new n0.a.d1
            r1.<init>(r10)
            goto L_0x0027
        L_0x0014:
            boolean r1 = r10 instanceof n0.a.i1
            if (r1 == 0) goto L_0x001c
            r1 = r10
            n0.a.i1 r1 = (n0.a.i1) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 != 0) goto L_0x0020
            r1 = r0
        L_0x0020:
            if (r1 != 0) goto L_0x0027
            n0.a.e1 r1 = new n0.a.e1
            r1.<init>(r10)
        L_0x0027:
            r1.x = r7
        L_0x0029:
            java.lang.Object r2 = r7.a0()
            boolean r3 = r2 instanceof n0.a.r0
            if (r3 == 0) goto L_0x0057
            r3 = r2
            n0.a.r0 r3 = (n0.a.r0) r3
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = c
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x0041:
            n0.a.m1 r2 = new n0.a.m1
            r2.<init>()
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            n0.a.z0 r4 = new n0.a.z0
            r4.<init>(r2)
            r2 = r4
        L_0x0051:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = c
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0029
        L_0x0057:
            boolean r3 = r2 instanceof n0.a.a1
            if (r3 == 0) goto L_0x00b0
            r3 = r2
            n0.a.a1 r3 = (n0.a.a1) r3
            n0.a.m1 r3 = r3.g()
            if (r3 != 0) goto L_0x006f
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            java.util.Objects.requireNonNull(r2, r3)
            n0.a.i1 r2 = (n0.a.i1) r2
            r7.m0(r2)
            goto L_0x0029
        L_0x006f:
            n0.a.n1 r4 = n0.a.n1.c
            if (r8 == 0) goto L_0x00a0
            boolean r5 = r2 instanceof kotlinx.coroutines.JobSupport.c
            if (r5 == 0) goto L_0x00a0
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.JobSupport$c r5 = (kotlinx.coroutines.JobSupport.c) r5     // Catch:{ all -> 0x009d }
            java.lang.Throwable r5 = r5.d()     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x008e
            boolean r6 = r10 instanceof n0.a.s     // Catch:{ all -> 0x009d }
            if (r6 == 0) goto L_0x009b
            r6 = r2
            kotlinx.coroutines.JobSupport$c r6 = (kotlinx.coroutines.JobSupport.c) r6     // Catch:{ all -> 0x009d }
            boolean r6 = r6.f()     // Catch:{ all -> 0x009d }
            if (r6 != 0) goto L_0x009b
        L_0x008e:
            boolean r4 = r7.B(r2, r3, r1)     // Catch:{ all -> 0x009d }
            if (r4 != 0) goto L_0x0096
            monitor-exit(r2)
            goto L_0x0029
        L_0x0096:
            if (r5 != 0) goto L_0x009a
            monitor-exit(r2)
            return r1
        L_0x009a:
            r4 = r1
        L_0x009b:
            monitor-exit(r2)
            goto L_0x00a1
        L_0x009d:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00a0:
            r5 = r0
        L_0x00a1:
            if (r5 == 0) goto L_0x00a9
            if (r9 == 0) goto L_0x00a8
            r10.invoke(r5)
        L_0x00a8:
            return r4
        L_0x00a9:
            boolean r2 = r7.B(r2, r3, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x00b0:
            if (r9 == 0) goto L_0x00c2
            boolean r8 = r2 instanceof n0.a.z
            if (r8 == 0) goto L_0x00b9
            n0.a.z r2 = (n0.a.z) r2
            goto L_0x00ba
        L_0x00b9:
            r2 = r0
        L_0x00ba:
            if (r2 != 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            java.lang.Throwable r0 = r2.b
        L_0x00bf:
            r10.invoke(r0)
        L_0x00c2:
            n0.a.n1 r8 = n0.a.n1.c
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.q(boolean, boolean, m0.n.a.l):n0.a.o0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0098, code lost:
        if (r5 != null) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x009b, code lost:
        j0(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00a0, code lost:
        if ((r7 instanceof n0.a.s) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a2, code lost:
        r0 = (n0.a.s) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a6, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a7, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00a9, code lost:
        r7 = r7.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ad, code lost:
        if (r7 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b0, code lost:
        r4 = i0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00b5, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b6, code lost:
        if (r4 == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00bc, code lost:
        if (s0(r3, r4, r8) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return U(r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        return n0.a.j1.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r0(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n0.a.a1
            if (r0 != 0) goto L_0x0007
            n0.a.h2.t r7 = n0.a.j1.a
            return r7
        L_0x0007:
            boolean r0 = r7 instanceof n0.a.r0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0011
            boolean r0 = r7 instanceof n0.a.i1
            if (r0 == 0) goto L_0x003f
        L_0x0011:
            boolean r0 = r7 instanceof n0.a.s
            if (r0 != 0) goto L_0x003f
            boolean r0 = r8 instanceof n0.a.z
            if (r0 != 0) goto L_0x003f
            n0.a.a1 r7 = (n0.a.a1) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = c
            boolean r3 = r8 instanceof n0.a.a1
            if (r3 == 0) goto L_0x002a
            n0.a.b1 r3 = new n0.a.b1
            r4 = r8
            n0.a.a1 r4 = (n0.a.a1) r4
            r3.<init>(r4)
            goto L_0x002b
        L_0x002a:
            r3 = r8
        L_0x002b:
            boolean r0 = r0.compareAndSet(r6, r7, r3)
            if (r0 != 0) goto L_0x0033
            r1 = r2
            goto L_0x0039
        L_0x0033:
            r6.k0(r8)
            r6.S(r7, r8)
        L_0x0039:
            if (r1 == 0) goto L_0x003c
            return r8
        L_0x003c:
            n0.a.h2.t r7 = n0.a.j1.c
            return r7
        L_0x003f:
            n0.a.a1 r7 = (n0.a.a1) r7
            n0.a.m1 r0 = r6.Y(r7)
            if (r0 != 0) goto L_0x004b
            n0.a.h2.t r7 = n0.a.j1.c
            goto L_0x00c5
        L_0x004b:
            boolean r3 = r7 instanceof kotlinx.coroutines.JobSupport.c
            r4 = 0
            if (r3 == 0) goto L_0x0054
            r3 = r7
            kotlinx.coroutines.JobSupport$c r3 = (kotlinx.coroutines.JobSupport.c) r3
            goto L_0x0055
        L_0x0054:
            r3 = r4
        L_0x0055:
            if (r3 != 0) goto L_0x005c
            kotlinx.coroutines.JobSupport$c r3 = new kotlinx.coroutines.JobSupport$c
            r3.<init>(r0, r2, r4)
        L_0x005c:
            monitor-enter(r3)
            boolean r2 = r3.f()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0068
            n0.a.h2.t r7 = n0.a.j1.a     // Catch:{ all -> 0x00c6 }
            monitor-exit(r3)
            goto L_0x00c5
        L_0x0068:
            r3.j(r1)     // Catch:{ all -> 0x00c6 }
            if (r3 == r7) goto L_0x0079
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = c     // Catch:{ all -> 0x00c6 }
            boolean r2 = r2.compareAndSet(r6, r7, r3)     // Catch:{ all -> 0x00c6 }
            if (r2 != 0) goto L_0x0079
            n0.a.h2.t r7 = n0.a.j1.c     // Catch:{ all -> 0x00c6 }
            monitor-exit(r3)
            goto L_0x00c5
        L_0x0079:
            boolean r2 = r3.e()     // Catch:{ all -> 0x00c6 }
            boolean r5 = r8 instanceof n0.a.z     // Catch:{ all -> 0x00c6 }
            if (r5 == 0) goto L_0x0085
            r5 = r8
            n0.a.z r5 = (n0.a.z) r5     // Catch:{ all -> 0x00c6 }
            goto L_0x0086
        L_0x0085:
            r5 = r4
        L_0x0086:
            if (r5 != 0) goto L_0x0089
            goto L_0x008e
        L_0x0089:
            java.lang.Throwable r5 = r5.b     // Catch:{ all -> 0x00c6 }
            r3.b(r5)     // Catch:{ all -> 0x00c6 }
        L_0x008e:
            java.lang.Throwable r5 = r3.d()     // Catch:{ all -> 0x00c6 }
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r5 = r4
        L_0x0097:
            monitor-exit(r3)
            if (r5 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r6.j0(r0, r5)
        L_0x009e:
            boolean r0 = r7 instanceof n0.a.s
            if (r0 == 0) goto L_0x00a6
            r0 = r7
            n0.a.s r0 = (n0.a.s) r0
            goto L_0x00a7
        L_0x00a6:
            r0 = r4
        L_0x00a7:
            if (r0 != 0) goto L_0x00b5
            n0.a.m1 r7 = r7.g()
            if (r7 != 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            n0.a.s r4 = r6.i0(r7)
            goto L_0x00b6
        L_0x00b5:
            r4 = r0
        L_0x00b6:
            if (r4 == 0) goto L_0x00c1
            boolean r7 = r6.s0(r3, r4, r8)
            if (r7 == 0) goto L_0x00c1
            n0.a.h2.t r7 = n0.a.j1.b
            goto L_0x00c5
        L_0x00c1:
            java.lang.Object r7 = r6.U(r3, r8)
        L_0x00c5:
            return r7
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.r0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final boolean s0(c cVar, s sVar, Object obj) {
        while (m0.r.t.a.r.m.a1.a.p2(sVar.y, false, false, new b(this, cVar, sVar, obj), 1, (Object) null) == n1.c) {
            sVar = i0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean start() {
        int n02;
        do {
            n02 = n0(a0());
            if (n02 == 0) {
                return false;
            }
        } while (n02 != 1);
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h0() + '{' + o0(a0()) + '}');
        sb.append('@');
        sb.append(m0.r.t.a.r.m.a1.a.M1(this));
        return sb.toString();
    }

    public final CancellationException v() {
        Object a0 = a0();
        if (a0 instanceof c) {
            Throwable d2 = ((c) a0).d();
            if (d2 != null) {
                return p0(d2, m0.n.b.i.k(getClass().getSimpleName(), " is cancelling"));
            }
            throw new IllegalStateException(m0.n.b.i.k("Job is still new or active: ", this).toString());
        } else if (a0 instanceof a1) {
            throw new IllegalStateException(m0.n.b.i.k("Job is still new or active: ", this).toString());
        } else if (a0 instanceof z) {
            return q0(this, ((z) a0).b, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(m0.n.b.i.k(getClass().getSimpleName(), " has completed normally"), (Throwable) null, this);
        }
    }

    public final void y(p1 p1Var) {
        K(p1Var);
    }
}
