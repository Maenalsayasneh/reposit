package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import m0.n.a.a;
import m0.r.t.a.r.c.u;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns$initialize$1 extends Lambda implements a<JvmBuiltIns.a> {
    public final /* synthetic */ u c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns$initialize$1(u uVar, boolean z) {
        super(0);
        this.c = uVar;
        this.d = z;
    }

    public Object invoke() {
        return new JvmBuiltIns.a(this.c, this.d);
    }
}
