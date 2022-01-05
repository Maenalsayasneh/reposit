package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.l5;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$unblockUser$2 extends Lambda implements p<c5, b<? extends EmptySuccessResponse>, c5> {
    public final /* synthetic */ ProfileViewModel c;
    public final /* synthetic */ User d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$unblockUser$2(ProfileViewModel profileViewModel, User user) {
        super(2);
        this.c = profileViewModel;
        this.d = user;
    }

    public Object invoke(Object obj, Object obj2) {
        c5 c5Var = (c5) obj;
        b bVar = (b) obj2;
        i.e(c5Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.o(new l5(this.d));
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return c5Var;
    }
}
