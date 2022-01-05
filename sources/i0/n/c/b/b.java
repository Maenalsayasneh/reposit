package i0.n.c.b;

import com.sinch.verification.flashcall.initialization.FlashCallInitializationResponseData;
import com.sinch.verification.flashcall.initialization.FlashCallVerificationInitializationData;
import com.sinch.verification.flashcall.report.FlashCallReportData;
import kotlin.Metadata;
import m0.i;
import t0.c0.a;
import t0.c0.n;
import t0.c0.o;
import t0.c0.s;
import t0.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Li0/n/c/b/b;", "Li0/n/c/a/f/b;", "Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;", "data", "Lt0/d;", "Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationResponseData;", "b", "(Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;)Lt0/d;", "", "number", "Lcom/sinch/verification/flashcall/report/FlashCallReportData;", "Lm0/i;", "a", "(Ljava/lang/String;Lcom/sinch/verification/flashcall/report/FlashCallReportData;)Lt0/d;", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: FlashCallVerificationService.kt */
public interface b extends i0.n.c.a.f.b {
    @n("verifications/number/{number}")
    d<i> a(@s("number") String str, @a FlashCallReportData flashCallReportData);

    @o("verifications")
    d<FlashCallInitializationResponseData> b(@a FlashCallVerificationInitializationData flashCallVerificationInitializationData);
}
