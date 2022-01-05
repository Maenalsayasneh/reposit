package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ModernAsyncTask<Params, Progress, Result> {
    public static final ThreadFactory c;
    public static final BlockingQueue<Runnable> d;
    public static final Executor q;
    public static e x;
    public final FutureTask<Result> Y1;
    public volatile Status Z1 = Status.PENDING;
    public final AtomicBoolean a2 = new AtomicBoolean();
    public final AtomicBoolean b2 = new AtomicBoolean();
    public final f<Params, Result> y;

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static class a implements ThreadFactory {
        public final AtomicInteger c = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            StringBuilder P0 = i0.d.a.a.a.P0("ModernAsyncTask #");
            P0.append(this.c.getAndIncrement());
            return new Thread(runnable, P0.toString());
        }
    }

    public class b extends f<Params, Result> {
        public b() {
        }

        public Result call() throws Exception {
            ModernAsyncTask.this.b2.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = ModernAsyncTask.this.a(this.c);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.d(result);
                return result;
            } catch (Throwable th) {
                ModernAsyncTask.this.d(result);
                throw th;
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                Object obj = get();
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                if (!modernAsyncTask.b2.get()) {
                    modernAsyncTask.d(obj);
                }
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException unused) {
                ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                if (!modernAsyncTask2.b2.get()) {
                    modernAsyncTask2.d(null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static class d<Data> {
        public final ModernAsyncTask a;
        public final Data[] b;

        public d(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.a = modernAsyncTask;
            this.b = dataArr;
        }
    }

    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i = message.what;
            if (i == 1) {
                ModernAsyncTask modernAsyncTask = dVar.a;
                Data data = dVar.b[0];
                if (modernAsyncTask.a2.get()) {
                    modernAsyncTask.b(data);
                } else {
                    modernAsyncTask.c(data);
                }
                modernAsyncTask.Z1 = Status.FINISHED;
            } else if (i == 2) {
                Objects.requireNonNull(dVar.a);
            }
        }
    }

    public static abstract class f<Params, Result> implements Callable<Result> {
        public Params[] c;
    }

    static {
        a aVar = new a();
        c = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        d = linkedBlockingQueue;
        q = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    public ModernAsyncTask() {
        b bVar = new b();
        this.y = bVar;
        this.Y1 = new c(bVar);
    }

    public abstract Result a(Params... paramsArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public Result d(Result result) {
        e eVar;
        synchronized (ModernAsyncTask.class) {
            if (x == null) {
                x = new e();
            }
            eVar = x;
        }
        eVar.obtainMessage(1, new d(this, result)).sendToTarget();
        return result;
    }
}
