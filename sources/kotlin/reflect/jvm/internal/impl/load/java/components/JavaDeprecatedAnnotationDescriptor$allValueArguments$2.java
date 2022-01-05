package kotlin.reflect.jvm.internal.impl.load.java.components;

import i0.j.f.p.h;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.r.t.a.r.e.a.s.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.s;

/* compiled from: JavaAnnotationMapper.kt */
public final class JavaDeprecatedAnnotationDescriptor$allValueArguments$2 extends Lambda implements a<Map<d, ? extends s>> {
    public static final JavaDeprecatedAnnotationDescriptor$allValueArguments$2 c = new JavaDeprecatedAnnotationDescriptor$allValueArguments$2();

    public JavaDeprecatedAnnotationDescriptor$allValueArguments$2() {
        super(0);
    }

    public Object invoke() {
        b bVar = b.a;
        return h.S2(new Pair(b.b, new s("Deprecated in Java")));
    }
}
