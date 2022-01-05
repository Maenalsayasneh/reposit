package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.m.v;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 extends Lambda implements l<CallableMemberDescriptor, v> {
    public final /* synthetic */ o0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1(o0 o0Var) {
        super(1);
        this.c = o0Var;
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        i.e(callableMemberDescriptor, "it");
        v type = callableMemberDescriptor.h().get(this.c.g()).getType();
        i.d(type, "it.valueParameters[p.index].type");
        return type;
    }
}
