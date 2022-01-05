package kotlin.coroutines;

import kotlin.jvm.internal.Lambda;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CoroutineContextImpl.kt */
public final class CombinedContext$toString$1 extends Lambda implements p<String, e.a, String> {
    public static final CombinedContext$toString$1 c = new CombinedContext$toString$1();

    public CombinedContext$toString$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        e.a aVar = (e.a) obj2;
        i.e(str, "acc");
        i.e(aVar, "element");
        if (str.length() == 0) {
            return aVar.toString();
        }
        return str + ", " + aVar;
    }
}
