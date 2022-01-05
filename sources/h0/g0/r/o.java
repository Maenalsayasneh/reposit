package h0.g0.r;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import h0.g0.d;
import h0.g0.i;
import h0.g0.r.s.b;
import h0.g0.r.s.c;
import h0.g0.r.s.n;
import h0.g0.r.s.p;
import h0.g0.r.s.q;
import h0.g0.r.s.s;
import h0.g0.r.t.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: WorkerWrapper */
public class o implements Runnable {
    public static final String c = i.e("WorkerWrapper");
    public h0.g0.r.s.o Y1;
    public ListenableWorker Z1;
    public ListenableWorker.a a2 = new ListenableWorker.a.C0006a();
    public h0.g0.a b2;
    public h0.g0.r.t.q.a c2;
    public Context d;
    public h0.g0.r.r.a d2;
    public WorkDatabase e2;
    public p f2;
    public b g2;
    public s h2;
    public List<String> i2;
    public String j2;
    public h0.g0.r.t.p.a<Boolean> k2 = new h0.g0.r.t.p.a<>();
    public i0.h.b.a.a.a<ListenableWorker.a> l2 = null;
    public volatile boolean m2;
    public String q;
    public List<e> x;
    public WorkerParameters.a y;

    /* compiled from: WorkerWrapper */
    public static class a {
        public Context a;
        public h0.g0.r.r.a b;
        public h0.g0.r.t.q.a c;
        public h0.g0.a d;
        public WorkDatabase e;
        public String f;
        public List<e> g;
        public WorkerParameters.a h = new WorkerParameters.a();

        public a(Context context, h0.g0.a aVar, h0.g0.r.t.q.a aVar2, h0.g0.r.r.a aVar3, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = aVar2;
            this.b = aVar3;
            this.d = aVar;
            this.e = workDatabase;
            this.f = str;
        }
    }

    public o(a aVar) {
        this.d = aVar.a;
        this.c2 = aVar.c;
        this.d2 = aVar.b;
        this.q = aVar.f;
        this.x = aVar.g;
        this.y = aVar.h;
        this.Z1 = null;
        this.b2 = aVar.d;
        WorkDatabase workDatabase = aVar.e;
        this.e2 = workDatabase;
        this.f2 = workDatabase.q();
        this.g2 = this.e2.l();
        this.h2 = this.e2.r();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            i.c().d(c, String.format("Worker result SUCCESS for %s", new Object[]{this.j2}), new Throwable[0]);
            if (this.Y1.c()) {
                e();
                return;
            }
            this.e2.c();
            try {
                p pVar = this.f2;
                ((q) pVar).p(WorkInfo$State.SUCCEEDED, this.q);
                d dVar = ((ListenableWorker.a.c) this.a2).a;
                ((q) this.f2).n(this.q, dVar);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((c) this.g2).a(this.q)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((q) this.f2).g(str) == WorkInfo$State.BLOCKED && ((c) this.g2).b(str)) {
                        i.c().d(c, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                        p pVar2 = this.f2;
                        ((q) pVar2).p(WorkInfo$State.ENQUEUED, str);
                        ((q) this.f2).o(str, currentTimeMillis);
                    }
                }
                this.e2.k();
            } finally {
                this.e2.g();
                f(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            i.c().d(c, String.format("Worker result RETRY for %s", new Object[]{this.j2}), new Throwable[0]);
            d();
        } else {
            i.c().d(c, String.format("Worker result FAILURE for %s", new Object[]{this.j2}), new Throwable[0]);
            if (this.Y1.c()) {
                e();
            } else {
                h();
            }
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((q) this.f2).g(str2) != WorkInfo$State.CANCELLED) {
                p pVar = this.f2;
                ((q) pVar).p(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((c) this.g2).a(str2));
        }
    }

    public void c() {
        if (!i()) {
            this.e2.c();
            try {
                WorkInfo$State g = ((q) this.f2).g(this.q);
                ((n) this.e2.p()).a(this.q);
                if (g == null) {
                    f(false);
                } else if (g == WorkInfo$State.RUNNING) {
                    a(this.a2);
                } else if (!g.isFinished()) {
                    d();
                }
                this.e2.k();
            } finally {
                this.e2.g();
            }
        }
        List<e> list = this.x;
        if (list != null) {
            for (e e : list) {
                e.e(this.q);
            }
            f.a(this.b2, this.e2, this.x);
        }
    }

    public final void d() {
        this.e2.c();
        try {
            p pVar = this.f2;
            ((q) pVar).p(WorkInfo$State.ENQUEUED, this.q);
            ((q) this.f2).o(this.q, System.currentTimeMillis());
            ((q) this.f2).l(this.q, -1);
            this.e2.k();
        } finally {
            this.e2.g();
            f(true);
        }
    }

    public final void e() {
        this.e2.c();
        try {
            ((q) this.f2).o(this.q, System.currentTimeMillis());
            p pVar = this.f2;
            ((q) pVar).p(WorkInfo$State.ENQUEUED, this.q);
            ((q) this.f2).m(this.q);
            ((q) this.f2).l(this.q, -1);
            this.e2.k();
        } finally {
            this.e2.g();
            f(false);
        }
    }

    public final void f(boolean z) {
        ListenableWorker listenableWorker;
        this.e2.c();
        try {
            if (((ArrayList) ((q) this.e2.q()).c()).isEmpty()) {
                f.a(this.d, RescheduleReceiver.class, false);
            }
            if (z) {
                ((q) this.f2).p(WorkInfo$State.ENQUEUED, this.q);
                ((q) this.f2).l(this.q, -1);
            }
            if (!(this.Y1 == null || (listenableWorker = this.Z1) == null || !listenableWorker.a())) {
                h0.g0.r.r.a aVar = this.d2;
                String str = this.q;
                d dVar = (d) aVar;
                synchronized (dVar.d2) {
                    dVar.Y1.remove(str);
                    dVar.g();
                }
            }
            this.e2.k();
            this.e2.g();
            this.k2.j(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.e2.g();
            throw th;
        }
    }

    public final void g() {
        WorkInfo$State g = ((q) this.f2).g(this.q);
        if (g == WorkInfo$State.RUNNING) {
            i.c().a(c, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.q}), new Throwable[0]);
            f(true);
            return;
        }
        i.c().a(c, String.format("Status for %s is %s; not doing any work", new Object[]{this.q, g}), new Throwable[0]);
        f(false);
    }

    public void h() {
        this.e2.c();
        try {
            b(this.q);
            d dVar = ((ListenableWorker.a.C0006a) this.a2).a;
            ((q) this.f2).n(this.q, dVar);
            this.e2.k();
        } finally {
            this.e2.g();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.m2) {
            return false;
        }
        i.c().a(c, String.format("Work interrupted for %s", new Object[]{this.j2}), new Throwable[0]);
        WorkInfo$State g = ((q) this.f2).g(this.q);
        if (g == null) {
            f(false);
        } else {
            f(!g.isFinished());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00bf, code lost:
        if ((r0.b == r3 && r0.k > 0) != false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            h0.g0.r.s.s r0 = r15.h2
            java.lang.String r1 = r15.q
            h0.g0.r.s.t r0 = (h0.g0.r.s.t) r0
            java.util.List r0 = r0.a(r1)
            r15.i2 = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Work [ id="
            r1.<init>(r2)
            java.lang.String r2 = r15.q
            r1.append(r2)
            java.lang.String r2 = ", tags={ "
            r1.append(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
            r3 = r2
        L_0x0023:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L_0x0034
            r3 = r5
            goto L_0x0039
        L_0x0034:
            java.lang.String r5 = ", "
            r1.append(r5)
        L_0x0039:
            r1.append(r4)
            goto L_0x0023
        L_0x003d:
            java.lang.String r0 = " } ]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.j2 = r0
            boolean r0 = r15.i()
            if (r0 == 0) goto L_0x0050
            goto L_0x02b3
        L_0x0050:
            androidx.work.impl.WorkDatabase r0 = r15.e2
            r0.c()
            h0.g0.r.s.p r0 = r15.f2     // Catch:{ all -> 0x02c3 }
            java.lang.String r1 = r15.q     // Catch:{ all -> 0x02c3 }
            h0.g0.r.s.q r0 = (h0.g0.r.s.q) r0     // Catch:{ all -> 0x02c3 }
            h0.g0.r.s.o r0 = r0.i(r1)     // Catch:{ all -> 0x02c3 }
            r15.Y1 = r0     // Catch:{ all -> 0x02c3 }
            if (r0 != 0) goto L_0x0084
            h0.g0.i r0 = h0.g0.i.c()     // Catch:{ all -> 0x02c3 }
            java.lang.String r1 = c     // Catch:{ all -> 0x02c3 }
            java.lang.String r3 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02c3 }
            java.lang.String r4 = r15.q     // Catch:{ all -> 0x02c3 }
            r2[r5] = r4     // Catch:{ all -> 0x02c3 }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x02c3 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02c3 }
            r0.b(r1, r2, r3)     // Catch:{ all -> 0x02c3 }
            r15.f(r5)     // Catch:{ all -> 0x02c3 }
            androidx.work.impl.WorkDatabase r0 = r15.e2     // Catch:{ all -> 0x02c3 }
            r0.k()     // Catch:{ all -> 0x02c3 }
            goto L_0x00fd
        L_0x0084:
            androidx.work.WorkInfo$State r1 = r0.b     // Catch:{ all -> 0x02c3 }
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x02c3 }
            if (r1 == r3) goto L_0x00ac
            r15.g()     // Catch:{ all -> 0x02c3 }
            androidx.work.impl.WorkDatabase r0 = r15.e2     // Catch:{ all -> 0x02c3 }
            r0.k()     // Catch:{ all -> 0x02c3 }
            h0.g0.i r0 = h0.g0.i.c()     // Catch:{ all -> 0x02c3 }
            java.lang.String r1 = c     // Catch:{ all -> 0x02c3 }
            java.lang.String r3 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02c3 }
            h0.g0.r.s.o r4 = r15.Y1     // Catch:{ all -> 0x02c3 }
            java.lang.String r4 = r4.c     // Catch:{ all -> 0x02c3 }
            r2[r5] = r4     // Catch:{ all -> 0x02c3 }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x02c3 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02c3 }
            r0.a(r1, r2, r3)     // Catch:{ all -> 0x02c3 }
            goto L_0x00fd
        L_0x00ac:
            boolean r0 = r0.c()     // Catch:{ all -> 0x02c3 }
            if (r0 != 0) goto L_0x00c1
            h0.g0.r.s.o r0 = r15.Y1     // Catch:{ all -> 0x02c3 }
            androidx.work.WorkInfo$State r1 = r0.b     // Catch:{ all -> 0x02c3 }
            if (r1 != r3) goto L_0x00be
            int r0 = r0.k     // Catch:{ all -> 0x02c3 }
            if (r0 <= 0) goto L_0x00be
            r0 = r2
            goto L_0x00bf
        L_0x00be:
            r0 = r5
        L_0x00bf:
            if (r0 == 0) goto L_0x0104
        L_0x00c1:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02c3 }
            h0.g0.r.s.o r3 = r15.Y1     // Catch:{ all -> 0x02c3 }
            long r6 = r3.n     // Catch:{ all -> 0x02c3 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00d1
            r4 = r2
            goto L_0x00d2
        L_0x00d1:
            r4 = r5
        L_0x00d2:
            if (r4 != 0) goto L_0x0104
            long r3 = r3.a()     // Catch:{ all -> 0x02c3 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0104
            h0.g0.i r0 = h0.g0.i.c()     // Catch:{ all -> 0x02c3 }
            java.lang.String r1 = c     // Catch:{ all -> 0x02c3 }
            java.lang.String r3 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x02c3 }
            h0.g0.r.s.o r6 = r15.Y1     // Catch:{ all -> 0x02c3 }
            java.lang.String r6 = r6.c     // Catch:{ all -> 0x02c3 }
            r4[r5] = r6     // Catch:{ all -> 0x02c3 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x02c3 }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02c3 }
            r0.a(r1, r3, r4)     // Catch:{ all -> 0x02c3 }
            r15.f(r2)     // Catch:{ all -> 0x02c3 }
            androidx.work.impl.WorkDatabase r0 = r15.e2     // Catch:{ all -> 0x02c3 }
            r0.k()     // Catch:{ all -> 0x02c3 }
        L_0x00fd:
            androidx.work.impl.WorkDatabase r0 = r15.e2
            r0.g()
            goto L_0x02b3
        L_0x0104:
            androidx.work.impl.WorkDatabase r0 = r15.e2     // Catch:{ all -> 0x02c3 }
            r0.k()     // Catch:{ all -> 0x02c3 }
            androidx.work.impl.WorkDatabase r0 = r15.e2
            r0.g()
            h0.g0.r.s.o r0 = r15.Y1
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x011d
            h0.g0.r.s.o r0 = r15.Y1
            h0.g0.d r0 = r0.e
        L_0x011a:
            r5 = r0
            goto L_0x01c4
        L_0x011d:
            h0.g0.a r0 = r15.b2
            h0.g0.h r0 = r0.d
            h0.g0.r.s.o r1 = r15.Y1
            java.lang.String r1 = r1.d
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = h0.g0.f.a
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0136 }
            h0.g0.f r3 = (h0.g0.f) r3     // Catch:{ Exception -> 0x0136 }
            goto L_0x014b
        L_0x0136:
            r3 = move-exception
            h0.g0.i r4 = h0.g0.i.c()
            java.lang.String r6 = h0.g0.f.a
            java.lang.String r7 = "Trouble instantiating + "
            java.lang.String r1 = i0.d.a.a.a.n0(r7, r1)
            java.lang.Throwable[] r7 = new java.lang.Throwable[r2]
            r7[r5] = r3
            r4.b(r6, r1, r7)
            r3 = r0
        L_0x014b:
            if (r3 != 0) goto L_0x016b
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r1 = c
            java.lang.Object[] r2 = new java.lang.Object[r2]
            h0.g0.r.s.o r3 = r15.Y1
            java.lang.String r3 = r3.d
            r2[r5] = r3
            java.lang.String r3 = "Could not create Input Merger %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.b(r1, r2, r3)
            r15.h()
            goto L_0x02b3
        L_0x016b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            h0.g0.r.s.o r4 = r15.Y1
            h0.g0.d r4 = r4.e
            r1.add(r4)
            h0.g0.r.s.p r4 = r15.f2
            java.lang.String r6 = r15.q
            h0.g0.r.s.q r4 = (h0.g0.r.s.q) r4
            java.util.Objects.requireNonNull(r4)
            java.lang.String r7 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            h0.w.g r7 = h0.w.g.e(r7, r2)
            if (r6 != 0) goto L_0x018c
            r7.i(r2)
            goto L_0x018f
        L_0x018c:
            r7.k(r2, r6)
        L_0x018f:
            androidx.room.RoomDatabase r6 = r4.a
            r6.b()
            androidx.room.RoomDatabase r4 = r4.a
            android.database.Cursor r0 = h0.w.k.b.a(r4, r7, r5, r0)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02bb }
            int r6 = r0.getCount()     // Catch:{ all -> 0x02bb }
            r4.<init>(r6)     // Catch:{ all -> 0x02bb }
        L_0x01a3:
            boolean r6 = r0.moveToNext()     // Catch:{ all -> 0x02bb }
            if (r6 == 0) goto L_0x01b5
            byte[] r6 = r0.getBlob(r5)     // Catch:{ all -> 0x02bb }
            h0.g0.d r6 = h0.g0.d.a(r6)     // Catch:{ all -> 0x02bb }
            r4.add(r6)     // Catch:{ all -> 0x02bb }
            goto L_0x01a3
        L_0x01b5:
            r0.close()
            r7.l()
            r1.addAll(r4)
            h0.g0.d r0 = r3.a(r1)
            goto L_0x011a
        L_0x01c4:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r1 = r15.q
            java.util.UUID r4 = java.util.UUID.fromString(r1)
            java.util.List<java.lang.String> r6 = r15.i2
            androidx.work.WorkerParameters$a r7 = r15.y
            h0.g0.r.s.o r1 = r15.Y1
            int r8 = r1.k
            h0.g0.a r1 = r15.b2
            java.util.concurrent.Executor r9 = r1.a
            h0.g0.r.t.q.a r10 = r15.c2
            h0.g0.q r11 = r1.c
            h0.g0.r.t.n r12 = new h0.g0.r.t.n
            androidx.work.impl.WorkDatabase r1 = r15.e2
            h0.g0.r.t.q.a r3 = r15.c2
            r12.<init>(r1, r3)
            h0.g0.r.t.m r13 = new h0.g0.r.t.m
            h0.g0.r.r.a r14 = r15.d2
            r13.<init>(r1, r14, r3)
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.work.ListenableWorker r1 = r15.Z1
            if (r1 != 0) goto L_0x0204
            h0.g0.a r1 = r15.b2
            h0.g0.q r1 = r1.c
            android.content.Context r3 = r15.d
            h0.g0.r.s.o r4 = r15.Y1
            java.lang.String r4 = r4.c
            androidx.work.ListenableWorker r0 = r1.b(r3, r4, r0)
            r15.Z1 = r0
        L_0x0204:
            androidx.work.ListenableWorker r0 = r15.Z1
            if (r0 != 0) goto L_0x0227
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r1 = c
            java.lang.Object[] r2 = new java.lang.Object[r2]
            h0.g0.r.s.o r3 = r15.Y1
            java.lang.String r3 = r3.c
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "Could not create Worker %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            r0.b(r1, r2, r3)
            r15.h()
            goto L_0x02b3
        L_0x0227:
            r1 = 0
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x0249
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r3 = c
            java.lang.Object[] r2 = new java.lang.Object[r2]
            h0.g0.r.s.o r4 = r15.Y1
            java.lang.String r4 = r4.c
            r2[r1] = r4
            java.lang.String r4 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r0.b(r3, r2, r1)
            r15.h()
            goto L_0x02b3
        L_0x0249:
            r0.x = r2
            androidx.work.impl.WorkDatabase r0 = r15.e2
            r0.c()
            h0.g0.r.s.p r0 = r15.f2     // Catch:{ all -> 0x02b4 }
            java.lang.String r1 = r15.q     // Catch:{ all -> 0x02b4 }
            h0.g0.r.s.q r0 = (h0.g0.r.s.q) r0     // Catch:{ all -> 0x02b4 }
            androidx.work.WorkInfo$State r0 = r0.g(r1)     // Catch:{ all -> 0x02b4 }
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x02b4 }
            if (r0 != r1) goto L_0x0278
            h0.g0.r.s.p r0 = r15.f2     // Catch:{ all -> 0x02b4 }
            androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo$State.RUNNING     // Catch:{ all -> 0x02b4 }
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ all -> 0x02b4 }
            java.lang.String r4 = r15.q     // Catch:{ all -> 0x02b4 }
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x02b4 }
            h0.g0.r.s.q r0 = (h0.g0.r.s.q) r0     // Catch:{ all -> 0x02b4 }
            r0.p(r1, r3)     // Catch:{ all -> 0x02b4 }
            h0.g0.r.s.p r0 = r15.f2     // Catch:{ all -> 0x02b4 }
            java.lang.String r1 = r15.q     // Catch:{ all -> 0x02b4 }
            h0.g0.r.s.q r0 = (h0.g0.r.s.q) r0     // Catch:{ all -> 0x02b4 }
            r0.k(r1)     // Catch:{ all -> 0x02b4 }
            goto L_0x0279
        L_0x0278:
            r2 = 0
        L_0x0279:
            androidx.work.impl.WorkDatabase r0 = r15.e2     // Catch:{ all -> 0x02b4 }
            r0.k()     // Catch:{ all -> 0x02b4 }
            androidx.work.impl.WorkDatabase r0 = r15.e2
            r0.g()
            if (r2 == 0) goto L_0x02b0
            boolean r0 = r15.i()
            if (r0 == 0) goto L_0x028c
            goto L_0x02b3
        L_0x028c:
            h0.g0.r.t.p.a r0 = new h0.g0.r.t.p.a
            r0.<init>()
            h0.g0.r.t.q.a r1 = r15.c2
            h0.g0.r.t.q.b r1 = (h0.g0.r.t.q.b) r1
            java.util.concurrent.Executor r1 = r1.c
            h0.g0.r.m r2 = new h0.g0.r.m
            r2.<init>(r15, r0)
            r1.execute(r2)
            java.lang.String r1 = r15.j2
            h0.g0.r.n r2 = new h0.g0.r.n
            r2.<init>(r15, r0, r1)
            h0.g0.r.t.q.a r1 = r15.c2
            h0.g0.r.t.q.b r1 = (h0.g0.r.t.q.b) r1
            h0.g0.r.t.i r1 = r1.a
            r0.a(r2, r1)
            goto L_0x02b3
        L_0x02b0:
            r15.g()
        L_0x02b3:
            return
        L_0x02b4:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r15.e2
            r1.g()
            throw r0
        L_0x02bb:
            r1 = move-exception
            r0.close()
            r7.l()
            throw r1
        L_0x02c3:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r15.e2
            r1.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.r.o.run():void");
    }
}
