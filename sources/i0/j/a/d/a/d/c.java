package i0.j.a.d.a.d;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import i0.j.a.d.b.d;
import java.util.Objects;

/* compiled from: SessionCacheHandlerImpl */
public class c implements ReturnableExecutable<Integer> {
    public final /* synthetic */ d a;
    public final /* synthetic */ e b;

    public c(e eVar, d dVar) {
        this.b = eVar;
        this.a = dVar;
    }

    public Object execute() throws Exception {
        e eVar = this.b;
        d dVar = this.a;
        Objects.requireNonNull(eVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put("session_id", dVar.a);
        contentValues.put(InstabugDbContract.APMSessionEntry.COLUMN_CORE_ID, dVar.b);
        contentValues.put("os", dVar.c);
        contentValues.put("uuid", dVar.e);
        contentValues.put("app_version", dVar.d);
        contentValues.put("started_at", Long.valueOf(dVar.g));
        contentValues.put("duration", Long.valueOf(dVar.f));
        contentValues.put(InstabugDbContract.APMSessionEntry.COLUMN_TERMINATION_CODE, Integer.valueOf(dVar.i));
        SQLiteDatabaseWrapper openDatabase = this.b.a.openDatabase();
        try {
            return Integer.valueOf(openDatabase.update(InstabugDbContract.APMSessionEntry.TABLE_NAME, contentValues, "session_id = ?", new String[]{this.a.a}));
        } finally {
            openDatabase.close();
        }
    }
}
