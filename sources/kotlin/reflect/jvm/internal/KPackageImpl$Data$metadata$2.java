package kotlin.reflect.jvm.internal;

import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import m0.n.a.a;
import m0.r.t.a.r.c.v0.a.e;
import m0.r.t.a.r.f.d.a.f;
import m0.r.t.a.r.f.d.a.g;
import m0.r.t.a.r.f.d.a.h;

/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$metadata$2 extends Lambda implements a<Triple<? extends g, ? extends ProtoBuf$Package, ? extends f>> {
    public final /* synthetic */ KPackageImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$metadata$2(KPackageImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        KotlinClassHeader kotlinClassHeader;
        e a = KPackageImpl.Data.a(this.c);
        if (a == null || (kotlinClassHeader = a.b) == null) {
            return null;
        }
        String[] strArr = kotlinClassHeader.c;
        String[] strArr2 = kotlinClassHeader.e;
        if (strArr == null || strArr2 == null) {
            return null;
        }
        Pair<g, ProtoBuf$Package> g = h.g(strArr, strArr2);
        return new Triple((g) g.c, (ProtoBuf$Package) g.d, kotlinClassHeader.b);
    }
}
