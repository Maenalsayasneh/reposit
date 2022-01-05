package q0.h0.f;

import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: TaskRunner.kt */
public final class d {
    public static final d a;
    public static final Logger b;
    public static final b c = new b((f) null);
    public int d = InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT;
    public boolean e;
    public long f;
    public final List<c> g = new ArrayList();
    public final List<c> h = new ArrayList();
    public final Runnable i = new C0287d(this);
    public final a j;

    /* compiled from: TaskRunner.kt */
    public interface a {
        void a(d dVar);

        void b(d dVar, long j);

        long c();

        void execute(Runnable runnable);
    }

    /* compiled from: TaskRunner.kt */
    public static final class b {
        public b(f fVar) {
        }
    }

    /* compiled from: TaskRunner.kt */
    public static final class c implements a {
        public final ThreadPoolExecutor a;

        public c(ThreadFactory threadFactory) {
            i.e(threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        public void a(d dVar) {
            i.e(dVar, "taskRunner");
            dVar.notify();
        }

        public void b(d dVar, long j) throws InterruptedException {
            i.e(dVar, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                dVar.wait(j2, (int) j3);
            }
        }

        public long c() {
            return System.nanoTime();
        }

        public void execute(Runnable runnable) {
            i.e(runnable, "runnable");
            this.a.execute(runnable);
        }
    }

    /* renamed from: q0.h0.f.d$d  reason: collision with other inner class name */
    /* compiled from: TaskRunner.kt */
    public static final class C0287d implements Runnable {
        public final /* synthetic */ d c;

        public C0287d(d dVar) {
            this.c = dVar;
        }

        public void run() {
            a c2;
            while (true) {
                synchronized (this.c) {
                    c2 = this.c.c();
                }
                if (c2 != null) {
                    c cVar = c2.a;
                    i.c(cVar);
                    long j = -1;
                    b bVar = d.c;
                    boolean isLoggable = d.b.isLoggable(Level.FINE);
                    if (isLoggable) {
                        j = cVar.e.j.c();
                        m0.r.t.a.r.m.a1.a.H(c2, cVar, "starting");
                    }
                    try {
                        d.a(this.c, c2);
                        if (isLoggable) {
                            long c3 = cVar.e.j.c() - j;
                            StringBuilder P0 = i0.d.a.a.a.P0("finished run in ");
                            P0.append(m0.r.t.a.r.m.a1.a.A1(c3));
                            m0.r.t.a.r.m.a1.a.H(c2, cVar, P0.toString());
                        }
                    } catch (Throwable th) {
                        if (isLoggable) {
                            long c4 = cVar.e.j.c() - j;
                            StringBuilder P02 = i0.d.a.a.a.P0("failed a run in ");
                            P02.append(m0.r.t.a.r.m.a1.a.A1(c4));
                            m0.r.t.a.r.m.a1.a.H(c2, cVar, P02.toString());
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    static {
        String str = q0.h0.c.g + " TaskRunner";
        i.e(str, "name");
        a = new d(new c(new q0.h0.b(str, true)));
        Logger logger = Logger.getLogger(d.class.getName());
        i.d(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        b = logger;
    }

    public d(a aVar) {
        i.e(aVar, "backend");
        this.j = aVar;
    }

    public static final void a(d dVar, a aVar) {
        Objects.requireNonNull(dVar);
        byte[] bArr = q0.h0.c.a;
        Thread currentThread = Thread.currentThread();
        i.d(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(aVar.c);
        try {
            long a2 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a2);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j2) {
        byte[] bArr = q0.h0.c.a;
        c cVar = aVar.a;
        i.c(cVar);
        if (cVar.b == aVar) {
            boolean z = cVar.d;
            cVar.d = false;
            cVar.b = null;
            this.g.remove(cVar);
            if (j2 != -1 && !z && !cVar.a) {
                cVar.e(aVar, j2, true);
            }
            if (!cVar.c.isEmpty()) {
                this.h.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:29|30|31|34|35|42|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        r14.e = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q0.h0.f.a c() {
        /*
            r14 = this;
            byte[] r0 = q0.h0.c.a
        L_0x0002:
            java.util.List<q0.h0.f.c> r0 = r14.h
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            q0.h0.f.d$a r0 = r14.j
            long r2 = r0.c()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List<q0.h0.f.c> r0 = r14.h
            java.util.Iterator r0 = r0.iterator()
            r6 = r1
        L_0x001e:
            boolean r7 = r0.hasNext()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L_0x004c
            java.lang.Object r7 = r0.next()
            q0.h0.f.c r7 = (q0.h0.f.c) r7
            java.util.List<q0.h0.f.a> r7 = r7.c
            java.lang.Object r7 = r7.get(r9)
            q0.h0.f.a r7 = (q0.h0.f.a) r7
            long r10 = r7.b
            long r10 = r10 - r2
            r12 = 0
            long r10 = java.lang.Math.max(r12, r10)
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 <= 0) goto L_0x0046
            long r4 = java.lang.Math.min(r10, r4)
            goto L_0x001e
        L_0x0046:
            if (r6 == 0) goto L_0x004a
            r0 = r8
            goto L_0x004d
        L_0x004a:
            r6 = r7
            goto L_0x001e
        L_0x004c:
            r0 = r9
        L_0x004d:
            if (r6 == 0) goto L_0x0082
            byte[] r1 = q0.h0.c.a
            r1 = -1
            r6.b = r1
            q0.h0.f.c r1 = r6.a
            m0.n.b.i.c(r1)
            java.util.List<q0.h0.f.a> r2 = r1.c
            r2.remove(r6)
            java.util.List<q0.h0.f.c> r2 = r14.h
            r2.remove(r1)
            r1.b = r6
            java.util.List<q0.h0.f.c> r2 = r14.g
            r2.add(r1)
            if (r0 != 0) goto L_0x007a
            boolean r0 = r14.e
            if (r0 != 0) goto L_0x0081
            java.util.List<q0.h0.f.c> r0 = r14.h
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0081
        L_0x007a:
            q0.h0.f.d$a r0 = r14.j
            java.lang.Runnable r1 = r14.i
            r0.execute(r1)
        L_0x0081:
            return r6
        L_0x0082:
            boolean r0 = r14.e
            if (r0 == 0) goto L_0x0093
            long r6 = r14.f
            long r6 = r6 - r2
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0092
            q0.h0.f.d$a r0 = r14.j
            r0.a(r14)
        L_0x0092:
            return r1
        L_0x0093:
            r14.e = r8
            long r2 = r2 + r4
            r14.f = r2
            q0.h0.f.d$a r0 = r14.j     // Catch:{ InterruptedException -> 0x00a3 }
            r0.b(r14, r4)     // Catch:{ InterruptedException -> 0x00a3 }
        L_0x009d:
            r14.e = r9
            goto L_0x0002
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a7
        L_0x00a3:
            r14.d()     // Catch:{ all -> 0x00a1 }
            goto L_0x009d
        L_0x00a7:
            r14.e = r9
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.f.d.c():q0.h0.f.a");
    }

    public final void d() {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            this.g.get(size).b();
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            c cVar = this.h.get(size2);
            cVar.b();
            if (cVar.c.isEmpty()) {
                this.h.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        i.e(cVar, "taskQueue");
        byte[] bArr = q0.h0.c.a;
        if (cVar.b == null) {
            if (!cVar.c.isEmpty()) {
                List<c> list = this.h;
                i.e(list, "$this$addIfAbsent");
                if (!list.contains(cVar)) {
                    list.add(cVar);
                }
            } else {
                this.h.remove(cVar);
            }
        }
        if (this.e) {
            this.j.a(this);
        } else {
            this.j.execute(this.i);
        }
    }

    public final c f() {
        int i2;
        synchronized (this) {
            i2 = this.d;
            this.d = i2 + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i2);
        return new c(this, sb.toString());
    }
}
