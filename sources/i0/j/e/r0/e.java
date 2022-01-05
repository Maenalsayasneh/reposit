package i0.j.e.r0;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import io.reactivex.internal.operators.completable.CompletableCreate;
import io.reactivex.plugins.RxJavaPlugins;
import k0.b.b;
import k0.b.d;

/* compiled from: SessionsLocalDataSource */
public class e {

    /* compiled from: SessionsLocalDataSource */
    public class a implements d {
        /* JADX INFO: finally extract failed */
        public void a(b bVar) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("sync_status", 1);
            try {
                openDatabase.beginTransaction();
                openDatabase.update(InstabugDbContract.SessionEntry.TABLE_NAME, contentValues, "sync_status = ? ", new String[]{String.valueOf(0)});
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

    public k0.b.a a() {
        return RxJavaPlugins.onAssembly((k0.b.a) new CompletableCreate(new a()));
    }
}
