package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.i.a;
import m0.r.t.a.r.i.b;

/* compiled from: DescriptorRenderer.kt */
public final class DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 extends Lambda implements l<b, i> {
    public static final DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1 c = new DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1();

    public DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        m0.n.b.i.e(bVar, "<this>");
        bVar.e(false);
        bVar.c(EmptySet.c);
        bVar.g(a.b.a);
        bVar.p(true);
        bVar.d(ParameterNameRenderingPolicy.NONE);
        bVar.k(true);
        bVar.j(true);
        bVar.h(true);
        bVar.b(true);
        return i.a;
    }
}
