package i0.j.f.p;

/* compiled from: PlayStoreUtils */
public class f {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0050, code lost:
        com.instabug.library.util.InstabugSDKLogger.e(i0.j.f.p.f.class, r5.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r5) {
        /*
            java.lang.String r0 = "market://details?id="
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = r5.getPackageName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r0)
            r0 = 1208483840(0x48080000, float:139264.0)
            r1.addFlags(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            r5.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002a }
            goto L_0x0059
        L_0x002a:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x004f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004f }
            r3.<init>()     // Catch:{ Exception -> 0x004f }
            java.lang.String r4 = "https://play.google.com/store/apps/details?id="
            r3.append(r4)     // Catch:{ Exception -> 0x004f }
            java.lang.String r4 = r5.getPackageName()     // Catch:{ Exception -> 0x004f }
            r3.append(r4)     // Catch:{ Exception -> 0x004f }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x004f }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x004f }
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x004f }
            r1.addFlags(r0)     // Catch:{ Exception -> 0x004f }
            r5.startActivity(r1)     // Catch:{ Exception -> 0x004f }
            goto L_0x0059
        L_0x004f:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            java.lang.Class<i0.j.f.p.f> r0 = i0.j.f.p.f.class
            com.instabug.library.util.InstabugSDKLogger.e(r0, r5)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.f.p.f.a(android.content.Context):void");
    }
}
