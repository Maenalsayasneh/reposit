package com.instabug.anr.d;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;

/* compiled from: AnrReportsDbHelper */
public class a {
    public static void a(String str, ContentValues contentValues) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        String[] strArr = {str};
        openDatabase.beginTransaction();
        try {
            openDatabase.update(InstabugDbContract.AnrEntry.TABLE_NAME, contentValues, "anr_id=? ", strArr);
            openDatabase.setTransactionSuccessful();
        } finally {
            openDatabase.endTransaction();
            openDatabase.close();
        }
    }
}
