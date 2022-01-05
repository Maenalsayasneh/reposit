package com.clubhouse.android.ui.payments;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.GetPaymentRegistrationResponse;
import com.clubhouse.android.data.repos.PaymentsRepo;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.s.r0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class PaymentsRegistrationViewModel$fetchPaymentRegistration$1 extends Lambda implements l<r0, i> {
    public final /* synthetic */ PaymentsRegistrationViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.payments.PaymentsRegistrationViewModel$fetchPaymentRegistration$1$1", f = "PaymentsRegistrationViewModel.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.payments.PaymentsRegistrationViewModel$fetchPaymentRegistration$1$1  reason: invalid class name */
    /* compiled from: PaymentsRegistrationViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super GetPaymentRegistrationResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1((c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                PaymentsRepo paymentsRepo = PaymentsRegistrationViewModel.this.p;
                this.c = 1;
                obj = paymentsRepo.b(this);
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
    public PaymentsRegistrationViewModel$fetchPaymentRegistration$1(PaymentsRegistrationViewModel paymentsRegistrationViewModel) {
        super(1);
        this.c = paymentsRegistrationViewModel;
    }

    public Object invoke(Object obj) {
        r0 r0Var = (r0) obj;
        m0.n.b.i.e(r0Var, "state");
        if (!(r0Var.e instanceof f)) {
            final PaymentsRegistrationViewModel paymentsRegistrationViewModel = this.c;
            AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final PaymentsRegistrationViewModel paymentsRegistrationViewModel2 = this.c;
            MavericksViewModel.f(paymentsRegistrationViewModel, r1, (d0) null, (m) null, new p<r0, b<? extends GetPaymentRegistrationResponse>, r0>() {
                public Object invoke(Object obj, Object obj2) {
                    RegistrationStatus registrationStatus;
                    r0 r0Var = (r0) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(r0Var, "$this$execute");
                    m0.n.b.i.e(bVar, "it");
                    if (bVar instanceof i0.b.b.c) {
                        PaymentsRegistrationViewModel paymentsRegistrationViewModel = PaymentsRegistrationViewModel.this;
                        String message = ((i0.b.b.c) bVar).b.getMessage();
                        if (message == null) {
                            message = PaymentsRegistrationViewModel.this.n.getString(R.string.payments_error);
                            m0.n.b.i.d(message, "resources.getString(R.string.payments_error)");
                        }
                        d dVar = new d(message);
                        int i = PaymentsRegistrationViewModel.m;
                        paymentsRegistrationViewModel.o(dVar);
                        return r0.copy$default(r0Var, (RegistrationStatus) null, false, false, (String) null, bVar, 15, (Object) null);
                    } else if (!(bVar instanceof f0)) {
                        return r0.copy$default(r0Var, (RegistrationStatus) null, false, false, (String) null, bVar, 15, (Object) null);
                    } else {
                        GetPaymentRegistrationResponse getPaymentRegistrationResponse = (GetPaymentRegistrationResponse) ((f0) bVar).b;
                        if (getPaymentRegistrationResponse.f) {
                            registrationStatus = RegistrationStatus.NeedsEmailVerification;
                        } else if (getPaymentRegistrationResponse.c) {
                            registrationStatus = RegistrationStatus.Active;
                        } else if (!getPaymentRegistrationResponse.b) {
                            registrationStatus = RegistrationStatus.NotStarted;
                        } else if (getPaymentRegistrationResponse.e) {
                            registrationStatus = RegistrationStatus.NeedsAction;
                        } else {
                            registrationStatus = RegistrationStatus.NeedsReview;
                        }
                        RegistrationStatus registrationStatus2 = registrationStatus;
                        boolean z = getPaymentRegistrationResponse.b;
                        boolean z2 = getPaymentRegistrationResponse.d;
                        String str = getPaymentRegistrationResponse.a;
                        if (str == null) {
                            str = PaymentsRegistrationViewModel.this.n.getString(R.string.stripe_dashboard_link);
                            m0.n.b.i.d(str, "resources.getString(R.string.stripe_dashboard_link)");
                        }
                        return r0Var.a(registrationStatus2, z, z2, str, bVar);
                    }
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
