package com.sinch.verification.core.verification;

import com.sinch.verification.core.internal.VerificationStateStatus;
import com.sinch.verification.core.internal.VerificationStatus;
import com.sinch.verification.core.internal.error.VerificationException;
import com.sinch.verification.core.verification.response.VerificationResponseData;
import i0.j.f.p.h;
import i0.n.a.c;
import i0.n.c.a.e.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: VerificationApiCallback.kt */
public final class VerificationApiCallback$onSuccess$1 extends Lambda implements a<i> {
    public final /* synthetic */ VerificationApiCallback c;
    public final /* synthetic */ VerificationResponseData d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VerificationApiCallback$onSuccess$1(VerificationApiCallback verificationApiCallback, VerificationResponseData verificationResponseData) {
        super(0);
        this.c = verificationApiCallback;
        this.d = verificationResponseData;
    }

    public Object invoke() {
        if (this.d.c == VerificationStatus.SUCCESSFUL) {
            c cVar = this.c.a;
            StringBuilder P0 = i0.d.a.a.a.P0("Successfully verified with ");
            P0.append(this.d.d);
            h.Z1(cVar, P0.toString(), (Throwable) null, 2, (Object) null);
            VerificationApiCallback verificationApiCallback = this.c;
            h.s0(verificationApiCallback.a, "Verification call successful!", (Throwable) null, 2, (Object) null);
            verificationApiCallback.c.d(new a.d(VerificationStateStatus.SUCCESS));
            verificationApiCallback.b.c();
        } else {
            VerificationApiCallback verificationApiCallback2 = this.c;
            String str = this.d.e;
            if (str == null) {
                str = "";
            }
            VerificationApiCallback.b(verificationApiCallback2, new VerificationException(str));
        }
        return i.a;
    }
}
