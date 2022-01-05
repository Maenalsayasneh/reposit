package i0.j.a.d.a.b;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.model.common.Session;
import i0.j.a.d.a.d.f;
import i0.j.a.d.b.c;
import i0.j.a.e.b;
import java.util.Map;

/* compiled from: ExecutionTracesMigrationHandlerImpl */
public class e {
    public final c a;
    public final a b;
    public final b c;
    public final f d;

    public e(c cVar, a aVar, b bVar, f fVar) {
        this.a = cVar;
        this.b = aVar;
        this.c = bVar;
        this.d = fVar;
    }

    public void a(c cVar, Session session) {
        String str;
        Map<String, String> map;
        if (this.d != null) {
            c cVar2 = this.a;
            String id = session.getId();
            d dVar = (d) cVar2;
            DatabaseManager databaseManager = dVar.b;
            if (databaseManager != null) {
                SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("trace_id", Long.valueOf(cVar.a));
                contentValues.put("session_id", id);
                String str2 = cVar.b;
                if (str2 != null) {
                    contentValues.put("name", str2);
                }
                contentValues.put("start_time", Long.valueOf(cVar.c));
                contentValues.put("duration", Long.valueOf(cVar.d));
                contentValues.put("started_on_background", Integer.valueOf(cVar.f ? 1 : 0));
                contentValues.put("ended_on_background", Integer.valueOf(cVar.g ? 1 : 0));
                if (!(openDatabase.insert(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, (String) null, contentValues) == -1 || (str = cVar.b) == null || (map = cVar.e) == null)) {
                    long j = cVar.a;
                    for (Map.Entry next : map.entrySet()) {
                        dVar.c(j, str, (String) next.getKey(), (String) next.getValue());
                    }
                }
                openDatabase.close();
            }
            this.d.i(session.getId(), 1);
        }
    }
}
