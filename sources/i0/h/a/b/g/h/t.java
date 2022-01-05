package i0.h.a.b.g.h;

import i0.h.a.b.g.h.z;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class t extends u<z.c> {
    public final v<z.c> a(Object obj) {
        return ((z.d) obj).zzc;
    }

    public final boolean b(y0 y0Var) {
        return y0Var instanceof z.d;
    }

    public final v<z.c> c(Object obj) {
        z.d dVar = (z.d) obj;
        v<z.c> vVar = dVar.zzc;
        if (vVar.c) {
            dVar.zzc = (v) vVar.clone();
        }
        return dVar.zzc;
    }

    public final void d(Object obj) {
        ((z.d) obj).zzc.e();
    }
}
