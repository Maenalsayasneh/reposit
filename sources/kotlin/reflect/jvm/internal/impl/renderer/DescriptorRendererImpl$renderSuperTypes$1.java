package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.v;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl$renderSuperTypes$1 extends Lambda implements l<v, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$renderSuperTypes$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.c = descriptorRendererImpl;
    }

    public Object invoke(Object obj) {
        v vVar = (v) obj;
        DescriptorRendererImpl descriptorRendererImpl = this.c;
        i.d(vVar, "it");
        return descriptorRendererImpl.w(vVar);
    }
}
