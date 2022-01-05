package com.stripe.android;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.StripeModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b&\u0018\u0000 \u0019*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003:\u0002\u0019\u001aB\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00028\u00008&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00068F@\u0006¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/StripeIntentResult;", "Lcom/stripe/android/model/StripeIntent;", "T", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripeIntent$Status;", "stripeIntentStatus", "", "outcome", "determineOutcome", "(Lcom/stripe/android/model/StripeIntent$Status;I)I", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "intent", "", "getFailureMessage", "()Ljava/lang/String;", "failureMessage", "outcomeFromFlow", "I", "getOutcome", "()I", "getOutcome$annotations", "()V", "<init>", "(I)V", "Companion", "Outcome", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeIntentResult.kt */
public abstract class StripeIntentResult<T extends StripeIntent> implements StripeModel {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final Set<PaymentMethod.Type> PROCESSING_IS_SUCCESS = g.h0(PaymentMethod.Type.SepaDebit, PaymentMethod.Type.BacsDebit, PaymentMethod.Type.AuBecsDebit, PaymentMethod.Type.Sofort);
    private final int outcomeFromFlow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/StripeIntentResult$Companion;", "", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "PROCESSING_IS_SUCCESS", "Ljava/util/Set;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeIntentResult.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/StripeIntentResult$Outcome;", "", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: StripeIntentResult.kt */
    public @interface Outcome {
        public static final int CANCELED = 3;
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int FAILED = 2;
        public static final int SUCCEEDED = 1;
        public static final int TIMEDOUT = 4;
        public static final int UNKNOWN = 0;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/StripeIntentResult$Outcome$Companion;", "", "", "SUCCEEDED", "I", "CANCELED", "FAILED", "TIMEDOUT", "UNKNOWN", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeIntentResult.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int CANCELED = 3;
            public static final int FAILED = 2;
            public static final int SUCCEEDED = 1;
            public static final int TIMEDOUT = 4;
            public static final int UNKNOWN = 0;

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            StripeIntent.Status.values();
            int[] iArr = new int[7];
            $EnumSwitchMapping$0 = iArr;
            iArr[StripeIntent.Status.RequiresAction.ordinal()] = 1;
            iArr[StripeIntent.Status.Canceled.ordinal()] = 2;
            iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 3;
            iArr[StripeIntent.Status.Succeeded.ordinal()] = 4;
            iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 5;
            iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 6;
            iArr[StripeIntent.Status.Processing.ordinal()] = 7;
        }
    }

    public StripeIntentResult(int i) {
        this.outcomeFromFlow = i;
    }

    private final int determineOutcome(StripeIntent.Status status, int i) {
        if (i != 0) {
            return i;
        }
        if (status == null) {
            return 0;
        }
        switch (status.ordinal()) {
            case 0:
            case 2:
                return 3;
            case 1:
                Set<PaymentMethod.Type> set = PROCESSING_IS_SUCCESS;
                PaymentMethod paymentMethod = getIntent().getPaymentMethod();
                return g.f(set, paymentMethod != null ? paymentMethod.type : null) ? 1 : 0;
            case 3:
            case 5:
            case 6:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static /* synthetic */ void getOutcome$annotations() {
    }

    public abstract String getFailureMessage();

    public abstract T getIntent();

    public final int getOutcome() {
        return determineOutcome(getIntent().getStatus(), this.outcomeFromFlow);
    }
}
