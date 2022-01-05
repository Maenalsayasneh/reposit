package com.afollestad.assent.internal;

import android.content.Context;
import h0.o.a.c0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: Assent.kt */
public final class Assent$Companion$ensureFragment$2$1$1 extends Lambda implements p<c0, Context, i> {
    public final /* synthetic */ PermissionFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Assent$Companion$ensureFragment$2$1$1(PermissionFragment permissionFragment) {
        super(2);
        this.c = permissionFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.f(c0Var, "$receiver");
        m0.n.b.i.f((Context) obj2, "it");
        c0Var.c(this.c, "[assent_permission_fragment/fragment]");
        return i.a;
    }
}
