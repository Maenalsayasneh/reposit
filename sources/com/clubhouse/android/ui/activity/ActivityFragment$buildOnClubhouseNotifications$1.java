package com.clubhouse.android.ui.activity;

import android.content.res.Resources;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.e.b.g3.j.d0;
import i0.e.b.g3.j.l0.c;
import i0.e.b.g3.j.r;
import i0.e.b.g3.j.s;
import i0.e.b.g3.j.t;
import i0.e.b.g3.j.u;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ActivityFragment.kt */
public final class ActivityFragment$buildOnClubhouseNotifications$1 extends Lambda implements l<d0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ ActivityFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFragment$buildOnClubhouseNotifications$1(o oVar, ActivityFragment activityFragment) {
        super(1);
        this.c = oVar;
        this.d = activityFragment;
    }

    public Object invoke(Object obj) {
        String str;
        String str2;
        d0 d0Var = (d0) obj;
        m0.n.b.i.e(d0Var, "state");
        List<T> p02 = g.p0(d0Var.c, 2);
        o oVar = this.c;
        ActivityFragment activityFragment = this.d;
        for (T t : p02) {
            BasicUser basicUser = t.Y1;
            c cVar = new c();
            cVar.O(t.c);
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
            Resources resources = activityFragment.getResources();
            Object[] objArr = new Object[1];
            if (basicUser != null) {
                str3 = basicUser.d;
            }
            objArr[0] = str3;
            cVar.P(resources.getString(R.string.just_signed_up_message, objArr));
            cVar.W(t.q);
            cVar.T(activityFragment.getResources().getString(R.string.follow));
            cVar.V(activityFragment.getResources().getString(R.string.not_yet));
            cVar.S(new s(activityFragment, basicUser, t));
            cVar.U(new t(activityFragment, t));
            cVar.M(new r(basicUser, activityFragment));
            oVar.add(cVar);
        }
        if (d0Var.c.size() > 2) {
            int size = d0Var.c.size() - 2;
            o oVar2 = this.c;
            ActivityFragment activityFragment2 = this.d;
            i0.e.b.g3.j.l0.g gVar = new i0.e.b.g3.j.l0.g();
            gVar.M(new Number[]{Integer.valueOf(d0Var.c.hashCode())});
            gVar.N(activityFragment2.getResources().getQuantityString(R.plurals.on_clubhouse_overflow, size, new Object[]{Integer.valueOf(size)}));
            gVar.L(new u(activityFragment2));
            oVar2.add(gVar);
        }
        if (!d0Var.c.isEmpty()) {
            o oVar3 = this.c;
            i0.e.b.g3.m.e.c cVar2 = new i0.e.b.g3.m.e.c();
            cVar2.L(new Number[]{Integer.valueOf(d0Var.c.hashCode())});
            oVar3.add(cVar2);
        }
        return i.a;
    }
}
