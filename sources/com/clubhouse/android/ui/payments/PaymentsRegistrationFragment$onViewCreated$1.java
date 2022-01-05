package com.clubhouse.android.ui.payments;

import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.s.d1;
import i0.e.b.g3.s.e1;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.payments.PaymentsRegistrationFragment$onViewCreated$1", f = "PaymentsRegistrationFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: PaymentsRegistrationFragment.kt */
public final class PaymentsRegistrationFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ PaymentsRegistrationFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationFragment$onViewCreated$1(PaymentsRegistrationFragment paymentsRegistrationFragment, m0.l.c<? super PaymentsRegistrationFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = paymentsRegistrationFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        PaymentsRegistrationFragment$onViewCreated$1 paymentsRegistrationFragment$onViewCreated$1 = new PaymentsRegistrationFragment$onViewCreated$1(this.d, cVar);
        paymentsRegistrationFragment$onViewCreated$1.c = obj;
        return paymentsRegistrationFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        PaymentsRegistrationFragment$onViewCreated$1 paymentsRegistrationFragment$onViewCreated$1 = new PaymentsRegistrationFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        paymentsRegistrationFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        paymentsRegistrationFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final PaymentsRegistrationFragment paymentsRegistrationFragment = this.d;
            v.f2(paymentsRegistrationFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = paymentsRegistrationFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (bVar instanceof d1) {
            v.f2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(((d1) bVar).a);
                    return i.a;
                }
            });
            this.d.N0().a.setChecked(!this.d.N0().a.isChecked());
        } else if (bVar instanceof e1) {
            PaymentsRegistrationFragment paymentsRegistrationFragment2 = this.d;
            String str = ((e1) bVar).a;
            k<Object>[] kVarArr = PaymentsRegistrationFragment.Z1;
            Objects.requireNonNull(paymentsRegistrationFragment2);
            PaymentsRegistrationFragment$showVerifyEmailSuccessDialog$1 paymentsRegistrationFragment$showVerifyEmailSuccessDialog$1 = new PaymentsRegistrationFragment$showVerifyEmailSuccessDialog$1(paymentsRegistrationFragment2, str);
            m0.n.b.i.e(paymentsRegistrationFragment2, "<this>");
            m0.n.b.i.e(paymentsRegistrationFragment$showVerifyEmailSuccessDialog$1, "f");
            d.a aVar = new d.a(paymentsRegistrationFragment2.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            paymentsRegistrationFragment$showVerifyEmailSuccessDialog$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
