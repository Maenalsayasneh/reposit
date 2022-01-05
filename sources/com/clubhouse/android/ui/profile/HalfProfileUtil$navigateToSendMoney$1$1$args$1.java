package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.payments.SendDirectPaymentArgs;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$navigateToSendMoney$1$1$args$1 extends Lambda implements l<i0.e.b.z2.g.l, SendDirectPaymentArgs> {
    public final /* synthetic */ UserProfile c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$navigateToSendMoney$1$1$args$1(UserProfile userProfile) {
        super(1);
        this.c = userProfile;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        i.e(lVar, "channelState");
        return new SendDirectPaymentArgs(this.c, lVar.t);
    }
}
