package i0.j.a.d.a.b;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import i0.j.a.d.b.c;
import java.util.ArrayList;

/* compiled from: ExecutionTracesCacheHandlerImpl */
public class d implements c {
    public ExceptionHandler a = new ExceptionHandler().withPenalty(new i0.j.a.m.c.a(i0.j.a.g.a.i()));
    public DatabaseManager b = i0.j.a.g.a.p();
    public i0.j.a.n.a.a c = i0.j.a.g.a.i();

    /* compiled from: ExecutionTracesCacheHandlerImpl */
    public class a implements ReturnableExecutable<Boolean> {
        public final /* synthetic */ long a;

        public a(long j) {
            this.a = j;
        }

        /* JADX INFO: finally extract failed */
        public Object execute() throws Exception {
            if (d.this.b == null) {
                return Boolean.FALSE;
            }
            String[] strArr = {String.valueOf(this.a)};
            SQLiteDatabaseWrapper openDatabase = d.this.b.openDatabase();
            Cursor cursor = null;
            try {
                Cursor query = openDatabase.query(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, (String[]) null, "trace_id = ? ", strArr, (String) null, (String) null, (String) null);
                if (query == null || query.getCount() <= 0) {
                    if (query != null) {
                        query.close();
                    }
                    openDatabase.close();
                    return Boolean.FALSE;
                }
                Boolean bool = Boolean.TRUE;
                query.close();
                openDatabase.close();
                return bool;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                openDatabase.close();
                throw th;
            }
        }
    }

    public int a(long j, long j2, boolean z) {
        DatabaseManager databaseManager = this.b;
        if (databaseManager == null) {
            return -1;
        }
        SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", Long.valueOf(j2));
        contentValues.put("ended_on_background", Integer.valueOf(z ? 1 : 0));
        int update = openDatabase.update(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, contentValues, "trace_id = ? AND duration = -1", new String[]{String.valueOf(j)});
        openDatabase.close();
        return update;
    }

    public final ArrayList<c> b(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, Cursor cursor) {
        ArrayList<c> arrayList = new ArrayList<>();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                c cVar = new c();
                cVar.a = cursor.getLong(cursor.getColumnIndex("trace_id"));
                cVar.b = cursor.getString(cursor.getColumnIndex("name"));
                cVar.c = cursor.getLong(cursor.getColumnIndex("start_time"));
                cVar.d = cursor.getLong(cursor.getColumnIndex("duration"));
                boolean z = false;
                cVar.f = cursor.getInt(cursor.getColumnIndex("started_on_background")) == 1;
                if (cursor.getInt(cursor.getColumnIndex("ended_on_background")) == 1) {
                    z = true;
                }
                cVar.g = z;
                StringBuilder P0 = i0.d.a.a.a.P0("select* from execution_traces_attributes where trace_id = ");
                P0.append(cVar.a);
                Cursor rawQuery = sQLiteDatabaseWrapper.rawQuery(P0.toString(), (String[]) null);
                if (rawQuery != null) {
                    h0.f.a aVar = new h0.f.a();
                    while (rawQuery.moveToNext()) {
                        aVar.put(rawQuery.getString(rawQuery.getColumnIndex("attribute_key")), rawQuery.getString(rawQuery.getColumnIndex("attribute_value")));
                    }
                    rawQuery.close();
                    cVar.e = aVar;
                }
                arrayList.add(cVar);
            }
            cursor.close();
        }
        return arrayList;
    }

    public void c(long j, String str, String str2, String str3) {
        h0.f.a aVar;
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        if (str5 != null) {
            if (this.b != null) {
                aVar = new h0.f.a();
                SQLiteDatabaseWrapper openDatabase = this.b.openDatabase();
                Cursor query = openDatabase.query(InstabugDbContract.ExecutionTracesAttributesEntry.TABLE_NAME, (String[]) null, "trace_id = ?", new String[]{j2 + ""}, (String) null, (String) null, (String) null);
                if (query != null) {
                    while (query.moveToNext()) {
                        aVar.put(query.getString(query.getColumnIndex("attribute_key")), query.getString(query.getColumnIndex("attribute_value")));
                    }
                    query.close();
                }
                openDatabase.close();
            } else {
                aVar = null;
            }
            if (aVar == null || aVar.getOrDefault(str4, null) == null) {
                SharedPreferences sharedPreferences = ((i0.j.a.e.c) i0.j.a.g.a.g()).a;
                int i = 5;
                if (sharedPreferences != null) {
                    i = sharedPreferences.getInt("TRACES_ATTRIBUTES_COUNT", 5);
                }
                if (aVar != null && aVar.Z1 == i) {
                    this.c.f("Trace attribute \"$s1\" wasn't added to \"$s2\". Max allowed trace attributes reached. Please note that you can add up 5 attributes to the same trace.".replace("$s1", str4).replace("$s2", str).replace("$s3", i + ""));
                } else if (this.b != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("trace_id", Long.valueOf(j));
                    contentValues.put("attribute_key", str4);
                    contentValues.put("attribute_value", str5);
                    SQLiteDatabaseWrapper openDatabase2 = this.b.openDatabase();
                    openDatabase2.insert(InstabugDbContract.ExecutionTracesAttributesEntry.TABLE_NAME, (String) null, contentValues);
                    openDatabase2.close();
                }
            } else {
                DatabaseManager databaseManager = this.b;
                if (databaseManager != null) {
                    SQLiteDatabaseWrapper openDatabase3 = databaseManager.openDatabase();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("attribute_value", str5);
                    openDatabase3.update(InstabugDbContract.ExecutionTracesAttributesEntry.TABLE_NAME, contentValues2, "trace_id = ? AND attribute_key= ?", new String[]{j2 + "", str4});
                    openDatabase3.close();
                }
            }
        } else if (this.b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("delete from execution_traces_attributes where trace_id = ");
            sb.append(j2);
            sb.append(" and ");
            sb.append("attribute_key");
            i0.d.a.a.a.o(this.b, i0.d.a.a.a.z0(sb, " = \"", str4, "\""));
        }
    }

    public boolean d(long j) {
        Boolean bool = (Boolean) this.a.executeAndGet(new a(j), Boolean.FALSE);
        return bool != null && bool.booleanValue();
    }

    public boolean e(long j, String str, String str2, long j2, boolean z) {
        DatabaseManager databaseManager = this.b;
        if (databaseManager == null) {
            return false;
        }
        SQLiteDatabaseWrapper openDatabase = databaseManager.openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("trace_id", Long.valueOf(j));
        contentValues.put("name", str2);
        contentValues.put("start_time", Long.valueOf(j2));
        contentValues.put("session_id", str);
        contentValues.put("started_on_background", Integer.valueOf(z ? 1 : 0));
        long insert = openDatabase.insert(InstabugDbContract.ExecutionTracesEntry.TABLE_NAME, (String) null, contentValues);
        openDatabase.close();
        if (insert != -1) {
            return true;
        }
        return false;
    }
}
