package com.clubhouse.android.ui.payments;

import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.stripe.android.PaymentSession;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.s.d0;
import i0.e.b.g3.s.l0;
import i0.e.b.g3.s.s0;
import i0.e.b.g3.s.t0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.payments.SendDirectPaymentFragment$onViewCreated$1", f = "SendDirectPaymentFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ SendDirectPaymentFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentFragment$onViewCreated$1(SendDirectPaymentFragment sendDirectPaymentFragment, m0.l.c<? super SendDirectPaymentFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = sendDirectPaymentFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        SendDirectPaymentFragment$onViewCreated$1 sendDirectPaymentFragment$onViewCreated$1 = new SendDirectPaymentFragment$onViewCreated$1(this.d, cVar);
        sendDirectPaymentFragment$onViewCreated$1.c = obj;
        return sendDirectPaymentFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        SendDirectPaymentFragment$onViewCreated$1 sendDirectPaymentFragment$onViewCreated$1 = new SendDirectPaymentFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        sendDirectPaymentFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        sendDirectPaymentFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof s0) {
            PaymentSession paymentSession = this.d.s2;
            if (paymentSession != null) {
                PaymentSession.presentPaymentMethodSelection$default(paymentSession, (String) null, 1, (Object) null);
            } else {
                m0.n.b.i.m("paymentSession");
                throw null;
            }
        } else if (bVar instanceof d) {
            v.e2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(((d) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof t0) {
            SendDirectPaymentFragment sendDirectPaymentFragment = this.d;
            k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
            t0 t0Var = (t0) bVar;
            sendDirectPaymentFragment.V0().s.handleNextActionForPayment((Fragment) this.d, t0Var.a, t0Var.b);
        } else if (bVar instanceof l0) {
            SendDirectPaymentFragment sendDirectPaymentFragment2 = this.d;
            k<Object>[] kVarArr2 = SendDirectPaymentFragment.p2;
            ProgressBar progressBar = sendDirectPaymentFragment2.U0().j;
            m0.n.b.i.d(progressBar, "binding.finalizingSpinner");
            i0.e.b.d3.k.r(progressBar);
            sendDirectPaymentFragment2.U0().i.setAlpha(0.0f);
            ImageView imageView = sendDirectPaymentFragment2.U0().i;
            m0.n.b.i.d(imageView, "binding.finalizingCheckMark");
            i0.e.b.d3.k.l(imageView);
            ConstraintLayout constraintLayout = sendDirectPaymentFragment2.U0().a;
            d0 d0Var = new d0(sendDirectPaymentFragment2);
            Resources resources = sendDirectPaymentFragment2.requireContext().getResources();
            m0.n.b.i.d(resources, "requireContext().resources");
            m0.n.b.i.e(resources, "<this>");
            constraintLayout.postDelayed(d0Var, (long) resources.getInteger(17694722));
        }
        return i.a;
    }
}
