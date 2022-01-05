package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.o0;

/* compiled from: DescriptorRendererOptionsImpl.kt */
public final class DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 extends Lambda implements l<o0, String> {
    public static final DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2 c = new DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2();

    public DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2() {
        super(1);
    }

    public Object invoke(Object obj) {
        i.e((o0) obj, "it");
        return "...";
    }
}
