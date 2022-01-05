package q0.h0.f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import q0.h0.f.d;

/* compiled from: TaskQueue.kt */
public final class c {
    public boolean a;
    public a b;
    public final List<a> c = new ArrayList();
    public boolean d;
    public final d e;
    public final String f;

    public c(d dVar, String str) {
        i.e(dVar, "taskRunner");
        i.e(str, "name");
        this.e = dVar;
        this.f = str;
    }

    public static /* synthetic */ void d(c cVar, a aVar, long j, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        cVar.c(aVar, j);
    }

    public final void a() {
        byte[] bArr = q0.h0.c.a;
        synchronized (this.e) {
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.b;
        if (aVar != null) {
            i.c(aVar);
            if (aVar.d) {
                this.d = true;
            }
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            if (this.c.get(size).d) {
                a aVar2 = this.c.get(size);
                d.b bVar = d.c;
                if (d.b.isLoggable(Level.FINE)) {
                    a.H(aVar2, this, "canceled");
                }
                this.c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(q0.h0.f.a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            m0.n.b.i.e(r3, r0)
            q0.h0.f.d r0 = r2.e
            monitor-enter(r0)
            boolean r1 = r2.a     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x003a
            boolean r4 = r3.d     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0023
            q0.h0.f.d$b r4 = q0.h0.f.d.c     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = q0.h0.f.d.b     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0021
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            m0.r.t.a.r.m.a1.a.H(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0021:
            monitor-exit(r0)
            return
        L_0x0023:
            q0.h0.f.d$b r4 = q0.h0.f.d.c     // Catch:{ all -> 0x0048 }
            java.util.logging.Logger r4 = q0.h0.f.d.b     // Catch:{ all -> 0x0048 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0048 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            m0.r.t.a.r.m.a1.a.H(r3, r2, r4)     // Catch:{ all -> 0x0048 }
        L_0x0034:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0048 }
            r3.<init>()     // Catch:{ all -> 0x0048 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x003a:
            r1 = 0
            boolean r3 = r2.e(r3, r4, r1)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            q0.h0.f.d r3 = r2.e     // Catch:{ all -> 0x0048 }
            r3.e(r2)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.h0.f.c.c(q0.h0.f.a, long):void");
    }

    public final boolean e(a aVar, long j, boolean z) {
        String str;
        i.e(aVar, "task");
        i.e(this, "queue");
        c cVar = aVar.a;
        if (cVar != this) {
            if (cVar == null) {
                aVar.a = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        long c2 = this.e.j.c();
        long j2 = c2 + j;
        int indexOf = this.c.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.b <= j2) {
                d.b bVar = d.c;
                if (d.b.isLoggable(Level.FINE)) {
                    a.H(aVar, this, "already scheduled");
                }
                return false;
            }
            this.c.remove(indexOf);
        }
        aVar.b = j2;
        d.b bVar2 = d.c;
        if (d.b.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder P0 = i0.d.a.a.a.P0("run again after ");
                P0.append(a.A1(j2 - c2));
                str = P0.toString();
            } else {
                StringBuilder P02 = i0.d.a.a.a.P0("scheduled after ");
                P02.append(a.A1(j2 - c2));
                str = P02.toString();
            }
            a.H(aVar, this, str);
        }
        Iterator<a> it = this.c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().b - c2 > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = this.c.size();
        }
        this.c.add(i, aVar);
        if (i == 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        byte[] bArr = q0.h0.c.a;
        synchronized (this.e) {
            this.a = true;
            if (b()) {
                this.e.e(this);
            }
        }
    }

    public String toString() {
        return this.f;
    }
}
