package i0.h.a.b.g.h;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class z1 extends x1<w1, w1> {
    public final void a(Object obj, Object obj2) {
        ((z) obj).zzb = (w1) obj2;
    }

    public final /* synthetic */ Object b(Object obj) {
        return ((z) obj).zzb;
    }

    public final Object c(Object obj, Object obj2) {
        w1 w1Var = (w1) obj;
        w1 w1Var2 = (w1) obj2;
        if (w1Var2.equals(w1.a)) {
            return w1Var;
        }
        int i = w1Var.b + w1Var2.b;
        int[] copyOf = Arrays.copyOf(w1Var.c, i);
        System.arraycopy(w1Var2.c, 0, copyOf, w1Var.b, w1Var2.b);
        Object[] copyOf2 = Arrays.copyOf(w1Var.d, i);
        System.arraycopy(w1Var2.d, 0, copyOf2, w1Var.b, w1Var2.b);
        return new w1(i, copyOf, copyOf2, true);
    }

    public final void d(Object obj) {
        Objects.requireNonNull(((z) obj).zzb);
    }
}
