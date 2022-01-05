package i0.j.e.a.d;

import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;

/* compiled from: AnalyticsDatabaseHelper */
public class a {
    public static void a() {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        openDatabase.delete(InstabugDbContract.SDKEventEntry.TABLE_NAME, (String) null, (String[]) null);
        openDatabase.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    @android.annotation.SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.util.Collection<com.instabug.library.analytics.model.Api> r6, long r7) {
        /*
            r0 = 0
            com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ Exception -> 0x006f }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r1 = r1.openDatabase()     // Catch:{ Exception -> 0x006f }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.<init>()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
        L_0x0012:
            boolean r3 = r6.hasNext()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r6.next()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            com.instabug.library.analytics.model.Api r3 = (com.instabug.library.analytics.model.Api) r3     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r4 = "time_stamp"
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r4 = "api_name"
            java.lang.String r5 = r3.getApiName()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r4 = "is_deprecated"
            boolean r5 = r3.isDeprecated()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r5 = java.lang.Boolean.toString(r5)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r4 = "count"
            int r5 = r3.getCount()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.put(r4, r5)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r4 = "parameters"
            java.util.ArrayList r3 = r3.getParameters()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            org.json.JSONArray r3 = com.instabug.library.analytics.model.Api.Parameter.toJson(r3)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.put(r4, r3)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.lang.String r3 = "sdk_api"
            r1.insert(r3, r0, r2)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r2.clear()     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            goto L_0x0012
        L_0x0064:
            if (r1 == 0) goto L_0x007f
            goto L_0x007c
        L_0x0067:
            r6 = move-exception
            r0 = r1
            goto L_0x0080
        L_0x006a:
            r6 = move-exception
            r0 = r1
            goto L_0x0070
        L_0x006d:
            r6 = move-exception
            goto L_0x0080
        L_0x006f:
            r6 = move-exception
        L_0x0070:
            java.lang.Class<i0.j.e.a.d.a> r7 = i0.j.e.a.d.a.class
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x006d }
            com.instabug.library.util.InstabugSDKLogger.e(r7, r6)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x007f
            r1 = r0
        L_0x007c:
            r1.close()
        L_0x007f:
            return
        L_0x0080:
            if (r0 == 0) goto L_0x0085
            r0.close()
        L_0x0085:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.a.d.a.b(java.util.Collection, long):void");
    }

    public static void c() {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        openDatabase.delete(InstabugDbContract.SDKApiEntry.TABLE_NAME, (String) null, (String[]) null);
        openDatabase.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0096, code lost:
        if (r11 == null) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList<com.instabug.library.analytics.model.Api> d() throws org.json.JSONException {
        /*
            java.lang.Class<i0.j.e.a.d.a> r0 = i0.j.e.a.d.a.class
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            com.instabug.library.internal.storage.cache.db.DatabaseManager r2 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x00b8 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r2 = r2.openDatabase()     // Catch:{ all -> 0x00b8 }
            r11 = 0
            java.lang.String r4 = "sdk_api"
            java.lang.String r3 = "time_stamp"
            java.lang.String r5 = "api_name"
            java.lang.String r6 = "is_deprecated"
            java.lang.String r7 = "count"
            java.lang.String r8 = "parameters"
            java.lang.String[] r5 = new java.lang.String[]{r3, r5, r6, r7, r8}     // Catch:{ Exception -> 0x009b }
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r2
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x009b }
            if (r11 == 0) goto L_0x0096
            int r3 = r11.getCount()     // Catch:{ Exception -> 0x009b }
            if (r3 <= 0) goto L_0x0096
            r11.moveToFirst()     // Catch:{ Exception -> 0x009b }
        L_0x0036:
            com.instabug.library.analytics.model.Api r3 = new com.instabug.library.analytics.model.Api     // Catch:{ Exception -> 0x009b }
            r3.<init>()     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = "api_name"
            int r4 = r11.getColumnIndex(r4)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "time_stamp"
            int r5 = r11.getColumnIndex(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r6 = "is_deprecated"
            int r6 = r11.getColumnIndex(r6)     // Catch:{ Exception -> 0x009b }
            java.lang.String r7 = "count"
            int r7 = r11.getColumnIndex(r7)     // Catch:{ Exception -> 0x009b }
            java.lang.String r8 = "parameters"
            int r8 = r11.getColumnIndex(r8)     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = r11.getString(r4)     // Catch:{ Exception -> 0x009b }
            r3.setApiName(r4)     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = r11.getString(r5)     // Catch:{ Exception -> 0x009b }
            long r4 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x009b }
            r3.setTimeStamp(r4)     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = r11.getString(r6)     // Catch:{ Exception -> 0x009b }
            boolean r4 = java.lang.Boolean.parseBoolean(r4)     // Catch:{ Exception -> 0x009b }
            r3.setDeprecated(r4)     // Catch:{ Exception -> 0x009b }
            int r4 = r11.getInt(r7)     // Catch:{ Exception -> 0x009b }
            r3.setCount(r4)     // Catch:{ Exception -> 0x009b }
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = r11.getString(r8)     // Catch:{ Exception -> 0x009b }
            r4.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x009b }
            java.util.ArrayList r4 = com.instabug.library.analytics.model.Api.Parameter.fromJson((org.json.JSONArray) r4)     // Catch:{ Exception -> 0x009b }
            r3.setParameters(r4)     // Catch:{ Exception -> 0x009b }
            r1.add(r3)     // Catch:{ Exception -> 0x009b }
            boolean r3 = r11.moveToNext()     // Catch:{ Exception -> 0x009b }
            if (r3 != 0) goto L_0x0036
        L_0x0096:
            if (r11 == 0) goto L_0x00aa
            goto L_0x00a7
        L_0x0099:
            r1 = move-exception
            goto L_0x00af
        L_0x009b:
            r3 = move-exception
            java.lang.String r4 = "AnalyticsDatabaseHelper"
            java.lang.String r5 = r3.getMessage()     // Catch:{ all -> 0x0099 }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r3)     // Catch:{ all -> 0x0099 }
            if (r11 == 0) goto L_0x00aa
        L_0x00a7:
            r11.close()     // Catch:{ all -> 0x00b8 }
        L_0x00aa:
            r2.close()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)
            return r1
        L_0x00af:
            if (r11 == 0) goto L_0x00b4
            r11.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b4:
            r2.close()     // Catch:{ all -> 0x00b8 }
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.a.d.a.d():java.util.ArrayList");
    }
}
