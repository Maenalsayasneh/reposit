package com.stripe.android.paymentsheet;

import android.app.Application;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import h0.o.a.k;
import h0.q.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh0/q/m0$b;", "invoke", "()Lh0/q/m0$b;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetAddCardFragment.kt */
public final class PaymentSheetAddCardFragment$sheetViewModel$2 extends Lambda implements a<m0.b> {
    public final /* synthetic */ PaymentSheetAddCardFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetAddCardFragment$sheetViewModel$2(PaymentSheetAddCardFragment paymentSheetAddCardFragment) {
        super(0);
        this.this$0 = paymentSheetAddCardFragment;
    }

    public final m0.b invoke() {
        return new PaymentSheetViewModel.Factory(new a<Application>(this) {
            public final /* synthetic */ PaymentSheetAddCardFragment$sheetViewModel$2 this$0;

            {
                this.this$0 = r1;
            }

            public final Application invoke() {
                k requireActivity = this.this$0.this$0.requireActivity();
                i.d(requireActivity, "requireActivity()");
                Application application = requireActivity.getApplication();
                i.d(application, "requireActivity().application");
                return application;
            }
        }, new a<PaymentSheetContract.Args>(this) {
            public final /* synthetic */ PaymentSheetAddCardFragment$sheetViewModel$2 this$0;

            {
                this.this$0 = r1;
            }

            public final PaymentSheetContract.Args invoke() {
                Parcelable parcelable = this.this$0.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
                if (parcelable != null) {
                    return (PaymentSheetContract.Args) parcelable;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        });
    }
}
