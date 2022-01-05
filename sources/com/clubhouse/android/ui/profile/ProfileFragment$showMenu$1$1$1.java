package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.n3;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$showMenu$1$1$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ c5 c;
    public final /* synthetic */ ProfileFragment d;
    public final /* synthetic */ UserProfile q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$showMenu$1$1$1(c5 c5Var, ProfileFragment profileFragment, UserProfile userProfile) {
        super(1);
        this.c = c5Var;
        this.d = profileFragment;
        this.q = userProfile;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.e = new n3(this.d, this.c, this.q);
        m0Var.a(R.menu.menu_profile);
        m0Var.b.findItem(R.id.block).setVisible(!this.c.r);
        m0Var.b.findItem(R.id.unblock).setVisible(this.c.r);
        return i.a;
    }
}
