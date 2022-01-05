package h0.g0.r.t;

import androidx.work.WorkerParameters;
import h0.g0.r.l;

/* compiled from: StartWorkRunnable */
public class j implements Runnable {
    public l c;
    public String d;
    public WorkerParameters.a q;

    public j(l lVar, String str, WorkerParameters.a aVar) {
        this.c = lVar;
        this.d = str;
        this.q = aVar;
    }

    public void run() {
        this.c.j.f(this.d, this.q);
    }
}
