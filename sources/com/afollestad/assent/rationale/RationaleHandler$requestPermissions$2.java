package com.afollestad.assent.rationale;

import com.afollestad.assent.AssentResult;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RationaleHandler.kt */
public final class RationaleHandler$requestPermissions$2 extends Lambda implements l<AssentResult, i> {
    public final /* synthetic */ RationaleHandler c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RationaleHandler$requestPermissions$2(RationaleHandler rationaleHandler) {
        super(1);
        this.c = rationaleHandler;
    }

    public Object invoke(Object obj) {
        AssentResult assentResult = (AssentResult) obj;
        m0.n.b.i.f(assentResult, "it");
        RationaleHandler rationaleHandler = this.c;
        rationaleHandler.h = assentResult;
        rationaleHandler.d();
        return i.a;
    }
}
