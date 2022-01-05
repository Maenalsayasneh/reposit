package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.m.a0;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaAnnotationDescriptor$type$2 extends Lambda implements a<a0> {
    public final /* synthetic */ c c;
    public final /* synthetic */ JavaAnnotationDescriptor d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaAnnotationDescriptor$type$2(c cVar, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        super(0);
        this.c = cVar;
        this.d = javaAnnotationDescriptor;
    }

    public Object invoke() {
        a0 q = this.c.a.o.m().j(this.d.b).q();
        i.d(q, "c.module.builtIns.getBuiltInClassByFqName(fqName).defaultType");
        return q;
    }
}
