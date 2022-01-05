package com.afollestad.assent.rationale;

import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RationaleHandler.kt */
public final class RationaleHandler$onUserConfirmedRationale$1 extends Lambda implements l<AssentResult, i> {
    public final /* synthetic */ RationaleHandler c;
    public final /* synthetic */ Permission d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RationaleHandler$onUserConfirmedRationale$1(RationaleHandler rationaleHandler, Permission permission) {
        super(1);
        this.c = rationaleHandler;
        this.d = permission;
    }

    public Object invoke(Object obj) {
        AssentResult assentResult = (AssentResult) obj;
        m0.n.b.i.f(assentResult, "it");
        RationaleHandler rationaleHandler = this.c;
        rationaleHandler.i = v.p1(rationaleHandler.i, assentResult);
        this.c.b().remove(this.d);
        this.c.d();
        return i.a;
    }
}
