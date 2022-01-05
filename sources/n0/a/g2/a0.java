package n0.a.g2;

import kotlinx.coroutines.flow.StateFlowImpl;
import n0.a.g2.d0.n;
import n0.a.h2.t;

/* compiled from: StateFlow.kt */
public final class a0 {
    public static final t a = new t("NONE");
    public static final t b = new t("PENDING");

    public static final <T> q<T> a(T t) {
        if (t == null) {
            t = n.a;
        }
        return new StateFlowImpl(t);
    }

    public static final void b(q<Integer> qVar, int i) {
        Integer value;
        do {
            value = qVar.getValue();
        } while (!qVar.a(value, Integer.valueOf(value.intValue() + i)));
    }
}
