package i0.j.a.h.c;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import i0.d.a.a.a;
import i0.j.a.d.a.c.d;

/* compiled from: NetworkLogHandlerImpl */
public class b implements Runnable {
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    public void run() {
        DatabaseManager databaseManager = ((d) this.c.a).a;
        if (databaseManager != null) {
            a.o(databaseManager, "delete from apm_network_log where response_code = 0 and error_message is NULL");
        }
        DatabaseManager databaseManager2 = ((i0.j.a.d.a.c.b) this.c.b).a;
        if (databaseManager2 != null) {
            a.o(databaseManager2, "delete from dangling_apm_network_log where response_code = 0 and error_message is NULL");
        }
    }
}
