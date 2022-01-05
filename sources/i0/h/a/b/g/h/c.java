package i0.h.a.b.g.h;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import i0.h.a.b.c.g.j.e;
import i0.h.a.b.c.g.j.k;
import i0.h.a.b.c.i.d;
import i0.h.a.b.i.b;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class c extends d<s2> {
    public c(Context context, Looper looper, i0.h.a.b.c.i.c cVar, e eVar, k kVar) {
        super(context, looper, 205, cVar, eVar, kVar);
    }

    public final int j() {
        return 17108000;
    }

    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptcha.internal.IRecaptchaService");
        if (queryLocalInterface instanceof s2) {
            return (s2) queryLocalInterface;
        }
        return new r2(iBinder);
    }

    public final Feature[] r() {
        return b.e;
    }

    public final String v() {
        return "com.google.android.gms.recaptcha.internal.IRecaptchaService";
    }

    public final String w() {
        return "com.google.android.gms.recaptcha.service.START";
    }
}
