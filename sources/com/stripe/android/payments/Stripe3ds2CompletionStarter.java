package com.stripe.android.payments;

import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.Stripe3ds2CompletionActivity;
import h0.a.f.b;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "Lcom/stripe/android/view/AuthActivityStarter;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "<init>", "()V", "Legacy", "Modern", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter$Modern;", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter$Legacy;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2CompletionStarter.kt */
public abstract class Stripe3ds2CompletionStarter implements AuthActivityStarter<PaymentFlowResult.Unvalidated> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/payments/Stripe3ds2CompletionStarter$Legacy;", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "args", "Lm0/i;", "start", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "", "requestCode", "I", "<init>", "(Lcom/stripe/android/view/AuthActivityStarter$Host;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2CompletionStarter.kt */
    public static final class Legacy extends Stripe3ds2CompletionStarter {
        private final AuthActivityStarter.Host host;
        private final int requestCode;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Legacy(AuthActivityStarter.Host host2, int i) {
            super((f) null);
            i.e(host2, "host");
            this.host = host2;
            this.requestCode = i;
        }

        public void start(PaymentFlowResult.Unvalidated unvalidated) {
            i.e(unvalidated, "args");
            this.host.startActivityForResult$payments_core_release(Stripe3ds2CompletionActivity.class, unvalidated.toBundle(), this.requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/payments/Stripe3ds2CompletionStarter$Modern;", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "args", "Lm0/i;", "start", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "Lh0/a/f/b;", "launcher", "Lh0/a/f/b;", "<init>", "(Lh0/a/f/b;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2CompletionStarter.kt */
    public static final class Modern extends Stripe3ds2CompletionStarter {
        private final b<PaymentFlowResult.Unvalidated> launcher;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Modern(b<PaymentFlowResult.Unvalidated> bVar) {
            super((f) null);
            i.e(bVar, "launcher");
            this.launcher = bVar;
        }

        public void start(PaymentFlowResult.Unvalidated unvalidated) {
            i.e(unvalidated, "args");
            this.launcher.a(unvalidated, (ActivityOptionsCompat) null);
        }
    }

    private Stripe3ds2CompletionStarter() {
    }

    public /* synthetic */ Stripe3ds2CompletionStarter(f fVar) {
        this();
    }
}
