package com.instabug.library.internal.storage.cache.user;

import android.content.ContentValues;
import com.instabug.library.Feature;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.l0.k.a.c.a;
import i0.j.e.t0.f;
import i0.j.e.z;

public class UserCacheManager {
    private static final Object TAG = "UserCacheManager";

    private static long getLastSeen(String str) {
        f a = a.a(str);
        if (a != null) {
            return a.c;
        }
        return 0;
    }

    public static int getUserSessionCount(String str) {
        f a = a.a(str);
        if (a != null) {
            return a.b;
        }
        return 0;
    }

    public static void insertIfNotExists(String str, int i) {
        InstabugSDKLogger.v(TAG, "insertIfNotExists ");
        if (a.a(str) == null && z.j().h(Feature.INSTABUG) == Feature.State.ENABLED) {
            insertUser(str, i);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void insertUser(java.lang.String r8, int r9) {
        /*
            java.lang.Class<i0.j.e.l0.k.a.c.a> r0 = i0.j.e.l0.k.a.c.a.class
            long r1 = getLastSeen(r8)
            monitor-enter(r0)
            java.lang.String r3 = "UserDbHelper"
            java.lang.String r4 = "insert "
            com.instabug.library.util.InstabugSDKLogger.v(r3, r4)     // Catch:{ all -> 0x00e2 }
            com.instabug.library.internal.storage.cache.db.DatabaseManager r3 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x00e2 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r3 = r3.openDatabase()     // Catch:{ all -> 0x00e2 }
            r3.beginTransaction()     // Catch:{ all -> 0x00e2 }
            java.lang.String r4 = "user"
            long r4 = r3.queryNumEntries(r4)     // Catch:{ Exception -> 0x009b }
            com.instabug.library.internal.b.f r6 = com.instabug.library.internal.b.f.USER_DATA     // Catch:{ Exception -> 0x009b }
            long r6 = r6.a()     // Catch:{ Exception -> 0x009b }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x002e
            java.lang.String r4 = "DELETE FROM user WHERE last_seen = (SELECT MIN(last_seen) FROM user)"
            r3.execSQL(r4)     // Catch:{ Exception -> 0x009b }
        L_0x002e:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x009b }
            r4.<init>()     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "session_count"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x009b }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "last_seen"
            java.lang.Long r6 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x009b }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "uuid"
            r4.put(r5, r8)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = "user"
            r6 = 0
            long r4 = r3.insertWithOnConflict(r5, r6, r4)     // Catch:{ Exception -> 0x009b }
            r6 = -1
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00bb
            monitor-enter(r0)     // Catch:{ Exception -> 0x009b }
            java.lang.String r4 = "UserDbHelper"
            java.lang.String r5 = "update "
            com.instabug.library.util.InstabugSDKLogger.v(r4, r5)     // Catch:{ all -> 0x00b8 }
            com.instabug.library.internal.storage.cache.db.DatabaseManager r4 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x00b8 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r4 = r4.openDatabase()     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = "uuid = ?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x00b8 }
            r7 = 0
            r6[r7] = r8     // Catch:{ all -> 0x00b8 }
            r4.beginTransaction()     // Catch:{ all -> 0x00b8 }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ Exception -> 0x009f }
            r8.<init>()     // Catch:{ Exception -> 0x009f }
            java.lang.String r7 = "session_count"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x009f }
            r8.put(r7, r9)     // Catch:{ Exception -> 0x009f }
            java.lang.String r9 = "last_seen"
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x009f }
            r8.put(r9, r1)     // Catch:{ Exception -> 0x009f }
            java.lang.String r9 = "user"
            r4.update(r9, r8, r5, r6)     // Catch:{ Exception -> 0x009f }
            r4.setTransactionSuccessful()     // Catch:{ Exception -> 0x009f }
            r4.endTransaction()     // Catch:{ all -> 0x00b8 }
            r4.close()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x009b }
            goto L_0x00bb
        L_0x0099:
            r8 = move-exception
            goto L_0x00db
        L_0x009b:
            r8 = move-exception
            goto L_0x00c6
        L_0x009d:
            r8 = move-exception
            goto L_0x00b1
        L_0x009f:
            r8 = move-exception
            java.lang.String r9 = "UserDbHelper"
            java.lang.String r1 = r8.getMessage()     // Catch:{ all -> 0x009d }
            com.instabug.library.util.InstabugSDKLogger.e(r9, r1, r8)     // Catch:{ all -> 0x009d }
            r4.endTransaction()     // Catch:{ all -> 0x00b8 }
            r4.close()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r0)     // Catch:{ Exception -> 0x009b }
            goto L_0x00bb
        L_0x00b1:
            r4.endTransaction()     // Catch:{ all -> 0x00b8 }
            r4.close()     // Catch:{ all -> 0x00b8 }
            throw r8     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ Exception -> 0x009b }
            throw r8     // Catch:{ Exception -> 0x009b }
        L_0x00bb:
            r3.setTransactionSuccessful()     // Catch:{ Exception -> 0x009b }
            r3.endTransaction()     // Catch:{ all -> 0x00e2 }
            r3.close()     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)
            goto L_0x00da
        L_0x00c6:
            java.lang.String r9 = "UserDbHelper"
            java.lang.Class r1 = r8.getClass()     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x0099 }
            com.instabug.library.util.InstabugSDKLogger.e(r9, r1, r8)     // Catch:{ all -> 0x0099 }
            r3.endTransaction()     // Catch:{ all -> 0x00e2 }
            r3.close()     // Catch:{ all -> 0x00e2 }
            monitor-exit(r0)
        L_0x00da:
            return
        L_0x00db:
            r3.endTransaction()     // Catch:{ all -> 0x00e2 }
            r3.close()     // Catch:{ all -> 0x00e2 }
            throw r8     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.user.UserCacheManager.insertUser(java.lang.String, int):void");
    }

    public static void updateLastSeen(String str, long j) {
        int userSessionCount = getUserSessionCount(str);
        synchronized (a.class) {
            InstabugSDKLogger.v("UserDbHelper", "update ");
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.UserEntity.COLUMN_SESSION_COUNT, Integer.valueOf(userSessionCount));
                contentValues.put(InstabugDbContract.UserEntity.COLUMN_LAST_SEEN, Long.valueOf(j));
                openDatabase.update("user", contentValues, "uuid = ?", strArr);
                openDatabase.setTransactionSuccessful();
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (Exception e) {
                try {
                    InstabugSDKLogger.e("UserDbHelper", e.getMessage(), e);
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static void updateSessionCount(String str, int i) {
        long lastSeen = getLastSeen(str);
        synchronized (a.class) {
            InstabugSDKLogger.v("UserDbHelper", "update ");
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.UserEntity.COLUMN_SESSION_COUNT, Integer.valueOf(i));
                contentValues.put(InstabugDbContract.UserEntity.COLUMN_LAST_SEEN, Long.valueOf(lastSeen));
                openDatabase.update("user", contentValues, "uuid = ?", strArr);
                openDatabase.setTransactionSuccessful();
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (Exception e) {
                try {
                    InstabugSDKLogger.e("UserDbHelper", e.getMessage(), e);
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }
}
