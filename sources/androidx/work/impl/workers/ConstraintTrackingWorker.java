package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import h0.g0.i;
import h0.g0.r.l;
import h0.g0.r.q.c;
import h0.g0.r.q.d;
import h0.g0.r.s.o;
import h0.g0.r.s.q;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements c {
    public static final String y = i.e("ConstraintTrkngWrkr");
    public WorkerParameters Y1;
    public final Object Z1 = new Object();
    public volatile boolean a2 = false;
    public h0.g0.r.t.p.a<ListenableWorker.a> b2 = new h0.g0.r.t.p.a<>();
    public ListenableWorker c2;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.d.b.c.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            String str = obj instanceof String ? (String) obj : null;
            if (TextUtils.isEmpty(str)) {
                i.c().b(ConstraintTrackingWorker.y, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.g();
                return;
            }
            ListenableWorker b = constraintTrackingWorker.d.e.b(constraintTrackingWorker.c, str, constraintTrackingWorker.Y1);
            constraintTrackingWorker.c2 = b;
            if (b == null) {
                i.c().a(ConstraintTrackingWorker.y, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.g();
                return;
            }
            o i = ((q) l.c(constraintTrackingWorker.c).g.q()).i(constraintTrackingWorker.d.a.toString());
            if (i == null) {
                constraintTrackingWorker.g();
                return;
            }
            Context context = constraintTrackingWorker.c;
            d dVar = new d(context, l.c(context).h, constraintTrackingWorker);
            dVar.b(Collections.singletonList(i));
            if (dVar.a(constraintTrackingWorker.d.a.toString())) {
                i.c().a(ConstraintTrackingWorker.y, String.format("Constraints met for delegate %s", new Object[]{str}), new Throwable[0]);
                try {
                    i0.h.b.a.a.a<ListenableWorker.a> d = constraintTrackingWorker.c2.d();
                    d.a(new h0.g0.r.u.a(constraintTrackingWorker, d), constraintTrackingWorker.d.c);
                } catch (Throwable th) {
                    i c2 = i.c();
                    String str2 = ConstraintTrackingWorker.y;
                    c2.a(str2, String.format("Delegated worker %s threw exception in startWork.", new Object[]{str}), th);
                    synchronized (constraintTrackingWorker.Z1) {
                        if (constraintTrackingWorker.a2) {
                            i.c().a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                            constraintTrackingWorker.h();
                        } else {
                            constraintTrackingWorker.g();
                        }
                    }
                }
            } else {
                i.c().a(ConstraintTrackingWorker.y, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{str}), new Throwable[0]);
                constraintTrackingWorker.h();
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.Y1 = workerParameters;
    }

    public boolean a() {
        ListenableWorker listenableWorker = this.c2;
        return listenableWorker != null && listenableWorker.a();
    }

    public void b(List<String> list) {
        i.c().a(y, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.Z1) {
            this.a2 = true;
        }
    }

    public void c() {
        ListenableWorker listenableWorker = this.c2;
        if (listenableWorker != null && !listenableWorker.q) {
            this.c2.e();
        }
    }

    public i0.h.b.a.a.a<ListenableWorker.a> d() {
        this.d.c.execute(new a());
        return this.b2;
    }

    public void f(List<String> list) {
    }

    public void g() {
        this.b2.j(new ListenableWorker.a.C0006a());
    }

    public void h() {
        this.b2.j(new ListenableWorker.a.b());
    }
}
