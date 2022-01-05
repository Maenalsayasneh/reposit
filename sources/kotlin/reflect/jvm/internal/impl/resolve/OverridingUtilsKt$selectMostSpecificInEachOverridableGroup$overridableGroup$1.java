package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.o.j;

/* compiled from: overridingUtils.kt */
public final class OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 extends Lambda implements l<H, i> {
    public final /* synthetic */ j<H> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1(j<H> jVar) {
        super(1);
        this.c = jVar;
    }

    public Object invoke(Object obj) {
        j<H> jVar = this.c;
        m0.n.b.i.d(obj, "it");
        jVar.add(obj);
        return i.a;
    }
}
