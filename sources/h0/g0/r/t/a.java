package h0.g0.r.t;

import androidx.work.impl.WorkDatabase;
import h0.g0.r.f;
import h0.g0.r.l;
import java.util.UUID;

/* compiled from: CancelWorkRunnable */
public class a extends c {
    public final /* synthetic */ l d;
    public final /* synthetic */ UUID q;

    public a(l lVar, UUID uuid) {
        this.d = lVar;
        this.q = uuid;
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        WorkDatabase workDatabase = this.d.g;
        workDatabase.c();
        try {
            a(this.d, this.q.toString());
            workDatabase.k();
            workDatabase.g();
            l lVar = this.d;
            f.a(lVar.f, lVar.g, lVar.i);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
