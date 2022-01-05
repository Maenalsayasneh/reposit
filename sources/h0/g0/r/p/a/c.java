package h0.g0.r.p.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.g0.a;
import h0.g0.i;
import h0.g0.r.b;
import h0.g0.r.e;
import h0.g0.r.l;
import h0.g0.r.q.d;
import h0.g0.r.s.o;
import h0.g0.r.t.h;
import h0.g0.r.t.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: GreedyScheduler */
public class c implements e, h0.g0.r.q.c, b {
    public static final String c = i.e("GreedyScheduler");
    public b Y1;
    public boolean Z1;
    public final Object a2;
    public Boolean b2;
    public final Context d;
    public final l q;
    public final d x;
    public final Set<o> y = new HashSet();

    public c(Context context, a aVar, h0.g0.r.t.q.a aVar2, l lVar) {
        this.d = context;
        this.q = lVar;
        this.x = new d(context, aVar2, this);
        this.Y1 = new b(this, aVar.e);
        this.a2 = new Object();
    }

    public void a(o... oVarArr) {
        if (this.b2 == null) {
            this.b2 = Boolean.valueOf(h.a(this.d, this.q.f));
        }
        if (!this.b2.booleanValue()) {
            i.c().d(c, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.Z1) {
            this.q.j.a(this);
            this.Z1 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (o oVar : oVarArr) {
            long a = oVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (oVar.b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a) {
                    b bVar = this.Y1;
                    if (bVar != null) {
                        Runnable remove = bVar.d.remove(oVar.a);
                        if (remove != null) {
                            bVar.c.a.removeCallbacks(remove);
                        }
                        a aVar = new a(bVar, oVar);
                        bVar.d.put(oVar.a, aVar);
                        bVar.c.a.postDelayed(aVar, oVar.a() - System.currentTimeMillis());
                    }
                } else if (oVar.b()) {
                    h0.g0.b bVar2 = oVar.j;
                    if (bVar2.d) {
                        i.c().a(c, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{oVar}), new Throwable[0]);
                    } else {
                        if (bVar2.i.a() > 0) {
                            i.c().a(c, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{oVar}), new Throwable[0]);
                        } else {
                            hashSet.add(oVar);
                            hashSet2.add(oVar.a);
                        }
                    }
                } else {
                    i.c().a(c, String.format("Starting work for %s", new Object[]{oVar.a}), new Throwable[0]);
                    l lVar = this.q;
                    ((h0.g0.r.t.q.b) lVar.h).a.execute(new j(lVar, oVar.a, (WorkerParameters.a) null));
                }
            }
        }
        synchronized (this.a2) {
            if (!hashSet.isEmpty()) {
                i.c().a(c, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(InstabugDbContract.COMMA_SEP, hashSet2)}), new Throwable[0]);
                this.y.addAll(hashSet);
                this.x.b(this.y);
            }
        }
    }

    public void b(List<String> list) {
        for (String next : list) {
            i.c().a(c, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.q.f(next);
        }
    }

    public boolean c() {
        return false;
    }

    public void d(String str, boolean z) {
        synchronized (this.a2) {
            Iterator<o> it = this.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o next = it.next();
                if (next.a.equals(str)) {
                    i.c().a(c, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.y.remove(next);
                    this.x.b(this.y);
                    break;
                }
            }
        }
    }

    public void e(String str) {
        Runnable remove;
        if (this.b2 == null) {
            this.b2 = Boolean.valueOf(h.a(this.d, this.q.f));
        }
        if (!this.b2.booleanValue()) {
            i.c().d(c, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.Z1) {
            this.q.j.a(this);
            this.Z1 = true;
        }
        i.c().a(c, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        b bVar = this.Y1;
        if (!(bVar == null || (remove = bVar.d.remove(str)) == null)) {
            bVar.c.a.removeCallbacks(remove);
        }
        this.q.f(str);
    }

    public void f(List<String> list) {
        for (String next : list) {
            i.c().a(c, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            l lVar = this.q;
            h0.g0.r.t.q.a aVar = lVar.h;
            ((h0.g0.r.t.q.b) aVar).a.execute(new j(lVar, next, (WorkerParameters.a) null));
        }
    }
}
