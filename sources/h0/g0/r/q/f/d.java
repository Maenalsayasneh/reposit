package h0.g0.r.q.f;

import android.content.Context;
import h0.g0.i;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: ConstraintTracker */
public abstract class d<T> {
    public static final String a = i.e("ConstraintTracker");
    public final h0.g0.r.t.q.a b;
    public final Context c;
    public final Object d = new Object();
    public final Set<h0.g0.r.q.a<T>> e = new LinkedHashSet();
    public T f;

    /* compiled from: ConstraintTracker */
    public class a implements Runnable {
        public final /* synthetic */ List c;

        public a(List list) {
            this.c = list;
        }

        public void run() {
            for (h0.g0.r.q.a a : this.c) {
                a.a(d.this.f);
            }
        }
    }

    public d(Context context, h0.g0.r.t.q.a aVar) {
        this.c = context.getApplicationContext();
        this.b = aVar;
    }

    public abstract T a();

    public void b(h0.g0.r.q.a<T> aVar) {
        synchronized (this.d) {
            if (this.e.remove(aVar) && this.e.isEmpty()) {
                e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            T r1 = r3.f     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<h0.g0.r.q.a<T>> r1 = r3.e     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            h0.g0.r.t.q.a r1 = r3.b     // Catch:{ all -> 0x002b }
            h0.g0.r.t.q.b r1 = (h0.g0.r.t.q.b) r1     // Catch:{ all -> 0x002b }
            java.util.concurrent.Executor r1 = r1.c     // Catch:{ all -> 0x002b }
            h0.g0.r.q.f.d$a r2 = new h0.g0.r.q.f.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.r.q.f.d.c(java.lang.Object):void");
    }

    public abstract void d();

    public abstract void e();
}
