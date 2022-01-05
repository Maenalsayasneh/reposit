package m0.r.t.a.r.i;

import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl;
import m0.n.b.i;
import m0.o.b;
import m0.r.k;

/* compiled from: Delegates.kt */
public final class c extends b<T> {
    public final /* synthetic */ Object a;
    public final /* synthetic */ DescriptorRendererOptionsImpl b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Object obj, Object obj2, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        super(obj2);
        this.a = obj;
        this.b = descriptorRendererOptionsImpl;
    }

    public boolean beforeChange(k<?> kVar, T t, T t2) {
        i.e(kVar, "property");
        if (!this.b.b) {
            return true;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
