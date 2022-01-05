package i0.j.a.h.e.d;

import android.app.Activity;
import android.content.SharedPreferences;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.d.b.f;
import i0.j.a.h.e.a;
import i0.j.a.m.d.b;
import i0.j.a.m.d.c;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: AutomaticUiTraceHandlerImpl */
public class d implements b, a, b {
    public i0.j.a.m.b.a a = new i0.j.a.m.b.b();
    public i0.j.a.e.b b;
    public i0.j.a.l.a c;
    public i0.j.a.n.a.a d;
    public f e;
    public WeakReference<i0.j.a.m.d.a> f;
    public WeakReference<c> g;
    public i0.j.a.h.d.c h;
    public i0.j.a.d.a.d.f i;
    public Executor j;

    public d() {
        i0.j.a.e.b g2 = i0.j.a.g.a.g();
        this.b = g2;
        SharedPreferences sharedPreferences = ((i0.j.a.e.c) g2).a;
        this.c = new i0.j.a.l.b(this, sharedPreferences != null ? sharedPreferences.getFloat("UI_TRACE_SMALL_DROP_THRESHOLD", 16700.0f) : 16700.0f);
        this.d = i0.j.a.g.a.i();
        this.h = i0.j.a.g.a.a();
        this.i = i0.j.a.g.a.b();
        this.j = i0.j.a.g.a.f("ui_trace_thread_executor");
    }

    public void a(long j2) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.e += j2;
            float f2 = (float) j2;
            SharedPreferences sharedPreferences = ((i0.j.a.e.c) this.b).a;
            float f3 = 250000.0f;
            if (sharedPreferences != null) {
                f3 = sharedPreferences.getFloat("UI_TRACE_LARGE_DROP_THRESHOLD", 250000.0f);
            }
            if (f2 > f3) {
                this.e.d += j2;
            }
        }
    }

    public void b(Activity activity, long j2) {
        i0.j.a.m.d.a aVar;
        c cVar;
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
        i0.j.a.l.b bVar = (i0.j.a.l.b) this.c;
        bVar.a.removeFrameCallback(bVar);
        f fVar = this.e;
        if (fVar != null) {
            fVar.g = ((i0.j.a.m.b.b) this.a).b(activity);
            fVar.c = TimeUnit.NANOSECONDS.toMicros(j2 - fVar.o);
            if (activity != null) {
                if (!fVar.b.equals(activity.getClass().getSimpleName())) {
                    fVar.k = activity.getClass().getSimpleName();
                }
                fVar.l = i0.h.a.b.c.m.b.b(activity.getClass());
            }
            fVar.a = false;
            this.j.execute(new c(this, this.e));
            i0.j.a.n.a.a aVar2 = this.d;
            StringBuilder P0 = i0.d.a.a.a.P0("Ended Auto UI Trace for screen with name \"");
            P0.append(activity.getClass().getSimpleName());
            P0.append("\".\nTotal duration: ");
            f fVar2 = this.e;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            P0.append(timeUnit.toSeconds(fVar2.c));
            P0.append(" seconds\nTotal hang duration: ");
            f fVar3 = this.e;
            P0.append(timeUnit.toMillis(fVar3.e + fVar3.d));
            P0.append(" ms");
            aVar2.e(P0.toString());
            return;
        }
        Objects.requireNonNull(this.d);
        InstabugSDKLogger.p("Instabug - APM", "uiTraceModel is null, can't insert to DB");
    }

    public void c(Activity activity, String str, String str2, long j2, long j3) {
        i0.j.a.m.d.a aVar = new i0.j.a.m.d.a(this);
        aVar.a(activity);
        this.f = new WeakReference<>(aVar);
        c cVar = new c(this);
        cVar.a(activity);
        this.g = new WeakReference<>(cVar);
        f fVar = new f();
        Objects.requireNonNull((i0.j.a.m.b.b) this.a);
        fVar.i = DeviceStateProvider.getBatteryLevel(activity);
        fVar.j = ((i0.j.a.m.b.b) this.a).c(activity);
        fVar.b = str;
        fVar.h = str2;
        fVar.f = TimeUnit.MILLISECONDS.toMicros(j2);
        fVar.o = j3;
        fVar.m = ((i0.j.a.m.b.b) this.a).a(activity);
        this.e = fVar;
        i0.j.a.l.b bVar = (i0.j.a.l.b) this.c;
        bVar.a.postFrameCallback(bVar);
        i0.j.a.n.a.a aVar2 = this.d;
        StringBuilder P0 = i0.d.a.a.a.P0("Started Auto UI Trace for screen with name \"");
        P0.append(activity.getClass().getSimpleName());
        P0.append("\".");
        aVar2.e(P0.toString());
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

    public void j(boolean z) {
        f fVar;
        if (z && (fVar = this.e) != null) {
            fVar.j = Boolean.valueOf(z);
        }
    }
}
