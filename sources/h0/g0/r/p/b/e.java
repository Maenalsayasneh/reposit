package h0.g0.r.p.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h0.g0.i;
import h0.g0.r.l;
import h0.g0.r.t.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: SystemAlarmDispatcher */
public class e implements h0.g0.r.b {
    public static final String c = i.e("SystemAlarmDispatcher");
    public final l Y1;
    public final b Z1;
    public final Handler a2;
    public final List<Intent> b2;
    public Intent c2;
    public final Context d;
    public c d2;
    public final h0.g0.r.t.q.a q;
    public final o x = new o();
    public final h0.g0.r.d y;

    /* compiled from: SystemAlarmDispatcher */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.b2) {
                e eVar2 = e.this;
                eVar2.c2 = eVar2.b2.get(0);
            }
            Intent intent = e.this.c2;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.c2.getIntExtra("KEY_START_ID", 0);
                i c2 = i.c();
                String str = e.c;
                c2.a(str, String.format("Processing command %s, %s", new Object[]{e.this.c2, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a = h0.g0.r.t.l.a(e.this.d, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    i.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.acquire();
                    e eVar3 = e.this;
                    eVar3.Z1.e(eVar3.c2, intExtra, eVar3);
                    i.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    i.c().a(e.c, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a}), new Throwable[0]);
                    a.release();
                    e eVar4 = e.this;
                    eVar4.a2.post(new d(eVar4));
                    throw th;
                }
                eVar.a2.post(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public static class b implements Runnable {
        public final e c;
        public final Intent d;
        public final int q;

        public b(e eVar, Intent intent, int i) {
            this.c = eVar;
            this.d = intent;
            this.q = i;
        }

        public void run() {
            this.c.a(this.d, this.q);
        }
    }

    /* compiled from: SystemAlarmDispatcher */
    public interface c {
    }

    /* compiled from: SystemAlarmDispatcher */
    public static class d implements Runnable {
        public final e c;

        public d(e eVar) {
            this.c = eVar;
        }

        public void run() {
            boolean z;
            e eVar = this.c;
            Objects.requireNonNull(eVar);
            i c2 = i.c();
            String str = e.c;
            c2.a(str, "Checking if commands are complete.", new Throwable[0]);
            eVar.b();
            synchronized (eVar.b2) {
                boolean z2 = true;
                if (eVar.c2 != null) {
                    i.c().a(str, String.format("Removing command %s", new Object[]{eVar.c2}), new Throwable[0]);
                    if (eVar.b2.remove(0).equals(eVar.c2)) {
                        eVar.c2 = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                h0.g0.r.t.i iVar = ((h0.g0.r.t.q.b) eVar.q).a;
                b bVar = eVar.Z1;
                synchronized (bVar.x) {
                    z = !bVar.q.isEmpty();
                }
                if (!z) {
                    if (eVar.b2.isEmpty()) {
                        synchronized (iVar.q) {
                            if (iVar.c.isEmpty()) {
                                z2 = false;
                            }
                        }
                        if (!z2) {
                            i.c().a(str, "No more commands & intents.", new Throwable[0]);
                            c cVar = eVar.d2;
                            if (cVar != null) {
                                ((SystemAlarmService) cVar).b();
                            }
                        }
                    }
                }
                if (!eVar.b2.isEmpty()) {
                    eVar.e();
                }
            }
        }
    }

    public e(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.Z1 = new b(applicationContext);
        l c3 = l.c(context);
        this.Y1 = c3;
        h0.g0.r.d dVar = c3.j;
        this.y = dVar;
        this.q = c3.h;
        dVar.a(this);
        this.b2 = new ArrayList();
        this.c2 = null;
        this.a2 = new Handler(Looper.getMainLooper());
    }

    public boolean a(Intent intent, int i) {
        boolean z;
        i c3 = i.c();
        String str = c;
        boolean z2 = false;
        c3.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            i.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.b2) {
                Iterator<Intent> it = this.b2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.b2) {
            if (!this.b2.isEmpty()) {
                z2 = true;
            }
            this.b2.add(intent);
            if (!z2) {
                e();
            }
        }
        return true;
    }

    public final void b() {
        if (this.a2.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public void c() {
        i.c().a(c, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.y.e(this);
        o oVar = this.x;
        if (!oVar.c.isShutdown()) {
            oVar.c.shutdownNow();
        }
        this.d2 = null;
    }

    public void d(String str, boolean z) {
        Context context = this.d;
        String str2 = b.c;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.a2.post(new b(this, intent, 0));
    }

    public final void e() {
        b();
        PowerManager.WakeLock a3 = h0.g0.r.t.l.a(this.d, "ProcessCommand");
        try {
            a3.acquire();
            h0.g0.r.t.q.a aVar = this.Y1.h;
            ((h0.g0.r.t.q.b) aVar).a.execute(new a());
        } finally {
            a3.release();
        }
    }
}
