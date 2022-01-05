package i0.j.e.q0;

import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.Action;

/* compiled from: InstabugNetworkLogDbHelper */
public final class b implements Action {
    public final /* synthetic */ String[] a;

    public b(String[] strArr) {
        this.a = strArr;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0168, code lost:
        if (r13 == null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0188, code lost:
        if (r13 == null) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018d, code lost:
        r2.close();
        r2 = r12.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAffirmed() throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.String[] r0 = r14.a
            java.lang.Class<i0.j.e.q0.c> r1 = i0.j.e.q0.c.class
            monitor-enter(r1)
            java.lang.String r2 = "InstabugNetworkLogDbHelper"
            java.lang.String r3 = "retrieveNetworkLogs"
            com.instabug.library.util.InstabugSDKLogger.d(r2, r3)     // Catch:{ all -> 0x01a2 }
            com.instabug.library.internal.storage.cache.db.DatabaseManager r2 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x01a2 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r2 = r2.openDatabase()     // Catch:{ all -> 0x01a2 }
            org.json.JSONArray r12 = new org.json.JSONArray     // Catch:{ all -> 0x01a2 }
            r12.<init>()     // Catch:{ all -> 0x01a2 }
            r13 = 0
            java.lang.String r4 = "network_logs"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r10 = "_id DESC"
            java.lang.String r11 = "100"
            r3 = r2
            android.database.Cursor r13 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x016d }
            if (r13 == 0) goto L_0x0168
            boolean r3 = r13.moveToFirst()     // Catch:{ Exception -> 0x016d }
            if (r3 == 0) goto L_0x0168
        L_0x0032:
            com.instabug.library.model.NetworkLog r3 = new com.instabug.library.model.NetworkLog     // Catch:{ Exception -> 0x016d }
            r3.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "request"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            byte[] r5 = r13.getBlob(r4)     // Catch:{ Exception -> 0x016d }
            r6 = 500000(0x7a120, float:7.00649E-40)
            if (r5 == 0) goto L_0x0055
            byte[] r5 = r13.getBlob(r4)     // Catch:{ Exception -> 0x016d }
            int r5 = r5.length     // Catch:{ Exception -> 0x016d }
            if (r5 >= r6) goto L_0x0055
            java.lang.String r5 = r13.getString(r4)     // Catch:{ Exception -> 0x016d }
            r3.setRequest(r5)     // Catch:{ Exception -> 0x016d }
            goto L_0x0097
        L_0x0055:
            byte[] r5 = r13.getBlob(r4)     // Catch:{ Exception -> 0x016d }
            if (r5 == 0) goto L_0x0077
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
            r5.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r7 = ""
            r5.append(r7)     // Catch:{ Exception -> 0x016d }
            byte[] r7 = r13.getBlob(r4)     // Catch:{ Exception -> 0x016d }
            int r7 = r7.length     // Catch:{ Exception -> 0x016d }
            r5.append(r7)     // Catch:{ Exception -> 0x016d }
            java.lang.String r7 = " too large"
            r5.append(r7)     // Catch:{ Exception -> 0x016d }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x016d }
            goto L_0x0079
        L_0x0077:
            java.lang.String r5 = "null"
        L_0x0079:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
            r7.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r8 = "Request body blob status ["
            r7.append(r8)     // Catch:{ Exception -> 0x016d }
            r7.append(r5)     // Catch:{ Exception -> 0x016d }
            java.lang.String r5 = "]"
            r7.append(r5)     // Catch:{ Exception -> 0x016d }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x016d }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r5)     // Catch:{ Exception -> 0x016d }
            java.lang.String r5 = "{\"InstabugNetworkLog Error\":\"Response body exceeded limit\"}"
            r3.setRequest(r5)     // Catch:{ Exception -> 0x016d }
        L_0x0097:
            java.lang.String r5 = "response"
            int r5 = r13.getColumnIndex(r5)     // Catch:{ Exception -> 0x016d }
            byte[] r7 = r13.getBlob(r5)     // Catch:{ Exception -> 0x016d }
            if (r7 == 0) goto L_0x00b2
            byte[] r7 = r13.getBlob(r5)     // Catch:{ Exception -> 0x016d }
            int r7 = r7.length     // Catch:{ Exception -> 0x016d }
            if (r7 >= r6) goto L_0x00b2
            java.lang.String r4 = r13.getString(r5)     // Catch:{ Exception -> 0x016d }
            r3.setResponse(r4)     // Catch:{ Exception -> 0x016d }
            goto L_0x00f4
        L_0x00b2:
            byte[] r5 = r13.getBlob(r4)     // Catch:{ Exception -> 0x016d }
            if (r5 == 0) goto L_0x00d4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
            r5.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r6 = ""
            r5.append(r6)     // Catch:{ Exception -> 0x016d }
            byte[] r4 = r13.getBlob(r4)     // Catch:{ Exception -> 0x016d }
            int r4 = r4.length     // Catch:{ Exception -> 0x016d }
            r5.append(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = " too large"
            r5.append(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x016d }
            goto L_0x00d6
        L_0x00d4:
            java.lang.String r4 = "null"
        L_0x00d6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016d }
            r5.<init>()     // Catch:{ Exception -> 0x016d }
            java.lang.String r6 = "Request body blob status ["
            r5.append(r6)     // Catch:{ Exception -> 0x016d }
            r5.append(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "]"
            r5.append(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x016d }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "{\"InstabugNetworkLog Error\":\"Response body exceeded limit\"}"
            r3.setRequest(r4)     // Catch:{ Exception -> 0x016d }
        L_0x00f4:
            java.lang.String r4 = "method"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x016d }
            r3.setMethod(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "url"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x016d }
            r3.setUrl(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "status"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            int r4 = r13.getInt(r4)     // Catch:{ Exception -> 0x016d }
            r3.setResponseCode(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "date"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x016d }
            r3.setDate(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "headers"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x016d }
            r3.setRequestHeaders(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "response_headers"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x016d }
            r3.setResponseHeaders(r4)     // Catch:{ Exception -> 0x016d }
            java.lang.String r4 = "response_time"
            int r4 = r13.getColumnIndex(r4)     // Catch:{ Exception -> 0x016d }
            int r4 = r13.getInt(r4)     // Catch:{ Exception -> 0x016d }
            long r4 = (long) r4     // Catch:{ Exception -> 0x016d }
            r3.setTotalDuration(r4)     // Catch:{ Exception -> 0x016d }
            org.json.JSONObject r3 = r3.toJsonObject()     // Catch:{ Exception -> 0x0158 }
            r12.put((java.lang.Object) r3)     // Catch:{ Exception -> 0x0158 }
            goto L_0x0162
        L_0x0158:
            r3 = move-exception
            java.lang.String r4 = "InstabugNetworkLogDbHelper"
            java.lang.String r5 = r3.getMessage()     // Catch:{ Exception -> 0x016d }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r3)     // Catch:{ Exception -> 0x016d }
        L_0x0162:
            boolean r3 = r13.moveToNext()     // Catch:{ Exception -> 0x016d }
            if (r3 != 0) goto L_0x0032
        L_0x0168:
            if (r13 == 0) goto L_0x018d
            goto L_0x018a
        L_0x016b:
            r0 = move-exception
            goto L_0x0199
        L_0x016d:
            r3 = move-exception
            java.lang.String r4 = "InstabugNetworkLogDbHelper"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x016b }
            r5.<init>()     // Catch:{ all -> 0x016b }
            java.lang.String r6 = "Failed to get NetworkLogs type due to: "
            r5.append(r6)     // Catch:{ all -> 0x016b }
            java.lang.String r6 = r3.getMessage()     // Catch:{ all -> 0x016b }
            r5.append(r6)     // Catch:{ all -> 0x016b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x016b }
            com.instabug.library.util.InstabugSDKLogger.e(r4, r5, r3)     // Catch:{ all -> 0x016b }
            if (r13 == 0) goto L_0x018d
        L_0x018a:
            r13.close()     // Catch:{ all -> 0x01a2 }
        L_0x018d:
            r2.close()     // Catch:{ all -> 0x01a2 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x01a2 }
            monitor-exit(r1)
            r1 = 0
            r0[r1] = r2
            return
        L_0x0199:
            if (r13 == 0) goto L_0x019e
            r13.close()     // Catch:{ all -> 0x01a2 }
        L_0x019e:
            r2.close()     // Catch:{ all -> 0x01a2 }
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.q0.b.onAffirmed():void");
    }

    public void onDenied() throws Throwable {
        InstabugSDKLogger.e("InstabugNetworkLogDbHelper", "Not enough memory for retrieving network logs");
    }
}
