package com.stripe.android.payments;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.Stripe3ds2CompletionActivity;
import h0.a.f.d.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/payments/Stripe3ds2CompletionContract;", "Lh0/a/f/d/a;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "parsePaymentFlowResult", "(Landroid/content/Intent;)Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2CompletionContract.kt */
public final class Stripe3ds2CompletionContract extends a<PaymentFlowResult.Unvalidated, PaymentFlowResult.Unvalidated> {
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_ARGS = "extra_args";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/Stripe3ds2CompletionContract$Companion;", "", "", "EXTRA_ARGS", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2CompletionContract.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r11 = (com.stripe.android.payments.PaymentFlowResult.Unvalidated) r11.getParcelableExtra(EXTRA_ARGS);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.stripe.android.payments.PaymentFlowResult.Unvalidated parsePaymentFlowResult(android.content.Intent r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L_0x000d
            java.lang.String r0 = "extra_args"
            android.os.Parcelable r11 = r11.getParcelableExtra(r0)
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r11 = (com.stripe.android.payments.PaymentFlowResult.Unvalidated) r11
            if (r11 == 0) goto L_0x000d
            goto L_0x001d
        L_0x000d:
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r11 = new com.stripe.android.payments.PaymentFlowResult$Unvalidated
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x001d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.Stripe3ds2CompletionContract.parsePaymentFlowResult(android.content.Intent):com.stripe.android.payments.PaymentFlowResult$Unvalidated");
    }

    public Intent createIntent(Context context, PaymentFlowResult.Unvalidated unvalidated) {
        i.e(context, "context");
        Intent intent = new Intent(context, Stripe3ds2CompletionActivity.class);
        if (unvalidated != null) {
            intent.putExtras(unvalidated.toBundle());
        }
        return intent;
    }

    public PaymentFlowResult.Unvalidated parseResult(int i, Intent intent) {
        return parsePaymentFlowResult(intent);
    }
}
