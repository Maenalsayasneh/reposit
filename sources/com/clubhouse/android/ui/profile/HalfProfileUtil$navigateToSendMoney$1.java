package com.clubhouse.android.ui.profile;

import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.payments.SendDirectPaymentArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$navigateToSendMoney$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$navigateToSendMoney$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        SendDirectPaymentArgs sendDirectPaymentArgs;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        UserProfile userProfile = q4Var.k;
        if (userProfile == null) {
            return null;
        }
        HalfProfileFragment halfProfileFragment = this.c;
        ChannelViewModel channelViewModel = halfProfileFragment.j2;
        if (channelViewModel != null) {
            sendDirectPaymentArgs = (SendDirectPaymentArgs) v.v2(channelViewModel, new HalfProfileUtil$navigateToSendMoney$1$1$args$1(userProfile));
        } else {
            sendDirectPaymentArgs = new SendDirectPaymentArgs(userProfile, (String) null);
        }
        m0.n.b.i.e(sendDirectPaymentArgs, "mavericksArg");
        v.a1(halfProfileFragment, new o4.l(sendDirectPaymentArgs), (q) null, 2);
        return i.a;
    }
}
