package h0.g0.r.p.b;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h0.g0.i;
import h0.g0.r.b;
import h0.g0.r.p.b.e;
import h0.g0.r.q.c;
import h0.g0.r.s.q;
import h0.g0.r.t.l;
import h0.g0.r.t.o;
import java.util.Collections;
import java.util.List;

/* compiled from: DelayMetCommandHandler */
public class d implements c, b, o.b {
    public static final String c = i.e("DelayMetCommandHandler");
    public final h0.g0.r.q.d Y1;
    public final Object Z1 = new Object();
    public int a2 = 0;
    public PowerManager.WakeLock b2;
    public boolean c2 = false;
    public final Context d;
    public final int q;
    public final String x;
    public final e y;

    public d(Context context, int i, String str, e eVar) {
        this.d = context;
        this.q = i;
        this.y = eVar;
        this.x = str;
        this.Y1 = new h0.g0.r.q.d(context, eVar.q, this);
    }

    public void a(String str) {
        i.c().a(c, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void b(List<String> list) {
        g();
    }

    public final void c() {
        synchronized (this.Z1) {
            this.Y1.c();
            this.y.x.b(this.x);
            PowerManager.WakeLock wakeLock = this.b2;
            if (wakeLock != null && wakeLock.isHeld()) {
                i.c().a(c, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.b2, this.x}), new Throwable[0]);
                this.b2.release();
            }
        }
    }

    public void d(String str, boolean z) {
        i.c().a(c, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        c();
        if (z) {
            Intent c3 = b.c(this.d, this.x);
            e eVar = this.y;
            eVar.a2.post(new e.b(eVar, c3, this.q));
        }
        if (this.c2) {
            Intent a = b.a(this.d);
            e eVar2 = this.y;
            eVar2.a2.post(new e.b(eVar2, a, this.q));
        }
    }

    public void e() {
        this.b2 = l.a(this.d, String.format("%s (%s)", new Object[]{this.x, Integer.valueOf(this.q)}));
        i c3 = i.c();
        String str = c;
        c3.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.b2, this.x}), new Throwable[0]);
        this.b2.acquire();
        h0.g0.r.s.o i = ((q) this.y.Y1.g.q()).i(this.x);
        if (i == null) {
            g();
            return;
        }
        boolean b = i.b();
        this.c2 = b;
        if (!b) {
            i.c().a(str, String.format("No constraints for %s", new Object[]{this.x}), new Throwable[0]);
            f(Collections.singletonList(this.x));
            return;
        }
        this.Y1.b(Collections.singletonList(i));
    }

    public void f(List<String> list) {
        if (list.contains(this.x)) {
            synchronized (this.Z1) {
                if (this.a2 == 0) {
                    this.a2 = 1;
                    i.c().a(c, String.format("onAllConstraintsMet for %s", new Object[]{this.x}), new Throwable[0]);
                    if (this.y.y.f(this.x, (WorkerParameters.a) null)) {
                        this.y.x.a(this.x, 600000, this);
                    } else {
                        c();
                    }
                } else {
                    i.c().a(c, String.format("Already started work for %s", new Object[]{this.x}), new Throwable[0]);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.Z1) {
            if (this.a2 < 2) {
                this.a2 = 2;
                i c3 = i.c();
                String str = c;
                c3.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.x}), new Throwable[0]);
                Context context = this.d;
                String str2 = this.x;
                Intent intent = new Intent(context, SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                e eVar = this.y;
                eVar.a2.post(new e.b(eVar, intent, this.q));
                if (this.y.y.c(this.x)) {
                    i.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.x}), new Throwable[0]);
                    Intent c4 = b.c(this.d, this.x);
                    e eVar2 = this.y;
                    eVar2.a2.post(new e.b(eVar2, c4, this.q));
                } else {
                    i.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.x}), new Throwable[0]);
                }
            } else {
                i.c().a(c, String.format("Already stopped work for %s", new Object[]{this.x}), new Throwable[0]);
            }
        }
    }
}
