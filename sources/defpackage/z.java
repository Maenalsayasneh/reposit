package defpackage;

import com.clubhouse.android.data.models.local.user.UserInList;
import i0.e.b.g3.r.e1;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* renamed from: z  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class z extends Lambda implements l<e1, e1> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            e1 e1Var = (e1) obj;
            i.e(e1Var, "$this$setState");
            return e1.copy$default(e1Var, (List) null, (Set) null, g.T(e1Var.c, ((UserInList) this.d).getId()), false, 11, (Object) null);
        } else if (i == 1) {
            e1 e1Var2 = (e1) obj;
            i.e(e1Var2, "$this$setState");
            return e1.copy$default(e1Var2, (List) null, (Set) null, g.e0(e1Var2.c, ((UserInList) this.d).getId()), false, 11, (Object) null);
        } else {
            throw null;
        }
    }
}
