package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import i0.e.b.g3.i.c;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.u5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$showNotifyOptions$1$1$1$1 extends Lambda implements l<c, i> {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ FollowNotificationType d;
    public final /* synthetic */ q4 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$showNotifyOptions$1$1$1$1(HalfProfileFragment halfProfileFragment, FollowNotificationType followNotificationType, q4 q4Var) {
        super(1);
        this.c = halfProfileFragment;
        this.d = followNotificationType;
        this.q = q4Var;
    }

    public Object invoke(Object obj) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, "$this$action");
        String string = this.c.getString(this.d.getLabel());
        m0.n.b.i.d(string, "getString(it.label)");
        cVar.b(string);
        final q4 q4Var = this.q;
        FollowNotificationType followNotificationType = q4Var.n;
        final FollowNotificationType followNotificationType2 = this.d;
        cVar.f = followNotificationType == followNotificationType2;
        final HalfProfileFragment halfProfileFragment = this.c;
        cVar.a(new a<i>() {
            public Object invoke() {
                HalfProfileFragment.this.U0().p(new u5(q4Var.a.getId().intValue(), followNotificationType2));
                return i.a;
            }
        });
        return i.a;
    }
}
