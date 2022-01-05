package com.clubhouse.android.ui.profile;

import android.view.View;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.data.models.local.EventInProfile;
import i0.e.b.g3.u.d5;
import i0.e.b.g3.u.q4;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$setUpViews$22$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ View d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$setUpViews$22$1(HalfProfileFragment halfProfileFragment, View view) {
        super(1);
        this.c = halfProfileFragment;
        this.d = view;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        HalfProfileFragment halfProfileFragment = this.c;
        EventInProfile eventInProfile = q4Var.t;
        View view = this.d;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.clubhouse.android.core.ui.RSVPButton");
        boolean isChecked = ((RSVPButton) view).isChecked();
        HalfProfileViewModel U0 = this.c.U0();
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(U0, "viewModel");
        U0.p(new d5(eventInProfile, isChecked));
        return i.a;
    }
}
