package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.k.c;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v0;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 extends Lambda implements l<v0, Boolean> {
    public static final SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1 c = new SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1();

    public SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        f c2 = ((v0) obj).I0().c();
        if (c2 == null) {
            return Boolean.FALSE;
        }
        d name = c2.getName();
        c cVar = c.a;
        b bVar = c.g;
        return Boolean.valueOf(i.a(name, bVar.g()) && i.a(DescriptorUtilsKt.d(c2), bVar));
    }
}
