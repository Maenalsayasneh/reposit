package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.z;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$enhanceTypeParameterBounds$1$1 extends Lambda implements l<v0, Boolean> {
    public static final SignatureEnhancement$enhanceTypeParameterBounds$1$1 c = new SignatureEnhancement$enhanceTypeParameterBounds$1$1();

    public SignatureEnhancement$enhanceTypeParameterBounds$1$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        v0 v0Var = (v0) obj;
        i.e(v0Var, "it");
        return Boolean.valueOf(v0Var instanceof z);
    }
}
