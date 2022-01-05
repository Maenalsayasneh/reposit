package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;

/* compiled from: MigrateAnonymousUserEventsAction */
public class h implements Action {
    public final String a;

    public h(String str) {
        this.a = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() throws java.lang.Exception {
        /*
            r23 = this;
            r1 = r23
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r10 = r0.openDatabase()
            java.lang.String r0 = "event_identifier"
            java.lang.String r11 = "event_logging_count"
            java.lang.String[] r4 = new java.lang.String[]{r0, r11}
            java.lang.String r5 = "is_anonymous = ? "
            java.lang.String r12 = "1"
            java.lang.String[] r6 = new java.lang.String[]{r12}
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r14 = 0
            java.lang.String r3 = "user_events_logs"
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00fc }
            if (r2 == 0) goto L_0x0054
            int r3 = r2.getCount()     // Catch:{ all -> 0x0050 }
            if (r3 <= 0) goto L_0x0054
            int r0 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0050 }
            int r3 = r2.getColumnIndex(r11)     // Catch:{ all -> 0x0050 }
        L_0x003a:
            boolean r4 = r2.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x0054
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x0050 }
            int r5 = r2.getInt(r3)     // Catch:{ all -> 0x0050 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0050 }
            r13.put(r4, r5)     // Catch:{ all -> 0x0050 }
            goto L_0x003a
        L_0x0050:
            r0 = move-exception
            r14 = r2
            goto L_0x00fd
        L_0x0054:
            if (r2 == 0) goto L_0x0059
            r2.close()
        L_0x0059:
            r10.close()
            java.util.Set r0 = r13.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0064:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.String r4 = r1.a
            com.instabug.library.internal.storage.cache.db.DatabaseManager r5 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r5 = r5.openDatabase()
            java.lang.String[] r17 = new java.lang.String[]{r11}
            java.lang.String r18 = "event_identifier = ? AND uuid = ? "
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]
            r7 = 0
            r6[r7] = r3
            r8 = 1
            r6[r8] = r4
            java.lang.String r16 = "user_events_logs"
            r20 = 0
            r21 = 0
            r22 = 0
            r15 = r5
            r19 = r6
            android.database.Cursor r4 = r15.query(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x00b5
            int r6 = r4.getCount()     // Catch:{ all -> 0x00b2 }
            if (r6 <= 0) goto L_0x00b5
            r7 = r8
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            r14 = r4
            goto L_0x00cb
        L_0x00b5:
            if (r4 == 0) goto L_0x00ba
            r4.close()
        L_0x00ba:
            r5.close()
            if (r7 != 0) goto L_0x0064
            java.lang.String r4 = r1.a
            boolean r5 = i0.j.e.c1.b.G()
            r5 = r5 ^ r8
            i0.j.c.l.a.d(r3, r2, r4, r5)
            goto L_0x0064
        L_0x00ca:
            r0 = move-exception
        L_0x00cb:
            if (r14 == 0) goto L_0x00d0
            r14.close()
        L_0x00d0:
            r5.close()
            throw r0
        L_0x00d4:
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r2 = r0.openDatabase()
            java.lang.String r0 = "is_anonymous = ? "
            java.lang.String[] r3 = new java.lang.String[]{r12}
            r2.beginTransaction()     // Catch:{ all -> 0x00f4 }
            java.lang.String r4 = "user_events_logs"
            r2.delete(r4, r0, r3)     // Catch:{ all -> 0x00f4 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x00f4 }
            r2.endTransaction()
            r2.close()
            return
        L_0x00f4:
            r0 = move-exception
            r2.endTransaction()
            r2.close()
            throw r0
        L_0x00fc:
            r0 = move-exception
        L_0x00fd:
            if (r14 == 0) goto L_0x0102
            r14.close()
        L_0x0102:
            r10.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.l0.j.h.run():void");
    }
}
