package kotlinx.coroutines.internal;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.p;
import n0.a.x1;

/* compiled from: ThreadContext.kt */
public final class ThreadContextKt$countAll$1 extends Lambda implements p<Object, e.a, Object> {
    public static final ThreadContextKt$countAll$1 c = new ThreadContextKt$countAll$1();

    public ThreadContextKt$countAll$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        e.a aVar = (e.a) obj2;
        if (!(aVar instanceof x1)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int intValue = num == null ? 1 : num.intValue();
        if (intValue == 0) {
            return aVar;
        }
        return Integer.valueOf(intValue + 1);
    }
}
