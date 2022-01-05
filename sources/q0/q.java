package q0;

import androidx.core.app.NotificationCompat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;
import q0.h0.b;
import q0.h0.c;
import q0.h0.g.e;

/* compiled from: Dispatcher.kt */
public final class q {
    public int a = 5;
    public ExecutorService b;
    public final ArrayDeque<e.a> c = new ArrayDeque<>();
    public final ArrayDeque<e.a> d = new ArrayDeque<>();
    public final ArrayDeque<e> e = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        ExecutorService executorService;
        if (this.b == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            String str = c.g + " Dispatcher";
            i.e(str, "name");
            this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new b(str, false));
        }
        executorService = this.b;
        i.c(executorService);
        return executorService;
    }

    public final <T> void b(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        d();
    }

    public final void c(e.a aVar) {
        i.e(aVar, NotificationCompat.CATEGORY_CALL);
        aVar.c.decrementAndGet();
        b(this.d, aVar);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean d() {
        /*
            r8 = this;
            byte[] r0 = q0.h0.c.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.util.ArrayDeque<q0.h0.g.e$a> r1 = r8.c     // Catch:{ all -> 0x00ba }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            m0.n.b.i.d(r1, r2)     // Catch:{ all -> 0x00ba }
        L_0x0013:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00ba }
            q0.h0.g.e$a r2 = (q0.h0.g.e.a) r2     // Catch:{ all -> 0x00ba }
            java.util.ArrayDeque<q0.h0.g.e$a> r3 = r8.d     // Catch:{ all -> 0x00ba }
            int r3 = r3.size()     // Catch:{ all -> 0x00ba }
            r4 = 64
            if (r3 < r4) goto L_0x002a
            goto L_0x004b
        L_0x002a:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.c     // Catch:{ all -> 0x00ba }
            int r3 = r3.get()     // Catch:{ all -> 0x00ba }
            int r4 = r8.a     // Catch:{ all -> 0x00ba }
            if (r3 < r4) goto L_0x0035
            goto L_0x0013
        L_0x0035:
            r1.remove()     // Catch:{ all -> 0x00ba }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.c     // Catch:{ all -> 0x00ba }
            r3.incrementAndGet()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "asyncCall"
            m0.n.b.i.d(r2, r3)     // Catch:{ all -> 0x00ba }
            r0.add(r2)     // Catch:{ all -> 0x00ba }
            java.util.ArrayDeque<q0.h0.g.e$a> r3 = r8.d     // Catch:{ all -> 0x00ba }
            r3.add(r2)     // Catch:{ all -> 0x00ba }
            goto L_0x0013
        L_0x004b:
            monitor-enter(r8)     // Catch:{ all -> 0x00ba }
            java.util.ArrayDeque<q0.h0.g.e$a> r1 = r8.d     // Catch:{ all -> 0x00b7 }
            int r1 = r1.size()     // Catch:{ all -> 0x00b7 }
            java.util.ArrayDeque<q0.h0.g.e> r2 = r8.e     // Catch:{ all -> 0x00b7 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b7 }
            int r1 = r1 + r2
            monitor-exit(r8)     // Catch:{ all -> 0x00ba }
            r2 = 0
            if (r1 <= 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            monitor-exit(r8)
            int r3 = r0.size()
        L_0x0065:
            if (r2 >= r3) goto L_0x00b6
            java.lang.Object r4 = r0.get(r2)
            q0.h0.g.e$a r4 = (q0.h0.g.e.a) r4
            java.util.concurrent.ExecutorService r5 = r8.a()
            java.util.Objects.requireNonNull(r4)
            java.lang.String r6 = "executorService"
            m0.n.b.i.e(r5, r6)
            q0.h0.g.e r6 = r4.q
            q0.a0 r6 = r6.i2
            q0.q r6 = r6.x
            byte[] r6 = q0.h0.c.a
            r5.execute(r4)     // Catch:{ RejectedExecutionException -> 0x0087 }
            goto L_0x00a9
        L_0x0085:
            r0 = move-exception
            goto L_0x00ac
        L_0x0087:
            r5 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0085 }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x0085 }
            r6.initCause(r5)     // Catch:{ all -> 0x0085 }
            q0.h0.g.e r5 = r4.q     // Catch:{ all -> 0x0085 }
            r5.i(r6)     // Catch:{ all -> 0x0085 }
            q0.g r5 = r4.d     // Catch:{ all -> 0x0085 }
            q0.h0.g.e r7 = r4.q     // Catch:{ all -> 0x0085 }
            t0.n$a r5 = (t0.n.a) r5     // Catch:{ all -> 0x0085 }
            r5.a(r7, r6)     // Catch:{ all -> 0x0085 }
            q0.h0.g.e r5 = r4.q
            q0.a0 r5 = r5.i2
            q0.q r5 = r5.x
            r5.c(r4)
        L_0x00a9:
            int r2 = r2 + 1
            goto L_0x0065
        L_0x00ac:
            q0.h0.g.e r1 = r4.q
            q0.a0 r1 = r1.i2
            q0.q r1 = r1.x
            r1.c(r4)
            throw r0
        L_0x00b6:
            return r1
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.q.d():boolean");
    }
}
