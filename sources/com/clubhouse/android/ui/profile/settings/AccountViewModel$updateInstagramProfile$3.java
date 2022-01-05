package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.request.UpdateInstagramProfileResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.u.z5.n0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: AccountViewModel.kt */
public final class AccountViewModel$updateInstagramProfile$3 extends Lambda implements p<n0, b<? extends UpdateInstagramProfileResponse>, n0> {
    public final /* synthetic */ AccountViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountViewModel$updateInstagramProfile$3(AccountViewModel accountViewModel) {
        super(2);
        this.c = accountViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        n0 n0Var = (n0) obj;
        final b bVar = (b) obj2;
        i.e(n0Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            AccountViewModel accountViewModel = this.c;
            String string = accountViewModel.p.getString(R.string.instagram_connect_success);
            i.d(string, "resources.getString(R.string.instagram_connect_success)");
            accountViewModel.o(new e(string));
            this.c.m(new l<n0, n0>() {
                public Object invoke(Object obj) {
                    n0 n0Var = (n0) obj;
                    i.e(n0Var, "$this$setState");
                    return n0.copy$default(n0Var, false, (String) null, true, ((UpdateInstagramProfileResponse) ((f0) bVar).b).a, false, 19, (Object) null);
                }
            });
        }
        if (bVar instanceof c) {
            AccountViewModel accountViewModel2 = this.c;
            String message = ((c) bVar).b.getMessage();
            if (message == null) {
                message = this.c.p.getString(R.string.instagram_connect_error);
                i.d(message, "resources.getString(R.string.instagram_connect_error)");
            }
            accountViewModel2.o(new d(message));
        }
        return n0.copy$default(n0Var, false, (String) null, false, (String) null, bVar instanceof i0.b.b.e, 15, (Object) null);
    }
}
