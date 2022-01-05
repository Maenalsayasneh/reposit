package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.m.v;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 extends Lambda implements l<CallableMemberDescriptor, v> {
    public static final SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 c = new SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1();

    public SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        i.e(callableMemberDescriptor, "it");
        f0 l02 = callableMemberDescriptor.l0();
        i.c(l02);
        v type = l02.getType();
        i.d(type, "it.extensionReceiverParameter!!.type");
        return type;
    }
}
