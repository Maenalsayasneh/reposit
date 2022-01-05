package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.events.HalfEventArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.y4;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$31$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$31$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        Integer num;
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        ProfileFragment profileFragment = this.c;
        EventInProfile eventInProfile = c5Var.t;
        if (eventInProfile == null) {
            num = null;
        } else {
            num = Integer.valueOf(eventInProfile.q);
        }
        HalfEventArgs halfEventArgs = new HalfEventArgs((String) null, num, (String) null, (String) null, (EventInClub) null, (SourceLocation) null, (Map) null, 125);
        m0.n.b.i.e(halfEventArgs, "mavericksArg");
        v.a1(profileFragment, new y4.g(halfEventArgs), (q) null, 2);
        return i.a;
    }
}
