package com.clubhouse.android.ui.payments;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.g3.s.d1;
import i0.e.b.g3.s.r0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$2 extends Lambda implements p<r0, b<? extends EmptySuccessResponse>, r0> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ PaymentsRegistrationViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$2(boolean z, PaymentsRegistrationViewModel paymentsRegistrationViewModel) {
        super(2);
        this.c = z;
        this.d = paymentsRegistrationViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        r0 r0Var = (r0) obj;
        b bVar = (b) obj2;
        i.e(r0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            return r0.copy$default(r0Var, (RegistrationStatus) null, false, this.c, (String) null, (b) null, 27, (Object) null);
        }
        if (!(bVar instanceof c)) {
            return r0Var;
        }
        PaymentsRegistrationViewModel paymentsRegistrationViewModel = this.d;
        String message = ((c) bVar).b.getMessage();
        if (message == null) {
            message = this.d.n.getString(R.string.update_payments_status_error);
            i.d(message, "resources.getString(R.string.update_payments_status_error)");
        }
        paymentsRegistrationViewModel.o(new d1(message));
        return r0Var;
    }
}
