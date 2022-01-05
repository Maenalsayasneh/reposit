package h0.g0.r.u;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* compiled from: ConstraintTrackingWorker */
public class a implements Runnable {
    public final /* synthetic */ i0.h.b.a.a.a c;
    public final /* synthetic */ ConstraintTrackingWorker d;

    public a(ConstraintTrackingWorker constraintTrackingWorker, i0.h.b.a.a.a aVar) {
        this.d = constraintTrackingWorker;
        this.c = aVar;
    }

    public void run() {
        synchronized (this.d.Z1) {
            if (this.d.a2) {
                this.d.h();
            } else {
                this.d.b2.l(this.c);
            }
        }
    }
}
