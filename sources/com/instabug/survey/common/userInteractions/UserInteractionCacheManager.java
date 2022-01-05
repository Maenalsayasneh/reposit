package com.instabug.survey.common.userInteractions;

import android.database.Cursor;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.f.c.g;
import com.instabug.survey.f.c.i;
import i0.j.f.f.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

public class UserInteractionCacheManager {
    public static void deleteBulkOfUserInteractions(List<i> list) {
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            openDatabase.beginTransaction();
            try {
                for (i next : list) {
                    openDatabase.delete(InstabugDbContract.UserInteractions.TABLE_NAME, "survey_id=? AND uuid=? AND action_on_type=?", new String[]{String.valueOf(next.c), next.d, String.valueOf(next.x)});
                }
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static void deleteUserInteraction(long j, String str, int i) {
        Long valueOf = Long.valueOf(j);
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(valueOf), str, String.valueOf(i)};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.UserInteractions.TABLE_NAME, "survey_id=? AND uuid=? AND action_on_type=?", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static <T extends i0.j.f.m.e.a> void insertUserInteraction(T t, String str) {
        i userInteraction = t.getUserInteraction();
        userInteraction.c = t.getSurveyId();
        userInteraction.d = str;
        Class<a> cls = a.class;
        synchronized (cls) {
            if (!a.b(userInteraction)) {
                InstabugSDKLogger.w(cls, "invalid user interaction");
                return;
            }
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                if (openDatabase.insertWithOnConflict(InstabugDbContract.UserInteractions.TABLE_NAME, (String) null, a.a(userInteraction)) == -1) {
                    a.c(userInteraction);
                }
                openDatabase.setTransactionSuccessful();
                InstabugSDKLogger.d(cls, "survey user interaction with survey id: " + userInteraction.c + " and uuid: " + userInteraction.d + " has been added to " + InstabugDbContract.UserInteractions.TABLE_NAME);
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (JSONException e) {
                try {
                    InstabugSDKLogger.e(cls, "survey insertion failed due to " + e.getMessage());
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static <T extends i0.j.f.m.e.a> void insertUserInteractions(List<T> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            i userInteraction = t.getUserInteraction();
            userInteraction.c = t.getSurveyId();
            userInteraction.d = str;
            arrayList.add(userInteraction);
        }
        Class<a> cls = a.class;
        synchronized (cls) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            try {
                openDatabase.beginTransaction();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (!a.b(iVar)) {
                        InstabugSDKLogger.w(cls, "invalid user interaction");
                    } else {
                        if (openDatabase.insertWithOnConflict(InstabugDbContract.UserInteractions.TABLE_NAME, (String) null, a.a(iVar)) == -1) {
                            a.c(iVar);
                        }
                        InstabugSDKLogger.d(cls, "survey user interaction with survey id: " + iVar.c + " and uuid: " + iVar.d + " has been added to " + InstabugDbContract.UserInteractions.TABLE_NAME);
                    }
                }
                openDatabase.setTransactionSuccessful();
                openDatabase.endTransaction();
                openDatabase.close();
            } catch (JSONException e) {
                try {
                    InstabugSDKLogger.e(cls, "survey insertion failed due to " + e.getMessage());
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
        return;
    }

    public static i retrieveUserInteraction(long j, String str, int i) {
        Class<a> cls;
        SQLiteDatabaseWrapper sQLiteDatabaseWrapper;
        String str2 = str;
        Long valueOf = Long.valueOf(j);
        Class<a> cls2 = a.class;
        synchronized (cls2) {
            try {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                Cursor query = openDatabase.query(InstabugDbContract.UserInteractions.TABLE_NAME, (String[]) null, "survey_id=? AND uuid=? AND action_on_type=?", new String[]{String.valueOf(valueOf), str2, String.valueOf(i)}, (String) null, (String) null, (String) null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex("answered");
                    int columnIndex2 = query.getColumnIndex("dismissed_at");
                    int columnIndex3 = query.getColumnIndex("shown_at");
                    int columnIndex4 = query.getColumnIndex("isCancelled");
                    int columnIndex5 = query.getColumnIndex("attemptCount");
                    int columnIndex6 = query.getColumnIndex("eventIndex");
                    int columnIndex7 = query.getColumnIndex("shouldShowAgain");
                    int columnIndex8 = query.getColumnIndex("sessionCounter");
                    int columnIndex9 = query.getColumnIndex("surveyTargeting");
                    int columnIndex10 = query.getColumnIndex(InstabugDbContract.UserInteractions.COLUMN_ALREADY_SHOWN);
                    try {
                        if (!query.moveToFirst()) {
                            query.close();
                            query.close();
                            openDatabase.close();
                        } else {
                            int i2 = query.getInt(columnIndex);
                            int i3 = query.getInt(columnIndex2);
                            int i4 = query.getInt(columnIndex3);
                            int i5 = query.getInt(columnIndex4);
                            int i6 = query.getInt(columnIndex5);
                            int i7 = query.getInt(columnIndex6);
                            int i8 = query.getInt(columnIndex7);
                            int i9 = query.getInt(columnIndex8);
                            String string = query.getString(columnIndex9);
                            int i10 = query.getInt(columnIndex10);
                            sQLiteDatabaseWrapper = openDatabase;
                            try {
                                i iVar = new i(i);
                                cls = cls2;
                                try {
                                    iVar.c = valueOf.longValue();
                                    iVar.d = str2;
                                    iVar.b2 = i6;
                                    iVar.Z1 = (long) i4;
                                    iVar.c2 = i7;
                                    iVar.a2 = i5 == 1;
                                    iVar.y = i2 == 1;
                                    iVar.Y1 = (long) i3;
                                    iVar.e2 = i9;
                                    iVar.f2 = i8 == 1;
                                    iVar.q = g.b(string);
                                    iVar.d2 = i10 == 1;
                                } catch (JSONException e) {
                                    e = e;
                                    try {
                                        InstabugSDKLogger.e(cls, "user interaction failed due to " + e.getMessage());
                                        query.close();
                                        sQLiteDatabaseWrapper.close();
                                        return null;
                                    } catch (Throwable th) {
                                        th = th;
                                        query.close();
                                        sQLiteDatabaseWrapper.close();
                                        throw th;
                                    }
                                }
                                try {
                                    query.close();
                                    sQLiteDatabaseWrapper.close();
                                    return iVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            } catch (JSONException e2) {
                                e = e2;
                                cls = cls2;
                                InstabugSDKLogger.e(cls, "user interaction failed due to " + e.getMessage());
                                query.close();
                                sQLiteDatabaseWrapper.close();
                                return null;
                            } catch (Throwable th3) {
                                th = th3;
                                cls = cls2;
                                query.close();
                                sQLiteDatabaseWrapper.close();
                                throw th;
                            }
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        sQLiteDatabaseWrapper = openDatabase;
                        cls = cls2;
                        InstabugSDKLogger.e(cls, "user interaction failed due to " + e.getMessage());
                        query.close();
                        sQLiteDatabaseWrapper.close();
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteDatabaseWrapper = openDatabase;
                        cls = cls2;
                        query.close();
                        sQLiteDatabaseWrapper.close();
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                cls = cls2;
                throw th;
            }
        }
        return null;
    }

    public static <T extends i0.j.f.m.e.a> void updateUserInteraction(T t, String str) {
        i userInteraction = t.getUserInteraction();
        userInteraction.c = t.getSurveyId();
        userInteraction.d = str;
        a.c(userInteraction);
    }
}
