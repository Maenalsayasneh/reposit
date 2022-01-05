package i0.j.a;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import i0.j.a.d.a.c.b;
import i0.j.a.d.a.c.d;
import i0.j.a.d.a.d.f;
import i0.j.a.h.c.c;

/* compiled from: APMImplementation */
public class a implements Runnable {
    public final /* synthetic */ i0.j.a.h.c.a c;

    public a(i0.j.a.h.c.a aVar) {
        this.c = aVar;
    }

    public void run() {
        c cVar = (c) this.c;
        cVar.c.e("Clearing cached APM network logs");
        DatabaseManager databaseManager = ((d) cVar.a).a;
        if (databaseManager != null) {
            i0.d.a.a.a.o(databaseManager, "delete from apm_network_log");
        }
        DatabaseManager databaseManager2 = ((b) cVar.b).a;
        if (databaseManager2 != null) {
            i0.d.a.a.a.o(databaseManager2, "delete from dangling_apm_network_log");
        }
        f fVar = cVar.e;
        if (fVar != null) {
            fVar.d();
        }
    }
}
