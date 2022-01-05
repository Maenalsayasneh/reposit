package defpackage;

import android.content.Context;
import com.afollestad.assent.internal.PermissionFragment;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* renamed from: a0  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class a0 extends Lambda implements p<c0, Context, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(int i, Object obj) {
        super(2);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            c0 c0Var = (c0) obj;
            m0.n.b.i.f(c0Var, "$receiver");
            m0.n.b.i.f((Context) obj2, "it");
            c0Var.l((PermissionFragment) this.d);
            c0Var.n((PermissionFragment) this.d);
            return i.a;
        } else if (i == 1) {
            c0 c0Var2 = (c0) obj;
            m0.n.b.i.f(c0Var2, "$receiver");
            m0.n.b.i.f((Context) obj2, "it");
            c0Var2.l((PermissionFragment) this.d);
            c0Var2.n((PermissionFragment) this.d);
            return i.a;
        } else {
            throw null;
        }
    }
}
