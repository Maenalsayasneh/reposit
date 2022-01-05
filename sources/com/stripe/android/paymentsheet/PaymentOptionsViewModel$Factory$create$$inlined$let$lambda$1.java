package com.stripe.android.paymentsheet;

import android.app.Application;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.stripe.android.paymentsheet.PaymentOptionsViewModel$Factory$create$prefsRepository$1$1", f = "PaymentOptionsViewModel.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lh0/q/k0;", "T", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/stripe/android/paymentsheet/PaymentOptionsViewModel$Factory$create$prefsRepository$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsViewModel.kt */
public final class PaymentOptionsViewModel$Factory$create$$inlined$let$lambda$1 extends SuspendLambda implements l<m0.l.c<? super Boolean>, Object> {
    public final /* synthetic */ Application $application$inlined;
    public final /* synthetic */ PaymentOptionContract.Args $starterArgs$inlined;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsViewModel$Factory$create$$inlined$let$lambda$1(m0.l.c cVar, Application application, PaymentOptionContract.Args args) {
        super(1, cVar);
        this.$application$inlined = application;
        this.$starterArgs$inlined = args;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PaymentOptionsViewModel$Factory$create$$inlined$let$lambda$1(cVar, this.$application$inlined, this.$starterArgs$inlined);
    }

    public final Object invoke(Object obj) {
        return ((PaymentOptionsViewModel$Factory$create$$inlined$let$lambda$1) create((m0.l.c) obj)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            return Boolean.valueOf(this.$starterArgs$inlined.isGooglePayReady());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
