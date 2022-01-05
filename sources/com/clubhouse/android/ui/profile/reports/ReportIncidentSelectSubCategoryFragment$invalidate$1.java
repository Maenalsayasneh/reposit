package com.clubhouse.android.ui.profile.reports;

import android.widget.TextView;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.u.y5.x0;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectSubCategoryFragment.kt */
public final class ReportIncidentSelectSubCategoryFragment$invalidate$1 extends Lambda implements l<x0, i> {
    public final /* synthetic */ ReportIncidentSelectSubCategoryFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectSubCategoryFragment$invalidate$1(ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment) {
        super(1);
        this.c = reportIncidentSelectSubCategoryFragment;
    }

    public Object invoke(Object obj) {
        i iVar;
        String str;
        x0 x0Var = (x0) obj;
        m0.n.b.i.e(x0Var, "state");
        String str2 = x0Var.b.c;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str2.toLowerCase();
        m0.n.b.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        User user = x0Var.a;
        if (user == null) {
            iVar = null;
        } else {
            ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment = this.c;
            AvatarView avatarView = reportIncidentSelectSubCategoryFragment.N0().a;
            m0.n.b.i.d(avatarView, "binding.avatar");
            k.u(avatarView, user);
            reportIncidentSelectSubCategoryFragment.N0().c.setText(user.getName());
            iVar = i.a;
        }
        if (iVar == null) {
            ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment2 = this.c;
            AvatarView avatarView2 = reportIncidentSelectSubCategoryFragment2.N0().a;
            m0.n.b.i.d(avatarView2, "binding.avatar");
            k.p(avatarView2);
            TextView textView = reportIncidentSelectSubCategoryFragment2.N0().c;
            Channel channel = x0Var.e;
            if (channel == null || (str = channel.u0()) == null) {
                str = "";
            }
            textView.setText(str);
        }
        this.c.N0().f.setText(this.c.getString(R.string.for_some, lowerCase));
        this.c.N0().g.setText(this.c.getString(R.string.what_kind_of, lowerCase));
        this.c.N0().d.g();
        return i.a;
    }
}
