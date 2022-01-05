package com.stripe.android.paymentsheet;

import android.app.Activity;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.view.ActivityStarter;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/paymentsheet/PaymentSheetActivity;", "Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivityStarter.kt */
public final class PaymentSheetActivityStarter extends ActivityStarter<PaymentSheetActivity, PaymentSheetContract.Args> {
    public static final Companion Companion = new Companion((f) null);
    public static final int REQUEST_CODE = 6003;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetActivityStarter$Companion;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSheetActivityStarter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivityStarter(Activity activity) {
        super(activity, PaymentSheetActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(activity, "activity");
    }
}
