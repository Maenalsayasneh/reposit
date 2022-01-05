package com.clubhouse.android.ui.profile.settings;

import android.content.Intent;
import androidx.core.app.ActivityOptionsCompat;
import h0.a.f.b;
import i0.e.b.g3.u.w4;
import i0.e.b.g3.u.z5.n0;
import i0.e.b.g3.u.z5.r0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AccountFragment.kt */
public final class AccountFragment$onViewCreated$4$1 extends Lambda implements l<n0, i> {
    public final /* synthetic */ AccountFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountFragment$onViewCreated$4$1(AccountFragment accountFragment) {
        super(1);
        this.c = accountFragment;
    }

    public Object invoke(Object obj) {
        n0 n0Var = (n0) obj;
        m0.n.b.i.e(n0Var, "state");
        if (n0Var.c) {
            this.c.O0().p(r0.a);
        } else {
            this.c.O0().p(w4.a);
            AccountFragment accountFragment = this.c;
            b<Intent> bVar = accountFragment.c2;
            if (bVar != null) {
                bVar.a(accountFragment.O0().o.a(), (ActivityOptionsCompat) null);
            } else {
                m0.n.b.i.m("getInstagramOAuthToken");
                throw null;
            }
        }
        return i.a;
    }
}
