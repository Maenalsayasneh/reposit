package com.clubhouse.android.ui.profile.reports;

import android.widget.TextView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.u.y5.e1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportProfileLegacyFragment.kt */
public final class ReportProfileLegacyFragment$invalidate$1 extends Lambda implements l<e1, i> {
    public final /* synthetic */ ReportProfileLegacyFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportProfileLegacyFragment$invalidate$1(ReportProfileLegacyFragment reportProfileLegacyFragment) {
        super(1);
        this.c = reportProfileLegacyFragment;
    }

    public Object invoke(Object obj) {
        e1 e1Var = (e1) obj;
        m0.n.b.i.e(e1Var, "state");
        User user = e1Var.a;
        AvatarView avatarView = this.c.N0().c;
        m0.n.b.i.d(avatarView, "binding.avatar");
        k.u(avatarView, user);
        this.c.N0().k.setText(user.getName());
        this.c.N0().o.setText(user.C());
        if (e1Var.d) {
            this.c.N0().e.setText(this.c.getString(R.string.speaker));
        } else if (e1Var.c) {
            this.c.N0().e.setText(this.c.getString(R.string.moderator));
        } else {
            TextView textView = this.c.N0().e;
            m0.n.b.i.d(textView, "binding.channelRole");
            k.p(textView);
        }
        this.c.N0().p.setText(this.c.getString(R.string.why_are_you_reporting, user.getName()));
        return i.a;
    }
}
