package defpackage;

import i0.e.b.g3.q.m;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* renamed from: q  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class q extends Lambda implements l<m, m> {
    public static final q c = new q(0);
    public static final q d = new q(1);
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(int i) {
        super(1);
        this.q = i;
    }

    public final Object invoke(Object obj) {
        int i = this.q;
        if (i == 0) {
            m mVar = (m) obj;
            i.e(mVar, "$this$setState");
            return m.copy$default(mVar, (List) null, false, false, false, (String) null, 27, (Object) null);
        } else if (i == 1) {
            m mVar2 = (m) obj;
            i.e(mVar2, "$this$setState");
            return m.copy$default(mVar2, (List) null, false, true, false, (String) null, 27, (Object) null);
        } else {
            throw null;
        }
    }
}
