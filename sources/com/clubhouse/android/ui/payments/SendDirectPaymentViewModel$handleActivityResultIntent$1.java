package com.clubhouse.android.ui.payments;

import android.content.Intent;
import com.stripe.android.PaymentIntentResult;
import com.stripe.android.Stripe;
import com.stripe.android.StripeKtxKt;
import com.stripe.android.model.StripeIntent;
import i0.e.b.g3.s.n0;
import i0.e.b.g3.s.o0;
import i0.j.f.p.h;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.payments.SendDirectPaymentViewModel$handleActivityResultIntent$1", f = "SendDirectPaymentViewModel.kt", l = {141}, m = "invokeSuspend")
/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$handleActivityResultIntent$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ SendDirectPaymentViewModel q;
    public final /* synthetic */ int x;
    public final /* synthetic */ Intent y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$handleActivityResultIntent$1(SendDirectPaymentViewModel sendDirectPaymentViewModel, int i, Intent intent, m0.l.c<? super SendDirectPaymentViewModel$handleActivityResultIntent$1> cVar) {
        super(2, cVar);
        this.q = sendDirectPaymentViewModel;
        this.x = i;
        this.y = intent;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        SendDirectPaymentViewModel$handleActivityResultIntent$1 sendDirectPaymentViewModel$handleActivityResultIntent$1 = new SendDirectPaymentViewModel$handleActivityResultIntent$1(this.q, this.x, this.y, cVar);
        sendDirectPaymentViewModel$handleActivityResultIntent$1.d = obj;
        return sendDirectPaymentViewModel$handleActivityResultIntent$1;
    }

    public Object invoke(Object obj, Object obj2) {
        SendDirectPaymentViewModel$handleActivityResultIntent$1 sendDirectPaymentViewModel$handleActivityResultIntent$1 = new SendDirectPaymentViewModel$handleActivityResultIntent$1(this.q, this.x, this.y, (m0.l.c) obj2);
        sendDirectPaymentViewModel$handleActivityResultIntent$1.d = (f0) obj;
        return sendDirectPaymentViewModel$handleActivityResultIntent$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.d;
            SendDirectPaymentViewModel sendDirectPaymentViewModel = this.q;
            int i2 = this.x;
            Intent intent = this.y;
            Stripe stripe = sendDirectPaymentViewModel.s;
            this.c = 1;
            obj = StripeKtxKt.getPaymentIntentResult(stripe, i2, intent, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (PaymentIntentResult) obj;
        SendDirectPaymentViewModel sendDirectPaymentViewModel2 = this.q;
        if (Result.a(obj2) != null) {
            sendDirectPaymentViewModel2.p(n0.a);
        } else if (((PaymentIntentResult) obj2).getIntent().getStatus() == StripeIntent.Status.Succeeded) {
            sendDirectPaymentViewModel2.p(o0.a);
        } else {
            sendDirectPaymentViewModel2.p(n0.a);
        }
        return i.a;
    }
}
