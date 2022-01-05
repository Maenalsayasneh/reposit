package i0.h.c.t;

import android.content.Intent;
import h0.b0.v;
import i0.h.c.m.d;
import i0.h.c.m.e;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class x {
    public final String a = "MESSAGE_DELIVERED";
    public final Intent b;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static class a implements d<x> {
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
            if ("normal".equals(r6) != false) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0178, code lost:
            if (r6.isEmpty() != false) goto L_0x017a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0148  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.Object r6, java.lang.Object r7) throws java.io.IOException {
            /*
                r5 = this;
                i0.h.c.t.x r6 = (i0.h.c.t.x) r6
                i0.h.c.m.e r7 = (i0.h.c.m.e) r7
                android.content.Intent r0 = r6.b
                android.os.Bundle r1 = r0.getExtras()
                java.lang.String r2 = "google.ttl"
                java.lang.Object r1 = r1.get(r2)
                boolean r2 = r1 instanceof java.lang.Integer
                r3 = 0
                if (r2 == 0) goto L_0x001c
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0049
            L_0x001c:
                boolean r2 = r1 instanceof java.lang.String
                if (r2 == 0) goto L_0x0048
                r2 = r1
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0028 }
                int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0028 }
                goto L_0x0049
            L_0x0028:
                java.lang.String r1 = java.lang.String.valueOf(r1)
                int r2 = r1.length()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                int r2 = r2 + 13
                r4.<init>(r2)
                java.lang.String r2 = "Invalid TTL: "
                r4.append(r2)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                java.lang.String r2 = "FirebaseMessaging"
                android.util.Log.w(r2, r1)
            L_0x0048:
                r1 = r3
            L_0x0049:
                java.lang.String r2 = "ttl"
                r7.b(r2, r1)
                java.lang.String r6 = r6.a
                java.lang.String r1 = "event"
                r7.e(r1, r6)
                java.lang.String r6 = "google.to"
                java.lang.String r6 = r0.getStringExtra(r6)
                boolean r1 = android.text.TextUtils.isEmpty(r6)
                if (r1 == 0) goto L_0x007d
                i0.h.c.c r6 = i0.h.c.c.b()     // Catch:{ ExecutionException -> 0x0076, InterruptedException -> 0x0074 }
                i0.h.c.r.f r6 = i0.h.c.r.f.f(r6)     // Catch:{ ExecutionException -> 0x0076, InterruptedException -> 0x0074 }
                i0.h.a.b.m.g r6 = r6.getId()     // Catch:{ ExecutionException -> 0x0076, InterruptedException -> 0x0074 }
                java.lang.Object r6 = i0.h.a.b.c.m.b.j(r6)     // Catch:{ ExecutionException -> 0x0076, InterruptedException -> 0x0074 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ ExecutionException -> 0x0076, InterruptedException -> 0x0074 }
                goto L_0x007d
            L_0x0074:
                r6 = move-exception
                goto L_0x0077
            L_0x0076:
                r6 = move-exception
            L_0x0077:
                java.lang.RuntimeException r7 = new java.lang.RuntimeException
                r7.<init>(r6)
                throw r7
            L_0x007d:
                java.lang.String r1 = "instanceId"
                r7.e(r1, r6)
                java.lang.String r6 = "google.delivered_priority"
                java.lang.String r6 = r0.getStringExtra(r6)
                r1 = 1
                r2 = 2
                if (r6 != 0) goto L_0x00a1
                java.lang.String r6 = "google.priority_reduced"
                java.lang.String r6 = r0.getStringExtra(r6)
                java.lang.String r4 = "1"
                boolean r6 = r4.equals(r6)
                if (r6 == 0) goto L_0x009b
                goto L_0x00b3
            L_0x009b:
                java.lang.String r6 = "google.priority"
                java.lang.String r6 = r0.getStringExtra(r6)
            L_0x00a1:
                java.lang.String r4 = "high"
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L_0x00ab
                r3 = r1
                goto L_0x00b4
            L_0x00ab:
                java.lang.String r4 = "normal"
                boolean r6 = r4.equals(r6)
                if (r6 == 0) goto L_0x00b4
            L_0x00b3:
                r3 = r2
            L_0x00b4:
                java.lang.String r6 = "priority"
                r7.b(r6, r3)
                i0.h.c.c r6 = i0.h.c.c.b()
                r6.a()
                android.content.Context r6 = r6.d
                java.lang.String r6 = r6.getPackageName()
                java.lang.String r3 = "packageName"
                r7.e(r3, r6)
                java.lang.String r6 = "sdkPlatform"
                java.lang.String r3 = "ANDROID"
                r7.e(r6, r3)
                android.os.Bundle r6 = r0.getExtras()
                if (r6 == 0) goto L_0x00e5
                android.os.Bundle r6 = r0.getExtras()
                boolean r6 = i0.h.c.t.g0.f(r6)
                if (r6 == 0) goto L_0x00e5
                java.lang.String r6 = "DISPLAY_NOTIFICATION"
                goto L_0x00e7
            L_0x00e5:
                java.lang.String r6 = "DATA_MESSAGE"
            L_0x00e7:
                java.lang.String r3 = "messageType"
                r7.e(r3, r6)
                java.lang.String r6 = "google.message_id"
                java.lang.String r6 = r0.getStringExtra(r6)
                if (r6 != 0) goto L_0x00fa
                java.lang.String r6 = "message_id"
                java.lang.String r6 = r0.getStringExtra(r6)
            L_0x00fa:
                if (r6 == 0) goto L_0x0101
                java.lang.String r3 = "messageId"
                r7.e(r3, r6)
            L_0x0101:
                java.lang.String r6 = i0.h.c.t.e0.a(r0)
                if (r6 == 0) goto L_0x010c
                java.lang.String r3 = "topic"
                r7.e(r3, r6)
            L_0x010c:
                java.lang.String r6 = "collapse_key"
                java.lang.String r6 = r0.getStringExtra(r6)
                if (r6 == 0) goto L_0x0119
                java.lang.String r3 = "collapseKey"
                r7.e(r3, r6)
            L_0x0119:
                java.lang.String r6 = "google.c.a.m_l"
                java.lang.String r3 = r0.getStringExtra(r6)
                if (r3 == 0) goto L_0x012a
                java.lang.String r6 = r0.getStringExtra(r6)
                java.lang.String r3 = "analyticsLabel"
                r7.e(r3, r6)
            L_0x012a:
                java.lang.String r6 = "google.c.a.c_l"
                java.lang.String r3 = r0.getStringExtra(r6)
                if (r3 == 0) goto L_0x013b
                java.lang.String r6 = r0.getStringExtra(r6)
                java.lang.String r3 = "composerLabel"
                r7.e(r3, r6)
            L_0x013b:
                java.lang.String r6 = "google.c.sender.id"
                boolean r3 = r0.hasExtra(r6)
                if (r3 == 0) goto L_0x0148
                java.lang.String r6 = r0.getStringExtra(r6)
                goto L_0x017b
            L_0x0148:
                i0.h.c.c r6 = i0.h.c.c.b()
                r6.a()
                i0.h.c.h r0 = r6.f
                java.lang.String r0 = r0.e
                if (r0 == 0) goto L_0x0157
                r6 = r0
                goto L_0x017b
            L_0x0157:
                r6.a()
                i0.h.c.h r6 = r6.f
                java.lang.String r6 = r6.b
                java.lang.String r0 = "1:"
                boolean r0 = r6.startsWith(r0)
                if (r0 != 0) goto L_0x0167
                goto L_0x017b
            L_0x0167:
                java.lang.String r0 = ":"
                java.lang.String[] r6 = r6.split(r0)
                int r0 = r6.length
                r3 = 0
                if (r0 >= r2) goto L_0x0172
                goto L_0x017a
            L_0x0172:
                r6 = r6[r1]
                boolean r0 = r6.isEmpty()
                if (r0 == 0) goto L_0x017b
            L_0x017a:
                r6 = r3
            L_0x017b:
                if (r6 == 0) goto L_0x0182
                java.lang.String r0 = "projectNumber"
                r7.e(r0, r6)
            L_0x0182:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.h.c.t.x.a.a(java.lang.Object, java.lang.Object):void");
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static final class b {
        public final x a;

        public b(x xVar) {
            this.a = xVar;
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    public static final class c implements d<b> {
        public void a(Object obj, Object obj2) throws IOException {
            ((e) obj2).e("messaging_client_event", ((b) obj).a);
        }
    }

    public x(Intent intent) {
        v.y("MESSAGE_DELIVERED", "evenType must be non-null");
        v.A(intent, "intent must be non-null");
        this.b = intent;
    }
}
