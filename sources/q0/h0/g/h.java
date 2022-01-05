package q0.h0.g;

import androidx.core.app.NotificationCompat;
import com.stripe.android.model.PaymentMethod;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;
import q0.g0;
import q0.h0.f.c;
import q0.h0.f.d;
import q0.h0.g.e;
import q0.h0.l.h;

/* compiled from: RealConnectionPool.kt */
public final class h {
    public final long a;
    public final c b;
    public final a c = new a(this, i0.d.a.a.a.y0(new StringBuilder(), q0.h0.c.g, " ConnectionPool"));
    public final ConcurrentLinkedQueue<g> d = new ConcurrentLinkedQueue<>();
    public final int e;

    /* compiled from: RealConnectionPool.kt */
    public static final class a extends q0.h0.f.a {
        public final /* synthetic */ h e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, String str) {
            super(str, true);
            this.e = hVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
            r1 = r6.c;
            m0.n.b.i.c(r1);
            q0.h0.c.e(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0085, code lost:
            if (r0.d.isEmpty() == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0087, code lost:
            r0.b.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            return 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            return 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long a() {
            /*
                r13 = this;
                q0.h0.g.h r0 = r13.e
                long r1 = java.lang.System.nanoTime()
                java.util.concurrent.ConcurrentLinkedQueue<q0.h0.g.g> r3 = r0.d
                java.util.Iterator r3 = r3.iterator()
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r7 = r6
                r6 = r5
                r5 = r4
            L_0x0013:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x003f
                java.lang.Object r9 = r3.next()
                q0.h0.g.g r9 = (q0.h0.g.g) r9
                java.lang.String r10 = "connection"
                m0.n.b.i.d(r9, r10)
                monitor-enter(r9)
                int r10 = r0.b(r9, r1)     // Catch:{ all -> 0x003c }
                if (r10 <= 0) goto L_0x002e
                int r5 = r5 + 1
                goto L_0x003a
            L_0x002e:
                int r4 = r4 + 1
                long r10 = r9.p     // Catch:{ all -> 0x003c }
                long r10 = r1 - r10
                int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r12 <= 0) goto L_0x003a
                r6 = r9
                r7 = r10
            L_0x003a:
                monitor-exit(r9)
                goto L_0x0013
            L_0x003c:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            L_0x003f:
                long r9 = r0.a
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 >= 0) goto L_0x0054
                int r3 = r0.e
                if (r4 <= r3) goto L_0x004a
                goto L_0x0054
            L_0x004a:
                if (r4 <= 0) goto L_0x004e
                long r9 = r9 - r7
                goto L_0x008c
            L_0x004e:
                if (r5 <= 0) goto L_0x0051
                goto L_0x008c
            L_0x0051:
                r9 = -1
                goto L_0x008c
            L_0x0054:
                m0.n.b.i.c(r6)
                monitor-enter(r6)
                java.util.List<java.lang.ref.Reference<q0.h0.g.e>> r3 = r6.o     // Catch:{ all -> 0x008d }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x008d }
                r4 = 1
                r3 = r3 ^ r4
                r9 = 0
                if (r3 == 0) goto L_0x0066
                monitor-exit(r6)
                goto L_0x008c
            L_0x0066:
                long r11 = r6.p     // Catch:{ all -> 0x008d }
                long r11 = r11 + r7
                int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x006f
                monitor-exit(r6)
                goto L_0x008c
            L_0x006f:
                r6.i = r4     // Catch:{ all -> 0x008d }
                java.util.concurrent.ConcurrentLinkedQueue<q0.h0.g.g> r1 = r0.d     // Catch:{ all -> 0x008d }
                r1.remove(r6)     // Catch:{ all -> 0x008d }
                monitor-exit(r6)
                java.net.Socket r1 = r6.c
                m0.n.b.i.c(r1)
                q0.h0.c.e(r1)
                java.util.concurrent.ConcurrentLinkedQueue<q0.h0.g.g> r1 = r0.d
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x008c
                q0.h0.f.c r0 = r0.b
                r0.a()
            L_0x008c:
                return r9
            L_0x008d:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.h0.g.h.a.a():long");
        }
    }

    public h(d dVar, int i, long j, TimeUnit timeUnit) {
        i.e(dVar, "taskRunner");
        i.e(timeUnit, "timeUnit");
        this.e = i;
        this.a = timeUnit.toNanos(j);
        this.b = dVar.f();
        if (!(j > 0)) {
            throw new IllegalArgumentException(i0.d.a.a.a.k0("keepAliveDuration <= 0: ", j).toString());
        }
    }

    public final boolean a(q0.a aVar, e eVar, List<g0> list, boolean z) {
        i.e(aVar, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        i.e(eVar, NotificationCompat.CATEGORY_CALL);
        Iterator<g> it = this.d.iterator();
        while (it.hasNext()) {
            g next = it.next();
            i.d(next, "connection");
            synchronized (next) {
                if (z) {
                    if (!next.j()) {
                    }
                }
                if (next.h(aVar, list)) {
                    eVar.c(next);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(g gVar, long j) {
        byte[] bArr = q0.h0.c.a;
        List<Reference<e>> list = gVar.o;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("A connection to ");
                P0.append(gVar.q.a.a);
                P0.append(" was leaked. ");
                P0.append("Did you forget to close a response body?");
                String sb = P0.toString();
                h.a aVar = q0.h0.l.h.c;
                q0.h0.l.h.a.k(sb, ((e.b) reference).a);
                list.remove(i);
                gVar.i = true;
                if (list.isEmpty()) {
                    gVar.p = j - this.a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
