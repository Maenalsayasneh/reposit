package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.a.a;
import m0.r.k;
import m0.r.t.a.j;

/* compiled from: KPackageImpl.kt */
public final class KPackageImpl$Data$members$2 extends Lambda implements a<Collection<? extends KCallableImpl<?>>> {
    public final /* synthetic */ KPackageImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$members$2(KPackageImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        KPackageImpl.Data data = this.c;
        KPackageImpl kPackageImpl = KPackageImpl.this;
        j jVar = data.f;
        k kVar = KPackageImpl.Data.d[1];
        return kPackageImpl.q((MemberScope) jVar.invoke(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
    }
}
