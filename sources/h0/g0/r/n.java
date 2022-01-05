package h0.g0.r;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import h0.g0.i;
import h0.g0.r.t.p.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: WorkerWrapper */
public class n implements Runnable {
    public final /* synthetic */ a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ o q;

    public n(o oVar, a aVar, String str) {
        this.q = oVar;
        this.c = aVar;
        this.d = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            ListenableWorker.a aVar = (ListenableWorker.a) this.c.get();
            if (aVar == null) {
                i.c().b(o.c, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.q.Y1.c}), new Throwable[0]);
            } else {
                i.c().a(o.c, String.format("%s returned a %s result.", new Object[]{this.q.Y1.c, aVar}), new Throwable[0]);
                this.q.a2 = aVar;
            }
        } catch (CancellationException e) {
            i.c().d(o.c, String.format("%s was cancelled", new Object[]{this.d}), e);
        } catch (InterruptedException | ExecutionException e2) {
            i.c().b(o.c, String.format("%s failed because it threw an exception/error", new Object[]{this.d}), e2);
        } catch (Throwable th) {
            this.q.c();
            throw th;
        }
        this.q.c();
    }
}
