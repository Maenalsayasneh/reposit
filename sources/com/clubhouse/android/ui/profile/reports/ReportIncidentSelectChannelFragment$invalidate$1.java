package com.clubhouse.android.ui.profile.reports;

import android.widget.TextView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.u.y5.t0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectChannelFragment.kt */
public final class ReportIncidentSelectChannelFragment$invalidate$1 extends Lambda implements l<t0, i> {
    public final /* synthetic */ ReportIncidentSelectChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectChannelFragment$invalidate$1(ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment) {
        super(1);
        this.c = reportIncidentSelectChannelFragment;
    }

    public Object invoke(Object obj) {
        t0 t0Var = (t0) obj;
        m0.n.b.i.e(t0Var, "state");
        User user = t0Var.a;
        AvatarView avatarView = this.c.N0().a;
        m0.n.b.i.d(avatarView, "binding.avatar");
        k.u(avatarView, user);
        this.c.N0().d.setText(user.getName());
        Boolean bool = t0Var.c;
        if (bool != null) {
            ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment = this.c;
            if (bool.booleanValue()) {
                reportIncidentSelectChannelFragment.N0().e.setText(R.string.we_couldnt_find_any_rooms);
            } else {
                reportIncidentSelectChannelFragment.N0().e.setText(R.string.these_are_the_rooms);
            }
            TextView textView = reportIncidentSelectChannelFragment.N0().e;
            m0.n.b.i.d(textView, "binding.weCouldntFindAnyRooms");
            k.K(textView);
        }
        this.c.N0().c.g();
        return i.a;
    }
}
