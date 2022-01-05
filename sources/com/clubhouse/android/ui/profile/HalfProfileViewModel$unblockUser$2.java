package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.l5;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$unblockUser$2 extends Lambda implements p<q4, b<? extends EmptySuccessResponse>, q4> {
    public final /* synthetic */ HalfProfileViewModel c;
    public final /* synthetic */ User d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$unblockUser$2(HalfProfileViewModel halfProfileViewModel, User user) {
        super(2);
        this.c = halfProfileViewModel;
        this.d = user;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        b bVar = (b) obj2;
        i.e(q4Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.o(new l5(this.d));
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return q4Var;
    }
}
