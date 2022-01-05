package i0.j.e.q0;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k0.b.b0.b;
import k0.b.l;

/* compiled from: InstabugLogDbHelper */
public class a {
    public static PublishSubject<List<InstabugLog.h>> a;
    public static k0.b.w.a b;
    public static List<InstabugLog.h> c = new ArrayList();

    /* renamed from: i0.j.e.q0.a$a  reason: collision with other inner class name */
    /* compiled from: InstabugLogDbHelper */
    public static class C0184a extends b<List<InstabugLog.h>> {
        public void b(Object obj) {
            List list = (List) obj;
            try {
                a.c.clear();
                a.b(list);
            } catch (IllegalStateException e) {
                StringBuilder P0 = i0.d.a.a.a.P0("couldn't insert the latest logs due to ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e("InstabugLogDbHelper", P0.toString());
            }
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            InstabugSDKLogger.e("InstabugLogDbHelper", "couldn't insert the latest logs");
        }
    }

    public static synchronized void a(InstabugLog.h hVar) {
        synchronized (a.class) {
            InstabugSDKLogger.d("InstabugLogDbHelper", "insert");
            if (a == null) {
                a = new PublishSubject<>();
                d();
            } else if (b.isDisposed()) {
                d();
            }
            c.add(hVar);
            a.b(new ArrayList(c));
        }
    }

    /* JADX INFO: finally extract failed */
    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static synchronized void b(List<InstabugLog.h> list) {
        synchronized (a.class) {
            InstabugSDKLogger.d("InstabugLogDbHelper", "insertInstabugLogs");
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                for (InstabugLog.h next : list) {
                    if (next != null) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(InstabugDbContract.InstabugLogEntry.COLUMN_LOG_MESSAGE, next.a);
                        contentValues.put(InstabugDbContract.InstabugLogEntry.COLUMN_LOG_LEVEL, next.b.toString());
                        contentValues.put(InstabugDbContract.InstabugLogEntry.COLUMN_LOG_DATE, String.valueOf(next.c));
                        openDatabase.insert(InstabugDbContract.InstabugLogEntry.TABLE_NAME, (String) null, contentValues);
                    }
                }
                openDatabase.execSQL(InstabugDbContract.InstabugLogEntry.DELETE_ALL_EXCEPT_THE_LATEST_1000_ENTRY);
                openDatabase.setTransactionSuccessful();
                openDatabase.endTransaction();
                openDatabase.close();
                k0.b.w.a aVar = b;
                if (aVar != null && !aVar.isDisposed()) {
                    b.dispose();
                }
            } catch (Throwable th) {
                openDatabase.endTransaction();
                openDatabase.close();
                throw th;
            }
        }
    }

    public static synchronized void c() {
        synchronized (a.class) {
            InstabugSDKLogger.d("InstabugLogDbHelper", "forceInsertSuspendedLogs");
            k0.b.w.a aVar = b;
            if (aVar != null && !aVar.isDisposed()) {
                b.dispose();
            }
            ArrayList arrayList = new ArrayList(c);
            c.clear();
            b(arrayList);
        }
    }

    public static void d() {
        l<List<InstabugLog.h>> s = a.e(1, TimeUnit.SECONDS).s(k0.b.d0.a.b());
        C0184a aVar = new C0184a();
        s.c(aVar);
        b = aVar;
    }
}
