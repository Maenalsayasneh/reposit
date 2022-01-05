package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import android.widget.FrameLayout;
import com.clubhouse.app.R;
import h0.i.b.a;
import i0.e.b.g3.u.z5.n0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.k;

/* compiled from: ConnectSocialAccountsFragment.kt */
public final class ConnectSocialAccountsFragment$invalidate$1 extends Lambda implements l<n0, Button> {
    public final /* synthetic */ ConnectSocialAccountsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConnectSocialAccountsFragment$invalidate$1(ConnectSocialAccountsFragment connectSocialAccountsFragment) {
        super(1);
        this.c = connectSocialAccountsFragment;
    }

    public Object invoke(Object obj) {
        n0 n0Var = (n0) obj;
        i.e(n0Var, "state");
        ConnectSocialAccountsFragment connectSocialAccountsFragment = this.c;
        k<Object>[] kVarArr = ConnectSocialAccountsFragment.Z1;
        FrameLayout frameLayout = connectSocialAccountsFragment.N0().b;
        i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf(n0Var.e));
        this.c.N0().c.setText(n0Var.f);
        this.c.N0().a.setEnabled(!n0Var.c);
        this.c.N0().d.setEnabled(!n0Var.a);
        String str = n0Var.d;
        if (str != null) {
            ConnectSocialAccountsFragment connectSocialAccountsFragment2 = this.c;
            Button button = connectSocialAccountsFragment2.N0().a;
            button.setText(str);
            button.setTextColor(a.getColor(connectSocialAccountsFragment2.requireContext(), R.color.black));
        }
        String str2 = n0Var.b;
        if (str2 == null) {
            return null;
        }
        ConnectSocialAccountsFragment connectSocialAccountsFragment3 = this.c;
        Button button2 = connectSocialAccountsFragment3.N0().d;
        button2.setText(str2);
        button2.setTextColor(a.getColor(connectSocialAccountsFragment3.requireContext(), R.color.black));
        return button2;
    }
}
