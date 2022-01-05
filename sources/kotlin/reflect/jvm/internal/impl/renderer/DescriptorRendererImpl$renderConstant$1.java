package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.j.p.g;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl$renderConstant$1 extends Lambda implements l<g<?>, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$renderConstant$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.c = descriptorRendererImpl;
    }

    public Object invoke(Object obj) {
        g gVar = (g) obj;
        i.e(gVar, "it");
        return this.c.U(gVar);
    }
}
