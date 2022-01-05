package com.sinch.verification.core.initiation;

import com.sinch.verification.core.internal.VerificationStateStatus;
import i0.j.f.p.h;
import i0.n.c.a.d.a.c;
import i0.n.c.a.e.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import t0.v;

/* compiled from: InitiationApiCallback.kt */
public final class InitiationApiCallback$onSuccess$1 extends Lambda implements a<i> {
    public final /* synthetic */ InitiationApiCallback c;
    public final /* synthetic */ c d;
    public final /* synthetic */ v q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InitiationApiCallback$onSuccess$1(InitiationApiCallback initiationApiCallback, c cVar, v vVar) {
        super(0);
        this.c = initiationApiCallback;
        this.d = cVar;
        this.q = vVar;
    }

    public Object invoke() {
        c cVar = (c) this.c.d.invoke(this.d, this.q);
        i0.n.a.c cVar2 = this.c.a;
        StringBuilder P0 = i0.d.a.a.a.P0("Verification initiated data is ");
        P0.append(this.d);
        h.s0(cVar2, P0.toString(), (Throwable) null, 2, (Object) null);
        this.c.c.d(new a.b(VerificationStateStatus.SUCCESS, cVar));
        this.c.b.b(cVar);
        this.c.e.invoke(cVar);
        return i.a;
    }
}
