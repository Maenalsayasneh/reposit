package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import h0.b0.v;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.g.d;
import i0.h.a.b.c.g.f;
import i0.h.a.b.c.g.h;
import i0.h.a.b.c.g.i;
import i0.h.a.b.c.g.j.j0;
import i0.h.a.b.c.g.j.p0;
import i0.h.a.b.g.c.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public abstract class BasePendingResult<R extends h> extends d<R> {
    public static final ThreadLocal<Boolean> a = new p0();
    public final Object b;
    public final a<R> c;
    public final CountDownLatch d;
    public final ArrayList<d.a> e;
    public final AtomicReference<j0> f;
    public R g;
    public Status h;
    public volatile boolean i;
    public boolean j;
    public boolean k;
    @KeepName
    public b mResultGuardian;

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public static class a<R extends h> extends e {
        public a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        public void handleMessage(@RecentlyNonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                i iVar = (i) pair.first;
                h hVar = (h) pair.second;
                try {
                    iVar.a(hVar);
                } catch (RuntimeException e) {
                    BasePendingResult.f(hVar);
                    throw e;
                }
            } else if (i != 2) {
                Log.wtf("BasePendingResult", i0.d.a.a.a.Q(45, "Don't know how to handle message: ", i), new Exception());
            } else {
                ((BasePendingResult) message.obj).c(Status.x);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public final class b {
        public b(p0 p0Var) {
        }

        public final void finalize() throws Throwable {
            BasePendingResult.f(BasePendingResult.this.g);
            super.finalize();
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.b = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.k = false;
        this.c = new a<>(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    public static void f(h hVar) {
        if (hVar instanceof f) {
            try {
                ((f) hVar).release();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(hVar);
                StringBuilder sb = new StringBuilder(valueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    public final void a(@RecentlyNonNull d.a aVar) {
        v.u(true, "Callback cannot be null.");
        synchronized (this.b) {
            if (d()) {
                aVar.a(this.h);
            } else {
                this.e.add(aVar);
            }
        }
    }

    public abstract R b(@RecentlyNonNull Status status);

    @Deprecated
    public final void c(@RecentlyNonNull Status status) {
        synchronized (this.b) {
            if (!d()) {
                e(b(status));
                this.j = true;
            }
        }
    }

    public final boolean d() {
        return this.d.getCount() == 0;
    }

    public final void e(@RecentlyNonNull R r) {
        synchronized (this.b) {
            if (!this.j) {
                d();
                boolean z = true;
                v.C(!d(), "Results have already been set");
                if (this.i) {
                    z = false;
                }
                v.C(z, "Result has already been consumed");
                g(r);
                return;
            }
            f(r);
        }
    }

    public final void g(R r) {
        this.g = r;
        this.h = r.getStatus();
        this.d.countDown();
        if (this.g instanceof f) {
            this.mResultGuardian = new b((p0) null);
        }
        ArrayList<d.a> arrayList = this.e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            d.a aVar = arrayList.get(i2);
            i2++;
            aVar.a(this.h);
        }
        this.e.clear();
    }

    public final R h() {
        R r;
        synchronized (this.b) {
            v.C(!this.i, "Result has already been consumed.");
            v.C(d(), "Result is not ready.");
            r = this.g;
            this.g = null;
            this.i = true;
        }
        j0 andSet = this.f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.a(this);
        }
        Objects.requireNonNull(r, "null reference");
        return r;
    }

    public BasePendingResult(c cVar) {
        this.b = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList<>();
        this.f = new AtomicReference<>();
        this.k = false;
        this.c = new a<>(cVar != null ? cVar.c() : Looper.getMainLooper());
        new WeakReference(cVar);
    }
}
