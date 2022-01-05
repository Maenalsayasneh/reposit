package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.app.R;
import com.instabug.library.model.NetworkLog;
import h0.b.a.d;
import h0.b0.v;
import i0.d.a.a.a;
import i0.e.b.g3.u.j5;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.g.l;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$inChannelMenuListener$1$1 extends Lambda implements p<q4, l, Boolean> {
    public final /* synthetic */ MenuItem c;
    public final /* synthetic */ HalfProfileFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$inChannelMenuListener$1$1(MenuItem menuItem, HalfProfileFragment halfProfileFragment) {
        super(2);
        this.c = menuItem;
        this.d = halfProfileFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        l lVar = (l) obj2;
        i.e(q4Var, "state");
        i.e(lVar, "channelState");
        boolean z = true;
        if (q4Var.k != null) {
            switch (this.c.getItemId()) {
                case R.id.block:
                    HalfProfileFragment halfProfileFragment = this.d;
                    UserProfile userProfile = q4Var.k;
                    HalfProfileViewModel U0 = halfProfileFragment.U0();
                    i.e(halfProfileFragment, "<this>");
                    i.e(userProfile, "user");
                    i.e(U0, "viewModel");
                    HalfProfileUtil$showBlockConfirmationDialog$1 halfProfileUtil$showBlockConfirmationDialog$1 = new HalfProfileUtil$showBlockConfirmationDialog$1(halfProfileFragment, userProfile, U0);
                    i.e(halfProfileFragment, "<this>");
                    i.e(halfProfileUtil$showBlockConfirmationDialog$1, "f");
                    d.a aVar = new d.a(halfProfileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                    halfProfileUtil$showBlockConfirmationDialog$1.invoke(aVar);
                    aVar.g();
                    break;
                case R.id.remove:
                    HalfProfileFragment halfProfileFragment2 = this.d;
                    i.e(halfProfileFragment2, "<this>");
                    v.v2(halfProfileFragment2.U0(), new HalfProfileUtil$showRemoveConfirmationDialog$1(false, halfProfileFragment2, false));
                    this.d.U0().p(j5.a);
                    break;
                case R.id.remove_and_report:
                    HalfProfileFragment halfProfileFragment3 = this.d;
                    i.e(halfProfileFragment3, "<this>");
                    v.v2(halfProfileFragment3.U0(), new HalfProfileUtil$showRemoveConfirmationDialog$1(false, halfProfileFragment3, false));
                    break;
                case R.id.report_incident:
                    HalfProfileFragment halfProfileFragment4 = this.d;
                    UserProfile userProfile2 = q4Var.k;
                    HalfProfileFragment.O0(halfProfileFragment4, new ReportProfileArgs(userProfile2, lVar.t, lVar.p.e(userProfile2.getId().intValue()), lVar.p.i(q4Var.k.getId().intValue()), (Uri) null, 16));
                    break;
                case R.id.share:
                    this.d.Q0().e("Share-Type-Profile", q4Var.b);
                    Context requireContext = this.d.requireContext();
                    i.d(requireContext, "requireContext()");
                    String str = q4Var.k.i2;
                    i.e(requireContext, "<this>");
                    if (str != null) {
                        a.e(requireContext, com.clubhouse.android.core.R.string.share_prompt, a.K("android.intent.action.SEND", NetworkLog.PLAIN_TEXT, "android.intent.extra.TEXT", str));
                        break;
                    }
                    break;
                case R.id.unblock:
                    HalfProfileFragment halfProfileFragment5 = this.d;
                    UserProfile userProfile3 = q4Var.k;
                    HalfProfileViewModel U02 = halfProfileFragment5.U0();
                    i.e(halfProfileFragment5, "<this>");
                    i.e(userProfile3, "user");
                    i.e(U02, "viewModel");
                    HalfProfileUtil$showUnblockConfirmationDialog$1 halfProfileUtil$showUnblockConfirmationDialog$1 = new HalfProfileUtil$showUnblockConfirmationDialog$1(halfProfileFragment5, userProfile3, U02);
                    i.e(halfProfileFragment5, "<this>");
                    i.e(halfProfileUtil$showUnblockConfirmationDialog$1, "f");
                    d.a aVar2 = new d.a(halfProfileFragment5.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                    halfProfileUtil$showUnblockConfirmationDialog$1.invoke(aVar2);
                    aVar2.g();
                    break;
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
