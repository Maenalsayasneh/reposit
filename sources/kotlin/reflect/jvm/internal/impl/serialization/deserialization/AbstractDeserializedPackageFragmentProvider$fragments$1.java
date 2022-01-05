package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.io.InputStream;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.k.j;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.k.b.g;

/* compiled from: AbstractDeserializedPackageFragmentProvider.kt */
public final class AbstractDeserializedPackageFragmentProvider$fragments$1 extends Lambda implements l<b, v> {
    public final /* synthetic */ AbstractDeserializedPackageFragmentProvider c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractDeserializedPackageFragmentProvider$fragments$1(AbstractDeserializedPackageFragmentProvider abstractDeserializedPackageFragmentProvider) {
        super(1);
        this.c = abstractDeserializedPackageFragmentProvider;
    }

    public Object invoke(Object obj) {
        m0.r.t.a.r.k.b.v.b bVar;
        b bVar2 = (b) obj;
        i.e(bVar2, "fqName");
        j jVar = (j) this.c;
        Objects.requireNonNull(jVar);
        i.e(bVar2, "fqName");
        InputStream b = jVar.b.b(bVar2);
        if (b == null) {
            bVar = null;
        } else {
            bVar = m0.r.t.a.r.k.b.v.b.I0(bVar2, jVar.a, jVar.c, b, false);
        }
        if (bVar == null) {
            return null;
        }
        g gVar = this.c.d;
        if (gVar != null) {
            bVar.H0(gVar);
            return bVar;
        }
        i.m("components");
        throw null;
    }
}
