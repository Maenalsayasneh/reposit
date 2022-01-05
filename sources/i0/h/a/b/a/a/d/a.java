package i0.h.a.b.a.a.d;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.dynamite.DynamiteModule;
import i0.h.a.b.c.g.b;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public class a extends b<GoogleSignInOptions> {
    public static int k = 1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r6, com.google.android.gms.auth.api.signin.GoogleSignInOptions r7) {
        /*
            r5 = this;
            i0.h.a.b.c.g.a<com.google.android.gms.auth.api.signin.GoogleSignInOptions> r0 = i0.h.a.b.a.a.a.e
            i0.h.a.b.c.g.j.a r1 = new i0.h.a.b.c.g.j.a
            r1.<init>()
            java.lang.String r2 = "StatusExceptionMapper must not be null."
            h0.b0.v.A(r1, r2)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            i0.h.a.b.c.g.b$a r3 = new i0.h.a.b.c.g.b$a
            r4 = 0
            r3.<init>(r1, r4, r2)
            r5.<init>(r6, r0, r7, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.a.a.d.a.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    public final synchronized int d() {
        if (k == 1) {
            Context context = this.a;
            Object obj = i0.h.a.b.c.b.b;
            i0.h.a.b.c.b bVar = i0.h.a.b.c.b.c;
            int b = bVar.b(context, 12451000);
            if (b == 0) {
                k = 4;
            } else if (bVar.a(context, b, (String) null) != null || DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                k = 2;
            } else {
                k = 3;
            }
        }
        return k;
    }
}
