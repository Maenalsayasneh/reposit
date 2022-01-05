package h0.r.b;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import h0.r.a.b;
import h0.r.b.b;
import i0.h.a.b.a.a.d.b.e;
import i0.h.a.b.c.g.c;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTaskLoader */
public abstract class a<D> extends b<D> {
    public final Executor g;
    public volatile a<D>.defpackage.a h;
    public volatile a<D>.defpackage.a i;
    public long j = -10000;

    /* renamed from: h0.r.b.a$a  reason: collision with other inner class name */
    /* compiled from: AsyncTaskLoader */
    public final class C0063a extends ModernAsyncTask<Void, Void, D> implements Runnable {
        public final CountDownLatch c2 = new CountDownLatch(1);

        public C0063a() {
        }

        public Object a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            try {
                a.this.d();
                return null;
            } catch (OperationCanceledException e) {
                if (this.a2.get()) {
                    return null;
                }
                throw e;
            }
        }

        public void b(D d) {
            try {
                a aVar = a.this;
                if (aVar.i == this) {
                    aVar.j = SystemClock.uptimeMillis();
                    aVar.i = null;
                    aVar.c();
                }
            } finally {
                this.c2.countDown();
            }
        }

        public void c(D d) {
            try {
                a.this.b(this, d);
            } finally {
                this.c2.countDown();
            }
        }

        public void run() {
            a.this.c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Executor executor = ModernAsyncTask.q;
        this.g = executor;
    }

    public void b(a<D>.defpackage.a aVar, D d) {
        if (this.h != aVar) {
            if (this.i == aVar) {
                this.j = SystemClock.uptimeMillis();
                this.i = null;
                c();
            }
        } else if (!this.d) {
            this.j = SystemClock.uptimeMillis();
            this.h = null;
            b.a<D> aVar2 = this.b;
            if (aVar2 != null) {
                b.a aVar3 = (b.a) aVar2;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aVar3.setValue(d);
                } else {
                    aVar3.postValue(d);
                }
            }
        }
    }

    public void c() {
        if (this.i == null && this.h != null) {
            Objects.requireNonNull(this.h);
            a<D>.defpackage.a aVar = this.h;
            Executor executor = this.g;
            if (aVar.Z1 != ModernAsyncTask.Status.PENDING) {
                int ordinal = aVar.Z1.ordinal();
                if (ordinal == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (ordinal != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                aVar.Z1 = ModernAsyncTask.Status.RUNNING;
                aVar.y.c = null;
                executor.execute(aVar.Y1);
            }
        }
    }

    public D d() {
        e eVar = (e) this;
        Iterator<c> it = eVar.l.iterator();
        if (!it.hasNext()) {
            try {
                eVar.k.tryAcquire(0, 5, TimeUnit.SECONDS);
                return null;
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
                return null;
            }
        } else {
            Objects.requireNonNull(it.next());
            throw new UnsupportedOperationException();
        }
    }
}
