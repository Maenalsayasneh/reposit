package i0.n.c.a.f;

import com.sinch.verification.core.verification.model.VerificationData;
import com.sinch.verification.core.verification.response.VerificationResponseData;
import kotlin.Metadata;
import t0.c0.a;
import t0.c0.p;
import t0.c0.s;
import t0.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li0/n/c/a/f/b;", "", "", "verificationId", "Lcom/sinch/verification/core/verification/model/VerificationData;", "data", "Lt0/d;", "Lcom/sinch/verification/core/verification/response/VerificationResponseData;", "c", "(Ljava/lang/String;Lcom/sinch/verification/core/verification/model/VerificationData;)Lt0/d;", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: VerificationService.kt */
public interface b {
    @p("verifications/id/{verificationId}")
    d<VerificationResponseData> c(@s("verificationId") String str, @a VerificationData verificationData);
}
