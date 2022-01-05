package i0.h.a.b.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNullable;
import h0.b0.v;
import i0.d.a.a.a;
import i0.h.a.b.c.i.k0;
import i0.h.a.b.c.n.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class c {
    public static final int a = 12451000;

    static {
        boolean z = e.a;
    }

    @RecentlyNullable
    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !v.N0(context)) {
                StringBuilder P0 = a.P0("gcore_");
                P0.append(a);
                P0.append("-");
                if (!TextUtils.isEmpty(str)) {
                    P0.append(str);
                }
                P0.append("-");
                if (context != null) {
                    P0.append(context.getPackageName());
                }
                P0.append("-");
                if (context != null) {
                    try {
                        P0.append(b.a(context).b(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb = P0.toString();
                int i2 = k0.a;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            int i3 = k0.a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            int i4 = k0.a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(@androidx.annotation.RecentlyNonNull android.content.Context r7, int r8) {
        /*
            r6 = this;
            int r8 = i0.h.a.b.c.e.a(r7, r8)
            r0 = 1
            r1 = 18
            if (r8 != r1) goto L_0x000a
            goto L_0x0044
        L_0x000a:
            r2 = 0
            if (r8 != r0) goto L_0x0043
            java.lang.String r3 = "com.google.android.gms"
            android.content.pm.PackageManager r4 = r7.getPackageManager()     // Catch:{ Exception -> 0x0043 }
            android.content.pm.PackageInstaller r4 = r4.getPackageInstaller()     // Catch:{ Exception -> 0x0043 }
            java.util.List r4 = r4.getAllSessions()     // Catch:{ Exception -> 0x0043 }
            java.util.Iterator r4 = r4.iterator()
        L_0x001f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0036
            java.lang.Object r5 = r4.next()
            android.content.pm.PackageInstaller$SessionInfo r5 = (android.content.pm.PackageInstaller.SessionInfo) r5
            java.lang.String r5 = r5.getAppPackageName()
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001f
            goto L_0x0044
        L_0x0036:
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r7 = r7.getApplicationInfo(r3, r0)     // Catch:{  }
            boolean r0 = r7.enabled     // Catch:{  }
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            r8 = r1
        L_0x0047:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.c.b(android.content.Context, int):int");
    }
}
