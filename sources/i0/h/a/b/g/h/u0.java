package i0.h.a.b.g.h;

import com.google.android.gms.internal.recaptcha.zzfi;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class u0 implements s0 {
    public final Map<?, ?> a(Object obj) {
        return (zzfi) obj;
    }

    public final Object b(Object obj, Object obj2) {
        zzfi zzfi = (zzfi) obj;
        zzfi zzfi2 = (zzfi) obj2;
        if (!zzfi2.isEmpty()) {
            if (!zzfi.c) {
                zzfi = zzfi.isEmpty() ? new zzfi() : new zzfi(zzfi);
            }
            zzfi.c();
            if (!zzfi2.isEmpty()) {
                zzfi.putAll(zzfi2);
            }
        }
        return zzfi;
    }

    public final q0<?, ?> c(Object obj) {
        Objects.requireNonNull((r0) obj);
        return null;
    }

    public final Object d(Object obj) {
        ((zzfi) obj).c = false;
        return obj;
    }
}
