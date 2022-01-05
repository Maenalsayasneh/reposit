package i0.h.c.t;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class c {
    public final Executor a;
    public final Context b;
    public final g0 c;

    public c(Context context, g0 g0Var, Executor executor) {
        this.a = executor;
        this.b = context;
        this.c = g0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        if (r4.importance == 100) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (r6 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0386 A[SYNTHETIC, Splitter:B:152:0x0386] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03ad A[SYNTHETIC, Splitter:B:158:0x03ad] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0413  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x044c  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x048e A[SYNTHETIC, Splitter:B:198:0x048e] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04dd A[SYNTHETIC, Splitter:B:207:0x04dd] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x059e  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05d2  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x05ec A[SYNTHETIC, Splitter:B:250:0x05ec] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae A[Catch:{ NameNotFoundException -> 0x00b3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e5 A[SYNTHETIC, Splitter:B:41:0x00e5] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a() {
        /*
            r15 = this;
            i0.h.c.t.g0 r0 = r15.c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r15.b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x004d
        L_0x001e:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r15.b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x004d
            java.util.Iterator r3 = r3.iterator()
        L_0x0036:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x004d
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0036
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = r2
        L_0x004e:
            if (r1 == 0) goto L_0x0051
            return r2
        L_0x0051:
            i0.h.c.t.g0 r0 = r15.c
            java.lang.String r1 = "gcm.n.image"
            java.lang.String r0 = r0.e(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "FirebaseMessaging"
            if (r1 == 0) goto L_0x0062
            goto L_0x0086
        L_0x0062:
            i0.h.c.t.c0 r1 = new i0.h.c.t.c0     // Catch:{ MalformedURLException -> 0x006d }
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x006d }
            r4.<init>(r0)     // Catch:{ MalformedURLException -> 0x006d }
            r1.<init>(r4)     // Catch:{ MalformedURLException -> 0x006d }
            goto L_0x0087
        L_0x006d:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Not downloading image, bad URL: "
            int r4 = r0.length()
            if (r4 == 0) goto L_0x007e
            java.lang.String r0 = r1.concat(r0)
            goto L_0x0083
        L_0x007e:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0083:
            android.util.Log.w(r3, r0)
        L_0x0086:
            r1 = 0
        L_0x0087:
            if (r1 == 0) goto L_0x0096
            java.util.concurrent.Executor r0 = r15.a
            i0.h.c.t.b0 r4 = new i0.h.c.t.b0
            r4.<init>(r1)
            i0.h.a.b.m.g r0 = i0.h.a.b.c.m.b.u(r0, r4)
            r1.d = r0
        L_0x0096:
            android.content.Context r0 = r15.b
            i0.h.c.t.g0 r4 = r15.c
            java.util.concurrent.atomic.AtomicInteger r5 = i0.h.c.t.a.a
            java.lang.String r5 = "Couldn't get own application info: "
            android.content.pm.PackageManager r6 = r0.getPackageManager()
            java.lang.String r7 = r0.getPackageName()
            r8 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r7, r8)     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r6 == 0) goto L_0x00d0
            android.os.Bundle r6 = r6.metaData     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r6 == 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00b3:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r7 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 35
            r8.<init>(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r3, r6)
        L_0x00d0:
            android.os.Bundle r6 = android.os.Bundle.EMPTY
        L_0x00d2:
            java.lang.String r7 = r0.getPackageName()
            java.lang.String r8 = "gcm.n.android_channel_id"
            java.lang.String r8 = r4.e(r8)
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 3
            r11 = 26
            if (r9 >= r11) goto L_0x00e5
            goto L_0x016d
        L_0x00e5:
            android.content.pm.PackageManager r9 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016d }
            java.lang.String r12 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x016d }
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r12, r2)     // Catch:{ NameNotFoundException -> 0x016d }
            int r9 = r9.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x016d }
            if (r9 < r11) goto L_0x016d
            java.lang.Class<android.app.NotificationManager> r9 = android.app.NotificationManager.class
            java.lang.Object r9 = r0.getSystemService(r9)
            android.app.NotificationManager r9 = (android.app.NotificationManager) r9
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L_0x0120
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 == 0) goto L_0x010a
            goto L_0x016e
        L_0x010a:
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r11 = r11 + 122
            r12.<init>(r11)
            java.lang.String r11 = "Notification Channel requested ("
            java.lang.String r13 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            i0.d.a.a.a.t(r12, r11, r8, r13, r3)
        L_0x0120:
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r8 = r6.getString(r8)
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 != 0) goto L_0x0139
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 == 0) goto L_0x0133
            goto L_0x016e
        L_0x0133:
            java.lang.String r8 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r3, r8)
            goto L_0x013e
        L_0x0139:
            java.lang.String r8 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r3, r8)
        L_0x013e:
            java.lang.String r8 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r11 = r9.getNotificationChannel(r8)
            if (r11 != 0) goto L_0x016e
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r12 = r0.getPackageName()
            java.lang.String r13 = "fcm_fallback_notification_channel_label"
            java.lang.String r14 = "string"
            int r11 = r11.getIdentifier(r13, r14, r12)
            if (r11 != 0) goto L_0x0160
            java.lang.String r11 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r3, r11)
            java.lang.String r11 = "Misc"
            goto L_0x0164
        L_0x0160:
            java.lang.String r11 = r0.getString(r11)
        L_0x0164:
            android.app.NotificationChannel r12 = new android.app.NotificationChannel
            r12.<init>(r8, r11, r10)
            r9.createNotificationChannel(r12)
            goto L_0x016e
        L_0x016d:
            r8 = 0
        L_0x016e:
            android.content.res.Resources r9 = r0.getResources()
            android.content.pm.PackageManager r10 = r0.getPackageManager()
            androidx.core.app.NotificationCompat$Builder r11 = new androidx.core.app.NotificationCompat$Builder
            r11.<init>((android.content.Context) r0, (java.lang.String) r8)
            java.lang.String r8 = "gcm.n.title"
            java.lang.String r8 = r4.d(r9, r7, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x018a
            r11.setContentTitle(r8)
        L_0x018a:
            java.lang.String r8 = "gcm.n.body"
            java.lang.String r8 = r4.d(r9, r7, r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x01a5
            r11.setContentText(r8)
            androidx.core.app.NotificationCompat$BigTextStyle r12 = new androidx.core.app.NotificationCompat$BigTextStyle
            r12.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r8 = r12.bigText(r8)
            r11.setStyle(r8)
        L_0x01a5:
            java.lang.String r8 = "gcm.n.icon"
            java.lang.String r8 = r4.e(r8)
            boolean r12 = android.text.TextUtils.isEmpty(r8)
            if (r12 != 0) goto L_0x01e3
            java.lang.String r12 = "drawable"
            int r12 = r9.getIdentifier(r8, r12, r7)
            if (r12 == 0) goto L_0x01bf
            boolean r13 = i0.h.c.t.a.b(r9, r12)
            if (r13 != 0) goto L_0x0223
        L_0x01bf:
            java.lang.String r12 = "mipmap"
            int r12 = r9.getIdentifier(r8, r12, r7)
            if (r12 == 0) goto L_0x01cd
            boolean r13 = i0.h.c.t.a.b(r9, r12)
            if (r13 != 0) goto L_0x0223
        L_0x01cd:
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 61
            r13.<init>(r12)
            java.lang.String r12 = "Icon resource "
            java.lang.String r14 = " not found. Notification will use default icon."
            i0.d.a.a.a.t(r13, r12, r8, r14, r3)
        L_0x01e3:
            java.lang.String r8 = "com.google.firebase.messaging.default_notification_icon"
            int r8 = r6.getInt(r8, r2)
            if (r8 == 0) goto L_0x01f1
            boolean r12 = i0.h.c.t.a.b(r9, r8)
            if (r12 != 0) goto L_0x0216
        L_0x01f1:
            android.content.pm.ApplicationInfo r12 = r10.getApplicationInfo(r7, r2)     // Catch:{ NameNotFoundException -> 0x01f9 }
            int r5 = r12.icon     // Catch:{ NameNotFoundException -> 0x01f9 }
            r12 = r5
            goto L_0x0217
        L_0x01f9:
            r12 = move-exception
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r13 = r12.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r13 = r13 + 35
            r14.<init>(r13)
            r14.append(r5)
            r14.append(r12)
            java.lang.String r5 = r14.toString()
            android.util.Log.w(r3, r5)
        L_0x0216:
            r12 = r8
        L_0x0217:
            r5 = 17301651(0x1080093, float:2.4979667E-38)
            if (r12 == 0) goto L_0x0222
            boolean r8 = i0.h.c.t.a.b(r9, r12)
            if (r8 != 0) goto L_0x0223
        L_0x0222:
            r12 = r5
        L_0x0223:
            r11.setSmallIcon((int) r12)
            java.lang.String r5 = "gcm.n.sound2"
            java.lang.String r5 = r4.e(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x0238
            java.lang.String r5 = "gcm.n.sound"
            java.lang.String r5 = r4.e(r5)
        L_0x0238:
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            r12 = 2
            if (r8 == 0) goto L_0x0241
            r5 = 0
            goto L_0x0286
        L_0x0241:
            java.lang.String r8 = "default"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0282
            java.lang.String r8 = "raw"
            int r8 = r9.getIdentifier(r5, r8, r7)
            if (r8 == 0) goto L_0x0282
            java.lang.String r8 = java.lang.String.valueOf(r7)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r5)
            int r9 = r9.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r8 = r8 + 24
            int r8 = r8 + r9
            r13.<init>(r8)
            java.lang.String r8 = "android.resource://"
            r13.append(r8)
            r13.append(r7)
            java.lang.String r8 = "/raw/"
            r13.append(r8)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x0286
        L_0x0282:
            android.net.Uri r5 = android.media.RingtoneManager.getDefaultUri(r12)
        L_0x0286:
            if (r5 == 0) goto L_0x028b
            r11.setSound(r5)
        L_0x028b:
            java.lang.String r5 = "gcm.n.click_action"
            java.lang.String r5 = r4.e(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x02a5
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r5)
            r8.setPackage(r7)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r8.setFlags(r5)
            goto L_0x02de
        L_0x02a5:
            java.lang.String r5 = "gcm.n.link_android"
            java.lang.String r5 = r4.e(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 == 0) goto L_0x02b7
            java.lang.String r5 = "gcm.n.link"
            java.lang.String r5 = r4.e(r5)
        L_0x02b7:
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x02c2
            android.net.Uri r5 = android.net.Uri.parse(r5)
            goto L_0x02c3
        L_0x02c2:
            r5 = 0
        L_0x02c3:
            if (r5 == 0) goto L_0x02d3
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "android.intent.action.VIEW"
            r8.<init>(r9)
            r8.setPackage(r7)
            r8.setData(r5)
            goto L_0x02de
        L_0x02d3:
            android.content.Intent r8 = r10.getLaunchIntentForPackage(r7)
            if (r8 != 0) goto L_0x02de
            java.lang.String r5 = "No activity found to launch app"
            android.util.Log.w(r3, r5)
        L_0x02de:
            java.lang.String r5 = "google.c.a.e"
            if (r8 != 0) goto L_0x02e5
            r7 = 0
            goto L_0x0357
        L_0x02e5:
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r8.addFlags(r7)
            android.os.Bundle r7 = new android.os.Bundle
            android.os.Bundle r9 = r4.a
            r7.<init>(r9)
            android.os.Bundle r9 = r4.a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x02fb:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0329
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r13 = "google.c."
            boolean r13 = r10.startsWith(r13)
            if (r13 != 0) goto L_0x0322
            java.lang.String r13 = "gcm.n."
            boolean r13 = r10.startsWith(r13)
            if (r13 != 0) goto L_0x0322
            java.lang.String r13 = "gcm.notification."
            boolean r13 = r10.startsWith(r13)
            if (r13 == 0) goto L_0x0320
            goto L_0x0322
        L_0x0320:
            r13 = r2
            goto L_0x0323
        L_0x0322:
            r13 = 1
        L_0x0323:
            if (r13 == 0) goto L_0x02fb
            r7.remove(r10)
            goto L_0x02fb
        L_0x0329:
            r8.putExtras(r7)
            java.util.concurrent.atomic.AtomicInteger r7 = i0.h.c.t.a.a
            int r7 = r7.incrementAndGet()
            r9 = 1140850688(0x44000000, float:512.0)
            android.app.PendingIntent r7 = android.app.PendingIntent.getActivity(r0, r7, r8, r9)
            boolean r8 = r4.a(r5)
            if (r8 == 0) goto L_0x0357
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            r8.<init>(r9)
            android.os.Bundle r9 = r4.g()
            android.content.Intent r8 = r8.putExtras(r9)
            java.lang.String r9 = "pending_intent"
            android.content.Intent r7 = r8.putExtra(r9, r7)
            android.app.PendingIntent r7 = i0.h.c.t.a.a(r0, r7)
        L_0x0357:
            r11.setContentIntent(r7)
            boolean r5 = r4.a(r5)
            if (r5 != 0) goto L_0x0362
            r5 = 0
            goto L_0x0375
        L_0x0362:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r7 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r5.<init>(r7)
            android.os.Bundle r7 = r4.g()
            android.content.Intent r5 = r5.putExtras(r7)
            android.app.PendingIntent r5 = i0.h.c.t.a.a(r0, r5)
        L_0x0375:
            if (r5 == 0) goto L_0x037a
            r11.setDeleteIntent(r5)
        L_0x037a:
            java.lang.String r5 = "gcm.n.color"
            java.lang.String r5 = r4.e(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x03a5
            int r7 = android.graphics.Color.parseColor(r5)     // Catch:{ IllegalArgumentException -> 0x038f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x038f }
            goto L_0x03bc
        L_0x038f:
            java.lang.String r7 = java.lang.String.valueOf(r5)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r7 = r7 + 56
            r8.<init>(r7)
            java.lang.String r7 = "Color is invalid: "
            java.lang.String r9 = ". Notification will use default color."
            i0.d.a.a.a.t(r8, r7, r5, r9, r3)
        L_0x03a5:
            java.lang.String r5 = "com.google.firebase.messaging.default_notification_color"
            int r5 = r6.getInt(r5, r2)
            if (r5 == 0) goto L_0x03bb
            int r0 = h0.i.b.a.getColor(r0, r5)     // Catch:{ NotFoundException -> 0x03b6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NotFoundException -> 0x03b6 }
            goto L_0x03bc
        L_0x03b6:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r3, r0)
        L_0x03bb:
            r0 = 0
        L_0x03bc:
            if (r0 == 0) goto L_0x03c5
            int r0 = r0.intValue()
            r11.setColor(r0)
        L_0x03c5:
            java.lang.String r0 = "gcm.n.sticky"
            boolean r0 = r4.a(r0)
            r0 = r0 ^ 1
            r11.setAutoCancel(r0)
            java.lang.String r0 = "gcm.n.local_only"
            boolean r0 = r4.a(r0)
            r11.setLocalOnly(r0)
            java.lang.String r0 = "gcm.n.ticker"
            java.lang.String r0 = r4.e(r0)
            if (r0 == 0) goto L_0x03e4
            r11.setTicker(r0)
        L_0x03e4:
            java.lang.String r0 = "gcm.n.notification_priority"
            java.lang.Integer r0 = r4.b(r0)
            if (r0 != 0) goto L_0x03ed
            goto L_0x0410
        L_0x03ed:
            int r5 = r0.intValue()
            r6 = -2
            if (r5 < r6) goto L_0x03fa
            int r5 = r0.intValue()
            if (r5 <= r12) goto L_0x0411
        L_0x03fa:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r0.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r5 = r5 + 72
            r6.<init>(r5)
            java.lang.String r5 = "notificationPriority is invalid "
            java.lang.String r7 = ". Skipping setting notificationPriority."
            i0.d.a.a.a.t(r6, r5, r0, r7, r3)
        L_0x0410:
            r0 = 0
        L_0x0411:
            if (r0 == 0) goto L_0x041a
            int r0 = r0.intValue()
            r11.setPriority(r0)
        L_0x041a:
            java.lang.String r0 = "gcm.n.visibility"
            java.lang.Integer r0 = r4.b(r0)
            java.lang.String r5 = "NotificationParams"
            if (r0 != 0) goto L_0x0425
            goto L_0x0449
        L_0x0425:
            int r6 = r0.intValue()
            r7 = -1
            if (r6 < r7) goto L_0x0433
            int r6 = r0.intValue()
            r7 = 1
            if (r6 <= r7) goto L_0x044a
        L_0x0433:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 53
            r7.<init>(r6)
            java.lang.String r6 = "visibility is invalid: "
            java.lang.String r8 = ". Skipping setting visibility."
            i0.d.a.a.a.t(r7, r6, r0, r8, r5)
        L_0x0449:
            r0 = 0
        L_0x044a:
            if (r0 == 0) goto L_0x0453
            int r0 = r0.intValue()
            r11.setVisibility(r0)
        L_0x0453:
            java.lang.String r0 = "gcm.n.notification_count"
            java.lang.Integer r0 = r4.b(r0)
            if (r0 != 0) goto L_0x045c
            goto L_0x0478
        L_0x045c:
            int r6 = r0.intValue()
            if (r6 >= 0) goto L_0x0479
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 67
            r7.<init>(r6)
            java.lang.String r6 = "notificationCount is invalid: "
            java.lang.String r8 = ". Skipping setting notificationCount."
            i0.d.a.a.a.t(r7, r6, r0, r8, r3)
        L_0x0478:
            r0 = 0
        L_0x0479:
            if (r0 == 0) goto L_0x0482
            int r0 = r0.intValue()
            r11.setNumber(r0)
        L_0x0482:
            java.lang.String r0 = "gcm.n.event_time"
            java.lang.String r6 = r4.e(r0)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x04c6
            long r7 = java.lang.Long.parseLong(r6)     // Catch:{ NumberFormatException -> 0x0497 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ NumberFormatException -> 0x0497 }
            goto L_0x04c7
        L_0x0497:
            java.lang.String r0 = i0.h.c.t.g0.h(r0)
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r6)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r7 = r7 + 38
            int r7 = r7 + r8
            r9.<init>(r7)
            java.lang.String r7 = "Couldn't parse value of "
            java.lang.String r8 = "("
            i0.d.a.a.a.s(r9, r7, r0, r8, r6)
            java.lang.String r0 = ") into a long"
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            android.util.Log.w(r5, r0)
        L_0x04c6:
            r0 = 0
        L_0x04c7:
            if (r0 == 0) goto L_0x04d4
            r6 = 1
            r11.setShowWhen(r6)
            long r6 = r0.longValue()
            r11.setWhen(r6)
        L_0x04d4:
            java.lang.String r0 = "gcm.n.vibrate_timings"
            org.json.JSONArray r0 = r4.c(r0)
            if (r0 != 0) goto L_0x04dd
            goto L_0x0514
        L_0x04dd:
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            r7 = 1
            if (r6 <= r7) goto L_0x04f6
            int r6 = r0.length()     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            long[] r7 = new long[r6]     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            r8 = r2
        L_0x04eb:
            if (r8 >= r6) goto L_0x0515
            long r9 = r0.optLong(r8)     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            r7[r8] = r9     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            int r8 = r8 + 1
            goto L_0x04eb
        L_0x04f6:
            org.json.JSONException r6 = new org.json.JSONException     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            java.lang.String r7 = "vibrateTimings have invalid length"
            r6.<init>((java.lang.String) r7)     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
            throw r6     // Catch:{ NumberFormatException | JSONException -> 0x04fe }
        L_0x04fe:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r6 = r6 + 74
            r7.<init>(r6)
            java.lang.String r6 = "User defined vibrateTimings is invalid: "
            java.lang.String r8 = ". Skipping setting vibrateTimings."
            i0.d.a.a.a.t(r7, r6, r0, r8, r5)
        L_0x0514:
            r7 = 0
        L_0x0515:
            if (r7 == 0) goto L_0x051a
            r11.setVibrate(r7)
        L_0x051a:
            java.lang.String r0 = ". Skipping setting LightSettings"
            java.lang.String r6 = "LightSettings is invalid: "
            java.lang.String r7 = "gcm.n.light_settings"
            org.json.JSONArray r7 = r4.c(r7)
            if (r7 != 0) goto L_0x0527
            goto L_0x059b
        L_0x0527:
            r8 = 3
            int[] r9 = new int[r8]
            int r10 = r7.length()     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            if (r10 != r8) goto L_0x0554
            java.lang.String r8 = r7.optString(r2)     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            int r8 = android.graphics.Color.parseColor(r8)     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            r10 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            if (r8 == r10) goto L_0x054c
            r9[r2] = r8     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            r8 = 1
            int r10 = r7.optInt(r8)     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            r9[r8] = r10     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            int r8 = r7.optInt(r12)     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            r9[r12] = r8     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            goto L_0x059c
        L_0x054c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            java.lang.String r9 = "Transparent color is invalid"
            r8.<init>(r9)     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            throw r8     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
        L_0x0554:
            org.json.JSONException r8 = new org.json.JSONException     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            java.lang.String r9 = "lightSettings don't have all three fields"
            r8.<init>((java.lang.String) r9)     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
            throw r8     // Catch:{ JSONException -> 0x0589, IllegalArgumentException -> 0x055c }
        L_0x055c:
            r8 = move-exception
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = r8.getMessage()
            int r9 = r7.length()
            java.lang.String r10 = java.lang.String.valueOf(r8)
            int r10 = r10.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r9 = r9 + 60
            int r9 = r9 + r10
            r13.<init>(r9)
            java.lang.String r9 = ". "
            i0.d.a.a.a.s(r13, r6, r7, r9, r8)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.util.Log.w(r5, r0)
            goto L_0x059b
        L_0x0589:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r8 = r7.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 58
            r9.<init>(r8)
            i0.d.a.a.a.t(r9, r6, r7, r0, r5)
        L_0x059b:
            r9 = 0
        L_0x059c:
            if (r9 == 0) goto L_0x05a8
            r0 = r9[r2]
            r5 = 1
            r5 = r9[r5]
            r6 = r9[r12]
            r11.setLights(r0, r5, r6)
        L_0x05a8:
            java.lang.String r0 = "gcm.n.default_sound"
            boolean r0 = r4.a(r0)
            java.lang.String r5 = "gcm.n.default_vibrate_timings"
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L_0x05b8
            r0 = r0 | 2
        L_0x05b8:
            java.lang.String r5 = "gcm.n.default_light_settings"
            boolean r5 = r4.a(r5)
            if (r5 == 0) goto L_0x05c2
            r0 = r0 | 4
        L_0x05c2:
            r11.setDefaults(r0)
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r0 = r4.e(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x05d2
            goto L_0x05e9
        L_0x05d2:
            long r4 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r6 = 37
            r0.<init>(r6)
            java.lang.String r6 = "FCM-Notification:"
            r0.append(r6)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x05e9:
            if (r1 != 0) goto L_0x05ec
            goto L_0x064e
        L_0x05ec:
            i0.h.a.b.m.g<android.graphics.Bitmap> r4 = r1.d     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            java.lang.String r5 = "null reference"
            java.util.Objects.requireNonNull(r4, r5)     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            r6 = 5
            java.lang.Object r4 = i0.h.a.b.c.m.b.k(r4, r6, r5)     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            r11.setLargeIcon(r4)     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            androidx.core.app.NotificationCompat$BigPictureStyle r5 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            r5.<init>()     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            androidx.core.app.NotificationCompat$BigPictureStyle r4 = r5.bigPicture(r4)     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            r5 = 0
            androidx.core.app.NotificationCompat$BigPictureStyle r4 = r4.bigLargeIcon(r5)     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            r11.setStyle(r4)     // Catch:{ ExecutionException -> 0x062b, InterruptedException -> 0x061b, TimeoutException -> 0x0612 }
            goto L_0x064e
        L_0x0612:
            java.lang.String r4 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r3, r4)
            r1.close()
            goto L_0x064e
        L_0x061b:
            java.lang.String r4 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r3, r4)
            r1.close()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L_0x064e
        L_0x062b:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 26
            r5.<init>(r4)
            java.lang.String r4 = "Failed to download image: "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            android.util.Log.w(r3, r1)
        L_0x064e:
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r3, r1)
            if (r1 == 0) goto L_0x065a
            java.lang.String r1 = "Showing notification"
            android.util.Log.d(r3, r1)
        L_0x065a:
            android.content.Context r1 = r15.b
            java.lang.String r3 = "notification"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.app.NotificationManager r1 = (android.app.NotificationManager) r1
            android.app.Notification r3 = r11.build()
            r1.notify(r0, r2, r3)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.c.t.c.a():boolean");
    }
}
