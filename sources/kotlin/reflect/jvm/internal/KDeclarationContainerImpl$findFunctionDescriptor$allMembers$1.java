package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.n;
import m0.r.t.a.r.c.r;

/* compiled from: KDeclarationContainerImpl.kt */
public final class KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 extends Lambda implements l<r, CharSequence> {
    public static final KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 c = new KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        r rVar = (r) obj;
        i.e(rVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(DescriptorRenderer.b.q(rVar));
        sb.append(" | ");
        n nVar = n.b;
        sb.append(n.d(rVar).a());
        return sb.toString();
    }
}
