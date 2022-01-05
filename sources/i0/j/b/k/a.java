package i0.j.b.k;

import android.content.ContentValues;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;

/* compiled from: BugReportsDbHelper */
public class a {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00dd, code lost:
        if (r12 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f0, code lost:
        if (r12 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0101, code lost:
        if (r12 == null) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        return r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<com.instabug.bug.model.a> a(android.content.Context r13) throws org.json.JSONException {
        /*
            java.lang.Class<i0.j.b.k.a> r0 = i0.j.b.k.a.class
            monitor-enter(r0)
            if (r13 == 0) goto L_0x0114
            com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x0122 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r1 = r1.openDatabase()     // Catch:{ all -> 0x0122 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x0122 }
            r11.<init>()     // Catch:{ all -> 0x0122 }
            r12 = 0
            java.lang.String r3 = "bugs_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r1
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            if (r12 == 0) goto L_0x00dd
            boolean r2 = r12.moveToFirst()     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            if (r2 == 0) goto L_0x00dd
        L_0x0029:
            com.instabug.bug.model.a r2 = new com.instabug.bug.model.a     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.<init>()     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "id"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.c = r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "message"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.x = r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "bug_state"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.Class<com.instabug.bug.model.a$a> r4 = com.instabug.bug.model.a.C0094a.class
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.Enum r3 = java.lang.Enum.valueOf(r4, r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            com.instabug.bug.model.a$a r3 = (com.instabug.bug.model.a.C0094a) r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.Y1 = r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "temporary_server_token"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.d = r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "type"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.q = r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "categories_list"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r4.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.c(r4)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "view_hierarchy"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.Z1 = r3     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = "state"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            com.instabug.library.model.State r4 = new com.instabug.library.model.State     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r4.<init>()     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r4.setUri(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            com.instabug.library.internal.storage.DiskUtils r5 = com.instabug.library.internal.storage.DiskUtils.with(r13)     // Catch:{ OutOfMemoryError -> 0x00bd }
            com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation r6 = new com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation     // Catch:{ OutOfMemoryError -> 0x00bd }
            r6.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x00bd }
            com.instabug.library.internal.storage.executor.ReadOperationExecutor r3 = r5.readOperation(r6)     // Catch:{ OutOfMemoryError -> 0x00bd }
            java.lang.String r3 = r3.execute()     // Catch:{ OutOfMemoryError -> 0x00bd }
            r4.fromJson(r3)     // Catch:{ OutOfMemoryError -> 0x00bd }
            r2.state = r4     // Catch:{ OutOfMemoryError -> 0x00bd }
            goto L_0x00c5
        L_0x00bd:
            r3 = move-exception
            java.lang.String r4 = "BugReportsDbHelper"
            java.lang.String r5 = "retrieving bug state throws OOM"
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
        L_0x00c5:
            java.lang.String r3 = r2.c     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            if (r3 == 0) goto L_0x00d7
            java.util.ArrayList r3 = com.instabug.library.internal.storage.cache.AttachmentsDbHelper.retrieve(r3, r1)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r2.y = r4     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            r11.add(r2)     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
        L_0x00d7:
            boolean r2 = r12.moveToNext()     // Catch:{ IOException -> 0x00f3, JSONException -> 0x00e2 }
            if (r2 != 0) goto L_0x0029
        L_0x00dd:
            if (r12 == 0) goto L_0x0106
            goto L_0x0103
        L_0x00e0:
            r13 = move-exception
            goto L_0x010b
        L_0x00e2:
            r13 = move-exception
            java.lang.String r2 = "BugReportsDbHelper"
            java.lang.Class r3 = r13.getClass()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x00e0 }
            com.instabug.library.util.InstabugSDKLogger.e(r2, r3, r13)     // Catch:{ all -> 0x00e0 }
            if (r12 == 0) goto L_0x0106
            goto L_0x0103
        L_0x00f3:
            r13 = move-exception
            java.lang.String r2 = "BugReportsDbHelper"
            java.lang.Class r3 = r13.getClass()     // Catch:{ all -> 0x00e0 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x00e0 }
            com.instabug.library.util.InstabugSDKLogger.e(r2, r3, r13)     // Catch:{ all -> 0x00e0 }
            if (r12 == 0) goto L_0x0106
        L_0x0103:
            r12.close()     // Catch:{ all -> 0x0122 }
        L_0x0106:
            r1.close()     // Catch:{ all -> 0x0122 }
            monitor-exit(r0)
            return r11
        L_0x010b:
            if (r12 == 0) goto L_0x0110
            r12.close()     // Catch:{ all -> 0x0122 }
        L_0x0110:
            r1.close()     // Catch:{ all -> 0x0122 }
            throw r13     // Catch:{ all -> 0x0122 }
        L_0x0114:
            java.lang.String r13 = "BugReportsDbHelper"
            java.lang.String r1 = "Context is null while retrieving bugs from DB."
            com.instabug.library.util.InstabugSDKLogger.e(r13, r1)     // Catch:{ all -> 0x0122 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0122 }
            r13.<init>()     // Catch:{ all -> 0x0122 }
            monitor-exit(r0)
            return r13
        L_0x0122:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.b.k.a.a(android.content.Context):java.util.List");
    }

    public static synchronized void b(String str, ContentValues contentValues) {
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                openDatabase.update(InstabugDbContract.BugEntry.TABLE_NAME, contentValues, "id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }
}
