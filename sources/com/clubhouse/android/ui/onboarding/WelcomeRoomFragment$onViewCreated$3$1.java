package com.clubhouse.android.ui.onboarding;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.r.f0;
import i0.e.b.g3.r.g0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: WelcomeRoomFragment.kt */
public final class WelcomeRoomFragment$onViewCreated$3$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ WelcomeRoomFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomFragment$onViewCreated$3$1(WelcomeRoomFragment welcomeRoomFragment) {
        super(1);
        this.c = welcomeRoomFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.are_you_sure, R.string.no_thanks_confirmation_message);
        aVar.c(R.string.yes_im_sure, new f0(this.c));
        aVar.d(R.string.welcome_room_okay_join, new g0(this.c));
        return i.a;
    }
}
