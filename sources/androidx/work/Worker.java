package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;

public abstract class Worker extends ListenableWorker {
    public h0.g0.r.t.p.a<ListenableWorker.a> y;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Worker.this.y.j(Worker.this.g());
            } catch (Throwable th) {
                Worker.this.y.k(th);
            }
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final i0.h.b.a.a.a<ListenableWorker.a> d() {
        this.y = new h0.g0.r.t.p.a<>();
        this.d.c.execute(new a());
        return this.y;
    }

    public abstract ListenableWorker.a g();
}
