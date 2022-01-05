package i0.j.a.d.a.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import i0.j.a.d.b.c;
import i0.j.a.n.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DanglingExecutionTracesCacheHandlerImpl */
public class b implements a {
    public final DatabaseManager a;
    public final a b;

    public b(DatabaseManager databaseManager, a aVar) {
        this.a = databaseManager;
        this.b = aVar;
    }

    public int a(long j, long j2, boolean z) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager == null) {
            return -1;
        }
        SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", Long.valueOf(j2));
        contentValues.put("ended_on_background", Integer.valueOf(z ? 1 : 0));
        int update = openDatabase.update(InstabugDbContract.DanglingExecutionTracesEntry.TABLE_NAME, contentValues, "trace_id = ?  AND duration = -1", new String[]{String.valueOf(j)});
        openDatabase.close();
        return update;
    }

    public final List<c> b(String str) {
        if (this.a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SQLiteDatabaseWrapper openDatabase = this.a.openDatabase();
        Cursor rawQuery = openDatabase.rawQuery(str, (String[]) null);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                c cVar = new c();
                cVar.a = rawQuery.getLong(rawQuery.getColumnIndex("trace_id"));
                cVar.b = rawQuery.getString(rawQuery.getColumnIndex("name"));
                cVar.c = rawQuery.getLong(rawQuery.getColumnIndex("start_time"));
                cVar.d = rawQuery.getLong(rawQuery.getColumnIndex("duration"));
                boolean z = false;
                cVar.f = rawQuery.getInt(rawQuery.getColumnIndex("started_on_background")) == 1;
                if (rawQuery.getInt(rawQuery.getColumnIndex("ended_on_background")) == 1) {
                    z = true;
                }
                cVar.g = z;
                StringBuilder P0 = i0.d.a.a.a.P0("select * from dangling_execution_traces_attributes where trace_id = ");
                P0.append(cVar.a);
                Cursor rawQuery2 = openDatabase.rawQuery(P0.toString(), (String[]) null);
                if (rawQuery2 != null) {
                    h0.f.a aVar = new h0.f.a();
                    while (rawQuery2.moveToNext()) {
                        aVar.put(rawQuery2.getString(rawQuery2.getColumnIndex("attribute_key")), rawQuery2.getString(rawQuery2.getColumnIndex("attribute_value")));
                    }
                    rawQuery2.close();
                    cVar.e = aVar;
                }
                arrayList.add(cVar);
            }
            rawQuery.close();
        }
        openDatabase.close();
        return arrayList;
    }

    public boolean c(long j, String str, long j2, boolean z) {
        DatabaseManager databaseManager = this.a;
        if (databaseManager == null) {
            return false;
        }
        SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("trace_id", Long.valueOf(j));
        contentValues.put("name", str);
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("started_on_background", Integer.valueOf(z ? 1 : 0));
        long insert = openDatabase.insert(InstabugDbContract.DanglingExecutionTracesEntry.TABLE_NAME, (String) null, contentValues);
        openDatabase.close();
        if (insert != -1) {
            return true;
        }
        return false;
    }
}
