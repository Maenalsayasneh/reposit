package i0.h.a.b.c;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class e {
    public static boolean a = false;
    public static boolean b = false;
    public static final AtomicBoolean c = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fc  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(@androidx.annotation.RecentlyNonNull android.content.Context r10, int r11) {
        /*
            android.content.res.Resources r0 = r10.getResources()     // Catch:{ all -> 0x000a }
            int r1 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue     // Catch:{ all -> 0x000a }
            r0.getString(r1)     // Catch:{ all -> 0x000a }
            goto L_0x0011
        L_0x000a:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L_0x0011:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r10.getPackageName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0075
            java.util.concurrent.atomic.AtomicBoolean r0 = d
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0075
            java.lang.Object r0 = i0.h.a.b.c.i.p0.a
            monitor-enter(r0)
            boolean r2 = i0.h.a.b.c.i.p0.b     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x002f
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x005c
        L_0x002f:
            i0.h.a.b.c.i.p0.b = r1     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = r10.getPackageName()     // Catch:{ all -> 0x0072 }
            i0.h.a.b.c.n.a r3 = i0.h.a.b.c.n.b.a(r10)     // Catch:{ all -> 0x0072 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.a(r2, r4)     // Catch:{ NameNotFoundException -> 0x0053 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0053 }
            if (r2 != 0) goto L_0x0045
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            goto L_0x005c
        L_0x0045:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch:{ NameNotFoundException -> 0x0053 }
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch:{ NameNotFoundException -> 0x0053 }
            i0.h.a.b.c.i.p0.c = r2     // Catch:{ NameNotFoundException -> 0x0053 }
            goto L_0x005b
        L_0x0053:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch:{ all -> 0x0072 }
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
        L_0x005c:
            int r0 = i0.h.a.b.c.i.p0.c
            if (r0 == 0) goto L_0x006c
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L_0x0066
            goto L_0x0075
        L_0x0066:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r10.<init>(r0)
            throw r10
        L_0x006c:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r10 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r10.<init>()
            throw r10
        L_0x0072:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0072 }
            throw r10
        L_0x0075:
            boolean r0 = h0.b0.v.N0(r10)
            r2 = 0
            if (r0 != 0) goto L_0x00ac
            java.lang.Boolean r0 = h0.b0.v.d
            if (r0 != 0) goto L_0x00a2
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L_0x009b
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r0 = r2
            goto L_0x009c
        L_0x009b:
            r0 = r1
        L_0x009c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            h0.b0.v.d = r0
        L_0x00a2:
            java.lang.Boolean r0 = h0.b0.v.d
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00ac
            r0 = r1
            goto L_0x00ad
        L_0x00ac:
            r0 = r2
        L_0x00ad:
            java.lang.String r3 = "com.google.android.gms"
            if (r11 < 0) goto L_0x00b3
            r4 = r1
            goto L_0x00b4
        L_0x00b3:
            r4 = r2
        L_0x00b4:
            h0.b0.v.t(r4)
            java.lang.String r4 = r10.getPackageName()
            android.content.pm.PackageManager r5 = r10.getPackageManager()
            r6 = 0
            r7 = 9
            java.lang.String r8 = "GooglePlayServicesUtil"
            if (r0 == 0) goto L_0x00df
            java.lang.String r6 = "com.android.vending"
            r9 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r6, r9)     // Catch:{ NameNotFoundException -> 0x00cf }
            goto L_0x00df
        L_0x00cf:
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = " requires the Google Play Store, but it is missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r8, r10)
        L_0x00dc:
            r1 = r7
            goto L_0x0192
        L_0x00df:
            r9 = 64
            android.content.pm.PackageInfo r9 = r5.getPackageInfo(r3, r9)     // Catch:{ NameNotFoundException -> 0x0185 }
            i0.h.a.b.c.f.a(r10)
            boolean r10 = i0.h.a.b.c.f.c(r9, r1)
            if (r10 != 0) goto L_0x00fc
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = " requires Google Play services, but their signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r8, r10)
            goto L_0x00dc
        L_0x00fc:
            if (r0 == 0) goto L_0x0125
            java.lang.String r10 = "null reference"
            java.util.Objects.requireNonNull(r6, r10)
            boolean r10 = i0.h.a.b.c.f.c(r6, r1)
            if (r10 == 0) goto L_0x0117
            android.content.pm.Signature[] r10 = r6.signatures
            r10 = r10[r2]
            android.content.pm.Signature[] r0 = r9.signatures
            r0 = r0[r2]
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x0125
        L_0x0117:
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = " requires Google Play Store, but its signature is invalid."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r8, r10)
            goto L_0x00dc
        L_0x0125:
            int r10 = r9.versionCode
            r0 = -1
            if (r10 != r0) goto L_0x012c
            r6 = r0
            goto L_0x012e
        L_0x012c:
            int r6 = r10 / 1000
        L_0x012e:
            if (r11 != r0) goto L_0x0131
            goto L_0x0133
        L_0x0131:
            int r0 = r11 / 1000
        L_0x0133:
            if (r6 >= r0) goto L_0x0165
            java.lang.String r0 = java.lang.String.valueOf(r4)
            int r0 = r0.length()
            int r0 = r0 + 82
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Google Play services out of date for "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ".  Requires "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r11 = " but found "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.w(r8, r10)
            r1 = 2
            goto L_0x0192
        L_0x0165:
            android.content.pm.ApplicationInfo r10 = r9.applicationInfo
            if (r10 != 0) goto L_0x017d
            android.content.pm.ApplicationInfo r10 = r5.getApplicationInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x016e }
            goto L_0x017d
        L_0x016e:
            r10 = move-exception
            java.lang.String r11 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r11 = r11.concat(r0)
            android.util.Log.wtf(r8, r11, r10)
            goto L_0x0192
        L_0x017d:
            boolean r10 = r10.enabled
            if (r10 != 0) goto L_0x0183
            r1 = 3
            goto L_0x0192
        L_0x0183:
            r1 = r2
            goto L_0x0192
        L_0x0185:
            java.lang.String r10 = java.lang.String.valueOf(r4)
            java.lang.String r11 = " requires Google Play services, but they are missing."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.w(r8, r10)
        L_0x0192:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.c.e.a(android.content.Context, int):int");
    }
}
