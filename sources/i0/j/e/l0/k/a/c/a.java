package i0.j.e.l0.k.a.c;

import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.t0.f;

/* compiled from: UserDbHelper */
public class a {
    public static f a(String str) {
        InstabugSDKLogger.v("UserDbHelper", "retrieve ");
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query("user", (String[]) null, "uuid =?", new String[]{str}, (String) null, (String) null, (String) null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return new f(str, query.getInt(query.getColumnIndex(InstabugDbContract.UserEntity.COLUMN_SESSION_COUNT)), query.getLong(query.getColumnIndex(InstabugDbContract.UserEntity.COLUMN_LAST_SEEN)));
                }
            } catch (Exception e) {
                InstabugSDKLogger.e("UserDbHelper", e.getClass().getSimpleName(), e);
                return null;
            } finally {
                query.close();
                openDatabase.close();
            }
        }
        if (query != null) {
            query.close();
        }
        openDatabase.close();
        return null;
    }
}
