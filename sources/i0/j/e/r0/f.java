package i0.j.e.r0;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import io.reactivex.internal.operators.completable.CompletableCreate;
import k0.b.b;
import k0.b.d;

/* compiled from: SessionsLocalDataSource */
public class f implements d {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public f(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    /* JADX INFO: finally extract failed */
    public void a(b bVar) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", this.a);
        String[] strArr = {this.b};
        try {
            openDatabase.beginTransaction();
            openDatabase.update(InstabugDbContract.SessionEntry.TABLE_NAME, contentValues, "uuid = ? ", strArr);
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
