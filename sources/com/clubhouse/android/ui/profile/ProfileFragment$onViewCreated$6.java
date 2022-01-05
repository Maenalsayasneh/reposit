package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.clubs.ClubArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.e5;
import i0.e.b.g3.u.y4;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$6 extends Lambda implements l<Integer, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$6(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (intValue != 0) {
            v.Z0(this.c, y4.a.a(new ClubArgs(Integer.valueOf(intValue), (String) null, (String) null, true, false, SourceLocation.PROFILE, (Map) null, 86)), new q(false, -1, false, -1, -1, -1, -1));
            this.c.P0().p(e5.a);
        }
        return i.a;
    }
}
