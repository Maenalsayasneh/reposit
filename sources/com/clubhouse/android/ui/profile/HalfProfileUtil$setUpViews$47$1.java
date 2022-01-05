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
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$47$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$47$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        UserProfile userProfile = q4Var.k;
        if (userProfile != null) {
            HalfProfileFragment halfProfileFragment = this.c;
            ClubWithAdmin clubWithAdmin = userProfile.g2;
            if (clubWithAdmin != null) {
                o4.m mVar = o4.a;
                ClubArgs clubArgs = r7;
                ClubArgs clubArgs2 = new ClubArgs(Integer.valueOf(clubWithAdmin.x), (String) null, (String) null, false, false, SourceLocation.PROFILE, (Map) null, 94);
                v.a1(halfProfileFragment, mVar.a(clubArgs), (q) null, 2);
            }
            BasicUser basicUser = userProfile.f2;
            if (basicUser != null && userProfile.g2 == null) {
                SourceLocation sourceLocation = SourceLocation.PROFILE;
                m0.n.b.i.e(basicUser, "<this>");
                m0.n.b.i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
                ProfileArgs profileArgs = new ProfileArgs(basicUser.getId(), (String) null, new BasicUser(basicUser.getId().intValue(), basicUser.getName(), basicUser.C(), basicUser.b()), false, (Uri) null, sourceLocation, (Map) null, 26);
                m0.n.b.i.e(profileArgs, "mavericksArg");
                v.a1(halfProfileFragment, new o4.h(profileArgs, (String) null), (q) null, 2);
            }
        }
        return i.a;
    }
}
