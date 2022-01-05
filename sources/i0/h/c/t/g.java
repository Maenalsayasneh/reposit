package i0.h.c.t;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import i0.h.a.b.c.m.b;
import i0.h.a.b.m.b0;
import i0.h.a.b.m.c0;
import i0.h.a.b.m.h;
import i0.h.a.b.m.q;
import i0.h.a.b.m.y;
import i0.h.c.t.x0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public abstract class g extends Service {
    public final ExecutorService c;
    public Binder d;
    public final Object q = new Object();
    public int x;
    public int y = 0;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public class a implements x0.a {
        public a() {
        }
    }

    public g() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i0.h.a.b.c.m.f.a("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: a */
    public final void d(Intent intent) {
        if (intent != null) {
            synchronized (u0.b) {
                if (u0.c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    u0.c.b();
                }
            }
        }
        synchronized (this.q) {
            try {
                int i = this.y - 1;
                this.y = i;
                if (i == 0) {
                    stopSelfResult(this.x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    public boolean c() {
        return false;
    }

    public final i0.h.a.b.m.g<Void> e(Intent intent) {
        if (c()) {
            return b.H(null);
        }
        h hVar = new h();
        this.c.execute(new d(this, intent, hVar));
        return hVar.a;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.d == null) {
            this.d = new x0(new a());
        }
        return this.d;
    }

    public void onDestroy() {
        this.c.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.q) {
            this.x = i2;
            this.y++;
        }
        Intent poll = k0.a().e.poll();
        if (poll == null) {
            d(intent);
            return 2;
        }
        i0.h.a.b.m.g<Void> e = e(poll);
        if (e.m()) {
            d(intent);
            return 2;
        }
        Executor executor = e.c;
        f fVar = new f(this, intent);
        b0 b0Var = (b0) e;
        y<TResult> yVar = b0Var.b;
        int i3 = c0.a;
        yVar.b(new q(executor, fVar));
        b0Var.t();
        return 3;
    }
}
