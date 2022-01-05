package com.google.firebase.installations.local;

import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.d.a.a.a;
import i0.h.c.c;
import io.sentry.cache.EnvelopeCache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

public class PersistedInstallation {
    public final File a;
    public final c b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(c cVar) {
        cVar.a();
        File filesDir = cVar.d.getFilesDir();
        StringBuilder P0 = a.P0("PersistedInstallation.");
        P0.append(cVar.c());
        P0.append(EnvelopeCache.SUFFIX_CURRENT_SESSION_FILE);
        this.a = new File(filesDir, P0.toString());
        this.b = cVar;
    }

    public i0.h.c.r.p.c a(i0.h.c.r.p.c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", (Object) cVar.c());
            jSONObject.put("Status", cVar.f().ordinal());
            jSONObject.put("AuthToken", (Object) cVar.a());
            jSONObject.put("RefreshToken", (Object) cVar.e());
            jSONObject.put("TokenCreationEpochInSecs", cVar.g());
            jSONObject.put("ExpiresInSecs", cVar.b());
            jSONObject.put("FisError", (Object) cVar.d());
            c cVar2 = this.b;
            cVar2.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", cVar2.d.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes(FileEncryptionUtil.ENCODING_UTF_8));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.a)) {
                return cVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.h.c.r.p.c b() {
        /*
            r14 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002d }
            java.io.File r4 = r14.a     // Catch:{ IOException | JSONException -> 0x002d }
            r3.<init>(r4)     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x0010:
            r4 = 0
            int r5 = r3.read(r2, r4, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0028 }
            r3.close()     // Catch:{ IOException | JSONException -> 0x002d }
            goto L_0x0032
        L_0x0024:
            r0.write(r2, r4, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ IOException | JSONException -> 0x002d }
        L_0x002d:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0032:
            r0 = 0
            java.lang.String r2 = "Fid"
            java.lang.String r2 = r1.optString(r2, r0)
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus r3 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION
            int r4 = r3.ordinal()
            java.lang.String r5 = "Status"
            int r4 = r1.optInt(r5, r4)
            java.lang.String r5 = "AuthToken"
            java.lang.String r5 = r1.optString(r5, r0)
            java.lang.String r6 = "RefreshToken"
            java.lang.String r6 = r1.optString(r6, r0)
            r7 = 0
            java.lang.String r9 = "TokenCreationEpochInSecs"
            long r9 = r1.optLong(r9, r7)
            java.lang.String r11 = "ExpiresInSecs"
            long r11 = r1.optLong(r11, r7)
            java.lang.String r13 = "FisError"
            java.lang.String r0 = r1.optString(r13, r0)
            int r1 = i0.h.c.r.p.c.a
            i0.h.c.r.p.a$b r1 = new i0.h.c.r.p.a$b
            r1.<init>()
            r1.d(r7)
            r1.b(r3)
            r1.c(r7)
            r1.a = r2
            com.google.firebase.installations.local.PersistedInstallation$RegistrationStatus[] r2 = com.google.firebase.installations.local.PersistedInstallation.RegistrationStatus.values()
            r2 = r2[r4]
            r1.b(r2)
            r1.c = r5
            r1.d = r6
            r1.d(r9)
            r1.c(r11)
            r1.g = r0
            i0.h.c.r.p.c r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.PersistedInstallation.b():i0.h.c.r.p.c");
    }
}
