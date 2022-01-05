package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: RawType.kt */
public final class RawTypeImpl$render$newArgs$1 extends Lambda implements l<String, CharSequence> {
    public static final RawTypeImpl$render$newArgs$1 c = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "it");
        return i.k("(raw) ", str);
    }
}
