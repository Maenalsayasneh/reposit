package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.m.a0;

/* compiled from: IntersectionType.kt */
public final class TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 extends Lambda implements a<String> {
    public final /* synthetic */ Set<a0> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1(Set<? extends a0> set) {
        super(0);
        this.c = set;
    }

    public Object invoke() {
        return i.k("This collections cannot be empty! input types: ", g.E(this.c, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
    }
}
