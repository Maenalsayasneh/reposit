package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.e.a.x.e;
import m0.r.t.a.r.e.a.x.k;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1 extends Lambda implements l<Integer, e> {
    public final /* synthetic */ k c;
    public final /* synthetic */ l<Integer, e> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1(k kVar, l<? super Integer, e> lVar) {
        super(1);
        this.c = kVar;
        this.d = lVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e eVar = this.c.a.get(Integer.valueOf(intValue));
        return eVar == null ? this.d.invoke(Integer.valueOf(intValue)) : eVar;
    }
}
