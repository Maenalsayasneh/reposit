package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.u.z5.n0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$disconnectTwitter$3 extends Lambda implements p<n0, b<? extends EmptySuccessResponse>, n0> {
    public final /* synthetic */ AccountViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$disconnectTwitter$3(AccountViewModel accountViewModel) {
        super(2);
        this.c = accountViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        b bVar = (b) obj2;
        i.e(n0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            AccountViewModel accountViewModel = this.c;
            String string = accountViewModel.p.getString(R.string.social_disconnect_success);
            i.d(string, "resources.getString(R.string.social_disconnect_success)");
            accountViewModel.o(new e(string));
            this.c.m(AnonymousClass1.c);
        }
        if (bVar instanceof c) {
            AccountViewModel accountViewModel2 = this.c;
            accountViewModel2.o(new d(accountViewModel2.p.getString(R.string.twitter_disconnect_error)));
        }
        return n0.copy$default(n0Var, false, (String) null, false, (String) null, bVar instanceof i0.b.b.e, 15, (Object) null);
    }
}
