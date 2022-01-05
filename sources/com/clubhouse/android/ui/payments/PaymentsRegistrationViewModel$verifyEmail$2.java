package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.s.e1;
import i0.e.b.g3.s.r0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class PaymentsRegistrationViewModel$verifyEmail$2 extends Lambda implements p<r0, b<? extends EmptySuccessResponse>, r0> {
    public final /* synthetic */ PaymentsRegistrationViewModel c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationViewModel$verifyEmail$2(PaymentsRegistrationViewModel paymentsRegistrationViewModel, String str) {
        super(2);
        this.c = paymentsRegistrationViewModel;
        this.d = str;
    }

    public Object invoke(Object obj, Object obj2) {
        r0 r0Var = (r0) obj;
        b bVar = (b) obj2;
        i.e(r0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.o(new e1(this.d));
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return r0Var;
    }
}
