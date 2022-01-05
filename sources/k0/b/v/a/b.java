package k0.b.v.a;

import android.os.Handler;
import android.os.Message;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.q;

/* compiled from: HandlerScheduler */
public final class b extends q {
    public final Handler b;

    /* compiled from: HandlerScheduler */
    public static final class a extends q.c {
        public final Handler c;
        public volatile boolean d;

        public a(Handler handler) {
            this.c = handler;
        }

        public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.d) {
                return EmptyDisposable.INSTANCE;
            }
            Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
            Handler handler = this.c;
            C0229b bVar = new C0229b(handler, onSchedule);
            Message obtain = Message.obtain(handler, bVar);
            obtain.obj = this;
            this.c.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.d) {
                return bVar;
            }
            this.c.removeCallbacks(bVar);
            return EmptyDisposable.INSTANCE;
        }

        public void dispose() {
            this.d = true;
            this.c.removeCallbacksAndMessages(this);
        }

        public boolean isDisposed() {
            return this.d;
        }
    }

    /* renamed from: k0.b.v.a.b$b  reason: collision with other inner class name */
    /* compiled from: HandlerScheduler */
    public static final class C0229b implements Runnable, k0.b.w.a {
        public final Handler c;
        public final Runnable d;
        public volatile boolean q;

        public C0229b(Handler handler, Runnable runnable) {
            this.c = handler;
            this.d = runnable;
        }

        public void dispose() {
            this.q = true;
            this.c.removeCallbacks(this);
        }

        public boolean isDisposed() {
            return this.q;
        }

        public void run() {
            try {
                this.d.run();
            } catch (Throwable th) {
                RxJavaPlugins.onError(th);
            }
        }
    }

    public b(Handler handler) {
        this.b = handler;
    }

    public q.c a() {
        return new a(this.b);
    }

    public k0.b.w.a c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        Handler handler = this.b;
        C0229b bVar = new C0229b(handler, onSchedule);
        handler.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
