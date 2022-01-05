package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.e.a.u.c;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.h;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {
    public static final /* synthetic */ k<Object>[] g = {m.c(new PropertyReference1Impl(m.a(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final h h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(a aVar, c cVar) {
        super(cVar, aVar, g.a.A);
        i.e(aVar, "annotation");
        i.e(cVar, "c");
        this.h = cVar.a.a.d(new JavaTargetAnnotationDescriptor$allValueArguments$2(this));
    }

    public Map<d, m0.r.t.a.r.j.p.g<Object>> a() {
        return (Map) i0.j.f.p.h.K1(this.h, g[0]);
    }
}
