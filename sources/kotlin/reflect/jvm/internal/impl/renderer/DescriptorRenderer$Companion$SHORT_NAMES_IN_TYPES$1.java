package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.i.a;
import m0.r.t.a.r.i.b;

/* compiled from: DescriptorRenderer.kt */
public final class DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 extends Lambda implements l<b, i> {
    public static final DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1 c = new DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1();

    public DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        m0.n.b.i.e(bVar, "<this>");
        bVar.g(a.b.a);
        bVar.d(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return i.a;
    }
}
