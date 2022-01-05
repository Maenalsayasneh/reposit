package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import m0.n.a.a;
import m0.r.g;
import m0.r.t.a.r.c.h;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$constructors$2 extends Lambda implements a<List<? extends g<? extends T>>> {
    public final /* synthetic */ KClassImpl.Data c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$constructors$2(KClassImpl.Data data) {
        super(0);
        this.c = data;
    }

    public Object invoke() {
        Collection<h> n = KClassImpl.this.n();
        ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(n, 10));
        for (h kFunctionImpl : n) {
            arrayList.add(new KFunctionImpl(KClassImpl.this, kFunctionImpl));
        }
        return arrayList;
    }
}
