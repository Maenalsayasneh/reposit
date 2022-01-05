package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.n;
import m0.r.t.a.r.c.c0;

/* compiled from: KDeclarationContainerImpl.kt */
public final class KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 extends Lambda implements l<c0, CharSequence> {
    public static final KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 c = new KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        i.e(c0Var, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append(DescriptorRenderer.b.q(c0Var));
        sb.append(" | ");
        n nVar = n.b;
        sb.append(n.c(c0Var).a());
        return sb.toString();
    }
}
