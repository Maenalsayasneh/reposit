package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import h0.o.a.s;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragmentFactory;", "Lh0/o/a/s;", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeFragmentFactory.kt */
public final class ChallengeFragmentFactory extends s {
    private final ChallengeActionHandler challengeActionHandler;
    private final ChallengeStatusReceiver challengeStatusReceiver;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final SdkTransactionId sdkTransactionId;
    private final TransactionTimer transactionTimer;
    private final StripeUiCustomization uiCustomization;

    public ChallengeFragmentFactory(SdkTransactionId sdkTransactionId2, StripeUiCustomization stripeUiCustomization, TransactionTimer transactionTimer2, ChallengeStatusReceiver challengeStatusReceiver2, ErrorRequestExecutor errorRequestExecutor2, ErrorReporter errorReporter2, ChallengeActionHandler challengeActionHandler2) {
        i.e(sdkTransactionId2, "sdkTransactionId");
        i.e(stripeUiCustomization, "uiCustomization");
        i.e(transactionTimer2, "transactionTimer");
        i.e(challengeStatusReceiver2, "challengeStatusReceiver");
        i.e(errorRequestExecutor2, "errorRequestExecutor");
        i.e(errorReporter2, "errorReporter");
        i.e(challengeActionHandler2, "challengeActionHandler");
        this.sdkTransactionId = sdkTransactionId2;
        this.uiCustomization = stripeUiCustomization;
        this.transactionTimer = transactionTimer2;
        this.challengeStatusReceiver = challengeStatusReceiver2;
        this.errorRequestExecutor = errorRequestExecutor2;
        this.errorReporter = errorReporter2;
        this.challengeActionHandler = challengeActionHandler2;
    }

    public Fragment instantiate(ClassLoader classLoader, String str) {
        i.e(classLoader, "classLoader");
        i.e(str, "className");
        if (i.a(str, ChallengeFragment.class.getName())) {
            return new ChallengeFragment(this.sdkTransactionId, this.uiCustomization, this.transactionTimer, this.challengeStatusReceiver, this.errorRequestExecutor, this.errorReporter, this.challengeActionHandler);
        }
        Fragment instantiate = super.instantiate(classLoader, str);
        i.d(instantiate, "super.instantiate(classLoader, className)");
        return instantiate;
    }
}
