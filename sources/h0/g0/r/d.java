package h0.g0.r;

import android.content.Context;
import android.content.Intent;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import h0.g0.i;
import h0.g0.r.o;
import h0.g0.r.r.c;
import h0.g0.r.t.q.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: Processor */
public class d implements b, h0.g0.r.r.a {
    public static final String c = i.e("Processor");
    public Map<String, o> Y1 = new HashMap();
    public Map<String, o> Z1 = new HashMap();
    public List<e> a2;
    public Set<String> b2;
    public final List<b> c2;
    public Context d;
    public final Object d2;
    public h0.g0.a q;
    public h0.g0.r.t.q.a x;
    public WorkDatabase y;

    /* compiled from: Processor */
    public static class a implements Runnable {
        public b c;
        public String d;
        public i0.h.b.a.a.a<Boolean> q;

        public a(b bVar, String str, i0.h.b.a.a.a<Boolean> aVar) {
            this.c = bVar;
            this.d = str;
            this.q = aVar;
        }

        public void run() {
            boolean z;
            try {
                z = this.q.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.c.d(this.d, z);
        }
    }

    public d(Context context, h0.g0.a aVar, h0.g0.r.t.q.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.d = context;
        this.q = aVar;
        this.x = aVar2;
        this.y = workDatabase;
        this.a2 = list;
        this.b2 = new HashSet();
        this.c2 = new ArrayList();
        this.d2 = new Object();
    }

    public static boolean b(String str, o oVar) {
        boolean z;
        if (oVar != null) {
            oVar.m2 = true;
            oVar.i();
            i0.h.b.a.a.a<ListenableWorker.a> aVar = oVar.l2;
            if (aVar != null) {
                z = aVar.isDone();
                oVar.l2.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = oVar.Z1;
            if (listenableWorker == null || z) {
                i.c().a(o.c, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{oVar.Y1}), new Throwable[0]);
            } else {
                listenableWorker.q = true;
                listenableWorker.c();
            }
            i.c().a(c, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        i.c().a(c, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    public void a(b bVar) {
        synchronized (this.d2) {
            this.c2.add(bVar);
        }
    }

    public boolean c(String str) {
        boolean z;
        synchronized (this.d2) {
            if (!this.Z1.containsKey(str)) {
                if (!this.Y1.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void d(String str, boolean z) {
        synchronized (this.d2) {
            this.Z1.remove(str);
            i.c().a(c, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (b d3 : this.c2) {
                d3.d(str, z);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.d2) {
            this.c2.remove(bVar);
        }
    }

    public boolean f(String str, WorkerParameters.a aVar) {
        synchronized (this.d2) {
            if (c(str)) {
                i.c().a(c, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            o.a aVar2 = new o.a(this.d, this.q, this.x, this, this.y, str);
            aVar2.g = this.a2;
            if (aVar != null) {
                aVar2.h = aVar;
            }
            o oVar = new o(aVar2);
            h0.g0.r.t.p.a<Boolean> aVar3 = oVar.k2;
            aVar3.a(new a(this, str, aVar3), ((b) this.x).c);
            this.Z1.put(str, oVar);
            ((b) this.x).a.execute(oVar);
            i.c().a(c, String.format("%s: processing %s", new Object[]{d.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.d2) {
            if (!(!this.Y1.isEmpty())) {
                Context context = this.d;
                String str = c.c;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.d.startService(intent);
                } catch (Throwable th) {
                    i.c().b(c, "Unable to stop foreground service", th);
                }
            }
        }
    }

    public boolean h(String str) {
        boolean b;
        synchronized (this.d2) {
            i.c().a(c, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            b = b(str, this.Y1.remove(str));
        }
        return b;
    }

    public boolean i(String str) {
        boolean b;
        synchronized (this.d2) {
            i.c().a(c, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            b = b(str, this.Z1.remove(str));
        }
        return b;
    }
}
