package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.HalfEventArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$19$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$19$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        Integer num;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        HalfProfileFragment halfProfileFragment = this.c;
        EventInProfile eventInProfile = q4Var.t;
        if (eventInProfile == null) {
            num = null;
        } else {
            num = Integer.valueOf(eventInProfile.q);
        }
        HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, num, (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 125);
        halfProfileFragment.P0();
        m0.n.b.i.e(halfEventArgs, "mavericksArg");
        v.a1(halfProfileFragment, new o4.g(halfEventArgs), (q) null, 2);
        return i.a;
    }
}
