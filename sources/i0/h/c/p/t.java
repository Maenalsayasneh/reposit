package i0.h.c.p;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class t {
    public final SharedPreferences a;
    public final Context b;
    public final Map<String, Long> c = new h0.f.a();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    public static class a {
        public static final long a = TimeUnit.DAYS.toMillis(7);
        public static final /* synthetic */ int b = 0;
        public final String c;
        public final String d;
        public final long e;

        public a(String str, String str2, long j) {
            this.c = str;
            this.d = str2;
            this.e = j;
        }

        public static String a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", (Object) str);
                jSONObject.put("appVersion", (Object) str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
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
            } catch (JSONException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        r4 = java.lang.String.valueOf(r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        if (r4.length() != 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r4 = "Error creating file in no backup dir: ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r4 = new java.lang.String("Error creating file in no backup dir: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        android.util.Log.d("FirebaseInstanceId", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            h0.f.a r0 = new h0.f.a
            r0.<init>()
            r3.c = r0
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
            if (r4 == 0) goto L_0x0027
            goto L_0x0070
        L_0x0027:
            boolean r4 = r1.createNewFile()     // Catch:{ IOException -> 0x0047 }
            if (r4 == 0) goto L_0x0070
            monitor-enter(r3)     // Catch:{ IOException -> 0x0047 }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x0044 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0044 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x0047 }
            if (r4 != 0) goto L_0x0070
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r0 = "App restored, clearing state"
            android.util.Log.i(r4, r0)     // Catch:{ IOException -> 0x0047 }
            r3.c()     // Catch:{ IOException -> 0x0047 }
            goto L_0x0070
        L_0x0044:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x0047 }
            throw r4     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r4 = move-exception
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0070
            java.lang.String r4 = r4.getMessage()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Error creating file in no backup dir: "
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0066
            java.lang.String r4 = r0.concat(r4)
            goto L_0x006b
        L_0x0066:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x006b:
            java.lang.String r0 = "FirebaseInstanceId"
            android.util.Log.d(r0, r4)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.p.t.<init>(android.content.Context):void");
    }

    public static String a(String str, String str2) {
        return i0.d.a.a.a.y0(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|cre");
    }

    public final String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i0.d.a.a.a.X(String.valueOf(str).length(), 4, String.valueOf(str2).length(), String.valueOf(str3).length()));
        i0.d.a.a.a.s(sb, str, "|T|", str2, "|");
        sb.append(str3);
        return sb.toString();
    }

    public synchronized void c() {
        this.c.clear();
        this.a.edit().clear().commit();
    }

    public final long d(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.a.contains(a(str, "cre"))) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(a(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        String string = this.a.getString(a(str, "cre"), (String) null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
