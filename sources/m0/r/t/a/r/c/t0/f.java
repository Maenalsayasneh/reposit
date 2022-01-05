package m0.r.t.a.r.c.t0;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import m0.n.a.a;
import m0.r.t.a.r.c.t0.e;

/* compiled from: AbstractTypeParameterDescriptor */
public class f implements a<MemberScope> {
    public final /* synthetic */ e.b c;

    public f(e.b bVar) {
        this.c = bVar;
    }

    public Object invoke() {
        StringBuilder P0 = i0.d.a.a.a.P0("Scope for type parameter ");
        P0.append(this.c.c.b());
        return TypeIntersectionScope.a.a(P0.toString(), e.this.getUpperBounds());
    }
}
