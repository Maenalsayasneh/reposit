package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.r.t.a.r.e.a.x.e;
import m0.r.t.a.r.e.a.x.i;

/* compiled from: predefinedEnhancementInfo.kt */
public final class PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9 extends Lambda implements l<i.a.C0258a, m0.i> {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$9(String str, String str2) {
        super(1);
        this.c = str;
        this.d = str2;
    }

    public Object invoke(Object obj) {
        i.a.C0258a aVar = (i.a.C0258a) obj;
        m0.n.b.i.e(aVar, "<this>");
        String str = this.c;
        e eVar = PredefinedEnhancementInfoKt.b;
        aVar.a(str, eVar);
        String str2 = this.c;
        e eVar2 = PredefinedEnhancementInfoKt.c;
        aVar.a(str2, eVar2);
        String str3 = this.d;
        e eVar3 = PredefinedEnhancementInfoKt.a;
        aVar.a(str3, eVar, eVar2, eVar2, eVar3);
        aVar.b(this.c, eVar3);
        return m0.i.a;
    }
}
