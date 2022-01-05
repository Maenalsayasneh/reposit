package i0.j.e.r0;

import com.instabug.library.model.session.SessionLocalEntity;
import java.util.List;
import k0.b.u;

/* compiled from: SessionsLocalDataSource */
public class j implements u<List<SessionLocalEntity>> {
    /* JADX WARNING: Removed duplicated region for block: B:13:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(k0.b.s<java.util.List<com.instabug.library.model.session.SessionLocalEntity>> r31) throws java.lang.Exception {
        /*
            r30 = this;
            java.lang.String r0 = "users_page_enabled"
            java.lang.String r1 = "sync_status"
            java.lang.String r2 = "crash_reporting_enabled"
            java.lang.String r3 = "app_version"
            java.lang.String r4 = "sdk_version"
            java.lang.String r5 = "device"
            java.lang.String r6 = "os"
            java.lang.String r7 = "app_token"
            java.lang.String r8 = "uuid"
            java.lang.String r9 = "user_name"
            java.lang.String r10 = "user_email"
            java.lang.String r11 = "user_events_keys"
            java.lang.String r12 = "user_attributes_keys"
            java.lang.String r13 = "user_events"
            java.lang.String r14 = "user_attributes"
            java.lang.String r15 = "duration"
            r16 = r0
            java.lang.String r0 = "started_at"
            r17 = r1
            java.lang.String r1 = "session_id"
            r18 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.instabug.library.internal.storage.cache.db.DatabaseManager r19 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r19 = r19.openDatabase()
            r28 = r2
            r2 = 1
            r29 = r3
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r20 = 0
            r3[r20] = r2
            java.lang.String r21 = "session_table"
            r22 = 0
            java.lang.String r23 = "sync_status =? "
            r25 = 0
            r26 = 0
            r27 = 0
            r20 = r19
            r24 = r3
            android.database.Cursor r2 = r20.query(r21, r22, r23, r24, r25, r26, r27)
            if (r2 == 0) goto L_0x0179
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0171 }
            if (r3 == 0) goto L_0x0179
        L_0x0062:
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0171 }
            r3.<init>()     // Catch:{ all -> 0x0171 }
            r20 = r4
            int r4 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r1, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0171 }
            long r21 = r2.getLong(r4)     // Catch:{ all -> 0x0171 }
            java.lang.Long r4 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0171 }
            r3.put(r0, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r15)     // Catch:{ all -> 0x0171 }
            long r21 = r2.getLong(r4)     // Catch:{ all -> 0x0171 }
            java.lang.Long r4 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0171 }
            r3.put(r15, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r14)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r14, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r13)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r13, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r12)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r12, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r11)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r11, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r10)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r10, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r9)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r9, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r8)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r8, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r7)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r7, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r6)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r6, r4)     // Catch:{ all -> 0x0171 }
            int r4 = r2.getColumnIndex(r5)     // Catch:{ all -> 0x0171 }
            java.lang.String r4 = r2.getString(r4)     // Catch:{ all -> 0x0171 }
            r3.put(r5, r4)     // Catch:{ all -> 0x0171 }
            r4 = r20
            r20 = r0
            int r0 = r2.getColumnIndex(r4)     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0171 }
            r3.put(r4, r0)     // Catch:{ all -> 0x0171 }
            r21 = r1
            r0 = r29
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0171 }
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x0171 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0171 }
            r29 = r0
            r1 = r18
            int r0 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x0171 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0171 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0171 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0171 }
            r18 = r1
            r0 = r17
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0171 }
            int r1 = r2.getInt(r1)     // Catch:{ all -> 0x0171 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0171 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0171 }
            r17 = r0
            r1 = r16
            int r0 = r2.getColumnIndex(r1)     // Catch:{ all -> 0x0171 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0171 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0171 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0171 }
            com.instabug.library.model.session.SessionLocalEntity r0 = com.instabug.library.model.session.SessionMapper.toLocalEntity(r3)     // Catch:{ all -> 0x0171 }
            r3 = r28
            r3.add(r0)     // Catch:{ all -> 0x0171 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0171 }
            if (r0 != 0) goto L_0x0167
            goto L_0x017b
        L_0x0167:
            r16 = r1
            r28 = r3
            r0 = r20
            r1 = r21
            goto L_0x0062
        L_0x0171:
            r0 = move-exception
            r2.close()
            r19.close()
            throw r0
        L_0x0179:
            r3 = r28
        L_0x017b:
            if (r2 == 0) goto L_0x0180
            r2.close()
        L_0x0180:
            r19.close()
            r0 = r31
            io.reactivex.internal.operators.single.SingleCreate$Emitter r0 = (io.reactivex.internal.operators.single.SingleCreate.Emitter) r0
            r0.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.r0.j.a(k0.b.s):void");
    }
}
