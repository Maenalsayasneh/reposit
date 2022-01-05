package h0.g0.r.t;

import androidx.work.impl.WorkDatabase;
import h0.g0.r.f;
import h0.g0.r.l;
import h0.g0.r.s.q;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable */
public class b extends c {
    public final /* synthetic */ l d;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean x;

    public b(l lVar, String str, boolean z) {
        this.d = lVar;
        this.q = str;
        this.x = z;
    }

    /* JADX INFO: finally extract failed */
    public void b() {
        WorkDatabase workDatabase = this.d.g;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((q) workDatabase.q()).h(this.q)).iterator();
            while (it.hasNext()) {
                a(this.d, (String) it.next());
            }
            workDatabase.k();
            workDatabase.g();
            if (this.x) {
                l lVar = this.d;
                f.a(lVar.f, lVar.g, lVar.i);
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
