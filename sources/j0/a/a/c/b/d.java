package j0.a.a.c.b;

import android.os.Bundle;
import h0.q.f0;
import h0.q.k0;
import h0.q.m0;
import h0.x.c;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.a.a.c.a.e;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: HiltViewModelFactory */
public final class d implements m0.b {
    public final Set<String> a;
    public final m0.b b;
    public final h0.q.a c;

    /* compiled from: HiltViewModelFactory */
    public class a extends h0.q.a {
        public final /* synthetic */ e a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, c cVar, Bundle bundle, e eVar) {
            super(cVar, bundle);
            this.a = eVar;
        }

        public <T extends k0> T create(String str, Class<T> cls, f0 f0Var) {
            l.c.C0215c cVar = (l.c.C0215c) this.a;
            Objects.requireNonNull(cVar);
            Objects.requireNonNull(f0Var);
            cVar.c = f0Var;
            h.C(f0Var, f0.class);
            l0.a.a aVar = ((b) h.L0(new l.c.d(cVar.a, cVar.b, cVar.c), b.class)).a().get(cls.getName());
            if (aVar != null) {
                return (k0) aVar.get();
            }
            throw new IllegalStateException(i0.d.a.a.a.Y(cls, i0.d.a.a.a.P0("Expected the @HiltViewModel-annotated class '"), "' to be available in the multi-binding of @HiltViewModelMap but none was found."));
        }
    }

    /* compiled from: HiltViewModelFactory */
    public interface b {
        Map<String, l0.a.a<k0>> a();
    }

    public d(c cVar, Bundle bundle, Set<String> set, m0.b bVar, e eVar) {
        this.a = set;
        this.b = bVar;
        this.c = new a(this, cVar, bundle, eVar);
    }

    public <T extends k0> T create(Class<T> cls) {
        if (this.a.contains(cls.getName())) {
            return this.c.create(cls);
        }
        return this.b.create(cls);
    }
}
