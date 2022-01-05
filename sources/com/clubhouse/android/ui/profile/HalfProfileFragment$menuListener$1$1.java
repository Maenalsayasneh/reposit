package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.net.Uri;
import android.view.MenuItem;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.app.R;
import com.instabug.library.model.NetworkLog;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$menuListener$1$1 extends Lambda implements l<q4, Boolean> {
    public final /* synthetic */ MenuItem c;
    public final /* synthetic */ HalfProfileFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$menuListener$1$1(MenuItem menuItem, HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = menuItem;
        this.d = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        i.e(q4Var, "state");
        boolean z = false;
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
                case R.id.report_incident:
                    HalfProfileFragment.O0(this.d, new ReportProfileArgs(q4Var.k, (String) null, false, false, (Uri) null, 30));
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
                    HalfProfileFragment halfProfileFragment2 = this.d;
                    UserProfile userProfile2 = q4Var.k;
                    HalfProfileViewModel U02 = halfProfileFragment2.U0();
                    i.e(halfProfileFragment2, "<this>");
                    i.e(userProfile2, "user");
                    i.e(U02, "viewModel");
                    HalfProfileUtil$showUnblockConfirmationDialog$1 halfProfileUtil$showUnblockConfirmationDialog$1 = new HalfProfileUtil$showUnblockConfirmationDialog$1(halfProfileFragment2, userProfile2, U02);
                    i.e(halfProfileFragment2, "<this>");
                    i.e(halfProfileUtil$showUnblockConfirmationDialog$1, "f");
                    d.a aVar2 = new d.a(halfProfileFragment2.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
                    halfProfileUtil$showUnblockConfirmationDialog$1.invoke(aVar2);
                    aVar2.g();
                    break;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
