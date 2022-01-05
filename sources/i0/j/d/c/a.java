package i0.j.d.c;

import android.content.ContentValues;
import com.instabug.featuresrequest.d.b;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import org.json.JSONException;

/* compiled from: FeatureRequestsDBHelper */
public class a {
    public static synchronized long a(b bVar) throws JSONException {
        long insertWithOnConflictReplace;
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_ID, Long.valueOf(bVar.c));
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, bVar.d);
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, bVar.q);
                contentValues.put("status", bVar.x.name());
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_LIKES_COUNT, Integer.valueOf(bVar.a2));
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_COMMENTS_COUNT, Integer.valueOf(bVar.b2));
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_IS_LIKED, Boolean.valueOf(bVar.c2));
                contentValues.put("date", Long.valueOf(bVar.Z1));
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_COLOR_CODE, bVar.y);
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_CREATOR_NAME, bVar.Y1);
                contentValues.put(InstabugDbContract.FeatureRequestEntry.COLUMN_VOTE_UPDATED, bVar.g2.name());
                insertWithOnConflictReplace = openDatabase.insertWithOnConflictReplace(InstabugDbContract.FeatureRequestEntry.TABLE_NAME, (String) null, contentValues);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        return insertWithOnConflictReplace;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00d5 A[SYNTHETIC, Splitter:B:17:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<com.instabug.featuresrequest.d.b> b() throws org.json.JSONException {
        /*
            java.lang.Class<i0.j.d.c.a> r0 = i0.j.d.c.a.class
            monitor-enter(r0)
            com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x00e7 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r1 = r1.openDatabase()     // Catch:{ all -> 0x00e7 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00e7 }
            r11.<init>()     // Catch:{ all -> 0x00e7 }
            r12 = 0
            java.lang.String r3 = "feature_requests_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r1
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00dd }
            if (r12 == 0) goto L_0x00d3
            boolean r2 = r12.moveToFirst()     // Catch:{ all -> 0x00dd }
            if (r2 == 0) goto L_0x00d3
        L_0x0027:
            com.instabug.featuresrequest.d.b r2 = new com.instabug.featuresrequest.d.b     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = com.instabug.library.user.UserManagerWrapper.getUserName()     // Catch:{ all -> 0x00dd }
            java.lang.String r4 = com.instabug.library.user.UserManagerWrapper.getUserEmail()     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = com.instabug.library.core.InstabugCore.getPushNotificationToken()     // Catch:{ all -> 0x00dd }
            r2.<init>(r3, r4, r5)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "_id"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            int r3 = r12.getInt(r3)     // Catch:{ all -> 0x00dd }
            long r3 = (long) r3     // Catch:{ all -> 0x00dd }
            r2.c = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "title"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ all -> 0x00dd }
            r2.d = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "description"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ all -> 0x00dd }
            r2.q = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "status"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ all -> 0x00dd }
            com.instabug.featuresrequest.d.b$a r3 = com.instabug.featuresrequest.d.b.a.valueOf(r3)     // Catch:{ all -> 0x00dd }
            r2.x = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "likes_count"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            int r3 = r12.getInt(r3)     // Catch:{ all -> 0x00dd }
            r2.a2 = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "comments_count"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            int r3 = r12.getInt(r3)     // Catch:{ all -> 0x00dd }
            r2.b2 = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "liked"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            int r3 = r12.getInt(r3)     // Catch:{ all -> 0x00dd }
            r4 = 1
            if (r3 != r4) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            r2.c2 = r4     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "date"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            long r3 = r12.getLong(r3)     // Catch:{ all -> 0x00dd }
            r2.Z1 = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "color_code"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ all -> 0x00dd }
            r2.y = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "creator_name"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ all -> 0x00dd }
            r2.Y1 = r3     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = "ib_user_vote_status"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ all -> 0x00dd }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ all -> 0x00dd }
            com.instabug.featuresrequest.d.b$b r3 = com.instabug.featuresrequest.d.b.C0102b.valueOf(r3)     // Catch:{ all -> 0x00dd }
            r2.g2 = r3     // Catch:{ all -> 0x00dd }
            r11.add(r2)     // Catch:{ all -> 0x00dd }
            boolean r2 = r12.moveToNext()     // Catch:{ all -> 0x00dd }
            if (r2 != 0) goto L_0x0027
        L_0x00d3:
            if (r12 == 0) goto L_0x00d8
            r12.close()     // Catch:{ all -> 0x00e7 }
        L_0x00d8:
            r1.close()     // Catch:{ all -> 0x00e7 }
            monitor-exit(r0)
            return r11
        L_0x00dd:
            r2 = move-exception
            if (r12 == 0) goto L_0x00e3
            r12.close()     // Catch:{ all -> 0x00e7 }
        L_0x00e3:
            r1.close()     // Catch:{ all -> 0x00e7 }
            throw r2     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.d.c.a.b():java.util.List");
    }
}
