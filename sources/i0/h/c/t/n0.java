package i0.h.c.t;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class n0 {
    public final SharedPreferences a;
    public final Context b;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static class a {
        public static final long a = TimeUnit.DAYS.toMillis(7);
        public final String b;
        public final String c;
        public final long d;

        public a(String str, String str2, long j) {
            this.b = str;
            this.c = str2;
            this.d = j;
        }

        public static String a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", (Object) str);
                jSONObject.put("appVersion", (Object) str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }

        public static a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseMessaging", sb.toString());
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r4 = java.lang.String.valueOf(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        if (r4.length() != 0) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        r4 = "Error creating file in no backup dir: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        r4 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        android.util.Log.d("FirebaseMessaging", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n0(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.b = r4
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.a = r0
            java.io.File r4 = h0.i.b.a.getNoBackupFilesDir(r4)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "com.google.android.gms.appid-no-backup"
            r1.<init>(r4, r2)
            boolean r4 = r1.exists()
            if (r4 == 0) goto L_0x0020
            goto L_0x0076
        L_0x0020:
            boolean r4 = r1.createNewFile()     // Catch:{ IOException -> 0x004d }
            if (r4 == 0) goto L_0x0076
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x004a }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            if (r4 != 0) goto L_0x0076
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = "App restored, clearing state"
            android.util.Log.i(r4, r1)     // Catch:{ IOException -> 0x004d }
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch:{ all -> 0x0047 }
            r4.commit()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            goto L_0x0076
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0076
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Error creating file in no backup dir: "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x006c
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0071
        L_0x006c:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0071:
            java.lang.String r0 = "FirebaseMessaging"
            android.util.Log.d(r0, r4)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.t.n0.<init>(android.content.Context):void");
    }

    public final String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public synchronized void b(String str, String str2, String str3, String str4) {
        String a2 = a.a(str3, str4, System.currentTimeMillis());
        if (a2 != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(a(str, str2), a2);
            edit.commit();
        }
    }
}
