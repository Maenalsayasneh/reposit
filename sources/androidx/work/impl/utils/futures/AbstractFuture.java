package androidx.work.impl.utils.futures;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture<V> implements i0.h.b.a.a.a<V> {
    public static final boolean c = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger d = Logger.getLogger(AbstractFuture.class.getName());
    public static final b q;
    public static final Object x = new Object();
    public volatile d Y1;
    public volatile h Z1;
    public volatile Object y;

    public static final class Failure {
        public static final Failure a = new Failure(new Throwable("Failure occurred while trying to finish a future.") {
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable b;

        public Failure(Throwable th) {
            boolean z = AbstractFuture.c;
            Objects.requireNonNull(th);
            this.b = th;
        }
    }

    public static abstract class b {
        public b(a aVar) {
        }

        public abstract boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class c {
        public static final c a;
        public static final c b;
        public final boolean c;
        public final Throwable d;

        static {
            if (AbstractFuture.c) {
                b = null;
                a = null;
                return;
            }
            b = new c(false, (Throwable) null);
            a = new c(true, (Throwable) null);
        }

        public c(boolean z, Throwable th) {
            this.c = z;
            this.d = th;
        }
    }

    public static final class d {
        public static final d a = new d((Runnable) null, (Executor) null);
        public final Runnable b;
        public final Executor c;
        public d d;

        public d(Runnable runnable, Executor executor) {
            this.b = runnable;
            this.c = executor;
        }
    }

    public static final class e extends b {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<AbstractFuture, h> c;
        public final AtomicReferenceFieldUpdater<AbstractFuture, d> d;
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super((a) null);
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            return this.d.compareAndSet(abstractFuture, dVar, dVar2);
        }

        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return this.e.compareAndSet(abstractFuture, obj, obj2);
        }

        public boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            return this.c.compareAndSet(abstractFuture, hVar, hVar2);
        }

        public void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        public void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {
        public final AbstractFuture<V> c;
        public final i0.h.b.a.a.a<? extends V> d;

        public f(AbstractFuture<V> abstractFuture, i0.h.b.a.a.a<? extends V> aVar) {
            this.c = abstractFuture;
            this.d = aVar;
        }

        public void run() {
            if (this.c.y == this) {
                if (AbstractFuture.q.b(this.c, this, AbstractFuture.f(this.d))) {
                    AbstractFuture.c(this.c);
                }
            }
        }
    }

    public static final class g extends b {
        public g() {
            super((a) null);
        }

        public boolean a(AbstractFuture<?> abstractFuture, d dVar, d dVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.Y1 != dVar) {
                    return false;
                }
                abstractFuture.Y1 = dVar2;
                return true;
            }
        }

        public boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.y != obj) {
                    return false;
                }
                abstractFuture.y = obj2;
                return true;
            }
        }

        public boolean c(AbstractFuture<?> abstractFuture, h hVar, h hVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.Z1 != hVar) {
                    return false;
                }
                abstractFuture.Z1 = hVar2;
                return true;
            }
        }

        public void d(h hVar, h hVar2) {
            hVar.c = hVar2;
        }

        public void e(h hVar, Thread thread) {
            hVar.b = thread;
        }
    }

    public static final class h {
        public static final h a = new h(false);
        public volatile Thread b;
        public volatile h c;

        public h(boolean z) {
        }

        public h() {
            AbstractFuture.q.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.AbstractFuture$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.AbstractFuture$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$h> r0 = androidx.work.impl.utils.futures.AbstractFuture.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            c = r1
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r1 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            d = r1
            androidx.work.impl.utils.futures.AbstractFuture$e r1 = new androidx.work.impl.utils.futures.AbstractFuture$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r2 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.String r5 = "Z1"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture$d> r2 = androidx.work.impl.utils.futures.AbstractFuture.d.class
            java.lang.String r6 = "Y1"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.AbstractFuture> r0 = androidx.work.impl.utils.futures.AbstractFuture.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "y"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.AbstractFuture$g r1 = new androidx.work.impl.utils.futures.AbstractFuture$g
            r1.<init>()
        L_0x0054:
            q = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = d
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            x = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.<clinit>():void");
    }

    public static void c(AbstractFuture<?> abstractFuture) {
        AbstractFuture<V> abstractFuture2;
        d dVar;
        d dVar2;
        d dVar3 = null;
        AbstractFuture<?> abstractFuture3 = abstractFuture;
        while (true) {
            h hVar = abstractFuture3.Z1;
            if (q.c(abstractFuture3, hVar, h.a)) {
                while (hVar != null) {
                    Thread thread = hVar.b;
                    if (thread != null) {
                        hVar.b = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.c;
                }
                do {
                    dVar = abstractFuture3.Y1;
                } while (!q.a(abstractFuture3, dVar, d.a));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.d;
                    dVar3.d = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.d;
                    Runnable runnable = dVar2.b;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        AbstractFuture<V> abstractFuture4 = fVar.c;
                        if (abstractFuture4.y == fVar) {
                            if (q.b(abstractFuture4, fVar, f(fVar.d))) {
                                abstractFuture2 = abstractFuture4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, dVar2.c);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
            abstractFuture2 = abstractFuture3;
            abstractFuture3 = abstractFuture2;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = d;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    public static Object f(i0.h.b.a.a.a<?> aVar) {
        if (aVar instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) aVar).y;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (!cVar.c) {
                return obj;
            }
            if (cVar.d != null) {
                return new c(false, cVar.d);
            }
            return c.b;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!c) && isCancelled) {
            return c.b;
        }
        try {
            Object g2 = g(aVar);
            return g2 == null ? x : g2;
        } catch (ExecutionException e2) {
            return new Failure(e2.getCause());
        } catch (CancellationException e3) {
            if (isCancelled) {
                return new c(false, e3);
            }
            return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e3));
        } catch (Throwable th) {
            return new Failure(th);
        }
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public final void a(Runnable runnable, Executor executor) {
        Objects.requireNonNull(executor);
        d dVar = this.Y1;
        if (dVar != d.a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.d = dVar;
                if (!q.a(this, dVar, dVar2)) {
                    dVar = this.Y1;
                } else {
                    return;
                }
            } while (dVar != d.a);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String str;
        try {
            Object g2 = g(this);
            sb.append("SUCCESS, result=[");
            if (g2 == this) {
                str = "this future";
            } else {
                str = String.valueOf(g2);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, i0.h.b.a.a.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.y
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = c
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = new androidx.work.impl.utils.futures.AbstractFuture$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.a
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.AbstractFuture$c r3 = androidx.work.impl.utils.futures.AbstractFuture.c.b
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            androidx.work.impl.utils.futures.AbstractFuture$b r6 = q
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            c(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r4 == 0) goto L_0x005d
            androidx.work.impl.utils.futures.AbstractFuture$f r0 = (androidx.work.impl.utils.futures.AbstractFuture.f) r0
            i0.h.b.a.a.a<? extends V> r0 = r0.d
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture
            if (r4 == 0) goto L_0x0050
            r4 = r0
            androidx.work.impl.utils.futures.AbstractFuture r4 = (androidx.work.impl.utils.futures.AbstractFuture) r4
            java.lang.Object r0 = r4.y
            if (r0 != 0) goto L_0x0048
            r5 = r1
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = r1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.y
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.AbstractFuture.f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.cancel(boolean):boolean");
    }

    public final V e(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            Throwable th = ((c) obj).d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof Failure) {
            throw new ExecutionException(((Failure) obj).b);
        } else if (obj == x) {
            return null;
        } else {
            return obj;
        }
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.y;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof f))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.Z1;
                if (hVar != h.a) {
                    h hVar2 = new h();
                    do {
                        b bVar = q;
                        bVar.d(hVar2, hVar);
                        if (bVar.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.y;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(hVar2);
                        } else {
                            hVar = this.Z1;
                        }
                    } while (hVar != h.a);
                }
                return e(this.y);
            }
            while (nanos > 0) {
                Object obj3 = this.y;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFuture = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String n02 = i0.d.a.a.a.n0(str, " (plus ");
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = n02 + convert + " " + lowerCase;
                    if (z) {
                        str2 = i0.d.a.a.a.n0(str2, InstabugDbContract.COMMA_SEP);
                    }
                    n02 = i0.d.a.a.a.n0(str2, " ");
                }
                if (z) {
                    n02 = i0.d.a.a.a.l0(n02, nanos2, " nanoseconds ");
                }
                str = i0.d.a.a.a.n0(n02, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(i0.d.a.a.a.n0(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(i0.d.a.a.a.o0(str, " for ", abstractFuture));
        }
        throw new InterruptedException();
    }

    public String h() {
        String str;
        Object obj = this.y;
        if (obj instanceof f) {
            StringBuilder P0 = i0.d.a.a.a.P0("setFuture=[");
            i0.h.b.a.a.a<? extends V> aVar = ((f) obj).d;
            if (aVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(aVar);
            }
            return i0.d.a.a.a.y0(P0, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder P02 = i0.d.a.a.a.P0("remaining delay=[");
            P02.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            P02.append(" ms]");
            return P02.toString();
        }
    }

    public final void i(h hVar) {
        hVar.b = null;
        while (true) {
            h hVar2 = this.Z1;
            if (hVar2 != h.a) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.c;
                    if (hVar2.b != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.c = hVar4;
                        if (hVar3.b == null) {
                        }
                    } else if (!q.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.y instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.y;
        return (!(obj instanceof f)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.y instanceof c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = h();
            } catch (RuntimeException e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Exception thrown from implementation: ");
                P0.append(e2.getClass());
                str = P0.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.y;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.Z1;
            if (hVar != h.a) {
                h hVar2 = new h();
                do {
                    b bVar = q;
                    bVar.d(hVar2, hVar);
                    if (bVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.y;
                            } else {
                                i(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.Z1;
                } while (hVar != h.a);
            }
            return e(this.y);
        }
        throw new InterruptedException();
    }
}
