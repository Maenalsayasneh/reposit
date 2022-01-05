package i0.j.e.l0.k.a.b.b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;

/* compiled from: Migration_20_21 */
public class i implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        InstabugSDKLogger.d("IBG_MIGRATION", "migration 20_21");
        if (Instabug.getApplicationContext() != null) {
            if (sQLiteDatabase != null) {
                InstabugSDKLogger.d("IBG_MIGRATION", "clearBugsAndCrashesTables");
                sQLiteDatabase.execSQL(InstabugDbContract.CrashEntry.DELETE_ALL);
                sQLiteDatabase.execSQL(InstabugDbContract.BugEntry.DELETE_ALL);
            }
            Context applicationContext = Instabug.getApplicationContext();
            InstabugSDKLogger.d("IBG_MIGRATION", "clearInstabugAttachmentDirectory started");
            File attachmentDirectory = AttachmentManager.getAttachmentDirectory(applicationContext);
            if (attachmentDirectory != null) {
                AttachmentManager.deleteRecursive(attachmentDirectory);
                InstabugSDKLogger.d("IBG_MIGRATION", "clearInstabugAttachmentDirectory finished");
            }
        }
    }
}
