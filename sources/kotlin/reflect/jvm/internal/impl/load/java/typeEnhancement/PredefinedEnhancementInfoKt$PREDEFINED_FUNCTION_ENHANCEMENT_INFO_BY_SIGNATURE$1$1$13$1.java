package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.e.a.x.e;
import m0.r.t.a.r.e.a.x.i;

/* compiled from: predefinedEnhancementInfo.kt */
public final class PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1 extends Lambda implements l<i.a.C0258a, m0.i> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$13$1(String str) {
        super(1);
        this.c = str;
    }

    public Object invoke(Object obj) {
        i.a.C0258a aVar = (i.a.C0258a) obj;
        m0.n.b.i.e(aVar, "<this>");
        String str = this.c;
        e eVar = PredefinedEnhancementInfoKt.b;
        aVar.a(str, eVar);
        aVar.a(this.c, eVar);
        aVar.b(this.c, eVar);
        return m0.i.a;
    }
}
