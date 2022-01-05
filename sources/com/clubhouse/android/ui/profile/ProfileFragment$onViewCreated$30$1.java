package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityOptionsCompat;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.app.R;
import h0.a.f.b;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.w4;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$30$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$30$1(ProfileFragment profileFragment) {
        super(1);
        this.c = profileFragment;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile != null) {
            ProfileFragment profileFragment = this.c;
            if (c5Var.p) {
                String str = userProfile.x;
                if (str == null || StringsKt__IndentKt.o(str)) {
                    profileFragment.P0().p(w4.a);
                    b<Intent> bVar = profileFragment.f2;
                    if (bVar != null) {
                        bVar.a(profileFragment.P0().p.a(), (ActivityOptionsCompat) null);
                    } else {
                        m0.n.b.i.m("getInstagramOAuthToken");
                        throw null;
                    }
                }
            }
            String str2 = userProfile.x;
            if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
                String string = profileFragment.requireContext().getString(R.string.instagram, new Object[]{userProfile.x});
                m0.n.b.i.e(profileFragment, "<this>");
                Context requireContext = profileFragment.requireContext();
                m0.n.b.i.d(requireContext, "requireContext()");
                m0.n.b.i.e(requireContext, "<this>");
                if (string != null) {
                    requireContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(string)));
                }
            }
        }
        return i.a;
    }
}
