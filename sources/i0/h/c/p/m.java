package i0.h.c.p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import i0.h.c.c;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public class m {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public m(Context context) {
        this.a = context;
    }

    public static String b(c cVar) {
        cVar.a();
        String str = cVar.f.e;
        if (str != null) {
            return str;
        }
        cVar.a();
        String str2 = cVar.f.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        if (this.b == null) {
            d();
        }
        return this.b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public final synchronized void d() {
        PackageInfo c2 = c(this.a.getPackageName());
        if (c2 != null) {
            this.b = Integer.toString(c2.versionCode);
            this.c = c2.versionName;
        }
    }
}
