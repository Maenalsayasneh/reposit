package com.instabug.survey.announcements.cache;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.f.c.f;
import com.instabug.survey.f.c.g;
import com.instabug.survey.f.c.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class AnnouncementCacheManager {

    public static class a implements Runnable {
        public final /* synthetic */ com.instabug.survey.e.c.a c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean q;

        public a(com.instabug.survey.e.c.a aVar, boolean z, boolean z2) {
            this.c = aVar;
            this.d = z;
            this.q = z2;
        }

        public void run() {
            com.instabug.survey.e.c.a aVar = this.c;
            boolean z = this.d;
            boolean z2 = this.q;
            Class<i0.j.f.b.a.a> cls = i0.j.f.b.a.a.class;
            synchronized (cls) {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                try {
                    openDatabase.beginTransaction();
                    if (openDatabase.insertWithOnConflict(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String) null, i0.j.f.b.a.a.b(aVar)) == -1) {
                        if (z) {
                            i0.j.f.b.a.a.d(openDatabase, aVar);
                        }
                        if (z2) {
                            i0.j.f.b.a.a.f(openDatabase, aVar);
                        }
                    }
                    openDatabase.setTransactionSuccessful();
                    InstabugSDKLogger.d(cls, "announcement id: " + aVar.c + " has been added to " + InstabugDbContract.AnnouncementEntry.TABLE_NAME);
                    openDatabase.endTransaction();
                    openDatabase.close();
                } catch (JSONException e) {
                    try {
                        InstabugSDKLogger.e(cls, "announcement insertion failed due to " + e.getMessage());
                    } finally {
                        openDatabase.endTransaction();
                        openDatabase.close();
                    }
                }
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ com.instabug.survey.e.c.a c;

        public b(com.instabug.survey.e.c.a aVar) {
            this.c = aVar;
        }

        public void run() {
            i0.j.f.b.a.a.h(this.c);
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ List c;

        public c(List list) {
            this.c = list;
        }

        public void run() {
            i0.j.f.b.a.a.e(this.c);
        }
    }

    public static void addAnnouncement(com.instabug.survey.e.c.a aVar) {
        Class<i0.j.f.b.a.a> cls = i0.j.f.b.a.a.class;
        synchronized (cls) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                if (openDatabase.insertWithOnConflict(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String) null, i0.j.f.b.a.a.b(aVar)) == -1) {
                    i0.j.f.b.a.a.h(aVar);
                }
                openDatabase.setTransactionSuccessful();
                InstabugSDKLogger.d(cls, "announcement id: " + aVar.c + " has been added to " + InstabugDbContract.AnnouncementEntry.TABLE_NAME);
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (JSONException e) {
                try {
                    InstabugSDKLogger.e(cls, "announcement insertion failed due to " + e.getMessage());
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static void addAnnouncements(List<com.instabug.survey.e.c.a> list) {
        for (com.instabug.survey.e.c.a next : list) {
            if (!isAnnouncementExist(next.c)) {
                addAnnouncement(next);
            }
        }
    }

    public static void deleteAllAnnouncement() {
        synchronized (i0.j.f.b.a.a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                openDatabase.delete(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String) null, (String[]) null);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static void deleteAnnouncement(String str) {
        synchronized (i0.j.f.b.a.a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.AnnouncementEntry.TABLE_NAME, "announcement_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static void deleteAnnouncementAssets() {
        synchronized (i0.j.e.c1.b.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                openDatabase.delete(InstabugDbContract.AnnouncementAssetsEntry.TABLE_NAME, (String) null, (String[]) null);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static List<com.instabug.survey.e.c.a> getAllAnnouncement() {
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper;
        Class<i0.j.f.b.a.a> cls;
        Class<i0.j.f.b.a.a> cls2 = i0.j.f.b.a.a.class;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query == null) {
            return new ArrayList();
        }
        int columnIndex = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ID);
        int columnIndex2 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_TYPE);
        int columnIndex3 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_TITLE);
        int columnIndex4 = query.getColumnIndex("conditions_operator");
        int columnIndex5 = query.getColumnIndex("answered");
        int columnIndex6 = query.getColumnIndex("dismissed_at");
        int columnIndex7 = query.getColumnIndex("shown_at");
        int columnIndex8 = query.getColumnIndex("isCancelled");
        int columnIndex9 = query.getColumnIndex("eventIndex");
        int columnIndex10 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_IS_SHOWN);
        int columnIndex11 = query.getColumnIndex("paused");
        int columnIndex12 = query.getColumnIndex("targetAudiences");
        int columnIndex13 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT);
        Class<i0.j.f.b.a.a> cls3 = cls2;
        int columnIndex14 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ASSETS_STATUS);
        int columnIndex15 = query.getColumnIndex("supportedLocales");
        int columnIndex16 = query.getColumnIndex("isLocalized");
        int columnIndex17 = query.getColumnIndex("currentLocale");
        try {
            if (!query.moveToFirst()) {
                query.close();
                ArrayList arrayList = new ArrayList();
                query.close();
                openDatabase.close();
                return arrayList;
            }
            sQLiteDatabaseWrapper = openDatabase;
            try {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    Long valueOf = Long.valueOf(query.getLong(columnIndex));
                    int i = columnIndex;
                    String string = query.getString(columnIndex3);
                    int i2 = columnIndex3;
                    int i3 = query.getInt(columnIndex2);
                    int i4 = columnIndex2;
                    String string2 = query.getString(columnIndex4);
                    int i5 = columnIndex4;
                    int i6 = query.getInt(columnIndex5);
                    int i7 = columnIndex5;
                    int i8 = query.getInt(columnIndex6);
                    int i9 = columnIndex6;
                    int i10 = query.getInt(columnIndex7);
                    int i11 = columnIndex7;
                    int i12 = query.getInt(columnIndex8);
                    int i13 = columnIndex8;
                    int i14 = query.getInt(columnIndex9);
                    int i15 = columnIndex9;
                    int i16 = query.getInt(columnIndex10);
                    int i17 = columnIndex10;
                    int i18 = query.getInt(columnIndex11);
                    int i19 = columnIndex11;
                    String string3 = query.getString(columnIndex12);
                    int i20 = columnIndex12;
                    String string4 = query.getString(columnIndex13);
                    int i21 = columnIndex13;
                    int i22 = columnIndex14;
                    ArrayList arrayList3 = arrayList2;
                    int i23 = query.getInt(i22);
                    int i24 = i22;
                    int i25 = columnIndex15;
                    String str = string3;
                    String string5 = query.getString(i25);
                    int i26 = i25;
                    int i27 = columnIndex16;
                    String str2 = string5;
                    int i28 = query.getInt(i27);
                    int i29 = i27;
                    String string6 = query.getString(columnIndex17);
                    int i30 = columnIndex17;
                    com.instabug.survey.e.c.a aVar = new com.instabug.survey.e.c.a();
                    int i31 = i28;
                    String str3 = string4;
                    aVar.c = valueOf.longValue();
                    aVar.q = i3;
                    aVar.d = string;
                    aVar.a(string2);
                    boolean z = false;
                    boolean z2 = i6 == 1;
                    i iVar = aVar.a2;
                    iVar.y = z2;
                    iVar.Y1 = (long) i8;
                    iVar.Z1 = (long) i10;
                    iVar.a2 = i12 == 1;
                    iVar.c2 = i14;
                    iVar.d2 = i16 == 1;
                    aVar.y = i18 == 1;
                    aVar.x = com.instabug.survey.e.c.c.a(new JSONArray(str3));
                    aVar.Y1 = i23;
                    aVar.Z1.a(new JSONArray(str2));
                    com.instabug.survey.f.c.b bVar = aVar.Z1;
                    bVar.q = string6;
                    if (i31 == 1) {
                        z = true;
                    }
                    bVar.c = z;
                    g gVar = new g();
                    gVar.fromJson(str);
                    aVar.a2.q = gVar;
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(aVar);
                    if (!query.moveToNext()) {
                        cls = cls3;
                        try {
                            InstabugSDKLogger.d(cls, arrayList4.size() + " announcements have been retrieved from " + InstabugDbContract.AnnouncementEntry.TABLE_NAME);
                            query.close();
                            sQLiteDatabaseWrapper.close();
                            return arrayList4;
                        } catch (JSONException e) {
                            e = e;
                            try {
                                InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
                                ArrayList arrayList5 = new ArrayList();
                                query.close();
                                sQLiteDatabaseWrapper.close();
                                return arrayList5;
                            } catch (Throwable th) {
                                th = th;
                                query.close();
                                sQLiteDatabaseWrapper.close();
                                throw th;
                            }
                        }
                    } else {
                        arrayList2 = arrayList4;
                        columnIndex = i;
                        columnIndex3 = i2;
                        columnIndex2 = i4;
                        columnIndex4 = i5;
                        columnIndex5 = i7;
                        columnIndex6 = i9;
                        columnIndex7 = i11;
                        columnIndex8 = i13;
                        columnIndex9 = i15;
                        columnIndex10 = i17;
                        columnIndex11 = i19;
                        columnIndex12 = i20;
                        columnIndex13 = i21;
                        columnIndex14 = i24;
                        columnIndex15 = i26;
                        columnIndex16 = i29;
                        columnIndex17 = i30;
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                cls = cls3;
                InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
                ArrayList arrayList52 = new ArrayList();
                query.close();
                sQLiteDatabaseWrapper.close();
                return arrayList52;
            }
        } catch (JSONException e3) {
            e = e3;
            sQLiteDatabaseWrapper = openDatabase;
            cls = cls3;
            InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
            ArrayList arrayList522 = new ArrayList();
            query.close();
            sQLiteDatabaseWrapper.close();
            return arrayList522;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseWrapper = openDatabase;
            query.close();
            sQLiteDatabaseWrapper.close();
            throw th;
        }
    }

    public static com.instabug.survey.e.c.a getAnnouncement(long j) {
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper;
        Cursor cursor;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String[]) null, "announcement_id=? ", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
        if (query != null) {
            int columnIndex = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ID);
            int columnIndex2 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_TYPE);
            int columnIndex3 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_TITLE);
            int columnIndex4 = query.getColumnIndex("conditions_operator");
            int columnIndex5 = query.getColumnIndex("answered");
            int columnIndex6 = query.getColumnIndex("dismissed_at");
            int columnIndex7 = query.getColumnIndex("shown_at");
            int columnIndex8 = query.getColumnIndex("isCancelled");
            int columnIndex9 = query.getColumnIndex("eventIndex");
            int columnIndex10 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_IS_SHOWN);
            int columnIndex11 = query.getColumnIndex("paused");
            int columnIndex12 = query.getColumnIndex("targetAudiences");
            int columnIndex13 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT);
            int columnIndex14 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ASSETS_STATUS);
            int columnIndex15 = query.getColumnIndex("supportedLocales");
            int columnIndex16 = query.getColumnIndex("isLocalized");
            int columnIndex17 = query.getColumnIndex("currentLocale");
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    query.close();
                    openDatabase.close();
                } else {
                    Long valueOf = Long.valueOf(query.getLong(columnIndex));
                    String string = query.getString(columnIndex3);
                    int i = query.getInt(columnIndex2);
                    String string2 = query.getString(columnIndex4);
                    int i2 = query.getInt(columnIndex5);
                    int i3 = query.getInt(columnIndex6);
                    int i4 = query.getInt(columnIndex7);
                    int i5 = query.getInt(columnIndex8);
                    int i6 = query.getInt(columnIndex9);
                    int i7 = query.getInt(columnIndex10);
                    int i8 = query.getInt(columnIndex11);
                    String string3 = query.getString(columnIndex12);
                    String string4 = query.getString(columnIndex13);
                    sQLiteDatabaseWrapper = openDatabase;
                    try {
                        int i9 = query.getInt(columnIndex14);
                        String str = string3;
                        String string5 = query.getString(columnIndex15);
                        int i10 = query.getInt(columnIndex16);
                        String string6 = query.getString(columnIndex17);
                        cursor = query;
                        try {
                            com.instabug.survey.e.c.a aVar = new com.instabug.survey.e.c.a();
                            int i11 = i10;
                            aVar.c = valueOf.longValue();
                            aVar.q = i;
                            aVar.d = string;
                            aVar.a(string2);
                            boolean z = i2 == 1;
                            i iVar = aVar.a2;
                            iVar.y = z;
                            iVar.Y1 = (long) i3;
                            iVar.Z1 = (long) i4;
                            iVar.a2 = i5 == 1;
                            iVar.c2 = i6;
                            iVar.d2 = i7 == 1;
                            aVar.y = i8 == 1;
                            aVar.x = com.instabug.survey.e.c.c.a(new JSONArray(string4));
                            aVar.Y1 = i9;
                            aVar.Z1.a(new JSONArray(string5));
                            com.instabug.survey.f.c.b bVar = aVar.Z1;
                            bVar.q = string6;
                            bVar.c = i11 == 1;
                            g gVar = new g();
                            gVar.fromJson(str);
                            aVar.a2.q = gVar;
                            cursor.close();
                            sQLiteDatabaseWrapper.close();
                            return aVar;
                        } catch (JSONException e) {
                            e = e;
                            Class<i0.j.f.b.a.a> cls = i0.j.f.b.a.a.class;
                            try {
                                InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
                                cursor.close();
                                sQLiteDatabaseWrapper.close();
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                cursor.close();
                                sQLiteDatabaseWrapper.close();
                                throw th;
                            }
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        cursor = query;
                        Class<i0.j.f.b.a.a> cls2 = i0.j.f.b.a.a.class;
                        InstabugSDKLogger.e(cls2, "announcement conversion failed due to " + e.getMessage());
                        cursor.close();
                        sQLiteDatabaseWrapper.close();
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        cursor.close();
                        sQLiteDatabaseWrapper.close();
                        throw th;
                    }
                }
            } catch (JSONException e3) {
                e = e3;
                cursor = query;
                sQLiteDatabaseWrapper = openDatabase;
                Class<i0.j.f.b.a.a> cls22 = i0.j.f.b.a.a.class;
                InstabugSDKLogger.e(cls22, "announcement conversion failed due to " + e.getMessage());
                cursor.close();
                sQLiteDatabaseWrapper.close();
                return null;
            } catch (Throwable th3) {
                th = th3;
                cursor = query;
                sQLiteDatabaseWrapper = openDatabase;
                cursor.close();
                sQLiteDatabaseWrapper.close();
                throw th;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        if (r11 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007f, code lost:
        if (r11 != null) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0081, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getAnnouncementAsset(long r10, long r12) {
        /*
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()
            java.lang.String r4 = "asset_id=?  AND announcement_item_id=? "
            r1 = 2
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r1 = java.lang.String.valueOf(r12)
            r2 = 0
            r5[r2] = r1
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r11 = 1
            r5[r11] = r10
            r10 = 0
            java.lang.String r2 = "announcement_assets_table"
            r3 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0073, all -> 0x0071 }
            if (r11 == 0) goto L_0x006e
            boolean r1 = r11.moveToFirst()     // Catch:{ Exception -> 0x006c }
            if (r1 != 0) goto L_0x0036
            r11.close()
            r0.close()
            goto L_0x0087
        L_0x0036:
            java.lang.String r1 = "asset_path"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x006c }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x006c }
            if (r1 == 0) goto L_0x0062
            java.lang.Class<i0.j.f.b.a.a> r2 = i0.j.f.b.a.a.class
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006c }
            r3.<init>()     // Catch:{ Exception -> 0x006c }
            java.lang.String r4 = "Feature with id"
            r3.append(r4)     // Catch:{ Exception -> 0x006c }
            r3.append(r12)     // Catch:{ Exception -> 0x006c }
            java.lang.String r12 = " assets retrieved from "
            r3.append(r12)     // Catch:{ Exception -> 0x006c }
            java.lang.String r12 = "announcement_table"
            r3.append(r12)     // Catch:{ Exception -> 0x006c }
            java.lang.String r12 = r3.toString()     // Catch:{ Exception -> 0x006c }
            com.instabug.library.util.InstabugSDKLogger.d(r2, r12)     // Catch:{ Exception -> 0x006c }
        L_0x0062:
            r11.close()
            r0.close()
            r10 = r1
            goto L_0x0087
        L_0x006a:
            r10 = move-exception
            goto L_0x0088
        L_0x006c:
            r12 = move-exception
            goto L_0x0076
        L_0x006e:
            if (r11 == 0) goto L_0x0084
            goto L_0x0081
        L_0x0071:
            r11 = move-exception
            goto L_0x008b
        L_0x0073:
            r11 = move-exception
            r12 = r11
            r11 = r10
        L_0x0076:
            java.lang.String r13 = "AnnouncementAssetsDBHelper"
            java.lang.String r1 = r12.getMessage()     // Catch:{ all -> 0x006a }
            com.instabug.library.util.InstabugSDKLogger.e(r13, r1, r12)     // Catch:{ all -> 0x006a }
            if (r11 == 0) goto L_0x0084
        L_0x0081:
            r11.close()
        L_0x0084:
            r0.close()
        L_0x0087:
            return r10
        L_0x0088:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x008b:
            if (r10 == 0) goto L_0x0090
            r10.close()
        L_0x0090:
            r0.close()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.announcements.cache.AnnouncementCacheManager.getAnnouncementAsset(long, long):java.lang.String");
    }

    public static List<com.instabug.survey.e.c.a> getAnnouncementsByType(int i) {
        return i0.j.f.b.a.a.c(i);
    }

    public static List<com.instabug.survey.e.c.a> getReadyToBeSend() {
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper;
        Class<i0.j.f.b.a.a> cls;
        Class<i0.j.f.b.a.a> cls2 = i0.j.f.b.a.a.class;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String[]) null, "surveyState=? ", new String[]{f.READY_TO_SEND.toString()}, (String) null, (String) null, (String) null);
        if (query == null) {
            return new ArrayList();
        }
        int columnIndex = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ID);
        int columnIndex2 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_TYPE);
        int columnIndex3 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_TITLE);
        int columnIndex4 = query.getColumnIndex("conditions_operator");
        int columnIndex5 = query.getColumnIndex("answered");
        int columnIndex6 = query.getColumnIndex("dismissed_at");
        int columnIndex7 = query.getColumnIndex("shown_at");
        int columnIndex8 = query.getColumnIndex("isCancelled");
        int columnIndex9 = query.getColumnIndex("eventIndex");
        int columnIndex10 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_IS_SHOWN);
        int columnIndex11 = query.getColumnIndex("paused");
        int columnIndex12 = query.getColumnIndex("targetAudiences");
        int columnIndex13 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT);
        Class<i0.j.f.b.a.a> cls3 = cls2;
        int columnIndex14 = query.getColumnIndex(InstabugDbContract.AnnouncementEntry.COLUMN_ASSETS_STATUS);
        int columnIndex15 = query.getColumnIndex("supportedLocales");
        int columnIndex16 = query.getColumnIndex("isLocalized");
        int columnIndex17 = query.getColumnIndex("currentLocale");
        try {
            if (!query.moveToFirst()) {
                query.close();
                ArrayList arrayList = new ArrayList();
                query.close();
                openDatabase.close();
                return arrayList;
            }
            sQLiteDatabaseWrapper = openDatabase;
            try {
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    Long valueOf = Long.valueOf(query.getLong(columnIndex));
                    int i = columnIndex;
                    String string = query.getString(columnIndex3);
                    int i2 = columnIndex3;
                    int i3 = query.getInt(columnIndex2);
                    int i4 = columnIndex2;
                    String string2 = query.getString(columnIndex4);
                    int i5 = columnIndex4;
                    int i6 = query.getInt(columnIndex5);
                    int i7 = columnIndex5;
                    int i8 = query.getInt(columnIndex6);
                    int i9 = columnIndex6;
                    int i10 = query.getInt(columnIndex7);
                    int i11 = columnIndex7;
                    int i12 = query.getInt(columnIndex8);
                    int i13 = columnIndex8;
                    int i14 = query.getInt(columnIndex9);
                    int i15 = columnIndex9;
                    int i16 = query.getInt(columnIndex10);
                    int i17 = columnIndex10;
                    int i18 = query.getInt(columnIndex11);
                    int i19 = columnIndex11;
                    String string3 = query.getString(columnIndex12);
                    int i20 = columnIndex12;
                    String string4 = query.getString(columnIndex13);
                    int i21 = columnIndex13;
                    int i22 = columnIndex14;
                    ArrayList arrayList3 = arrayList2;
                    int i23 = query.getInt(i22);
                    int i24 = i22;
                    int i25 = columnIndex15;
                    String str = string3;
                    String string5 = query.getString(i25);
                    int i26 = i25;
                    int i27 = columnIndex16;
                    String str2 = string5;
                    int i28 = query.getInt(i27);
                    int i29 = i27;
                    String string6 = query.getString(columnIndex17);
                    int i30 = columnIndex17;
                    com.instabug.survey.e.c.a aVar = new com.instabug.survey.e.c.a();
                    int i31 = i23;
                    String str3 = string4;
                    aVar.c = valueOf.longValue();
                    aVar.q = i3;
                    aVar.d = string;
                    aVar.a(string2);
                    boolean z = i6 == 1;
                    i iVar = aVar.a2;
                    iVar.y = z;
                    iVar.Y1 = (long) i8;
                    iVar.Z1 = (long) i10;
                    iVar.a2 = i12 == 1;
                    iVar.c2 = i14;
                    iVar.d2 = i16 == 1;
                    aVar.y = i18 == 1;
                    aVar.x = com.instabug.survey.e.c.c.a(new JSONArray(str3));
                    aVar.Y1 = i31;
                    aVar.Z1.a(new JSONArray(str2));
                    com.instabug.survey.f.c.b bVar = aVar.Z1;
                    bVar.q = string6;
                    bVar.c = i28 == 1;
                    g gVar = new g();
                    gVar.fromJson(str);
                    aVar.a2.q = gVar;
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(aVar);
                    if (!query.moveToNext()) {
                        cls = cls3;
                        try {
                            InstabugSDKLogger.d(cls, arrayList4.size() + " announcements have been retrieved from " + InstabugDbContract.AnnouncementEntry.TABLE_NAME);
                            query.close();
                            sQLiteDatabaseWrapper.close();
                            return arrayList4;
                        } catch (JSONException e) {
                            e = e;
                            try {
                                InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
                                ArrayList arrayList5 = new ArrayList();
                                query.close();
                                sQLiteDatabaseWrapper.close();
                                return arrayList5;
                            } catch (Throwable th) {
                                th = th;
                                query.close();
                                sQLiteDatabaseWrapper.close();
                                throw th;
                            }
                        }
                    } else {
                        arrayList2 = arrayList4;
                        columnIndex = i;
                        columnIndex3 = i2;
                        columnIndex2 = i4;
                        columnIndex4 = i5;
                        columnIndex5 = i7;
                        columnIndex6 = i9;
                        columnIndex7 = i11;
                        columnIndex8 = i13;
                        columnIndex9 = i15;
                        columnIndex10 = i17;
                        columnIndex11 = i19;
                        columnIndex12 = i20;
                        columnIndex13 = i21;
                        columnIndex14 = i24;
                        columnIndex15 = i26;
                        columnIndex16 = i29;
                        columnIndex17 = i30;
                    }
                }
            } catch (JSONException e2) {
                e = e2;
                cls = cls3;
                InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
                ArrayList arrayList52 = new ArrayList();
                query.close();
                sQLiteDatabaseWrapper.close();
                return arrayList52;
            }
        } catch (JSONException e3) {
            e = e3;
            sQLiteDatabaseWrapper = openDatabase;
            cls = cls3;
            InstabugSDKLogger.e(cls, "announcement conversion failed due to " + e.getMessage());
            ArrayList arrayList522 = new ArrayList();
            query.close();
            sQLiteDatabaseWrapper.close();
            return arrayList522;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseWrapper = openDatabase;
            query.close();
            sQLiteDatabaseWrapper.close();
            throw th;
        }
    }

    public static long insertAnnouncementAsset(long j, long j2, String str) {
        long insertWithOnConflict;
        synchronized (i0.j.e.c1.b.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_ID, Long.valueOf(j2));
            contentValues.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_ANNOUNCE_ID, Long.valueOf(j));
            contentValues.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_FILE_PATH, str);
            insertWithOnConflict = openDatabase.insertWithOnConflict(InstabugDbContract.AnnouncementAssetsEntry.TABLE_NAME, (String) null, contentValues);
            if (insertWithOnConflict == -1) {
                i0.j.e.c1.b.q(j, j2, str);
            }
            openDatabase.setTransactionSuccessful();
            InstabugSDKLogger.d(i0.j.f.b.a.a.class, "asset of id: " + j2 + " has been added to " + InstabugDbContract.AnnouncementAssetsEntry.TABLE_NAME);
            openDatabase.endTransaction();
            openDatabase.close();
        }
        return insertWithOnConflict;
    }

    public static void insertOrUpdatePausedOrLocale(com.instabug.survey.e.c.a aVar, boolean z, boolean z2) {
        PoolProvider.postIOTask(new a(aVar, z, z2));
    }

    public static boolean isAnnouncementExist(long j) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String[]) null, "announcement_id=? ", new String[]{String.valueOf(j)}, (String) null, (String) null, (String) null);
        if (query == null) {
            return false;
        }
        boolean moveToFirst = query.moveToFirst();
        query.close();
        openDatabase.close();
        return moveToFirst;
    }

    public static void resetAnnouncementUserInteraction(List<com.instabug.survey.e.c.a> list) {
        for (com.instabug.survey.e.c.a next : list) {
            g gVar = next.a2.q;
            gVar.x = new ArrayList<>();
            i iVar = new i(0);
            next.a2 = iVar;
            iVar.q = gVar;
        }
        i0.j.f.b.a.a.e(list);
    }

    public static void updateAnnouncement(com.instabug.survey.e.c.a aVar) {
        PoolProvider.postIOTask(new b(aVar));
    }

    public static void updateBulk(List<com.instabug.survey.e.c.a> list) {
        PoolProvider.postIOTask(new c(list));
    }
}
