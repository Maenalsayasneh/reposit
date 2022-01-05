package i0.j.e.r0;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import io.reactivex.internal.operators.completable.CompletableCreate;
import k0.b.b;
import k0.b.d;

/* compiled from: SessionsLocalDataSource */
public class h implements d {
    public final /* synthetic */ String a;

    public h(String str) {
        this.a = str;
    }

    /* JADX INFO: finally extract failed */
    public void a(b bVar) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        String[] strArr = {this.a};
        try {
            openDatabase.beginTransaction();
            openDatabase.delete(InstabugDbContract.SessionEntry.TABLE_NAME, "session_id = ? ", strArr);
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
