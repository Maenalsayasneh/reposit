package com.instabug.library.internal.storage.cache.db.userAttribute;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.model.UserAttributes;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.filters.Filters;
import i0.d.a.a.a;
import i0.j.e.d1.d.b;
import i0.j.e.t0.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class UserAttributesDbHelper {
    private static final String TAG = "UserAttributesDbHelper";

    public static synchronized void delete(String str, String str2) {
        synchronized (UserAttributesDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str, str2};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.UserAttributesEntry.TABLE_NAME, "key = ? AND uuid =?", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static synchronized void deleteAll() {
        synchronized (UserAttributesDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.UserAttributesEntry.TABLE_NAME, (String) null, (String[]) null);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static void deleteAnonymousData() {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        String[] strArr = {"1"};
        openDatabase.beginTransaction();
        try {
            openDatabase.delete(InstabugDbContract.UserAttributesEntry.TABLE_NAME, "is_anonymous = ?", strArr);
            openDatabase.setTransactionSuccessful();
        } finally {
            openDatabase.endTransaction();
            openDatabase.close();
        }
    }

    public static synchronized void deleteType(String str, int i) {
        synchronized (UserAttributesDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(i), str};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.UserAttributesEntry.TABLE_NAME, "type = ? AND uuid =?", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static synchronized void deleteUserAttributes(String str) {
        synchronized (UserAttributesDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.UserAttributesEntry.TABLE_NAME, "uuid = ?", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static HashMap<String, String> getAll() {
        return UserAttributeCacheManager.retrieveAll();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    private static ContentValues getContentValue(g gVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(InstabugDbContract.UserAttributesEntry.COLUMN_KEY, gVar.b);
        contentValues.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, gVar.c);
        contentValues.put("uuid", gVar.d);
        contentValues.put("type", Integer.valueOf(gVar.a));
        contentValues.put("is_anonymous", Boolean.valueOf(gVar.e));
        return contentValues;
    }

    public static String getSDKUserAttributes() {
        HashMap hashMap = (HashMap) Filters.applyOn(getAll()).apply(new b()).thenGet();
        if (hashMap == null || hashMap.size() == 0) {
            return "{}";
        }
        UserAttributes userAttributes = new UserAttributes();
        userAttributes.putMap(hashMap);
        return userAttributes.toString();
    }

    public static String getSDKUserAttributesAndAppendToIt(String str, String str2) {
        HashMap hashMap = (HashMap) Filters.applyOn(getAll()).apply(new b()).thenGet();
        if (hashMap != null) {
            if (str != null && !str.trim().isEmpty() && str2 != null && !str2.trim().isEmpty()) {
                hashMap.put(str.trim(), str2.trim());
            }
            if (hashMap.size() != 0) {
                UserAttributes userAttributes = new UserAttributes();
                userAttributes.putMap(hashMap);
                return userAttributes.toString();
            }
        }
        return "{}";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r10 == null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r10 != null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getType(java.lang.String r10, java.lang.String r11) {
        /*
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()
            java.lang.String r9 = "type"
            java.lang.String[] r3 = new java.lang.String[]{r9}
            java.lang.String r4 = "key LIKE ? AND uuid =? "
            r1 = 2
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r1 = "%"
            java.lang.String r10 = i0.d.a.a.a.o0(r1, r10, r1)
            r1 = 0
            r5[r1] = r10
            r10 = 1
            r5[r10] = r11
            r10 = 0
            r11 = -1
            java.lang.String r2 = "user_attributes_table"
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0043 }
            if (r10 == 0) goto L_0x003e
            int r1 = r10.getCount()     // Catch:{ Exception -> 0x0043 }
            if (r1 <= 0) goto L_0x003e
            r10.moveToFirst()     // Catch:{ Exception -> 0x0043 }
            int r1 = r10.getColumnIndex(r9)     // Catch:{ Exception -> 0x0043 }
            int r11 = r10.getInt(r1)     // Catch:{ Exception -> 0x0043 }
        L_0x003e:
            if (r10 == 0) goto L_0x0061
            goto L_0x005e
        L_0x0041:
            r11 = move-exception
            goto L_0x0065
        L_0x0043:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0041 }
            r2.<init>()     // Catch:{ all -> 0x0041 }
            java.lang.String r3 = "Failed to get UserAttribute type due to: "
            r2.append(r3)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0041 }
            r2.append(r1)     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0041 }
            com.instabug.library.logging.InstabugLog.e(r1)     // Catch:{ all -> 0x0041 }
            if (r10 == 0) goto L_0x0061
        L_0x005e:
            r10.close()
        L_0x0061:
            r0.close()
            return r11
        L_0x0065:
            if (r10 == 0) goto L_0x006a
            r10.close()
        L_0x006a:
            r0.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper.getType(java.lang.String, java.lang.String):int");
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static synchronized long insert(g gVar) {
        long insertWithOnConflict;
        synchronized (UserAttributesDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                insertWithOnConflict = openDatabase.insertWithOnConflict(InstabugDbContract.UserAttributesEntry.TABLE_NAME, (String) null, getContentValue(gVar));
                if (insertWithOnConflict == -1) {
                    update(gVar);
                }
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        return insertWithOnConflict;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static void insertBulk(List<g> list) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        openDatabase.beginTransaction();
        try {
            for (g next : list) {
                if (openDatabase.insertWithOnConflict(InstabugDbContract.UserAttributesEntry.TABLE_NAME, (String) null, getContentValue(next)) == -1) {
                    update(next);
                }
            }
            openDatabase.setTransactionSuccessful();
        } finally {
            openDatabase.endTransaction();
            openDatabase.close();
        }
    }

    public static String retrieve(String str, String str2) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.UserAttributesEntry.TABLE_NAME, new String[]{InstabugDbContract.UserAttributesEntry.COLUMN_VALUE}, "key LIKE ? AND uuid =? ", new String[]{a.o0("%", str, "%"), str2}, (String) null, (String) null, (String) null);
        if (query == null) {
            return null;
        }
        int columnIndex = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        try {
            if (!query.moveToFirst()) {
                return null;
            }
            String string = query.getString(columnIndex);
            query.close();
            openDatabase.close();
            return string;
        } finally {
            query.close();
            openDatabase.close();
        }
    }

    public static HashMap<String, String> retrieveAll(String str) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.UserAttributesEntry.TABLE_NAME, new String[]{InstabugDbContract.UserAttributesEntry.COLUMN_KEY, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE}, "uuid =? ", new String[]{str}, (String) null, (String) null, (String) null);
        if (query != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            int columnIndex = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            int columnIndex2 = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            try {
                if (!query.moveToFirst()) {
                    return hashMap;
                }
                do {
                    hashMap.put(query.getString(columnIndex), query.getString(columnIndex2));
                } while (query.moveToNext());
                query.close();
                openDatabase.close();
                return hashMap;
            } catch (Exception e) {
                InstabugSDKLogger.e(TAG, "an exception has occurred while retrieving user attributes", e);
            } finally {
                query.close();
                openDatabase.close();
            }
        }
        return new HashMap<>();
    }

    public static HashMap<String, String> retrieveAllSDKAttributes(String str) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.UserAttributesEntry.TABLE_NAME, new String[]{InstabugDbContract.UserAttributesEntry.COLUMN_KEY, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE}, "uuid =?  AND type = 0", new String[]{str}, (String) null, (String) null, (String) null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            int columnIndex2 = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            try {
                HashMap<String, String> hashMap = new HashMap<>();
                if (!query.moveToFirst()) {
                    return hashMap;
                }
                do {
                    hashMap.put(query.getString(columnIndex), query.getString(columnIndex2));
                } while (query.moveToNext());
                query.close();
                openDatabase.close();
                return hashMap;
            } catch (Exception e) {
                InstabugSDKLogger.e(TAG, "an exception has occurred while retrieving user attributes", e);
            } finally {
                query.close();
                openDatabase.close();
            }
        }
        return new HashMap<>();
    }

    public static List<g> retrieveAnonymousUserAttribute() {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.UserAttributesEntry.TABLE_NAME, (String[]) null, "is_anonymous=? ", new String[]{"1"}, (String) null, (String) null, (String) null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            int columnIndex2 = query.getColumnIndex(InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            int columnIndex3 = query.getColumnIndex("uuid");
            int columnIndex4 = query.getColumnIndex("type");
            try {
                ArrayList arrayList = new ArrayList();
                if (!query.moveToFirst()) {
                    return arrayList;
                }
                do {
                    arrayList.add(new g(query.getString(columnIndex2), query.getString(columnIndex), query.getString(columnIndex3), true, query.getInt(columnIndex4), (g.a) null));
                } while (query.moveToNext());
                query.close();
                openDatabase.close();
                return arrayList;
            } catch (Exception e) {
                InstabugSDKLogger.e(TAG, "an exception has occurred while retrieving user attributes", e);
            } finally {
                query.close();
                openDatabase.close();
            }
        }
        return Collections.emptyList();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    private static synchronized long update(g gVar) {
        long update;
        synchronized (UserAttributesDbHelper.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {gVar.b, gVar.d};
            openDatabase.beginTransaction();
            try {
                update = (long) openDatabase.update(InstabugDbContract.UserAttributesEntry.TABLE_NAME, getContentValue(gVar), "key = ? AND uuid=?", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        return update;
    }
}
