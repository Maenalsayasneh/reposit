package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i0.j.f.p.h;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.r.t.a.r.c.g0;

/* compiled from: StaticScopeForKotlinEnum.kt */
public final class StaticScopeForKotlinEnum$functions$2 extends Lambda implements a<List<? extends g0>> {
    public final /* synthetic */ StaticScopeForKotlinEnum c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$functions$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.c = staticScopeForKotlinEnum;
    }

    public Object invoke() {
        return g.K(h.i0(this.c.c), h.j0(this.c.c));
    }
}
