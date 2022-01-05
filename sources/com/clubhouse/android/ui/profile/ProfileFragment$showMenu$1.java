package com.clubhouse.android.ui.profile;

import android.view.View;
import com.clubhouse.android.data.models.local.user.UserProfile;
import h0.b.f.m0;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$showMenu$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$showMenu$1(ProfileFragment profileFragment, View view) {
        super(1);
        this.c = profileFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        UserProfile userProfile = c5Var.l;
        if (userProfile == null) {
            return null;
        }
        ProfileFragment profileFragment = this.c;
        View view = this.d;
        ProfileFragment$showMenu$1$1$1 profileFragment$showMenu$1$1$1 = new ProfileFragment$showMenu$1$1$1(c5Var, profileFragment, userProfile);
        m0.n.b.i.e(profileFragment, "<this>");
        m0.n.b.i.e(view, "anchor");
        m0.n.b.i.e(profileFragment$showMenu$1$1$1, "f");
        m0 m0Var = new m0(profileFragment.requireContext(), view);
        profileFragment$showMenu$1$1$1.invoke(m0Var);
        if (m0Var.d.f()) {
            return i.a;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
}
