package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
public final class ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 extends Lambda implements l<CallableMemberDescriptor, Boolean> {
    public final /* synthetic */ ClassicBuiltinSpecialProperties c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1(ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties) {
        super(1);
        this.c = classicBuiltinSpecialProperties;
    }

    public Object invoke(Object obj) {
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
        i.e(callableMemberDescriptor, "it");
        return Boolean.valueOf(this.c.b(callableMemberDescriptor));
    }
}
