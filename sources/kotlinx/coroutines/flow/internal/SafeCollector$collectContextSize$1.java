package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.p;

/* compiled from: SafeCollector.kt */
public final class SafeCollector$collectContextSize$1 extends Lambda implements p<Integer, e.a, Integer> {
    public static final SafeCollector$collectContextSize$1 c = new SafeCollector$collectContextSize$1();

    public SafeCollector$collectContextSize$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        e.a aVar = (e.a) obj2;
        return Integer.valueOf(((Number) obj).intValue() + 1);
    }
}
