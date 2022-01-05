package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl$appendTypeProjections$1 extends Lambda implements l<m0, CharSequence> {
    public final /* synthetic */ DescriptorRendererImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$appendTypeProjections$1(DescriptorRendererImpl descriptorRendererImpl) {
        super(1);
        this.c = descriptorRendererImpl;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        i.e(m0Var, "it");
        if (m0Var.c()) {
            return "*";
        }
        DescriptorRendererImpl descriptorRendererImpl = this.c;
        v type = m0Var.getType();
        i.d(type, "it.type");
        String w = descriptorRendererImpl.w(type);
        if (m0Var.b() == Variance.INVARIANT) {
            return w;
        }
        return m0Var.b() + ' ' + w;
    }
}
