package i0.h.c.t;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import i0.h.a.b.c.m.b;
import i0.h.c.c;
import java.util.List;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class f0 {
    public final Context a;
    public String b;
    public String c;
    public int d;
    public int e = 0;

    public f0(Context context) {
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
            e();
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
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    public boolean d() {
        int i;
        synchronized (this) {
            i = this.e;
            if (i == 0) {
                PackageManager packageManager = this.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!b.U()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null) {
                            if (queryIntentServices.size() > 0) {
                                this.e = 1;
                                i = 1;
                            }
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null) {
                        if (queryBroadcastReceivers.size() > 0) {
                            this.e = 2;
                            i = 2;
                        }
                    }
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (b.U()) {
                        this.e = 2;
                        i = 2;
                    } else {
                        this.e = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }

    public final synchronized void e() {
        PackageInfo c2 = c(this.a.getPackageName());
        if (c2 != null) {
            this.b = Integer.toString(c2.versionCode);
            this.c = c2.versionName;
        }
    }
}
