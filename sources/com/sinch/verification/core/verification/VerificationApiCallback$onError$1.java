package com.sinch.verification.core.verification;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: VerificationApiCallback.kt */
public final class VerificationApiCallback$onError$1 extends Lambda implements a<i> {
    public final /* synthetic */ VerificationApiCallback c;
    public final /* synthetic */ Throwable d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerificationApiCallback$onError$1(VerificationApiCallback verificationApiCallback, Throwable th) {
        super(0);
        this.c = verificationApiCallback;
        this.d = th;
    }

    public Object invoke() {
        VerificationApiCallback.b(this.c, this.d);
        return i.a;
    }
}
