package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.g.b;

/* compiled from: PackageFragmentProviderImpl.kt */
public final class PackageFragmentProviderImpl$getSubPackagesOf$2 extends Lambda implements l<b, Boolean> {
    public final /* synthetic */ b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PackageFragmentProviderImpl$getSubPackagesOf$2(b bVar) {
        super(1);
        this.c = bVar;
    }

    public Object invoke(Object obj) {
        b bVar = (b) obj;
        i.e(bVar, "it");
        return Boolean.valueOf(!bVar.d() && i.a(bVar.e(), this.c));
    }
}
