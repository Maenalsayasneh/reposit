package i0.n.c.b;

import com.sinch.verification.core.initiation.VerificationIdentity;
import com.sinch.verification.core.initiation.VerificationIdentityType;
import com.sinch.verification.core.internal.VerificationStateStatus;
import com.sinch.verification.core.verification.VerificationApiCallback;
import com.sinch.verification.core.verification.model.VerificationSourceType;
import com.sinch.verification.core.verification.model.flashcall.FlashCallVerificationDetails;
import com.sinch.verification.flashcall.initialization.FlashCallInitializationResponseData;
import com.sinch.verification.flashcall.initialization.FlashCallVerificationInitializationData;
import com.sinch.verification.flashcall.verification.interceptor.FlashCallInterceptor;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import i0.n.a.c;
import i0.n.c.a.d.a.b;
import i0.n.c.a.e.a;
import java.util.Date;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FlashCallVerificationMethod.kt */
public final class a extends i0.n.c.a.c.c.a<b, FlashCallInterceptor> {
    public FlashCallInterceptor g;
    public Date h = new Date();
    public final i0.n.c.b.c.a i;
    public final b<FlashCallInitializationResponseData> j;

    /* renamed from: i0.n.c.b.a$a  reason: collision with other inner class name */
    /* compiled from: FlashCallVerificationMethod.kt */
    public static final class C0085a {
        public static final C0086a Companion = new C0086a((f) null);
        public final c a = h.M2(this);
        public b<? super FlashCallInitializationResponseData> b = new i0.n.c.a.d.a.a();
        public i0.n.c.a.f.d.b c = new i0.n.c.a.f.d.a();
        public i0.n.c.b.c.a d;

        /* renamed from: i0.n.c.b.a$a$a  reason: collision with other inner class name */
        /* compiled from: FlashCallVerificationMethod.kt */
        public static final class C0086a {
            public C0086a(f fVar) {
            }
        }

        public C0085a(f fVar) {
        }
    }

    public a(i0.n.c.b.c.a aVar, b bVar, i0.n.c.a.f.d.b bVar2, f fVar) {
        super(aVar, bVar2);
        this.i = aVar;
        this.j = bVar;
    }

    public void c(Throwable th) {
        i.e(th, "e");
        this.f.a(th);
    }

    public void e(String str, VerificationSourceType verificationSourceType) {
        i.e(str, PaymentMethodOptionsParams.Blik.PARAM_CODE);
        i.e(verificationSourceType, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(str, "verificationCode");
        i.e(verificationSourceType, "sourceType");
        i0.n.c.a.e.a aVar = this.e;
        Objects.requireNonNull(aVar);
        boolean z = true;
        if ((aVar instanceof a.d) && ((a.d) aVar).a == VerificationStateStatus.SUCCESS) {
            z = false;
        }
        if (z) {
            c cVar = this.b;
            h.Z1(cVar, "Verify called with code: " + str + " for method: " + null + " acquired from source: " + verificationSourceType, (Throwable) null, 2, (Object) null);
            d(new a.d(VerificationStateStatus.ONGOING));
            i.e(str, "verificationCode");
            i.e(verificationSourceType, "sourceType");
            i0.n.c.a.d.a.c cVar2 = this.a;
            String id = cVar2 != null ? cVar2.getId() : null;
            if (id != null) {
                h.z0(((b) this.d).c(id, new i0.n.c.b.d.a(verificationSourceType, new FlashCallVerificationDetails(str))), f(), new VerificationApiCallback(this.f, this, (m0.n.a.a) null, 4));
                return;
            }
            return;
        }
        h.D4(this.b, "Verify called however verificationState.canVerify returned false", (Throwable) null, 2, (Object) null);
    }

    public final FlashCallVerificationInitializationData g() {
        VerificationIdentity verificationIdentity = new VerificationIdentity(this.i.a, (VerificationIdentityType) null, 2);
        i0.n.c.b.c.a aVar = this.i;
        return new FlashCallVerificationInitializationData(verificationIdentity, aVar.d, aVar.b, aVar.c, aVar.h.create());
    }
}
