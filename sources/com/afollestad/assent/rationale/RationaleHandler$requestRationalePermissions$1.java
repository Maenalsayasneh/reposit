package com.afollestad.assent.rationale;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: RationaleHandler.kt */
public final class RationaleHandler$requestRationalePermissions$1 extends Lambda implements l<Lifecycle.Event, i> {
    public final /* synthetic */ RationaleHandler c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RationaleHandler$requestRationalePermissions$1(RationaleHandler rationaleHandler) {
        super(1);
        this.c = rationaleHandler;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.f((Lifecycle.Event) obj, "it");
        this.c.c();
        return i.a;
    }
}
