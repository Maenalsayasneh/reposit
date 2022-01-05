package com.sinch.verification.core.initiation;

import com.sinch.verification.core.internal.VerificationStateStatus;
import i0.j.f.p.h;
import i0.n.a.c;
import i0.n.c.a.e.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: InitiationApiCallback.kt */
public final class InitiationApiCallback$onError$1 extends Lambda implements a<i> {
    public final /* synthetic */ InitiationApiCallback c;
    public final /* synthetic */ Throwable d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitiationApiCallback$onError$1(InitiationApiCallback initiationApiCallback, Throwable th) {
        super(0);
        this.c = initiationApiCallback;
        this.d = th;
    }

    public Object invoke() {
        c cVar = this.c.a;
        StringBuilder P0 = i0.d.a.a.a.P0("Verification initiation failed error is is ");
        P0.append(this.d);
        h.s0(cVar, P0.toString(), (Throwable) null, 2, (Object) null);
        this.c.c.d(new a.b(VerificationStateStatus.ERROR, (i0.n.c.a.d.a.c) null));
        this.c.b.d(this.d);
        return i.a;
    }
}
