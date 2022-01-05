package i0.j.e.o0.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.o0.d.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExperimentsDBManagerImpl */
public class b implements a {
    public void a() {
        SQLiteDatabaseWrapper openDatabase = a.a().openDatabase();
        openDatabase.delete(InstabugDbContract.ExperimentsEntry.TABLE_NAME, (String) null, (String[]) null);
        openDatabase.close();
    }

    public List<String> b() {
        try {
            SQLiteDatabaseWrapper openDatabase = a.a().openDatabase();
            Cursor query = openDatabase.query(InstabugDbContract.ExperimentsEntry.TABLE_NAME, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query != null) {
                ArrayList arrayList = new ArrayList();
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(query.getString(query.getColumnIndex(InstabugDbContract.ExperimentsEntry.COLUMN_EXPERIMENT)));
                    } while (query.moveToNext());
                }
                query.close();
                openDatabase.close();
                return arrayList;
            }
            openDatabase.close();
            return null;
        } catch (Exception | OutOfMemoryError e) {
            InstabugSDKLogger.e(e, e.getMessage() != null ? e.getMessage() : e.toString());
            return null;
        }
    }

    public void c(List<String> list) {
        SQLiteDatabaseWrapper openDatabase = a.a().openDatabase();
        for (String next : list) {
            Cursor rawQuery = openDatabase.rawQuery("select * from experiments_table where experiment = ?", new String[]{next});
            if (rawQuery != null) {
                boolean moveToFirst = rawQuery.moveToFirst();
                rawQuery.close();
                if (!moveToFirst) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(InstabugDbContract.ExperimentsEntry.COLUMN_EXPERIMENT, next);
                    openDatabase.insert(InstabugDbContract.ExperimentsEntry.TABLE_NAME, (String) null, contentValues);
                }
            }
        }
        openDatabase.close();
    }

    public int e(int i) {
        SQLiteDatabaseWrapper openDatabase = a.a().openDatabase();
        int delete = openDatabase.delete(InstabugDbContract.ExperimentsEntry.TABLE_NAME, "experiment_id not in ( select experiment_id from experiments_table order by experiment_id desc limit ? )", new String[]{String.valueOf(i)});
        openDatabase.close();
        return delete;
    }

    public void i(List<String> list) {
        SQLiteDatabaseWrapper openDatabase = a.a().openDatabase();
        for (String str : list) {
            openDatabase.delete(InstabugDbContract.ExperimentsEntry.TABLE_NAME, "experiment = ?", new String[]{str});
        }
        openDatabase.close();
    }
}
