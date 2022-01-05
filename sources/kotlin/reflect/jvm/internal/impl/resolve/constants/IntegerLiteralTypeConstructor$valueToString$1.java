package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.v;

/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class IntegerLiteralTypeConstructor$valueToString$1 extends Lambda implements l<v, CharSequence> {
    public static final IntegerLiteralTypeConstructor$valueToString$1 c = new IntegerLiteralTypeConstructor$valueToString$1();

    public IntegerLiteralTypeConstructor$valueToString$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        i.e(vVar, "it");
        return vVar.toString();
    }
}
