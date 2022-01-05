package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.e.a.x.e;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 extends Lambda implements l<Integer, e> {
    public final /* synthetic */ e[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1(e[] eVarArr) {
        super(1);
        this.c = eVarArr;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e[] eVarArr = this.c;
        if (intValue >= 0 && intValue <= h.t1(eVarArr)) {
            return eVarArr[intValue];
        }
        e eVar = e.a;
        e eVar2 = e.a;
        return e.b;
    }
}
