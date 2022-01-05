package i0.h.a.b.c;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class f {
    public static f a;
    public final Context b;

    public f(Context context) {
        this.b = context.getApplicationContext();
    }

    @RecentlyNonNull
    public static f a(@RecentlyNonNull Context context) {
        Objects.requireNonNull(context, "null reference");
        synchronized (f.class) {
            if (a == null) {
                synchronized (q.class) {
                    if (q.a == null) {
                        q.a = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                a = new f(context);
            }
        }
        return a;
    }

    public static r b(PackageInfo packageInfo, r... rVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        t tVar = new t(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < rVarArr.length; i++) {
            if (rVarArr[i].equals(tVar)) {
                return rVarArr[i];
            }
        }
        return null;
    }

    public static boolean c(@RecentlyNonNull PackageInfo packageInfo, boolean z) {
        r rVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                rVar = b(packageInfo, v.a);
            } else {
                rVar = b(packageInfo, v.a[0]);
            }
            if (rVar != null) {
                return true;
            }
        }
        return false;
    }
}
