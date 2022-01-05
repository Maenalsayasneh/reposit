package i0.j.e.r0;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.model.session.SessionLocalEntity;
import com.instabug.library.model.session.SessionMapper;
import io.reactivex.internal.operators.completable.CompletableCreate;
import k0.b.d;

/* compiled from: SessionsLocalDataSource */
public class b implements d {
    public final /* synthetic */ SessionLocalEntity a;

    public b(SessionLocalEntity sessionLocalEntity) {
        this.a = sessionLocalEntity;
    }

    /* JADX INFO: finally extract failed */
    public void a(k0.b.b bVar) {
        ContentValues contentValues = SessionMapper.toContentValues(this.a);
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        try {
            openDatabase.beginTransaction();
            if (openDatabase.insertWithOnConflict(InstabugDbContract.SessionEntry.TABLE_NAME, (String) null, contentValues) == -1) {
                openDatabase.update(InstabugDbContract.SessionEntry.TABLE_NAME, contentValues, "session_id = ? ", new String[]{String.valueOf(this.a.getId())});
            }
            openDatabase.setTransactionSuccessful();
            openDatabase.endTransaction();
            openDatabase.close();
            ((CompletableCreate.Emitter) bVar).a();
        } catch (Throwable th) {
            openDatabase.endTransaction();
            openDatabase.close();
            throw th;
        }
    }
}
