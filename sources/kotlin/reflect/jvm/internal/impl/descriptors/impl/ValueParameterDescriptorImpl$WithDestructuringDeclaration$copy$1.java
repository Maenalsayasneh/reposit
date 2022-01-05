package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import m0.n.a.a;
import m0.r.t.a.r.c.p0;

/* compiled from: ValueParameterDescriptorImpl.kt */
public final class ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 extends Lambda implements a<List<? extends p0>> {
    public final /* synthetic */ ValueParameterDescriptorImpl.WithDestructuringDeclaration c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(ValueParameterDescriptorImpl.WithDestructuringDeclaration withDestructuringDeclaration) {
        super(0);
        this.c = withDestructuringDeclaration;
    }

    public Object invoke() {
        return (List) this.c.e2.getValue();
    }
}
