package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import i0.e.b.g3.i.c;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.u5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$showNotifyOptions$1$1$1$1$1 extends Lambda implements l<c, i> {
    public final /* synthetic */ ProfileFragment c;
    public final /* synthetic */ FollowNotificationType d;
    public final /* synthetic */ c5 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$showNotifyOptions$1$1$1$1$1(ProfileFragment profileFragment, FollowNotificationType followNotificationType, c5 c5Var) {
        super(1);
        this.c = profileFragment;
        this.d = followNotificationType;
        this.q = c5Var;
    }

    public Object invoke(Object obj) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, "$this$action");
        String string = this.c.getString(this.d.getLabel());
        m0.n.b.i.d(string, "getString(it.label)");
        cVar.b(string);
        final c5 c5Var = this.q;
        FollowNotificationType followNotificationType = c5Var.n;
        final FollowNotificationType followNotificationType2 = this.d;
        cVar.f = followNotificationType == followNotificationType2;
        final ProfileFragment profileFragment = this.c;
        cVar.a(new a<i>() {
            public Object invoke() {
                ProfileViewModel P0 = ProfileFragment.this.P0();
                Integer num = c5Var.a;
                if (num != null) {
                    P0.p(new u5(num.intValue(), followNotificationType2));
                    return i.a;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        });
        return i.a;
    }
}
