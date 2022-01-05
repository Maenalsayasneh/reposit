package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.d5;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$rsvpEvent$1$2 extends Lambda implements p<c5, b<? extends EmptySuccessResponse>, c5> {
    public final /* synthetic */ ProfileViewModel c;
    public final /* synthetic */ d5 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$rsvpEvent$1$2(ProfileViewModel profileViewModel, d5 d5Var) {
        super(2);
        this.c = profileViewModel;
        this.d = d5Var;
    }

    public Object invoke(Object obj, Object obj2) {
        c5 c5Var = (c5) obj;
        b bVar = (b) obj2;
        i.e(c5Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.m(new l(0, this.d));
        }
        if (bVar instanceof c) {
            this.c.m(new l(1, this.d));
            ProfileViewModel profileViewModel = this.c;
            String message = ((c) bVar).b.getMessage();
            if (message == null) {
                message = this.c.o.getString(R.string.rsvp_error);
                i.d(message, "resources.getString(R.string.rsvp_error)");
            }
            profileViewModel.o(new d(message));
        }
        return c5Var;
    }
}
