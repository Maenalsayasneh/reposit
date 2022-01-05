package i0.j.a.d.a.d;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.model.common.Session;
import i0.j.a.d.b.d;
import java.util.Objects;

/* compiled from: SessionCacheHandlerImpl */
public class b implements ReturnableExecutable<d> {
    public final /* synthetic */ Session a;
    public final /* synthetic */ e b;

    public b(e eVar, Session session) {
        this.b = eVar;
        this.a = session;
    }

    public Object execute() throws Exception {
        e eVar = this.b;
        Session session = this.a;
        Objects.requireNonNull(eVar);
        ContentValues contentValues = new ContentValues();
        contentValues.put(InstabugDbContract.APMSessionEntry.COLUMN_CORE_ID, session.getId());
        contentValues.put("os", session.getOs());
        contentValues.put("uuid", session.getUuid());
        contentValues.put("app_version", session.getAppVersion());
        contentValues.put("started_at", Long.valueOf(session.getStartTimestampMicros()));
        SQLiteDatabaseWrapper openDatabase = this.b.a.openDatabase();
        try {
            String valueOf = String.valueOf(openDatabase.insertWithOnConflict(InstabugDbContract.APMSessionEntry.TABLE_NAME, (String) null, contentValues));
            Session session2 = this.a;
            return new d(valueOf, session2.getId(), session2.getOs(), session2.getAppVersion() != null ? session2.getAppVersion() : "", session2.getUuid(), 0, session2.getStartTimestampMicros(), session2.getStartNanoTime(), -1);
        } finally {
            openDatabase.close();
        }
    }
}
