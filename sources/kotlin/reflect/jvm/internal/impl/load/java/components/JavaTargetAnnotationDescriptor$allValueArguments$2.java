package kotlin.reflect.jvm.internal.impl.load.java.components;

import i0.j.f.p.h;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.e.a.w.b;
import m0.r.t.a.r.e.a.w.e;
import m0.r.t.a.r.e.a.w.m;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaTargetAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<d, ? extends g<? extends Object>>> {
    public final /* synthetic */ JavaTargetAnnotationDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor$allValueArguments$2(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        super(0);
        this.c = javaTargetAnnotationDescriptor;
    }

    public Object invoke() {
        g<?> gVar;
        b bVar = this.c.e;
        Map map = null;
        if (bVar instanceof e) {
            gVar = JavaAnnotationTargetMapper.a.a(((e) bVar).e());
        } else {
            gVar = bVar instanceof m ? JavaAnnotationTargetMapper.a.a(h.L2(bVar)) : null;
        }
        if (gVar != null) {
            m0.r.t.a.r.e.a.s.b bVar2 = m0.r.t.a.r.e.a.s.b.a;
            map = h.S2(new Pair(m0.r.t.a.r.e.a.s.b.c, gVar));
        }
        return map != null ? map : m0.j.g.o();
    }
}
