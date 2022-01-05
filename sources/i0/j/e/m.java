package i0.j.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.e.l0.k.a.b.a;

/* compiled from: InstabugDelegate */
public class m implements Runnable {
    public final /* synthetic */ Context c;

    public m(Context context) {
        this.c = context;
    }

    public void run() {
        a aVar = new a(this.c);
        SQLiteDatabase readableDatabase = aVar.getReadableDatabase();
        readableDatabase.execSQL(InstabugDbContract.NetworkLogEntry.DELETE_ALL);
        readableDatabase.execSQL(InstabugDbContract.InstabugLogEntry.DELETE_ALL);
        readableDatabase.execSQL(InstabugDbContract.SDKEventEntry.DELETE_ALL);
        readableDatabase.execSQL(InstabugDbContract.SDKApiEntry.DELETE_ALL);
        i0.d.a.a.a.h(readableDatabase, InstabugDbContract.AttachmentEntry.DELETE_ALL, InstabugDbContract.CrashEntry.DELETE_ALL, InstabugDbContract.BugEntry.DELETE_ALL, InstabugDbContract.ExperimentsEntry.DELETE_ALL);
        aVar.onCreate(readableDatabase);
        readableDatabase.close();
        aVar.close();
    }
}
