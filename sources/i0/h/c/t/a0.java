package i0.h.c.t;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import i0.h.a.b.b.b;
import i0.h.c.c;
import i0.h.c.r.g;
import i0.h.c.r.k;
import i0.h.c.u.h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class a0 {
    public final c a;
    public final f0 b;
    public final b c;
    public final i0.h.c.q.b<h> d;
    public final i0.h.c.q.b<HeartBeatInfo> e;
    public final g f;

    public a0(c cVar, f0 f0Var, i0.h.c.q.b<h> bVar, i0.h.c.q.b<HeartBeatInfo> bVar2, g gVar) {
        cVar.a();
        b bVar3 = new b(cVar.d);
        this.a = cVar;
        this.b = f0Var;
        this.c = bVar3;
        this.d = bVar;
        this.e = bVar2;
        this.f = gVar;
    }

    public final i0.h.a.b.m.g<String> a(i0.h.a.b.m.g<Bundle> gVar) {
        return gVar.g(y.c, new z(this));
    }

    public final i0.h.a.b.m.g<Bundle> b(String str, String str2, String str3, Bundle bundle) {
        int i;
        String str4;
        String str5;
        HeartBeatInfo.HeartBeat a2;
        PackageInfo c2;
        bundle.putString("scope", str3);
        bundle.putString(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        c cVar = this.a;
        cVar.a();
        bundle.putString("gmp_app_id", cVar.f.b);
        f0 f0Var = this.b;
        synchronized (f0Var) {
            if (f0Var.d == 0 && (c2 = f0Var.c("com.google.android.gms")) != null) {
                f0Var.d = c2.versionCode;
            }
            i = f0Var.d;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        f0 f0Var2 = this.b;
        synchronized (f0Var2) {
            if (f0Var2.c == null) {
                f0Var2.e();
            }
            str4 = f0Var2.c;
        }
        bundle.putString("app_ver_name", str4);
        c cVar2 = this.a;
        cVar2.a();
        try {
            str5 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(cVar2.e.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str5 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str5);
        try {
            String a3 = ((k) i0.h.a.b.c.m.b.j(this.f.a(false))).a();
            if (!TextUtils.isEmpty(a3)) {
                bundle.putString("Goog-Firebase-Installations-Auth", a3);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e2);
        }
        bundle.putString("cliv", "fcm-20.1.7_1p");
        HeartBeatInfo heartBeatInfo = this.e.get();
        h hVar = this.d.get();
        if (!(heartBeatInfo == null || hVar == null || (a2 = heartBeatInfo.a("fire-iid")) == HeartBeatInfo.HeartBeat.NONE)) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a2.getCode()));
            bundle.putString("Firebase-Client", hVar.a());
        }
        return this.c.a(bundle);
    }
}
