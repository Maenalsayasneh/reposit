package com.instabug.library.logging;

import android.util.Log;
import com.instabug.library.Feature;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.e.z;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

public class InstabugLog {
    private static final String INSTABUG_LOG_TAG = "INSTABUG_LOG_TAG";
    public static final String LOG_MESSAGE_DATE_FORMAT = "MM-dd HH:mm:ss.SSS";
    private static final String TAG = "InstabugLog";

    public static class a implements Runnable {
        public final /* synthetic */ String c;

        public a(String str) {
            this.c = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchLoggingApiUsage("v", i0.d.a.a.a.O("logMessage", String.class));
            if (!InstabugLog.isInstabugLogsDisabled()) {
                String trimString = StringUtility.trimString(this.c);
                InstabugLog.printInstabugLogs(2, trimString);
                h hVar = new h();
                hVar.a = trimString;
                hVar.b = g.V;
                hVar.c = InstabugLog.getDate();
                InstabugLog.addLog(hVar);
            }
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ String c;

        public b(String str) {
            this.c = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchLoggingApiUsage("d", i0.d.a.a.a.O("logMessage", String.class));
            if (!InstabugLog.isInstabugLogsDisabled()) {
                String trimString = StringUtility.trimString(this.c);
                InstabugLog.printInstabugLogs(3, trimString);
                h hVar = new h();
                hVar.a = trimString;
                hVar.b = g.D;
                hVar.c = InstabugLog.getDate();
                InstabugLog.addLog(hVar);
            }
        }
    }

    public static class c implements Runnable {
        public final /* synthetic */ String c;

        public c(String str) {
            this.c = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchLoggingApiUsage("i", i0.d.a.a.a.O("logMessage", String.class));
            if (!InstabugLog.isInstabugLogsDisabled()) {
                String trimString = StringUtility.trimString(this.c);
                InstabugLog.printInstabugLogs(4, trimString);
                h hVar = new h();
                hVar.a = trimString;
                hVar.b = g.I;
                hVar.c = InstabugLog.getDate();
                InstabugLog.addLog(hVar);
            }
        }
    }

    public static class d implements Runnable {
        public final /* synthetic */ String c;

        public d(String str) {
            this.c = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchLoggingApiUsage("e", i0.d.a.a.a.O("logMessage", String.class));
            if (!InstabugLog.isInstabugLogsDisabled()) {
                String trimString = StringUtility.trimString(this.c);
                InstabugLog.printInstabugLogs(6, trimString);
                h hVar = new h();
                hVar.a = trimString;
                hVar.b = g.E;
                hVar.c = InstabugLog.getDate();
                InstabugLog.addLog(hVar);
            }
        }
    }

    public static class e implements Runnable {
        public final /* synthetic */ String c;

        public e(String str) {
            this.c = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchLoggingApiUsage("w", i0.d.a.a.a.O("logMessage", String.class));
            if (!InstabugLog.isInstabugLogsDisabled()) {
                String trimString = StringUtility.trimString(this.c);
                InstabugLog.printInstabugLogs(5, trimString);
                h hVar = new h();
                hVar.a = trimString;
                hVar.b = g.W;
                hVar.c = InstabugLog.getDate();
                InstabugLog.addLog(hVar);
            }
        }
    }

    public static class f implements Runnable {
        public final /* synthetic */ String c;

        public f(String str) {
            this.c = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchLoggingApiUsage("wtf", i0.d.a.a.a.O("logMessage", String.class));
            if (!InstabugLog.isInstabugLogsDisabled()) {
                String trimString = StringUtility.trimString(this.c);
                InstabugLog.printInstabugLogs(5, trimString);
                h hVar = new h();
                hVar.a = trimString;
                hVar.b = g.WTF;
                hVar.c = InstabugLog.getDate();
                InstabugLog.addLog(hVar);
            }
        }
    }

    public enum g {
        V("v"),
        D("d"),
        I("i"),
        E("e"),
        W("w"),
        WTF("wtf");
        
        private final String level;

        private g(String str) {
            this.level = str;
        }

        public String toString() {
            return this.level;
        }
    }

    public static class h {
        public String a;
        public g b;
        public long c;
    }

    /* access modifiers changed from: private */
    public static synchronized void addLog(h hVar) {
        synchronized (InstabugLog.class) {
            i0.j.e.q0.a.a(hVar);
        }
    }

    private static void clearLogMessages() {
        PublishSubject<List<h>> publishSubject = i0.j.e.q0.a.a;
        InstabugSDKLogger.d("InstabugLogDbHelper", "clear");
        i0.j.e.q0.a.c();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        openDatabase.beginTransaction();
        try {
            openDatabase.delete(InstabugDbContract.InstabugLogEntry.TABLE_NAME, (String) null, (String[]) null);
            openDatabase.setTransactionSuccessful();
        } catch (Exception e2) {
            InstabugSDKLogger.e("InstabugLogDbHelper", e2.getMessage(), e2);
        } catch (Throwable th) {
            openDatabase.endTransaction();
            openDatabase.close();
            throw th;
        }
        openDatabase.endTransaction();
        openDatabase.close();
    }

    public static void clearLogs() {
        AnalyticsWrapper.getInstance().catchLoggingApiUsage("clearLogs", new Api.Parameter[0]);
        clearLogMessages();
    }

    public static void d(String str) {
        PoolProvider.getSingleThreadExecuter("Database-Logging").execute(new b(str));
    }

    public static void e(String str) {
        PoolProvider.getSingleThreadExecuter("Database-Logging").execute(new d(str));
    }

    /* access modifiers changed from: private */
    public static long getDate() {
        return InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r4.isClosed() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (r4.isClosed() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cf, code lost:
        r4.close();
        r3.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getLogMessages() {
        /*
            io.reactivex.subjects.PublishSubject<java.util.List<com.instabug.library.logging.InstabugLog$h>> r0 = i0.j.e.q0.a.a
            java.lang.String r0 = "log_message"
            java.lang.String r1 = "InstabugLogDbHelper"
            java.lang.String r2 = "retrieve"
            com.instabug.library.util.InstabugSDKLogger.d(r1, r2)
            i0.j.e.q0.a.c()
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            com.instabug.library.internal.storage.cache.db.DatabaseManager r3 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r3 = r3.openDatabase()
            r3.beginTransaction()
            r4 = 0
            java.lang.String r5 = "SELECT * FROM instabug_logs ORDER  BY log_date DESC LIMIT 1000"
            android.database.Cursor r4 = r3.rawQuery(r5, r4)     // Catch:{ Exception -> 0x00bc }
            if (r4 == 0) goto L_0x00ab
            boolean r5 = r4.moveToFirst()     // Catch:{ Exception -> 0x00bc }
            if (r5 == 0) goto L_0x00ab
        L_0x002d:
            int r5 = r4.getColumnIndex(r0)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r5 = r4.getString(r5)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = "log_level"
            int r6 = r4.getColumnIndex(r6)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = r4.getString(r6)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r7 = "log_date"
            int r7 = r4.getColumnIndex(r7)     // Catch:{ Exception -> 0x00bc }
            java.lang.String r7 = r4.getString(r7)     // Catch:{ Exception -> 0x00bc }
            r8 = 0
            java.util.Locale r10 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x00bc }
            java.lang.String r6 = r6.toUpperCase(r10)     // Catch:{ Exception -> 0x00bc }
            com.instabug.library.logging.InstabugLog$g r6 = com.instabug.library.logging.InstabugLog.g.valueOf(r6)     // Catch:{ Exception -> 0x00bc }
            boolean r10 = com.instabug.library.util.StringUtility.isNumeric(r7)     // Catch:{ Exception -> 0x00bc }
            if (r10 == 0) goto L_0x0061
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x00bc }
        L_0x005f:
            r8 = r7
            goto L_0x007b
        L_0x0061:
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ ParseException -> 0x0073 }
            java.lang.String r11 = "MM-dd HH:mm:ss.SSS"
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ ParseException -> 0x0073 }
            r10.<init>(r11, r12)     // Catch:{ ParseException -> 0x0073 }
            java.util.Date r7 = r10.parse(r7)     // Catch:{ ParseException -> 0x0073 }
            long r7 = r7.getTime()     // Catch:{ ParseException -> 0x0073 }
            goto L_0x005f
        L_0x0073:
            r7 = move-exception
            java.lang.String r7 = r7.getMessage()     // Catch:{ Exception -> 0x00bc }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r7)     // Catch:{ Exception -> 0x00bc }
        L_0x007b:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bc }
            r7.<init>()     // Catch:{ Exception -> 0x00bc }
            r7.put((java.lang.String) r0, (java.lang.Object) r5)     // Catch:{ JSONException -> 0x0094 }
            if (r6 == 0) goto L_0x008e
            java.lang.String r5 = "log_message_level"
            java.lang.String r6 = r6.toString()     // Catch:{ JSONException -> 0x0094 }
            r7.put((java.lang.String) r5, (java.lang.Object) r6)     // Catch:{ JSONException -> 0x0094 }
        L_0x008e:
            java.lang.String r5 = "log_message_date"
            r7.put((java.lang.String) r5, (long) r8)     // Catch:{ JSONException -> 0x0094 }
            goto L_0x00a2
        L_0x0094:
            r5 = move-exception
            java.lang.Class<com.instabug.library.logging.InstabugLog> r6 = com.instabug.library.logging.InstabugLog.class
            java.lang.String r6 = r6.getSimpleName()     // Catch:{ Exception -> 0x00bc }
            java.lang.String r8 = r5.getMessage()     // Catch:{ Exception -> 0x00bc }
            com.instabug.library.util.InstabugSDKLogger.e(r6, r8, r5)     // Catch:{ Exception -> 0x00bc }
        L_0x00a2:
            r2.put((java.lang.Object) r7)     // Catch:{ Exception -> 0x00bc }
            boolean r5 = r4.moveToNext()     // Catch:{ Exception -> 0x00bc }
            if (r5 != 0) goto L_0x002d
        L_0x00ab:
            r3.setTransactionSuccessful()     // Catch:{ Exception -> 0x00bc }
            r3.endTransaction()
            if (r4 == 0) goto L_0x00d5
            boolean r0 = r4.isClosed()
            if (r0 != 0) goto L_0x00d5
            goto L_0x00cf
        L_0x00ba:
            r0 = move-exception
            goto L_0x00e5
        L_0x00bc:
            r0 = move-exception
            java.lang.String r5 = r0.getMessage()     // Catch:{ all -> 0x00ba }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r5, r0)     // Catch:{ all -> 0x00ba }
            r3.endTransaction()
            if (r4 == 0) goto L_0x00d5
            boolean r0 = r4.isClosed()
            if (r0 != 0) goto L_0x00d5
        L_0x00cf:
            r4.close()
            r3.close()
        L_0x00d5:
            java.lang.String r0 = r2.toString()     // Catch:{ OutOfMemoryError -> 0x00da }
            goto L_0x00e4
        L_0x00da:
            r0 = move-exception
            java.lang.String r1 = "InstabugLog"
            java.lang.String r2 = "Couldn't parse Instabug logs due to an OOM"
            com.instabug.library.util.InstabugSDKLogger.e(r1, r2, r0)
            java.lang.String r0 = "[]"
        L_0x00e4:
            return r0
        L_0x00e5:
            r3.endTransaction()
            if (r4 == 0) goto L_0x00f6
            boolean r1 = r4.isClosed()
            if (r1 != 0) goto L_0x00f6
            r4.close()
            r3.close()
        L_0x00f6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.logging.InstabugLog.getLogMessages():java.lang.String");
    }

    public static String getLogs() {
        AnalyticsWrapper.getInstance().catchLoggingApiUsage("getLogs", new Api.Parameter[0]);
        return getLogMessages();
    }

    public static void i(String str) {
        PoolProvider.getSingleThreadExecuter("Database-Logging").execute(new c(str));
    }

    /* access modifiers changed from: private */
    public static boolean isInstabugLogsDisabled() {
        return z.j().h(Feature.INSTABUG_LOGS) == Feature.State.DISABLED;
    }

    /* access modifiers changed from: private */
    public static void printInstabugLogs(int i, String str) {
        if (SettingsManager.getInstance().isDebugEnabled()) {
            Log.println(i, INSTABUG_LOG_TAG, str);
        }
    }

    public static void trimLogs() {
        PublishSubject<List<h>> publishSubject = i0.j.e.q0.a.a;
        InstabugSDKLogger.d("InstabugLogDbHelper", "trim");
        i0.j.e.q0.a.c();
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        openDatabase.beginTransaction();
        try {
            openDatabase.execSQL(InstabugDbContract.InstabugLogEntry.TRIM_INSTABUG_LOG_SQL_QUERY);
            openDatabase.setTransactionSuccessful();
        } catch (Exception e2) {
            InstabugSDKLogger.e("InstabugLogDbHelper", e2.getMessage(), e2);
        } catch (Throwable th) {
            openDatabase.endTransaction();
            openDatabase.close();
            throw th;
        }
        openDatabase.endTransaction();
        openDatabase.close();
    }

    public static void v(String str) {
        PoolProvider.getSingleThreadExecuter("Database-Logging").execute(new a(str));
    }

    public static void w(String str) {
        PoolProvider.getSingleThreadExecuter("Database-Logging").execute(new e(str));
    }

    public static void wtf(String str) {
        PoolProvider.getSingleThreadExecuter("Database-Logging").execute(new f(str));
    }
}
