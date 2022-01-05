package i0.n.c.b.d;

import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.verification.model.VerificationData;
import com.sinch.verification.core.verification.model.VerificationSourceType;
import com.sinch.verification.core.verification.model.callout.CalloutVerificationDetails;
import com.sinch.verification.core.verification.model.flashcall.FlashCallVerificationDetails;
import com.sinch.verification.core.verification.model.sms.SmsVerificationDetails;
import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.n.b.i;

/* compiled from: FlashCallVerificationData.kt */
public final class a extends VerificationData {
    public final VerificationSourceType f;
    public final FlashCallVerificationDetails g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(VerificationSourceType verificationSourceType, FlashCallVerificationDetails flashCallVerificationDetails) {
        super(VerificationMethodType.FLASHCALL);
        i.e(verificationSourceType, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(flashCallVerificationDetails, "flashcallDetails");
        this.f = verificationSourceType;
        this.g = flashCallVerificationDetails;
    }

    public CalloutVerificationDetails a() {
        return null;
    }

    public FlashCallVerificationDetails b() {
        return this.g;
    }

    public SmsVerificationDetails c() {
        return null;
    }

    public VerificationSourceType d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f, aVar.f) && i.a(this.g, aVar.g);
    }

    public int hashCode() {
        VerificationSourceType verificationSourceType = this.f;
        int i = 0;
        int hashCode = (verificationSourceType != null ? verificationSourceType.hashCode() : 0) * 31;
        FlashCallVerificationDetails flashCallVerificationDetails = this.g;
        if (flashCallVerificationDetails != null) {
            i = flashCallVerificationDetails.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FlashCallVerificationData(source=");
        P0.append(this.f);
        P0.append(", flashcallDetails=");
        P0.append(this.g);
        P0.append(")");
        return P0.toString();
    }
}
