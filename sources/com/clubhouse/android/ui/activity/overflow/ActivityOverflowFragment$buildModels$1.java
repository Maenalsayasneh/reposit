package com.clubhouse.android.ui.activity.overflow;

import android.content.res.Resources;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.b.a.o;
import i0.e.b.g3.j.k0.a;
import i0.e.b.g3.j.k0.b;
import i0.e.b.g3.j.k0.g;
import i0.e.b.g3.j.l0.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ActivityOverflowFragment.kt */
public final class ActivityOverflowFragment$buildModels$1 extends Lambda implements l<o, i> {
    public final /* synthetic */ ActivityOverflowFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOverflowFragment$buildModels$1(ActivityOverflowFragment activityOverflowFragment) {
        super(1);
        this.c = activityOverflowFragment;
    }

    public Object invoke(Object obj) {
        final o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$null");
        ActivityOverflowFragment activityOverflowFragment = this.c;
        k<Object>[] kVarArr = ActivityOverflowFragment.Z1;
        ActivityOverflowViewModel O0 = activityOverflowFragment.O0();
        final ActivityOverflowFragment activityOverflowFragment2 = this.c;
        v.v2(O0, new l<g, i>() {
            public Object invoke(Object obj) {
                String str;
                String str2;
                g gVar = (g) obj;
                m0.n.b.i.e(gVar, "state");
                List<ActionableNotification> list = gVar.a;
                o oVar = o.this;
                ActivityOverflowFragment activityOverflowFragment = activityOverflowFragment2;
                for (ActionableNotification actionableNotification : list) {
                    BasicUser basicUser = actionableNotification.Y1;
                    c cVar = new c();
                    cVar.O(actionableNotification.c);
                    String str3 = null;
                    if (basicUser == null) {
                        str = null;
                    } else {
                        str = basicUser.d;
                    }
                    cVar.Q(str);
                    if (basicUser == null) {
                        str2 = null;
                    } else {
                        str2 = basicUser.x;
                    }
                    cVar.R(str2);
                    Resources resources = activityOverflowFragment.getResources();
                    Object[] objArr = new Object[1];
                    if (basicUser != null) {
                        str3 = basicUser.d;
                    }
                    objArr[0] = str3;
                    cVar.P(resources.getString(R.string.just_signed_up_message, objArr));
                    cVar.W(actionableNotification.q);
                    cVar.T(activityOverflowFragment.getResources().getString(R.string.follow));
                    cVar.V(activityOverflowFragment.getResources().getString(R.string.not_yet));
                    cVar.S(new a(activityOverflowFragment, basicUser, actionableNotification));
                    cVar.U(new i0.e.b.g3.j.k0.c(activityOverflowFragment, actionableNotification));
                    cVar.M(new b(actionableNotification, activityOverflowFragment));
                    oVar.add(cVar);
                }
                return i.a;
            }
        });
        return i.a;
    }
}
