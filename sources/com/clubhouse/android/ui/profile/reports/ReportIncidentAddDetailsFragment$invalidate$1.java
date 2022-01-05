package com.clubhouse.android.ui.profile.reports;

import android.widget.TextView;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.u.y5.k0;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsFragment$invalidate$1 extends Lambda implements l<k0, i> {
    public final /* synthetic */ ReportIncidentAddDetailsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentAddDetailsFragment$invalidate$1(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        super(1);
        this.c = reportIncidentAddDetailsFragment;
    }

    public Object invoke(Object obj) {
        String str;
        i iVar;
        String u02;
        k0 k0Var = (k0) obj;
        m0.n.b.i.e(k0Var, "state");
        User user = k0Var.a;
        int size = k0Var.b.size();
        String str2 = "";
        if (size == 0) {
            str = str2;
        } else if (size != 1) {
            str = k0Var.b.get(0).c + ", " + k0Var.b.get(1).c;
        } else {
            str = k0Var.b.get(0).c;
        }
        if (user == null) {
            iVar = null;
        } else {
            ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = this.c;
            AvatarView avatarView = reportIncidentAddDetailsFragment.N0().c;
            m0.n.b.i.d(avatarView, "binding.avatar");
            k.u(avatarView, user);
            reportIncidentAddDetailsFragment.N0().g.setText(user.getName());
            iVar = i.a;
        }
        if (iVar == null) {
            ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment2 = this.c;
            AvatarView avatarView2 = reportIncidentAddDetailsFragment2.N0().c;
            m0.n.b.i.d(avatarView2, "binding.avatar");
            k.p(avatarView2);
            TextView textView = reportIncidentAddDetailsFragment2.N0().g;
            Channel channel = k0Var.d;
            if (!(channel == null || (u02 = channel.u0()) == null)) {
                str2 = u02;
            }
            textView.setText(str2);
        }
        TextView textView2 = this.c.N0().i;
        ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment3 = this.c;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase();
        m0.n.b.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        textView2.setText(reportIncidentAddDetailsFragment3.getString(R.string.for_some, lowerCase));
        return i.a;
    }
}
