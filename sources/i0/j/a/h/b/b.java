package i0.j.a.h.b;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.d.b.c;
import i0.j.a.d.b.d;
import i0.j.a.g.a;
import java.util.ArrayList;

/* compiled from: ExecutionTracesHandlerImpl */
public class b implements Runnable {
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    public void run() {
        ArrayList<c> arrayList;
        d dVar = ((i0.j.a.h.d.d) a.a()).f;
        if (dVar != null) {
            c cVar = this.c;
            String str = dVar.a;
            i0.j.a.d.a.b.d dVar2 = (i0.j.a.d.a.b.d) cVar.a;
            DatabaseManager databaseManager = dVar2.b;
            if (databaseManager != null) {
                SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
                arrayList = dVar2.b(openDatabase, openDatabase.query(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, (String[]) null, "session_id = ?", new String[]{str}, (String) null, (String) null, (String) null));
                openDatabase.close();
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                for (c next : arrayList) {
                    if (next.d == -1) {
                        this.c.a(next.a, System.currentTimeMillis() - next.c);
                    }
                }
            }
        }
    }
}
