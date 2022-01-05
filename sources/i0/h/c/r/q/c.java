package i0.h.c.r.q;

import android.content.Context;
import android.util.JsonReader;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.pubnub.api.vendor.FileEncryptionUtil;
import h0.b0.v;
import i0.h.c.q.b;
import i0.h.c.r.q.a;
import i0.h.c.r.q.b;
import i0.h.c.u.h;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FirebaseInstallationServiceClient */
public class c {
    public static final Pattern a = Pattern.compile("[0-9]+s");
    public static final Charset b = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
    public final Context c;
    public final b<h> d;
    public final b<HeartBeatInfo> e;
    public final d f = new d();

    public c(Context context, b<h> bVar, b<HeartBeatInfo> bVar2) {
        this.c = context;
        this.d = bVar;
        this.e = bVar2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.net.HttpURLConnection r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.io.InputStream r0 = r10.getErrorStream()
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 3
            if (r0 != 0) goto L_0x000c
            goto L_0x0050
        L_0x000c:
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            java.nio.charset.Charset r8 = b
            r7.<init>(r0, r8)
            r6.<init>(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r0.<init>()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
        L_0x001d:
            java.lang.String r7 = r6.readLine()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            if (r7 == 0) goto L_0x002c
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r7 = 10
            r0.append(r7)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            goto L_0x001d
        L_0x002c:
            java.lang.String r7 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            int r9 = r10.getResponseCode()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r4] = r9     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = r10.getResponseMessage()     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r3] = r10     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r8[r2] = r0     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ IOException -> 0x004d, all -> 0x0048 }
            r1 = r10
            goto L_0x004d
        L_0x0048:
            r10 = move-exception
            r6.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            throw r10
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "Firebase-Installations"
            android.util.Log.w(r10, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r12
            r0[r3] = r13
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L_0x006a
            java.lang.String r11 = ""
            goto L_0x0070
        L_0x006a:
            java.lang.String r12 = ", "
            java.lang.String r11 = i0.d.a.a.a.n0(r12, r11)
        L_0x0070:
            r0[r2] = r11
            java.lang.String r11 = "Firebase options used while communicating with Firebase server APIs: %s, %s%s"
            java.lang.String r11 = java.lang.String.format(r11, r0)
            android.util.Log.w(r10, r11)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.r.q.c.b(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static long d(String str) {
        v.u(a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    public final URL a(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e2) {
            throw new FirebaseInstallationsException(e2.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[Catch:{ NameNotFoundException -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d6 A[Catch:{ NameNotFoundException -> 0x00fe }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.HttpURLConnection c(java.net.URL r9, java.lang.String r10) throws com.google.firebase.installations.FirebaseInstallationsException {
        /*
            r8 = this;
            java.net.URLConnection r9 = r9.openConnection()     // Catch:{ IOException -> 0x0120 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ IOException -> 0x0120 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r9.setConnectTimeout(r0)
            r1 = 0
            r9.setUseCaches(r1)
            r9.setReadTimeout(r0)
            java.lang.String r0 = "application/json"
            java.lang.String r2 = "Content-Type"
            r9.addRequestProperty(r2, r0)
            java.lang.String r2 = "Accept"
            r9.addRequestProperty(r2, r0)
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            r9.addRequestProperty(r0, r2)
            android.content.Context r0 = r8.c
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r2 = "X-Android-Package"
            r9.addRequestProperty(r2, r0)
            i0.h.c.q.b<com.google.firebase.heartbeatinfo.HeartBeatInfo> r0 = r8.e
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0077
            i0.h.c.q.b<i0.h.c.u.h> r0 = r8.d
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0077
            i0.h.c.q.b<com.google.firebase.heartbeatinfo.HeartBeatInfo> r0 = r8.e
            java.lang.Object r0 = r0.get()
            com.google.firebase.heartbeatinfo.HeartBeatInfo r0 = (com.google.firebase.heartbeatinfo.HeartBeatInfo) r0
            java.lang.String r2 = "fire-installations-id"
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r0 = r0.a(r2)
            com.google.firebase.heartbeatinfo.HeartBeatInfo$HeartBeat r2 = com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat.NONE
            if (r0 == r2) goto L_0x0077
            i0.h.c.q.b<i0.h.c.u.h> r2 = r8.d
            java.lang.Object r2 = r2.get()
            i0.h.c.u.h r2 = (i0.h.c.u.h) r2
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "x-firebase-client"
            r9.addRequestProperty(r3, r2)
            int r0 = r0.getCode()
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r2 = "x-firebase-client-log-type"
            r9.addRequestProperty(r2, r0)
        L_0x0077:
            java.lang.String r0 = "ContentValues"
            r2 = 0
            android.content.Context r3 = r8.c     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r5 = "SHA1"
            i0.h.a.b.c.n.a r3 = i0.h.a.b.c.n.b.a(r3)     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.Context r3 = r3.a     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fe }
            r6 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r6)     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.pm.Signature[] r4 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00fe }
            if (r4 == 0) goto L_0x00b8
            int r4 = r4.length     // Catch:{ NameNotFoundException -> 0x00fe }
            r6 = 1
            if (r4 != r6) goto L_0x00b8
            r4 = r1
        L_0x009b:
            r6 = 2
            if (r4 >= r6) goto L_0x00a8
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x00a5 }
            if (r6 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            int r4 = r4 + 1
            goto L_0x009b
        L_0x00a8:
            r6 = r2
        L_0x00a9:
            if (r6 == 0) goto L_0x00b8
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ NameNotFoundException -> 0x00fe }
            r3 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00fe }
            byte[] r3 = r3.toByteArray()     // Catch:{ NameNotFoundException -> 0x00fe }
            byte[] r3 = r6.digest(r3)     // Catch:{ NameNotFoundException -> 0x00fe }
            goto L_0x00b9
        L_0x00b8:
            r3 = r2
        L_0x00b9:
            if (r3 != 0) goto L_0x00d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00fe }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x00fe }
            android.content.Context r3 = r8.c     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00fe }
            r1.append(r3)     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x00fe }
            android.util.Log.e(r0, r1)     // Catch:{ NameNotFoundException -> 0x00fe }
            goto L_0x0115
        L_0x00d6:
            int r4 = r3.length     // Catch:{ NameNotFoundException -> 0x00fe }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00fe }
            int r6 = r4 << 1
            r5.<init>(r6)     // Catch:{ NameNotFoundException -> 0x00fe }
        L_0x00de:
            if (r1 >= r4) goto L_0x00f9
            char[] r6 = i0.h.a.b.c.m.a.a     // Catch:{ NameNotFoundException -> 0x00fe }
            byte r7 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00fe }
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >>> 4
            char r7 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00fe }
            r5.append(r7)     // Catch:{ NameNotFoundException -> 0x00fe }
            byte r7 = r3[r1]     // Catch:{ NameNotFoundException -> 0x00fe }
            r7 = r7 & 15
            char r6 = r6[r7]     // Catch:{ NameNotFoundException -> 0x00fe }
            r5.append(r6)     // Catch:{ NameNotFoundException -> 0x00fe }
            int r1 = r1 + 1
            goto L_0x00de
        L_0x00f9:
            java.lang.String r2 = r5.toString()     // Catch:{ NameNotFoundException -> 0x00fe }
            goto L_0x0115
        L_0x00fe:
            r1 = move-exception
            java.lang.String r3 = "No such package: "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            android.content.Context r4 = r8.c
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r1)
        L_0x0115:
            java.lang.String r0 = "X-Android-Cert"
            r9.addRequestProperty(r0, r2)
            java.lang.String r0 = "x-goog-api-key"
            r9.addRequestProperty(r0, r10)
            return r9
        L_0x0120:
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$Status r10 = com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE
            java.lang.String r0 = "Firebase Installations Service is unavailable. Please try again later."
            r9.<init>(r0, r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.r.q.c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }

    public final InstallationResponse e(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
        TokenResult.a a2 = TokenResult.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        TokenResult tokenResult = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((b.C0152b) a2).a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.b(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                tokenResult = a2.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new a(str, str2, str3, tokenResult, InstallationResponse.ResponseCode.OK, (a.C0151a) null);
    }

    public final TokenResult f(HttpURLConnection httpURLConnection) throws AssertionError, IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, b));
        TokenResult.a a2 = TokenResult.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((b.C0152b) a2).a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.b(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        b.C0152b bVar = (b.C0152b) a2;
        bVar.c = TokenResult.ResponseCode.OK;
        return bVar.a();
    }

    public final void g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", (Object) str);
            jSONObject.put("appId", (Object) str2);
            jSONObject.put("authVersion", (Object) "FIS_v2");
            jSONObject.put("sdkVersion", (Object) "a:16.3.5");
            i(httpURLConnection, jSONObject.toString().getBytes(FileEncryptionUtil.ENCODING_UTF_8));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final void h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", (Object) "a:16.3.5");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", (Object) jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes(FileEncryptionUtil.ENCODING_UTF_8));
        } catch (JSONException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
