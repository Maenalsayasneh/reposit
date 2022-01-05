package com.clubhouse.android.ui.profile.reports;

import android.widget.TextView;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.u.y5.p0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectCategoryFragment.kt */
public final class ReportIncidentSelectCategoryFragment$invalidate$1 extends Lambda implements l<p0, i> {
    public final /* synthetic */ ReportIncidentSelectCategoryFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectCategoryFragment$invalidate$1(ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment) {
        super(1);
        this.c = reportIncidentSelectCategoryFragment;
    }

    public Object invoke(Object obj) {
        i iVar;
        String str;
        String str2;
        p0 p0Var = (p0) obj;
        m0.n.b.i.e(p0Var, "state");
        User user = p0Var.a;
        String str3 = null;
        if (user == null) {
            iVar = null;
        } else {
            ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment = this.c;
            AvatarView avatarView = reportIncidentSelectCategoryFragment.N0().a;
            m0.n.b.i.d(avatarView, "binding.avatar");
            k.u(avatarView, user);
            reportIncidentSelectCategoryFragment.N0().c.setText(user.getName());
            iVar = i.a;
        }
        if (iVar == null) {
            ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment2 = this.c;
            AvatarView avatarView2 = reportIncidentSelectCategoryFragment2.N0().a;
            m0.n.b.i.d(avatarView2, "binding.avatar");
            k.p(avatarView2);
            TextView textView = reportIncidentSelectCategoryFragment2.N0().c;
            Channel channel = p0Var.d;
            if (channel == null || (str2 = channel.u0()) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        TextView textView2 = this.c.N0().e;
        int ordinal = p0Var.h.ordinal();
        if (ordinal == 0) {
            ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment3 = this.c;
            Object[] objArr = new Object[1];
            if (user != null) {
                str3 = user.F();
            }
            objArr[0] = str3;
            str = reportIncidentSelectCategoryFragment3.getString(R.string.what_did_say_was_wrong, objArr);
        } else if (ordinal == 1) {
            ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment4 = this.c;
            Object[] objArr2 = new Object[1];
            if (user != null) {
                str3 = user.F();
            }
            objArr2[0] = str3;
            str = reportIncidentSelectCategoryFragment4.getString(R.string.what_is_wrong_on_profile, objArr2);
        } else if (ordinal != 2) {
            ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment5 = this.c;
            Object[] objArr3 = new Object[1];
            if (user != null) {
                str3 = user.F();
            }
            objArr3[0] = str3;
            str = reportIncidentSelectCategoryFragment5.getString(R.string.what_did_do_wrong, objArr3);
        } else {
            str = this.c.getString(R.string.what_is_wrong_with_the_room_title);
        }
        textView2.setText(str);
        this.c.N0().d.g();
        return i.a;
    }
}
