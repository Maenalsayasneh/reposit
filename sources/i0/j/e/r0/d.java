package i0.j.e.r0;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import io.reactivex.internal.operators.completable.CompletableCreate;
import k0.b.b;

/* compiled from: SessionsLocalDataSource */
public class d implements k0.b.d {
    public final /* synthetic */ String a;

    public d(String str) {
        this.a = str;
    }

    /* JADX INFO: finally extract failed */
    public void a(b bVar) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", 2);
        try {
            openDatabase.beginTransaction();
            openDatabase.update(InstabugDbContract.SessionEntry.TABLE_NAME, contentValues, "session_id = ? ", new String[]{this.a});
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
