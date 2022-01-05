package i0.j.a;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import i0.j.a.d.a.b.d;
import i0.j.a.d.a.d.f;
import i0.j.a.h.b.a;
import i0.j.a.h.b.c;

/* compiled from: APMImplementation */
public class b implements Runnable {
    public final /* synthetic */ a c;

    public b(a aVar) {
        this.c = aVar;
    }

    public void run() {
        c cVar = (c) this.c;
        DatabaseManager databaseManager = ((d) cVar.a).b;
        if (databaseManager != null) {
            i0.d.a.a.a.o(databaseManager, "delete from execution_traces");
        }
        DatabaseManager databaseManager2 = ((i0.j.a.d.a.b.b) cVar.b).a;
        if (databaseManager2 != null) {
            i0.d.a.a.a.o(databaseManager2, "delete from dangling_execution_traces");
        }
        f fVar = cVar.e;
        if (fVar != null) {
            fVar.c();
        }
    }
}
