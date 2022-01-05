package i0.b.a;

import android.os.Handler;
import h0.v.a.g;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: AsyncEpoxyDiffer */
public class c {
    public final Executor a;
    public final d b;
    public final g.e<t<?>> c;
    public final C0080c d = new C0080c((b) null);
    public volatile List<? extends t<?>> e;
    public volatile List<? extends t<?>> f = Collections.emptyList();

    /* compiled from: AsyncEpoxyDiffer */
    public class a implements Runnable {
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;
        public final /* synthetic */ l q;

        public a(List list, int i, l lVar) {
            this.c = list;
            this.d = i;
            this.q = lVar;
        }

        public void run() {
            boolean c2 = c.this.c(this.c, this.d);
            l lVar = this.q;
            if (lVar != null && c2) {
                p pVar = (p) c.this.b;
                Objects.requireNonNull(pVar);
                pVar.j = lVar.b.size();
                pVar.g.a = true;
                h0.v.a.b bVar = new h0.v.a.b(pVar);
                g.d dVar = lVar.c;
                if (dVar != null) {
                    dVar.b(bVar);
                } else if (lVar.b.isEmpty() && !lVar.a.isEmpty()) {
                    bVar.b(0, lVar.a.size());
                } else if (!lVar.b.isEmpty() && lVar.a.isEmpty()) {
                    bVar.a(0, lVar.b.size());
                }
                pVar.g.a = false;
                for (int size = pVar.k.size() - 1; size >= 0; size--) {
                    pVar.k.get(size).a(lVar);
                }
            }
        }
    }

    /* compiled from: AsyncEpoxyDiffer */
    public static class b extends g.b {
        public final List<? extends t<?>> a;
        public final List<? extends t<?>> b;
        public final g.e<t<?>> c;

        public b(List<? extends t<?>> list, List<? extends t<?>> list2, g.e<t<?>> eVar) {
            this.a = list;
            this.b = list2;
            this.c = eVar;
        }

        public boolean a(int i, int i2) {
            return this.c.a((t) this.a.get(i), (t) this.b.get(i2));
        }

        public boolean b(int i, int i2) {
            return this.c.b((t) this.a.get(i), (t) this.b.get(i2));
        }

        public Object c(int i, int i2) {
            return this.c.c((t) this.a.get(i), (t) this.b.get(i2));
        }

        public int d() {
            return this.b.size();
        }

        public int e() {
            return this.a.size();
        }
    }

    /* renamed from: i0.b.a.c$c  reason: collision with other inner class name */
    /* compiled from: AsyncEpoxyDiffer */
    public static class C0080c {
        public volatile int a;
        public volatile int b;

        public C0080c(b bVar) {
        }

        public synchronized boolean a() {
            return this.a > this.b;
        }
    }

    /* compiled from: AsyncEpoxyDiffer */
    public interface d {
    }

    public c(Handler handler, d dVar, g.e<t<?>> eVar) {
        this.a = new a0(handler);
        this.b = dVar;
        this.c = eVar;
    }

    public synchronized boolean a(List<t<?>> list) {
        boolean a2;
        int i;
        C0080c cVar = this.d;
        synchronized (cVar) {
            a2 = cVar.a();
            cVar.b = cVar.a;
        }
        C0080c cVar2 = this.d;
        synchronized (cVar2) {
            i = cVar2.a + 1;
            cVar2.a = i;
        }
        c(list, i);
        return a2;
    }

    public final void b(int i, List<? extends t<?>> list, l lVar) {
        d0.q.execute(new a(list, i, lVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean c(java.util.List<? extends i0.b.a.t<?>> r5, int r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            i0.b.a.c$c r0 = r4.d     // Catch:{ all -> 0x0030 }
            monitor-enter(r0)     // Catch:{ all -> 0x0030 }
            int r1 = r0.a     // Catch:{ all -> 0x002d }
            r2 = 1
            r3 = 0
            if (r1 != r6) goto L_0x0010
            int r1 = r0.b     // Catch:{ all -> 0x002d }
            if (r6 <= r1) goto L_0x0010
            r1 = r2
            goto L_0x0011
        L_0x0010:
            r1 = r3
        L_0x0011:
            if (r1 == 0) goto L_0x0015
            r0.b = r6     // Catch:{ all -> 0x002d }
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002b
            r4.e = r5     // Catch:{ all -> 0x0030 }
            if (r5 != 0) goto L_0x0023
            java.util.List r5 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0030 }
            r4.f = r5     // Catch:{ all -> 0x0030 }
            goto L_0x0029
        L_0x0023:
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)     // Catch:{ all -> 0x0030 }
            r4.f = r5     // Catch:{ all -> 0x0030 }
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            monitor-exit(r4)
            return r3
        L_0x002d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r5     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.c.c(java.util.List, int):boolean");
    }
}
