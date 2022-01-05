package com.clubhouse.android.ui.profile;

import android.view.View;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.data.models.local.EventInProfile;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.d5;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$32$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$32$1(ProfileFragment profileFragment, View view) {
        super(1);
        this.c = profileFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        ProfileFragment profileFragment = this.c;
        EventInProfile eventInProfile = c5Var.t;
        View view = this.d;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.clubhouse.android.core.ui.RSVPButton");
        boolean isChecked = ((RSVPButton) view).isChecked();
        ProfileViewModel P0 = this.c.P0();
        m0.n.b.i.e(profileFragment, "<this>");
        m0.n.b.i.e(P0, "viewModel");
        P0.p(new d5(eventInProfile, isChecked));
        return i.a;
    }
}
