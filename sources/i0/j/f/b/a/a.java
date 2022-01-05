package i0.j.f.b.a;

import android.content.ContentValues;
import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.e.c.c;
import com.instabug.survey.f.c.b;
import com.instabug.survey.f.c.g;
import com.instabug.survey.f.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: AnnouncementsDBHelper */
public class a {
    public static synchronized long a(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, long j, ContentValues contentValues) {
        long update;
        Class<a> cls = a.class;
        synchronized (cls) {
            update = (long) sQLiteDatabaseWrapper.update(InstabugDbContract.AnnouncementEntry.TABLE_NAME, contentValues, "announcement_id=? ", new String[]{String.valueOf(j)});
            InstabugSDKLogger.d(cls, "announcement id: " + j + " paused state has been updated in " + InstabugDbContract.AnnouncementEntry.TABLE_NAME);
        }
        return update;
    }

    public static ContentValues b(com.instabug.survey.e.c.a aVar) throws JSONException {
        String str;
        ContentValues contentValues = new ContentValues();
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_ID, Long.valueOf(aVar.c));
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_TITLE, aVar.d);
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_TYPE, Integer.valueOf(aVar.q));
        contentValues.put("conditions_operator", aVar.a2.q.Z1);
        contentValues.put("answered", Integer.valueOf(aVar.a2.y ? 1 : 0));
        contentValues.put("dismissed_at", Long.valueOf(aVar.a2.Y1));
        contentValues.put("shown_at", Long.valueOf(aVar.c()));
        contentValues.put("isCancelled", Integer.valueOf(aVar.a2.a2 ? 1 : 0));
        contentValues.put("eventIndex", Integer.valueOf(aVar.a2.c2));
        contentValues.put("shouldShowAgain", Integer.valueOf(aVar.e() ? 1 : 0));
        contentValues.put("paused", Integer.valueOf(aVar.y ? 1 : 0));
        contentValues.put("sessionCounter", Integer.valueOf(aVar.a2.e2));
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT, c.b(aVar.x).toString());
        contentValues.put("targetAudiences", g.a(aVar.a2.q).toString());
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCE_EVENTS, com.instabug.survey.f.c.a.b(aVar.a2.q.x).toString());
        contentValues.put("surveyState", aVar.a2.g2.toString());
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_ASSETS_STATUS, Integer.valueOf(aVar.Y1));
        contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_IS_SHOWN, Integer.valueOf(aVar.a2.d2 ? 1 : 0));
        contentValues.put("isLocalized", Boolean.valueOf(aVar.Z1.c));
        contentValues.put("supportedLocales", new JSONArray((Collection<?>) aVar.Z1.c()).toString());
        b bVar = aVar.Z1;
        if (!(bVar == null || (str = bVar.q) == null)) {
            contentValues.put("currentLocale", str);
        }
        return contentValues;
    }

    public static List<com.instabug.survey.e.c.a> c(int i) {
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper;
        Class<a> cls;
        Class<a> cls2 = a.class;
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        Cursor query = openDatabase.query(InstabugDbContract.AnnouncementEntry.TABLE_NAME, (String[]) null, "announcement_type=? ", new String[]{String.valueOf(i)}, (String) null, (String) null, (String) null);
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
        Class<a> cls3 = cls2;
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
                    int i2 = columnIndex;
                    int i3 = query.getInt(columnIndex2);
                    int i4 = columnIndex2;
                    String string = query.getString(columnIndex3);
                    int i5 = columnIndex3;
                    String string2 = query.getString(columnIndex4);
                    int i6 = columnIndex4;
                    int i7 = query.getInt(columnIndex5);
                    int i8 = columnIndex5;
                    int i9 = query.getInt(columnIndex6);
                    int i10 = columnIndex6;
                    int i11 = query.getInt(columnIndex7);
                    int i12 = columnIndex7;
                    int i13 = query.getInt(columnIndex8);
                    int i14 = columnIndex8;
                    int i15 = query.getInt(columnIndex9);
                    int i16 = columnIndex9;
                    int i17 = query.getInt(columnIndex10);
                    int i18 = columnIndex10;
                    int i19 = query.getInt(columnIndex11);
                    int i20 = columnIndex11;
                    String string3 = query.getString(columnIndex12);
                    int i21 = columnIndex12;
                    String string4 = query.getString(columnIndex13);
                    int i22 = columnIndex13;
                    int i23 = columnIndex14;
                    ArrayList arrayList3 = arrayList2;
                    int i24 = query.getInt(i23);
                    int i25 = i23;
                    int i26 = columnIndex15;
                    String str = string3;
                    String string5 = query.getString(i26);
                    int i27 = i26;
                    int i28 = columnIndex16;
                    String str2 = string5;
                    int i29 = query.getInt(i28);
                    int i30 = i28;
                    String string6 = query.getString(columnIndex17);
                    int i31 = columnIndex17;
                    com.instabug.survey.e.c.a aVar = new com.instabug.survey.e.c.a();
                    int i32 = i24;
                    String str3 = string4;
                    aVar.c = valueOf.longValue();
                    aVar.q = i3;
                    aVar.d = string;
                    aVar.a(string2);
                    boolean z = i7 == 1;
                    i iVar = aVar.a2;
                    iVar.y = z;
                    iVar.Y1 = (long) i9;
                    iVar.Z1 = (long) i11;
                    iVar.a2 = i13 == 1;
                    iVar.c2 = i15;
                    iVar.d2 = i17 == 1;
                    aVar.y = i19 == 1;
                    aVar.y = i19 == 1;
                    aVar.x = c.a(new JSONArray(str3));
                    aVar.Y1 = i32;
                    aVar.Z1.a(new JSONArray(str2));
                    b bVar = aVar.Z1;
                    bVar.q = string6;
                    bVar.c = i29 == 1;
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
                        columnIndex = i2;
                        columnIndex2 = i4;
                        columnIndex3 = i5;
                        columnIndex4 = i6;
                        columnIndex5 = i8;
                        columnIndex6 = i10;
                        columnIndex7 = i12;
                        columnIndex8 = i14;
                        columnIndex9 = i16;
                        columnIndex10 = i18;
                        columnIndex11 = i20;
                        columnIndex12 = i21;
                        columnIndex13 = i22;
                        columnIndex14 = i25;
                        columnIndex15 = i27;
                        columnIndex16 = i30;
                        columnIndex17 = i31;
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

    public static void d(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, com.instabug.survey.e.c.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("paused", Boolean.valueOf(aVar.y));
        a(sQLiteDatabaseWrapper, aVar.c, contentValues);
    }

    public static synchronized void e(List<com.instabug.survey.e.c.a> list) {
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                for (com.instabug.survey.e.c.a g : list) {
                    g(openDatabase, g);
                }
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static void f(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, com.instabug.survey.e.c.a aVar) throws JSONException {
        ArrayList<c> arrayList;
        String str;
        ContentValues contentValues = new ContentValues();
        b bVar = aVar.Z1;
        if (!(bVar == null || (str = bVar.q) == null)) {
            contentValues.put("currentLocale", str);
        }
        if (!(aVar.Z1 == null || (arrayList = aVar.x) == null)) {
            contentValues.put(InstabugDbContract.AnnouncementEntry.COLUMN_ANNOUNCEMENT, c.b(arrayList).toString());
        }
        a(sQLiteDatabaseWrapper, aVar.c, contentValues);
    }

    public static synchronized long g(SQLiteDatabaseWrapper sQLiteDatabaseWrapper, com.instabug.survey.e.c.a aVar) {
        long update;
        Class<a> cls = a.class;
        synchronized (cls) {
            try {
                update = (long) sQLiteDatabaseWrapper.update(InstabugDbContract.AnnouncementEntry.TABLE_NAME, b(aVar), "announcement_id=? ", new String[]{String.valueOf(aVar.c)});
                InstabugSDKLogger.d(cls, "announcement id: " + aVar.c + " has been updated in " + InstabugDbContract.AnnouncementEntry.TABLE_NAME);
            } catch (JSONException e) {
                InstabugSDKLogger.e(cls, "announcement updating failed due to " + e.getMessage());
                return -1;
            }
        }
        return update;
    }

    public static synchronized long h(com.instabug.survey.e.c.a aVar) {
        long g;
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                g = g(openDatabase, aVar);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
        return g;
    }
}
