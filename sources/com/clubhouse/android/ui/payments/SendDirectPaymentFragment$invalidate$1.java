package com.clubhouse.android.ui.payments;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.j0;
import i0.e.b.g3.s.k0;
import java.text.NumberFormat;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment$invalidate$1 extends Lambda implements l<b1, i> {
    public final /* synthetic */ SendDirectPaymentFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentFragment$invalidate$1(SendDirectPaymentFragment sendDirectPaymentFragment) {
        super(1);
        this.c = sendDirectPaymentFragment;
    }

    public Object invoke(Object obj) {
        Integer num;
        b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        SendDirectPaymentFragment sendDirectPaymentFragment = this.c;
        k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
        AvatarView avatarView = sendDirectPaymentFragment.U0().b;
        m0.n.b.i.d(avatarView, "binding.avatar");
        i0.e.b.d3.k.u(avatarView, b1Var.a);
        this.c.U0().m.setText(b1Var.a.u2);
        this.c.U0().t.setText(this.c.requireContext().getString(R.string.username, new Object[]{b1Var.a.v2}));
        Button button = this.c.U0().c;
        m0.n.b.i.d(button, "binding.backButton");
        Boolean valueOf = Boolean.valueOf(b1Var.c instanceof k0.a);
        m0.n.b.i.e(button, "<this>");
        if (m0.n.b.i.a(valueOf, Boolean.TRUE)) {
            i0.e.b.d3.k.l(button);
        } else {
            i0.e.b.d3.k.m(button);
        }
        TextView textView = this.c.U0().t;
        m0.n.b.i.d(textView, "binding.username");
        i0.e.b.d3.k.L(textView, Boolean.valueOf(b1Var.c instanceof k0.d));
        ConstraintLayout constraintLayout = this.c.U0().s;
        m0.n.b.i.d(constraintLayout, "binding.selectAmountState");
        i0.e.b.d3.k.L(constraintLayout, Boolean.valueOf(b1Var.c instanceof k0.d));
        LinearLayout linearLayout = this.c.U0().e;
        m0.n.b.i.d(linearLayout, "binding.confirmAmountState");
        i0.e.b.d3.k.L(linearLayout, Boolean.valueOf(b1Var.c instanceof k0.a));
        CardView cardView = this.c.U0().q;
        m0.n.b.i.d(cardView, "binding.paymentAmountLabel");
        i0.e.b.d3.k.L(cardView, Boolean.valueOf(b1Var.c instanceof k0.a));
        FrameLayout frameLayout = this.c.U0().l;
        m0.n.b.i.d(frameLayout, "binding.loadingState");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(b1Var.c instanceof k0.c));
        ConstraintLayout constraintLayout2 = this.c.U0().k;
        m0.n.b.i.d(constraintLayout2, "binding.finalizingState");
        i0.e.b.d3.k.L(constraintLayout2, Boolean.valueOf(b1Var.c instanceof k0.b));
        k0 k0Var = b1Var.c;
        if (k0Var instanceof k0.a) {
            Button button2 = this.c.U0().f;
            Context requireContext = this.c.requireContext();
            UserProfile userProfile = b1Var.a;
            Objects.requireNonNull(userProfile);
            k0.a aVar = (k0.a) k0Var;
            button2.setText(requireContext.getString(R.string.send_amount_dollars, new Object[]{v.f0(userProfile), Integer.valueOf(aVar.a.b() / 100)}));
            this.c.U0().d.setText(aVar.c.c);
            UserProfile userProfile2 = b1Var.a;
            int a = aVar.a.a(userProfile2.k2, userProfile2.l2);
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMinimumIntegerDigits(1);
            numberInstance.setMinimumFractionDigits(2);
            numberInstance.setMaximumFractionDigits(2);
            String format = numberInstance.format(((double) a) / 100.0d);
            this.c.U0().g.setText(this.c.requireContext().getString(R.string.fee_amount_dollars, new Object[]{format}));
            Button button3 = this.c.U0().f;
            Context requireContext2 = this.c.requireContext();
            UserProfile userProfile3 = b1Var.a;
            Objects.requireNonNull(userProfile3);
            button3.setContentDescription(requireContext2.getString(R.string.cd_confirm_payment_dollars, new Object[]{v.f0(userProfile3), Integer.valueOf(aVar.a.b() / 100), format}));
            this.c.U0().q.setContentDescription(this.c.requireContext().getString(R.string.cd_selected_payment_method, new Object[]{aVar.c.c}));
        }
        if (b1Var.c instanceof k0.b) {
            TextView textView2 = this.c.U0().h;
            Context requireContext3 = this.c.requireContext();
            Object[] objArr = new Object[1];
            j0 j0Var = b1Var.d;
            if (j0Var == null) {
                num = null;
            } else {
                num = Integer.valueOf(j0Var.b() / 100);
            }
            objArr[0] = num;
            textView2.setText(requireContext3.getString(R.string.amount_dollars, objArr));
        }
        return i.a;
    }
}
