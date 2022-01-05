package com.clubhouse.android.ui.profile;

import android.net.Uri;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.clubs.ClubArgs;
import com.stripe.android.model.Stripe3ds2AuthParams;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.y4;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$17$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$17$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile != null) {
            ProfileFragment profileFragment = this.c;
            Objects.requireNonNull(profileFragment);
            m0.n.b.i.e(userProfile, "user");
            BasicUser basicUser = userProfile.f2;
            if (basicUser != null && userProfile.g2 == null) {
                SourceLocation sourceLocation = SourceLocation.PROFILE;
                m0.n.b.i.e(basicUser, "<this>");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                ProfileArgs profileArgs = new ProfileArgs(basicUser.getId(), (String) null, new BasicUser(basicUser.getId().intValue(), basicUser.getName(), basicUser.C(), basicUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
                m0.n.b.i.e(profileArgs, "mavericksArg");
                v.a1(profileFragment, new y4.h(profileArgs, (String) null), (q) null, 2);
            }
            ClubWithAdmin clubWithAdmin = userProfile.g2;
            if (clubWithAdmin != null) {
                v.a1(profileFragment, y4.a.a(new ClubArgs(Integer.valueOf(clubWithAdmin.x), (String) null, (String) null, false, false, SourceLocation.PROFILE, (Map) null, 94)), (q) null, 2);
            }
        }
        return i.a;
    }
}
