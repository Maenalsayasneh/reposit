package r0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: AsyncTimeout.kt */
public class b extends z {
    public static final long e;
    public static final long f;
    public static b g;
    public static final a h = new a((f) null);
    public boolean i;
    public b j;
    public long k;

    /* compiled from: AsyncTimeout.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final b a() throws InterruptedException {
            Class<b> cls = b.class;
            b bVar = b.g;
            i.c(bVar);
            b bVar2 = bVar.j;
            if (bVar2 == null) {
                long nanoTime = System.nanoTime();
                cls.wait(b.e);
                b bVar3 = b.g;
                i.c(bVar3);
                if (bVar3.j != null || System.nanoTime() - nanoTime < b.f) {
                    return null;
                }
                return b.g;
            }
            long nanoTime2 = bVar2.k - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / 1000000;
                cls.wait(j, (int) (nanoTime2 - (1000000 * j)));
                return null;
            }
            b bVar4 = b.g;
            i.c(bVar4);
            bVar4.j = bVar2.j;
            bVar2.j = null;
            return bVar2;
        }
    }

    /* renamed from: r0.b$b  reason: collision with other inner class name */
    /* compiled from: AsyncTimeout.kt */
    public static final class C0294b extends Thread {
        public C0294b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            r1.k();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<r0.b> r0 = r0.b.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                r0.b$a r1 = r0.b.h     // Catch:{ all -> 0x0019 }
                r0.b r1 = r1.a()     // Catch:{ all -> 0x0019 }
                r0.b r2 = r0.b.g     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0012
                r1 = 0
                r0.b.g = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                return
            L_0x0012:
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                if (r1 == 0) goto L_0x0000
                r1.k()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.b.C0294b.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        e = millis;
        f = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        if (!this.i) {
            long j2 = this.d;
            boolean z = this.b;
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 || z) {
                this.i = true;
                Class<b> cls = b.class;
                synchronized (cls) {
                    if (g == null) {
                        g = new b();
                        new C0294b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (i2 != 0 && z) {
                        this.k = Math.min(j2, c() - nanoTime) + nanoTime;
                    } else if (i2 != 0) {
                        this.k = j2 + nanoTime;
                    } else if (z) {
                        this.k = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j3 = this.k - nanoTime;
                    b bVar = g;
                    i.c(bVar);
                    while (true) {
                        b bVar2 = bVar.j;
                        if (bVar2 == null) {
                            break;
                        }
                        i.c(bVar2);
                        if (j3 < bVar2.k - nanoTime) {
                            break;
                        }
                        bVar = bVar.j;
                        i.c(bVar);
                    }
                    this.j = bVar.j;
                    bVar.j = this;
                    if (bVar == g) {
                        cls.notify();
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean i() {
        boolean z = false;
        if (!this.i) {
            return false;
        }
        this.i = false;
        synchronized (b.class) {
            b bVar = g;
            while (true) {
                if (bVar == null) {
                    z = true;
                    break;
                }
                b bVar2 = bVar.j;
                if (bVar2 == this) {
                    bVar.j = this.j;
                    this.j = null;
                    break;
                }
                bVar = bVar2;
            }
        }
        return z;
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
