package defpackage;

import i0.b.b.b;
import i0.e.b.g3.r.t1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* renamed from: d  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class d extends Lambda implements p<t1, b<? extends Boolean>, t1> {
    public static final d c = new d(0);
    public static final d d = new d(1);
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(int i) {
        super(2);
        this.q = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.q;
        if (i == 0) {
            t1 t1Var = (t1) obj;
            b bVar = (b) obj2;
            i.e(t1Var, "$this$execute");
            i.e(bVar, "it");
            return t1.copy$default(t1Var, (String) null, (b) null, bVar, (b) null, false, false, false, 123, (Object) null);
        } else if (i == 1) {
            t1 t1Var2 = (t1) obj;
            b bVar2 = (b) obj2;
            i.e(t1Var2, "$this$execute");
            i.e(bVar2, "it");
            return t1.copy$default(t1Var2, (String) null, (b) null, (b) null, bVar2, false, false, false, 119, (Object) null);
        } else {
            throw null;
        }
    }
}
