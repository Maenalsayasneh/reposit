package com.clubhouse.android.ui.payments;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.SendDirectPaymentResponse;
import com.clubhouse.android.data.repos.PaymentsRepo;
import com.clubhouse.app.R;
import com.stripe.android.model.PaymentMethod;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.a.a;
import i0.e.b.a3.b.d;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.j0;
import i0.e.b.g3.s.k0;
import i0.e.b.g3.s.l0;
import i0.e.b.g3.s.t0;
import i0.j.f.p.h;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$confirmPayment$1 extends Lambda implements l<b1, i> {
    public final /* synthetic */ SendDirectPaymentViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.payments.SendDirectPaymentViewModel$confirmPayment$1$2", f = "SendDirectPaymentViewModel.kt", l = {234}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.payments.SendDirectPaymentViewModel$confirmPayment$1$2  reason: invalid class name */
    /* compiled from: SendDirectPaymentViewModel.kt */
    public final class AnonymousClass2 extends SuspendLambda implements l<c<? super SendDirectPaymentResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass2(b1Var, a, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass2(b1Var, a, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                PaymentsRepo paymentsRepo = SendDirectPaymentViewModel.this.r;
                int intValue = b1Var.a.getId().intValue();
                b1 b1Var = b1Var;
                String str = b1Var.e.id;
                if (str == null) {
                    str = "";
                }
                int i2 = a;
                String str2 = b1Var.b;
                this.c = 1;
                obj = paymentsRepo.c(intValue, str, i2, str2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$confirmPayment$1(SendDirectPaymentViewModel sendDirectPaymentViewModel) {
        super(1);
        this.c = sendDirectPaymentViewModel;
    }

    public Object invoke(Object obj) {
        final b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        if (!(b1Var.d == null || b1Var.e == null)) {
            this.c.m(AnonymousClass1.c);
            final j0 j0Var = b1Var.d;
            int b = j0Var.b();
            a aVar = this.c.o;
            AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) aVar;
            amplitudeAnalytics.b("DirectPayments-SendPayment-Confirmed", g.N(new Pair("recipient", b1Var.a), new Pair("amount", Integer.valueOf(b))));
            UserProfile userProfile = b1Var.a;
            final int a = j0Var.a(userProfile.k2, userProfile.l2) + b;
            final SendDirectPaymentViewModel sendDirectPaymentViewModel = this.c;
            AnonymousClass2 r4 = new AnonymousClass2((c<? super AnonymousClass2>) null);
            final SendDirectPaymentViewModel sendDirectPaymentViewModel2 = this.c;
            MavericksViewModel.f(sendDirectPaymentViewModel, r4, (d0) null, (m) null, new p<b1, b<? extends SendDirectPaymentResponse>, b1>() {
                public Object invoke(Object obj, Object obj2) {
                    b1 b1Var = (b1) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(b1Var, "$this$execute");
                    m0.n.b.i.e(bVar, "it");
                    if (bVar instanceof i0.b.b.c) {
                        SendDirectPaymentViewModel sendDirectPaymentViewModel = SendDirectPaymentViewModel.this;
                        String message = ((i0.b.b.c) bVar).b.getMessage();
                        if (message == null) {
                            message = SendDirectPaymentViewModel.this.n.getString(R.string.process_payment_error);
                            m0.n.b.i.d(message, "appContext.getString(R.string.process_payment_error)");
                        }
                        d dVar = new d(message);
                        int i = SendDirectPaymentViewModel.m;
                        sendDirectPaymentViewModel.o(dVar);
                        j0 j0Var = j0Var;
                        b1 b1Var2 = b1Var;
                        String str = b1Var2.e.id;
                        if (str == null) {
                            str = "";
                        }
                        return b1.copy$default(b1Var, (UserProfile) null, (String) null, new k0.a(j0Var, str, b1Var2.a()), (j0) null, (PaymentMethod) null, 27, (Object) null);
                    } else if (!(bVar instanceof f0)) {
                        return b1Var;
                    } else {
                        SendDirectPaymentResponse sendDirectPaymentResponse = (SendDirectPaymentResponse) ((f0) bVar).b;
                        String str2 = sendDirectPaymentResponse.b;
                        if (!sendDirectPaymentResponse.a || str2 == null) {
                            SendDirectPaymentViewModel sendDirectPaymentViewModel2 = SendDirectPaymentViewModel.this;
                            l0 l0Var = l0.a;
                            int i2 = SendDirectPaymentViewModel.m;
                            sendDirectPaymentViewModel2.o(l0Var);
                            return b1Var;
                        }
                        SendDirectPaymentViewModel sendDirectPaymentViewModel3 = SendDirectPaymentViewModel.this;
                        t0 t0Var = new t0(str2, sendDirectPaymentResponse.c);
                        int i3 = SendDirectPaymentViewModel.m;
                        sendDirectPaymentViewModel3.o(t0Var);
                        return b1Var;
                    }
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
