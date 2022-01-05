package com.clubhouse.android.ui.channels.users.ping;

import com.clubhouse.android.data.models.remote.response.InviteToExistingChannelResponse;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.k.w0.b.f;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: PingUserViewModel.kt */
public final class PingUserViewModel$pingUser$2 extends Lambda implements p<f, b<? extends InviteToExistingChannelResponse>, f> {
    public final /* synthetic */ PingUserViewModel c;
    public final /* synthetic */ User d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PingUserViewModel$pingUser$2(PingUserViewModel pingUserViewModel, User user) {
        super(2);
        this.c = pingUserViewModel;
        this.d = user;
    }

    public Object invoke(Object obj, Object obj2) {
        f fVar = (f) obj;
        b bVar = (b) obj2;
        i.e(fVar, "$this$execute");
        i.e(bVar, "it");
        if ((bVar instanceof f0) && !((InviteToExistingChannelResponse) ((f0) bVar).b).a) {
            PingUserViewModel pingUserViewModel = this.c;
            String string = pingUserViewModel.n.getString(R.string.ping_result_notifs_off, new Object[]{this.d.F()});
            i.d(string, "resources.getString(R.string.ping_result_notifs_off, user.firstName())");
            pingUserViewModel.o(new e(string));
        }
        if (bVar instanceof c) {
            PingUserViewModel pingUserViewModel2 = this.c;
            pingUserViewModel2.o(new d(pingUserViewModel2.n.getString(R.string.ping_result_failed, new Object[]{this.d.F()})));
        }
        return fVar;
    }
}
