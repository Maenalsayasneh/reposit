package com.clubhouse.android.ui.profile.settings;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.e.b.g3.u.z5.n0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AccountFragment.kt */
public final class AccountFragment$invalidate$1 extends Lambda implements l<n0, i> {
    public final /* synthetic */ AccountFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountFragment$invalidate$1(AccountFragment accountFragment) {
        super(1);
        this.c = accountFragment;
    }

    public Object invoke(Object obj) {
        String str;
        String str2;
        n0 n0Var = (n0) obj;
        m0.n.b.i.e(n0Var, "state");
        FrameLayout frameLayout = this.c.N0().d;
        m0.n.b.i.d(frameLayout, "binding.loading");
        k.L(frameLayout, Boolean.valueOf(n0Var.e));
        TextView textView = this.c.N0().c;
        if (n0Var.c) {
            str = this.c.getString(R.string.disconnect_instagram);
        } else {
            str = this.c.getString(R.string.connect_instagram);
        }
        textView.setText(str);
        TextView textView2 = this.c.N0().e;
        if (n0Var.a) {
            str2 = this.c.getString(R.string.disconnect_twitter);
        } else {
            str2 = this.c.getString(R.string.connect_twitter);
        }
        textView2.setText(str2);
        return i.a;
    }
}
