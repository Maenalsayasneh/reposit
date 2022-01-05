package h0.g0.r.t;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import h0.g0.i;
import h0.g0.k;
import h0.g0.r.d;
import h0.g0.r.e;
import h0.g0.r.l;
import h0.g0.r.o;
import h0.g0.r.s.b;
import h0.g0.r.s.p;
import h0.g0.r.s.q;
import java.util.LinkedList;

/* compiled from: CancelWorkRunnable */
public abstract class c implements Runnable {
    public final h0.g0.r.c c = new h0.g0.r.c();

    public void a(l lVar, String str) {
        boolean z;
        WorkDatabase workDatabase = lVar.g;
        p q = workDatabase.q();
        b l = workDatabase.l();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = false;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            q qVar = (q) q;
            WorkInfo$State g = qVar.g(str2);
            if (!(g == WorkInfo$State.SUCCEEDED || g == WorkInfo$State.FAILED)) {
                qVar.p(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((h0.g0.r.s.c) l).a(str2));
        }
        d dVar = lVar.j;
        synchronized (dVar.d2) {
            i.c().a(d.c, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            dVar.b2.add(str);
            o remove = dVar.Y1.remove(str);
            if (remove != null) {
                z = true;
            }
            if (remove == null) {
                remove = dVar.Z1.remove(str);
            }
            d.b(str, remove);
            if (z) {
                dVar.g();
            }
        }
        for (e e : lVar.i) {
            e.e(str);
        }
    }

    public abstract void b();

    public void run() {
        try {
            b();
            this.c.a(k.a);
        } catch (Throwable th) {
            this.c.a(new k.b.a(th));
        }
    }
}
