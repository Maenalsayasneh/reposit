package i0.j.a.h.e.e;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Looper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.d.b.f;
import i0.j.a.h.e.a;
import i0.j.a.m.d.c;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: CustomUiTraceHandlerImpl */
public class b implements a, a, i0.j.a.m.d.b, i0.j.a.h.e.b {
    public final i0.j.a.m.b.a a;
    public final i0.j.a.e.b b;
    public i0.j.a.n.a.a c;
    public final i0.j.a.l.a d;
    public f e;
    public WeakReference<i0.j.a.m.d.a> f = new WeakReference<>(new i0.j.a.m.d.a(this));
    public WeakReference<c> g = new WeakReference<>(new c(this));
    public i0.j.a.d.a.e.a h;
    public i0.j.a.d.a.d.f i;

    public b(i0.j.a.m.b.a aVar, i0.j.a.e.b bVar, i0.j.a.n.a.a aVar2) {
        this.a = aVar;
        this.b = bVar;
        this.c = aVar2;
        SharedPreferences sharedPreferences = ((i0.j.a.e.c) bVar).a;
        this.d = new i0.j.a.l.b(this, sharedPreferences != null ? sharedPreferences.getFloat("UI_TRACE_SMALL_DROP_THRESHOLD", 16700.0f) : 16700.0f);
        this.h = i0.j.a.g.a.d();
        this.i = i0.j.a.g.a.b();
    }

    public void a(long j) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.e += j;
            float f2 = (float) j;
            SharedPreferences sharedPreferences = ((i0.j.a.e.c) this.b).a;
            float f3 = 250000.0f;
            if (sharedPreferences != null) {
                f3 = sharedPreferences.getFloat("UI_TRACE_LARGE_DROP_THRESHOLD", 250000.0f);
            }
            if (f2 > f3) {
                this.e.d += j;
            }
        }
    }

    public void b(Activity activity, boolean z) {
        if (this.e != null && z) {
            i0.j.a.n.a.a aVar = this.c;
            String format = String.format("App went background while ui Trace %s is running, ending the trace…", new Object[]{c()});
            Objects.requireNonNull(aVar);
            InstabugSDKLogger.p("Instabug - APM", format);
            d(activity);
        }
    }

    public String c() {
        f fVar = this.e;
        if (fVar != null) {
            return fVar.b;
        }
        return null;
    }

    public void d(Activity activity) {
        i0.j.a.d.a.d.f fVar;
        i0.j.a.m.d.a aVar;
        c cVar;
        i0.j.a.n.a.a aVar2 = this.c;
        StringBuilder P0 = i0.d.a.a.a.P0("Ui trace");
        f fVar2 = this.e;
        P0.append(fVar2 != null ? fVar2.b : "");
        P0.append(" is ending in ");
        P0.append(activity.toString());
        String sb = P0.toString();
        Objects.requireNonNull(aVar2);
        InstabugSDKLogger.p("Instabug - APM", sb);
        i0.j.a.l.a aVar3 = this.d;
        if (aVar3 != null) {
            i0.j.a.l.b bVar = (i0.j.a.l.b) aVar3;
            bVar.a.removeFrameCallback(bVar);
        }
        WeakReference<c> weakReference = this.g;
        if (!(weakReference == null || (cVar = (c) weakReference.get()) == null)) {
            cVar.b(activity);
            this.g = null;
        }
        WeakReference<i0.j.a.m.d.a> weakReference2 = this.f;
        if (!(weakReference2 == null || (aVar = (i0.j.a.m.d.a) weakReference2.get()) == null)) {
            aVar.b(activity);
            this.f = null;
        }
        f fVar3 = this.e;
        if (fVar3 != null) {
            fVar3.c = TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.e.o);
            this.e.k = activity.getClass().getSimpleName();
            if (activity.getTitle() != null) {
                this.e.h = activity.getTitle().toString();
            }
            this.e.l = i0.h.a.b.c.m.b.b(activity.getClass());
            this.e.g = ((i0.j.a.m.b.b) this.a).b(activity);
        }
        f fVar4 = this.e;
        if (fVar4 == null || fVar4.n == null) {
            Objects.requireNonNull(this.c);
            InstabugSDKLogger.p("Instabug - APM", "uiTraceModel or currentSession is null, can't insert to DB");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.c.h("Custom UI Trace \"$name\" was ended from a non-main thread. Please make sure to end Custom UI Traces from the main thread.".replace("$name", this.e.b));
            }
            if (!(((i0.j.a.d.a.e.b) this.h).a(this.e) == -1 || (fVar = this.i) == null)) {
                fVar.j(this.e.n, 1);
            }
            i0.j.a.n.a.a aVar4 = this.c;
            StringBuilder P02 = i0.d.a.a.a.P0("Custom UI Trace \"");
            P02.append(this.e.b);
            P02.append("\" has ended.\nTotal duration: ");
            f fVar5 = this.e;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            P02.append(timeUnit.toSeconds(fVar5.c));
            P02.append(" seconds\nTotal hang duration: ");
            f fVar6 = this.e;
            P02.append(timeUnit.toMillis(fVar6.e + fVar6.d));
            P02.append(" ms");
            aVar4.e(P02.toString());
        }
        this.e = null;
    }

    public void e(int i2) {
        f fVar = this.e;
        if (fVar != null) {
            int i3 = fVar.i;
            if (i3 == -1) {
                fVar.i = i2;
            } else {
                fVar.i = Math.min(i2, i3);
            }
        }
    }

    public final void f(Activity activity) {
        WeakReference<i0.j.a.m.d.a> weakReference = new WeakReference<>(new i0.j.a.m.d.a(this));
        this.f = weakReference;
        i0.j.a.m.d.a aVar = (i0.j.a.m.d.a) weakReference.get();
        if (aVar != null) {
            aVar.a(activity);
        }
    }

    public final void g(Activity activity) {
        WeakReference<c> weakReference = new WeakReference<>(new c(this));
        this.g = weakReference;
        c cVar = (c) weakReference.get();
        if (cVar != null) {
            cVar.a(activity);
        }
    }

    public void j(boolean z) {
        f fVar;
        if (z && (fVar = this.e) != null) {
            fVar.j = Boolean.valueOf(z);
        }
    }

    public void onActivityStarted(Activity activity) {
        if (this.e != null) {
            i0.j.a.n.a.a aVar = this.c;
            String format = String.format("New activity resumed while ui Trace %s is running, registering broadcast receivers…", new Object[]{c()});
            Objects.requireNonNull(aVar);
            InstabugSDKLogger.p("Instabug - APM", format);
            g(activity);
            f(activity);
        }
    }
}
