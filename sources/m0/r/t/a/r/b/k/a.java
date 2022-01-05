package m0.r.t.a.r.b.k;

import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.d0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.l.l;

/* compiled from: CloneableClassScope.kt */
public final class a extends GivenFunctionsMemberScope {
    public static final a e = null;
    public static final d f;

    static {
        d g = d.g("clone");
        i.d(g, "identifier(\"clone\")");
        f = g;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(l lVar, m0.r.t.a.r.c.d dVar) {
        super(lVar, dVar);
        i.e(lVar, "storageManager");
        i.e(dVar, "containingClass");
    }

    public List<r> h() {
        m0.r.t.a.r.c.d dVar = this.c;
        Objects.requireNonNull(f.i);
        d0 R0 = d0.R0(dVar, f.a.b, f, CallableMemberDescriptor.Kind.DECLARATION, h0.a);
        f0 G0 = this.c.G0();
        EmptyList emptyList = EmptyList.c;
        R0.K0((f0) null, G0, emptyList, emptyList, DescriptorUtilsKt.f(this.c).f(), Modality.OPEN, o.c);
        return h.L2(R0);
    }
}
