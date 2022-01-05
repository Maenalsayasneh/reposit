package com.stripe.android.paymentsheet;

import android.app.Activity;
import com.stripe.android.PaymentController;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.view.AuthActivityStarter;
import h0.q.q;
import h0.q.z;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "kotlin.jvm.PlatformType", "event", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$onCreate$5<T> implements z<BaseSheetViewModel.Event<? extends ConfirmStripeIntentParams>> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    @m0.l.f.a.c(c = "com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$5$1", f = "PaymentSheetActivity.kt", l = {207}, m = "invokeSuspend")
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetActivity$onCreate$5$1  reason: invalid class name */
    /* compiled from: PaymentSheetActivity.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super i>, Object> {
        public int label;
        public final /* synthetic */ PaymentSheetActivity$onCreate$5 this$0;

        {
            this.this$0 = r1;
        }

        public final c<i> create(Object obj, c<?> cVar) {
            m0.n.b.i.e(cVar, "completion");
            return new AnonymousClass1(this.this$0, confirmStripeIntentParams, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create(obj, (c) obj2)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                h.d4(obj);
                PaymentController access$getPaymentController$p = PaymentSheetActivity.access$getPaymentController$p(this.this$0.this$0);
                AuthActivityStarter.Host create$payments_core_release = AuthActivityStarter.Host.Companion.create$payments_core_release((Activity) this.this$0.this$0);
                ConfirmStripeIntentParams confirmStripeIntentParams = confirmStripeIntentParams;
                ApiRequest.Options options = new ApiRequest.Options(this.this$0.this$0.getPaymentConfig().getPublishableKey(), this.this$0.this$0.getPaymentConfig().getStripeAccountId(), (String) null, 4, (f) null);
                this.label = 1;
                if (access$getPaymentController$p.startConfirmAndAuth(create$payments_core_release, confirmStripeIntentParams, options, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return i.a;
        }
    }

    public PaymentSheetActivity$onCreate$5(PaymentSheetActivity paymentSheetActivity) {
        this.this$0 = paymentSheetActivity;
    }

    public final void onChanged(BaseSheetViewModel.Event<? extends ConfirmStripeIntentParams> event) {
        final ConfirmStripeIntentParams confirmStripeIntentParams = (ConfirmStripeIntentParams) event.getContentIfNotHandled();
        if (confirmStripeIntentParams != null) {
            a.E2(q.a(this.this$0), (e) null, (CoroutineStart) null, new AnonymousClass1(this, (c) null), 3, (Object) null);
        }
    }
}
