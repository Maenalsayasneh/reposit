package com.clubhouse.android.ui.payments;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import i0.b.b.c;
import i0.b.b.e;
import i0.b.b.f0;
import i0.e.b.d3.k;
import i0.e.b.g3.s.r0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PaymentsRegistrationFragment.kt */
public final class PaymentsRegistrationFragment$invalidate$1 extends Lambda implements l<r0, i> {
    public final /* synthetic */ PaymentsRegistrationFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationFragment$invalidate$1(PaymentsRegistrationFragment paymentsRegistrationFragment) {
        super(1);
        this.c = paymentsRegistrationFragment;
    }

    public Object invoke(Object obj) {
        r0 r0Var = (r0) obj;
        m0.n.b.i.e(r0Var, "state");
        FrameLayout frameLayout = this.c.N0().c;
        m0.n.b.i.d(frameLayout, "binding.loading");
        k.L(frameLayout, Boolean.valueOf(r0Var.e instanceof e));
        FrameLayout frameLayout2 = this.c.N0().i;
        m0.n.b.i.d(frameLayout2, "binding.retry");
        k.L(frameLayout2, Boolean.valueOf(r0Var.e instanceof c));
        SwitchMaterial switchMaterial = this.c.N0().a;
        switchMaterial.setChecked(r0Var.c);
        switchMaterial.jumpDrawablesToCurrentState();
        if (r0Var.e instanceof f0) {
            LinearLayout linearLayout = this.c.N0().o;
            m0.n.b.i.d(linearLayout, "binding.stateVerifyEmail");
            boolean z = true;
            k.L(linearLayout, Boolean.valueOf(r0Var.a == RegistrationStatus.NeedsEmailVerification));
            LinearLayout linearLayout2 = this.c.N0().n;
            m0.n.b.i.d(linearLayout2, "binding.stateRegistrationNotStarted");
            k.L(linearLayout2, Boolean.valueOf(r0Var.a == RegistrationStatus.NotStarted));
            LinearLayout linearLayout3 = this.c.N0().l;
            m0.n.b.i.d(linearLayout3, "binding.stateRegistrationActionNeeded");
            k.L(linearLayout3, Boolean.valueOf(r0Var.a == RegistrationStatus.NeedsAction));
            LinearLayout linearLayout4 = this.c.N0().m;
            m0.n.b.i.d(linearLayout4, "binding.stateRegistrationInReview");
            k.L(linearLayout4, Boolean.valueOf(r0Var.a == RegistrationStatus.NeedsReview));
            LinearLayout linearLayout5 = this.c.N0().k;
            m0.n.b.i.d(linearLayout5, "binding.statePaymentsActive");
            if (r0Var.a != RegistrationStatus.Active) {
                z = false;
            }
            k.L(linearLayout5, Boolean.valueOf(z));
        }
        return i.a;
    }
}
