package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;

/* compiled from: CapturedTypeConstructor.kt */
public final class CapturedTypeConstructorKt$createCapturedIfNeeded$1 extends Lambda implements a<v> {
    public final /* synthetic */ m0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CapturedTypeConstructorKt$createCapturedIfNeeded$1(m0 m0Var) {
        super(0);
        this.c = m0Var;
    }

    public Object invoke() {
        v type = this.c.getType();
        i.d(type, "this@createCapturedIfNeeded.type");
        return type;
    }
}
