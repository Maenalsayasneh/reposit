package m0.r.t.a;

import i0.j.f.p.h;
import java.util.Comparator;
import kotlin.reflect.KParameter;

/* compiled from: Comparisons.kt */
public final class d<T> implements Comparator<T> {
    public final int compare(T t, T t2) {
        return h.L(((KParameter) t).getName(), ((KParameter) t2).getName());
    }
}
