package defpackage;

import i0.b.b.b;
import i0.e.b.g3.r.t1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* renamed from: x  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class x extends Lambda implements l<t1, t1> {
    public static final x c = new x(0);
    public static final x d = new x(1);
    public static final x q = new x(2);
    public static final x x = new x(3);
    public final /* synthetic */ int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(int i) {
        super(1);
        this.y = i;
    }

    public final Object invoke(Object obj) {
        int i = this.y;
        if (i == 0) {
            t1 t1Var = (t1) obj;
            i.e(t1Var, "$this$setState");
            return t1.copy$default(t1Var, (String) null, (b) null, (b) null, (b) null, true, false, false, 111, (Object) null);
        } else if (i == 1) {
            t1 t1Var2 = (t1) obj;
            i.e(t1Var2, "$this$setState");
            return t1.copy$default(t1Var2, (String) null, (b) null, (b) null, (b) null, false, false, false, 111, (Object) null);
        } else if (i == 2) {
            t1 t1Var3 = (t1) obj;
            i.e(t1Var3, "$this$setState");
            return t1.copy$default(t1Var3, (String) null, (b) null, (b) null, (b) null, false, false, true, 63, (Object) null);
        } else if (i == 3) {
            t1 t1Var4 = (t1) obj;
            i.e(t1Var4, "$this$setState");
            return t1.copy$default(t1Var4, (String) null, (b) null, (b) null, (b) null, false, true, false, 95, (Object) null);
        } else {
            throw null;
        }
    }
}
