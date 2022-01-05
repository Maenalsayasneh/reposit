package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.AbstractFuture;
import h0.g0.r.t.q.b;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import n0.a.d0;
import n0.a.f1;
import n0.a.m0;
import n0.a.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0016\u001a\u00020\u00118\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Li0/h/b/a/a/a;", "Landroidx/work/ListenableWorker$a;", "d", "()Li0/h/b/a/a/a;", "g", "(Lm0/l/c;)Ljava/lang/Object;", "Lm0/i;", "c", "()V", "Lh0/g0/r/t/p/a;", "Y1", "Lh0/g0/r/t/p/a;", "getFuture$work_runtime_ktx_release", "()Lh0/g0/r/t/p/a;", "future", "Ln0/a/x;", "y", "Ln0/a/x;", "getJob$work_runtime_ktx_release", "()Ln0/a/x;", "job", "Ln0/a/d0;", "Z1", "Ln0/a/d0;", "getCoroutineContext", "()Ln0/a/d0;", "getCoroutineContext$annotations", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 4, 1})
/* compiled from: CoroutineWorker.kt */
public abstract class CoroutineWorker extends ListenableWorker {
    public final h0.g0.r.t.p.a<ListenableWorker.a> Y1;
    public final d0 Z1;
    public final x y = m0.r.t.a.r.m.a1.a.n((f1) null, 1, (Object) null);

    /* compiled from: CoroutineWorker.kt */
    public static final class a implements Runnable {
        public final /* synthetic */ CoroutineWorker c;

        public a(CoroutineWorker coroutineWorker) {
            this.c = coroutineWorker;
        }

        public final void run() {
            if (this.c.Y1.y instanceof AbstractFuture.c) {
                m0.r.t.a.r.m.a1.a.o0(this.c.y, (CancellationException) null, 1, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        i.e(context, "appContext");
        i.e(workerParameters, "params");
        h0.g0.r.t.p.a<ListenableWorker.a> aVar = new h0.g0.r.t.p.a<>();
        i.d(aVar, "SettableFuture.create()");
        this.Y1 = aVar;
        a aVar2 = new a(this);
        h0.g0.r.t.q.a aVar3 = this.d.d;
        i.d(aVar3, "taskExecutor");
        aVar.a(aVar2, ((b) aVar3).a);
        this.Z1 = m0.a;
    }

    public final void c() {
        this.Y1.cancel(false);
    }

    public final i0.h.b.a.a.a<ListenableWorker.a> d() {
        m0.r.t.a.r.m.a1.a.E2(m0.r.t.a.r.m.a1.a.h(this.Z1.plus(this.y)), (e) null, (CoroutineStart) null, new CoroutineWorker$startWork$1(this, (c) null), 3, (Object) null);
        return this.Y1;
    }

    public abstract Object g(c<? super ListenableWorker.a> cVar);
}
