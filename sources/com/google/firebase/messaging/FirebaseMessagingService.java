package com.google.firebase.messaging;

import i0.h.c.t.g;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class FirebaseMessagingService extends g {
    public static final Queue<String> Y1 = new ArrayDeque(10);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:91|92|93|94|95|96|97) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x019e */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Intent r11) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r3 = "FirebaseMessaging"
            if (r1 != 0) goto L_0x0047
            boolean r1 = r2.equals(r0)
            if (r1 == 0) goto L_0x0017
            goto L_0x0047
        L_0x0017:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "token"
            java.lang.String r11 = r11.getStringExtra(r0)
            r10.h(r11)
            return
        L_0x0029:
            java.lang.String r11 = r11.getAction()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "Unknown intent action: "
            int r1 = r11.length()
            if (r1 == 0) goto L_0x003e
            java.lang.String r11 = r0.concat(r11)
            goto L_0x0043
        L_0x003e:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0)
        L_0x0043:
            android.util.Log.d(r3, r11)
            return
        L_0x0047:
            java.lang.String r0 = "google.message_id"
            java.lang.String r1 = r11.getStringExtra(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r5 = 1
            r6 = 3
            r7 = 0
            if (r4 == 0) goto L_0x0057
            goto L_0x008e
        L_0x0057:
            java.util.Queue<java.lang.String> r4 = Y1
            boolean r8 = r4.contains(r1)
            if (r8 == 0) goto L_0x0080
            boolean r4 = android.util.Log.isLoggable(r3, r6)
            if (r4 == 0) goto L_0x007e
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "Received duplicate message: "
            int r8 = r1.length()
            if (r8 == 0) goto L_0x0076
            java.lang.String r1 = r4.concat(r1)
            goto L_0x007b
        L_0x0076:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
        L_0x007b:
            android.util.Log.d(r3, r1)
        L_0x007e:
            r1 = r5
            goto L_0x008f
        L_0x0080:
            int r8 = r4.size()
            r9 = 10
            if (r8 < r9) goto L_0x008b
            r4.remove()
        L_0x008b:
            r4.add(r1)
        L_0x008e:
            r1 = r7
        L_0x008f:
            if (r1 != 0) goto L_0x020a
            java.lang.String r1 = "message_type"
            java.lang.String r1 = r11.getStringExtra(r1)
            java.lang.String r4 = "gcm"
            if (r1 != 0) goto L_0x009c
            r1 = r4
        L_0x009c:
            int r8 = r1.hashCode()
            r9 = 2
            switch(r8) {
                case -2062414158: goto L_0x00c1;
                case 102161: goto L_0x00b9;
                case 814694033: goto L_0x00af;
                case 814800675: goto L_0x00a5;
                default: goto L_0x00a4;
            }
        L_0x00a4:
            goto L_0x00cb
        L_0x00a5:
            java.lang.String r4 = "send_event"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cb
            r4 = r9
            goto L_0x00cc
        L_0x00af:
            java.lang.String r4 = "send_error"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cb
            r4 = r6
            goto L_0x00cc
        L_0x00b9:
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cb
            r4 = r7
            goto L_0x00cc
        L_0x00c1:
            java.lang.String r4 = "deleted_messages"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cb
            r4 = r5
            goto L_0x00cc
        L_0x00cb:
            r4 = -1
        L_0x00cc:
            if (r4 == 0) goto L_0x010f
            if (r4 == r5) goto L_0x020a
            if (r4 == r9) goto L_0x0107
            if (r4 == r6) goto L_0x00ec
            java.lang.String r11 = "Received message with unknown type: "
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00e1
            java.lang.String r11 = r11.concat(r1)
            goto L_0x00e7
        L_0x00e1:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r11)
            r11 = r0
        L_0x00e7:
            android.util.Log.w(r3, r11)
            goto L_0x020a
        L_0x00ec:
            java.lang.String r0 = r11.getStringExtra(r0)
            if (r0 != 0) goto L_0x00f7
            java.lang.String r0 = "message_id"
            r11.getStringExtra(r0)
        L_0x00f7:
            com.google.firebase.messaging.SendException r0 = new com.google.firebase.messaging.SendException
            java.lang.String r1 = "error"
            java.lang.String r11 = r11.getStringExtra(r1)
            r0.<init>(r11)
            r10.i()
            goto L_0x020a
        L_0x0107:
            r11.getStringExtra(r0)
            r10.g()
            goto L_0x020a
        L_0x010f:
            boolean r0 = i0.h.c.t.e0.c(r11)
            if (r0 == 0) goto L_0x011a
            java.lang.String r0 = "_nr"
            i0.h.c.t.e0.b(r0, r11)
        L_0x011a:
            java.lang.String r0 = r11.getAction()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0125
            goto L_0x016e
        L_0x0125:
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            i0.h.c.c.b()     // Catch:{ IllegalStateException -> 0x0169 }
            i0.h.c.c r1 = i0.h.c.c.b()
            r1.a()
            android.content.Context r1 = r1.d
            java.lang.String r2 = "com.google.firebase.messaging"
            android.content.SharedPreferences r2 = r1.getSharedPreferences(r2, r7)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r2.contains(r4)
            if (r5 == 0) goto L_0x0146
            boolean r7 = r2.getBoolean(r4, r7)
            goto L_0x016e
        L_0x0146:
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x016e }
            if (r2 == 0) goto L_0x016e
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x016e }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r4)     // Catch:{ NameNotFoundException -> 0x016e }
            if (r1 == 0) goto L_0x016e
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x016e }
            if (r2 == 0) goto L_0x016e
            boolean r2 = r2.containsKey(r0)     // Catch:{ NameNotFoundException -> 0x016e }
            if (r2 == 0) goto L_0x016e
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x016e }
            boolean r7 = r1.getBoolean(r0, r7)     // Catch:{ NameNotFoundException -> 0x016e }
            goto L_0x016e
        L_0x0169:
            java.lang.String r0 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r3, r0)
        L_0x016e:
            if (r7 == 0) goto L_0x01b9
            i0.h.a.a.f r0 = com.google.firebase.messaging.FirebaseMessaging.c
            if (r0 == 0) goto L_0x01b4
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            i0.h.a.a.b r2 = new i0.h.a.a.b
            java.lang.String r4 = "json"
            r2.<init>(r4)
            i0.h.a.a.d r4 = i0.h.c.t.d0.a
            java.lang.String r5 = "FCM_CLIENT_EVENT_LOGGING"
            i0.h.a.a.e r0 = r0.a(r5, r1, r2, r4)
            i0.h.c.t.x r1 = new i0.h.c.t.x
            r1.<init>(r11)
            i0.h.c.t.x$b r2 = new i0.h.c.t.x$b
            r2.<init>(r1)
            i0.h.c.m.a r1 = i0.h.c.t.e0.a     // Catch:{ EncodingException -> 0x01ae }
            i0.h.c.m.h.d r1 = (i0.h.c.m.h.d) r1     // Catch:{ EncodingException -> 0x01ae }
            java.util.Objects.requireNonNull(r1)     // Catch:{ EncodingException -> 0x01ae }
            java.io.StringWriter r4 = new java.io.StringWriter     // Catch:{ EncodingException -> 0x01ae }
            r4.<init>()     // Catch:{ EncodingException -> 0x01ae }
            r1.a(r2, r4)     // Catch:{ IOException -> 0x019e }
        L_0x019e:
            java.lang.String r1 = r4.toString()     // Catch:{ EncodingException -> 0x01ae }
            i0.h.a.a.a r2 = new i0.h.a.a.a     // Catch:{ EncodingException -> 0x01ae }
            com.google.android.datatransport.Priority r4 = com.google.android.datatransport.Priority.VERY_LOW     // Catch:{ EncodingException -> 0x01ae }
            r5 = 0
            r2.<init>(r5, r1, r4)     // Catch:{ EncodingException -> 0x01ae }
            r0.a(r2)     // Catch:{ EncodingException -> 0x01ae }
            goto L_0x01b9
        L_0x01ae:
            java.lang.String r0 = "Failed to encode big query analytics payload. Skip sending"
            android.util.Log.d(r3, r0)
            goto L_0x01b9
        L_0x01b4:
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r3, r0)
        L_0x01b9:
            android.os.Bundle r0 = r11.getExtras()
            if (r0 != 0) goto L_0x01c4
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x01c4:
            java.lang.String r1 = "androidx.content.wakelockid"
            r0.remove(r1)
            boolean r1 = i0.h.c.t.g0.f(r0)
            if (r1 == 0) goto L_0x0202
            i0.h.c.t.g0 r1 = new i0.h.c.t.g0
            r1.<init>(r0)
            i0.h.a.b.c.m.f.a r2 = new i0.h.a.b.c.m.f.a
            java.lang.String r3 = "Firebase-Messaging-Network-Io"
            r2.<init>(r3)
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor(r2)
            i0.h.c.t.c r3 = new i0.h.c.t.c
            r3.<init>(r10, r1, r2)
            boolean r1 = r3.a()     // Catch:{ all -> 0x01fd }
            if (r1 == 0) goto L_0x01ee
            r2.shutdown()
            goto L_0x020a
        L_0x01ee:
            r2.shutdown()
            boolean r1 = i0.h.c.t.e0.c(r11)
            if (r1 == 0) goto L_0x0202
            java.lang.String r1 = "_nf"
            i0.h.c.t.e0.b(r1, r11)
            goto L_0x0202
        L_0x01fd:
            r11 = move-exception
            r2.shutdown()
            throw r11
        L_0x0202:
            com.google.firebase.messaging.RemoteMessage r11 = new com.google.firebase.messaging.RemoteMessage
            r11.<init>(r0)
            r10.f(r11)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void f(RemoteMessage remoteMessage) {
    }

    public void g() {
    }

    public void h(String str) {
    }

    public void i() {
    }
}
