package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.i.a;
import m0.r.t.a.r.i.b;

/* compiled from: DescriptorRenderer.kt */
public final class DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1 extends Lambda implements l<b, i> {
    public static final DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1 c = new DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1();

    public DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        m0.n.b.i.e(bVar, "<this>");
        bVar.c(EmptySet.c);
        bVar.g(a.b.a);
        bVar.d(ParameterNameRenderingPolicy.ONLY_NON_SYNTHESIZED);
        return i.a;
    }
}
