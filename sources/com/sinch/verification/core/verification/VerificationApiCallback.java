package com.sinch.verification.core.verification;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.sinch.verification.core.internal.VerificationStateStatus;
import com.sinch.verification.core.verification.response.VerificationResponseData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.j.f.p.h;
import i0.n.a.c;
import i0.n.c.a.e.a;
import i0.n.c.a.e.d.a;
import i0.n.c.a.f.d.b;
import java.util.Objects;
import m0.i;
import t0.v;

/* compiled from: VerificationApiCallback.kt */
public final class VerificationApiCallback implements a<VerificationResponseData> {
    public final c a;
    public final b b;
    public final i0.n.c.a.e.b c;
    public final m0.n.a.a<i> d;

    public VerificationApiCallback(b bVar, i0.n.c.a.e.b bVar2, m0.n.a.a aVar, int i) {
        AnonymousClass1 r3 = (i & 4) != 0 ? AnonymousClass1.c : null;
        m0.n.b.i.e(bVar, "listener");
        m0.n.b.i.e(bVar2, "verificationStateListener");
        m0.n.b.i.e(r3, "beforeResultHandledCallback");
        this.b = bVar;
        this.c = bVar2;
        this.d = r3;
        this.a = h.M2(this);
    }

    public static final void b(VerificationApiCallback verificationApiCallback, Throwable th) {
        c cVar = verificationApiCallback.a;
        h.s0(cVar, "Verification call failed with error " + th, (Throwable) null, 2, (Object) null);
        verificationApiCallback.c.d(new a.d(VerificationStateStatus.ERROR));
        verificationApiCallback.b.a(th);
    }

    public void a(Object obj, v vVar) {
        VerificationResponseData verificationResponseData = (VerificationResponseData) obj;
        m0.n.b.i.e(verificationResponseData, MessageExtension.FIELD_DATA);
        m0.n.b.i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        this.d.invoke();
        c(new VerificationApiCallback$onSuccess$1(this, verificationResponseData));
    }

    public final void c(m0.n.a.a<i> aVar) {
        i0.n.c.a.e.a a2 = this.c.a();
        Objects.requireNonNull(a2);
        if (!m0.n.b.i.a(a2, new a.d(VerificationStateStatus.SUCCESS))) {
            aVar.invoke();
        }
    }

    public void onError(Throwable th) {
        m0.n.b.i.e(th, "t");
        this.d.invoke();
        c(new VerificationApiCallback$onError$1(this, th));
    }
}
