package kotlin.coroutines;

import kotlin.jvm.internal.Lambda;
import m0.l.d;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CoroutineContext.kt */
public final class CoroutineContext$plus$1 extends Lambda implements p<e, e.a, e> {
    public static final CoroutineContext$plus$1 c = new CoroutineContext$plus$1();

    public CoroutineContext$plus$1() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        e eVar = (e) obj;
        e.a aVar = (e.a) obj2;
        i.e(eVar, "acc");
        i.e(aVar, "element");
        e minusKey = eVar.minusKey(aVar.getKey());
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.c;
        if (minusKey == emptyCoroutineContext) {
            return aVar;
        }
        int i = d.h;
        d.a aVar2 = d.a.c;
        d dVar = (d) minusKey.get(aVar2);
        if (dVar == null) {
            combinedContext = new CombinedContext(minusKey, aVar);
        } else {
            e minusKey2 = minusKey.minusKey(aVar2);
            if (minusKey2 == emptyCoroutineContext) {
                return new CombinedContext(aVar, dVar);
            }
            combinedContext = new CombinedContext(new CombinedContext(minusKey2, aVar), dVar);
        }
        return combinedContext;
    }
}
