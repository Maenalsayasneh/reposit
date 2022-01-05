package m0.r.t.a.r.e.a.x;

import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: predefinedEnhancementInfo.kt */
public final class h {
    public final k a;
    public final List<k> b;

    public h(k kVar, List<k> list) {
        i.e(list, "parametersInfo");
        this.a = kVar;
        this.b = list;
    }

    public h() {
        EmptyList emptyList = EmptyList.c;
        i.e(emptyList, "parametersInfo");
        this.a = null;
        this.b = emptyList;
    }
}
