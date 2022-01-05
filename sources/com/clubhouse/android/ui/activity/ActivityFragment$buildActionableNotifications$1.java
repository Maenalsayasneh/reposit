package com.clubhouse.android.ui.activity;

import android.content.res.Resources;
import android.text.Spanned;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.app.R;
import i0.b.a.o;
import i0.d.a.a.a;
import i0.e.b.g3.j.d0;
import i0.e.b.g3.j.e;
import i0.e.b.g3.j.f;
import i0.e.b.g3.j.g;
import i0.e.b.g3.j.h;
import i0.e.b.g3.j.j;
import i0.e.b.g3.j.k;
import i0.e.b.g3.j.l0.c;
import i0.e.b.g3.j.m;
import i0.e.b.g3.j.n;
import i0.e.b.g3.j.p;
import i0.e.b.g3.j.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ActivityFragment.kt */
public final class ActivityFragment$buildActionableNotifications$1 extends Lambda implements l<d0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ ActivityFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFragment$buildActionableNotifications$1(o oVar, ActivityFragment activityFragment) {
        super(1);
        this.c = oVar;
        this.d = activityFragment;
    }

    public Object invoke(Object obj) {
        Iterator<T> it;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Spanned spanned;
        d0 d0Var = (d0) obj;
        m0.n.b.i.e(d0Var, "state");
        List<ActionableNotification> list = d0Var.b;
        ActivityFragment activityFragment = this.d;
        o oVar = this.c;
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ActionableNotification actionableNotification = (ActionableNotification) it2.next();
            int ordinal = actionableNotification.d.ordinal();
            String str10 = null;
            if (ordinal == 1) {
                it = it2;
                BasicUser basicUser = actionableNotification.Y1;
                ClubWithAdmin clubWithAdmin = actionableNotification.b2;
                Resources resources = activityFragment.getResources();
                Object[] objArr = new Object[2];
                if (basicUser == null) {
                    str = null;
                } else {
                    str = basicUser.d;
                }
                objArr[0] = str;
                if (clubWithAdmin == null) {
                    str2 = null;
                } else {
                    str2 = clubWithAdmin.y;
                }
                objArr[1] = str2;
                String string = resources.getString(R.string.invite_to_join_the_club, objArr);
                m0.n.b.i.d(string, "resources.getString(\n                            R.string.invite_to_join_the_club, user?.name,\n                            club?.name\n                        )");
                c cVar = new c();
                cVar.O(actionableNotification.c);
                if (basicUser == null) {
                    str3 = null;
                } else {
                    str3 = basicUser.d;
                }
                cVar.Q(str3);
                if (clubWithAdmin == null) {
                    str4 = null;
                } else {
                    str4 = clubWithAdmin.y;
                }
                cVar.N(str4);
                if (basicUser != null) {
                    str10 = basicUser.x;
                }
                cVar.R(str10);
                cVar.P(string);
                cVar.W(actionableNotification.q);
                cVar.T(activityFragment.getResources().getString(R.string.join));
                cVar.V(activityFragment.getResources().getString(R.string.ignore));
                cVar.S(new f(clubWithAdmin, activityFragment, actionableNotification));
                cVar.U(new k(activityFragment, actionableNotification));
                cVar.L(new i0.e.b.g3.j.l(basicUser, activityFragment));
                cVar.M(new p(clubWithAdmin, activityFragment));
                oVar.add(cVar);
            } else if (ordinal == 2) {
                it = it2;
                ClubWithAdmin clubWithAdmin2 = actionableNotification.b2;
                Resources resources2 = activityFragment.getResources();
                Object[] objArr2 = new Object[1];
                if (clubWithAdmin2 == null) {
                    str5 = null;
                } else {
                    str5 = clubWithAdmin2.y;
                }
                objArr2[0] = str5;
                String string2 = resources2.getString(R.string.new_club_nominations, objArr2);
                m0.n.b.i.d(string2, "resources.getString(\n                            R.string.new_club_nominations, club?.name\n                        )");
                c cVar2 = new c();
                cVar2.O(actionableNotification.c);
                if (clubWithAdmin2 == null) {
                    str6 = null;
                } else {
                    str6 = clubWithAdmin2.y;
                }
                cVar2.Q(str6);
                if (clubWithAdmin2 == null) {
                    str7 = null;
                } else {
                    str7 = clubWithAdmin2.y;
                }
                cVar2.N(str7);
                if (clubWithAdmin2 != null) {
                    str10 = clubWithAdmin2.d2;
                }
                cVar2.R(str10);
                cVar2.P(string2);
                cVar2.W(actionableNotification.q);
                cVar2.T(activityFragment.getResources().getString(R.string.review));
                cVar2.V(activityFragment.getResources().getString(R.string.do_this_later));
                cVar2.S(new i0.e.b.g3.j.o(clubWithAdmin2, activityFragment, actionableNotification));
                cVar2.U(new h(activityFragment, actionableNotification));
                cVar2.L(new n(clubWithAdmin2, activityFragment));
                oVar.add(cVar2);
            } else if (ordinal == 4) {
                it = it2;
                BasicUser basicUser2 = actionableNotification.Y1;
                c cVar3 = new c();
                cVar3.O(actionableNotification.c);
                if (basicUser2 == null) {
                    str8 = null;
                } else {
                    str8 = basicUser2.d;
                }
                cVar3.Q(str8);
                if (basicUser2 == null) {
                    str9 = null;
                } else {
                    str9 = basicUser2.x;
                }
                cVar3.R(str9);
                Resources resources3 = activityFragment.getResources();
                Object[] objArr3 = new Object[1];
                if (basicUser2 != null) {
                    str10 = basicUser2.d;
                }
                objArr3[0] = str10;
                cVar3.P(resources3.getString(R.string.followed_you_follow_them, objArr3));
                cVar3.W(actionableNotification.q);
                cVar3.T(activityFragment.getResources().getString(R.string.follow_back));
                cVar3.V(activityFragment.getResources().getString(R.string.not_yet));
                cVar3.S(new e(activityFragment, basicUser2, actionableNotification));
                cVar3.U(new m(activityFragment, actionableNotification));
                cVar3.L(new g(basicUser2, activityFragment));
                cVar3.M(new i0.e.b.g3.j.i(basicUser2, activityFragment));
                oVar.add(cVar3);
            } else if (ordinal != 7) {
                it = it2;
            } else {
                ClubWithAdmin clubWithAdmin3 = actionableNotification.b2;
                if (clubWithAdmin3 != null) {
                    if (!clubWithAdmin3.f2 || !clubWithAdmin3.e2) {
                        it = it2;
                        Resources resources4 = activityFragment.getResources();
                        m0.n.b.i.d(resources4, "resources");
                        int i = 1;
                        Object[] objArr4 = {clubWithAdmin3.y};
                        ArrayList i1 = a.i1(resources4, "<this>", objArr4, "rawArgs", 1);
                        int i2 = 0;
                        while (i2 < i) {
                            Object obj2 = objArr4[i2];
                            Object[] objArr5 = objArr4;
                            if (obj2 instanceof String) {
                                String str11 = (String) obj2;
                                obj2 = a.p0(str11, "<this>", str11, 63);
                            }
                            i1.add(obj2);
                            i2++;
                            i = 1;
                            objArr4 = objArr5;
                        }
                        String string3 = resources4.getString(R.string.club_review_changes_new);
                        m0.n.b.i.d(string3, "getString(id)");
                        Object[] array = i1.toArray(new Object[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        Object[] copyOf = Arrays.copyOf(array, array.length);
                        spanned = a.L(copyOf, copyOf.length, string3, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
                    } else {
                        Resources resources5 = activityFragment.getResources();
                        m0.n.b.i.d(resources5, "resources");
                        Object[] objArr6 = {clubWithAdmin3.y};
                        int i3 = 1;
                        ArrayList i12 = a.i1(resources5, "<this>", objArr6, "rawArgs", 1);
                        it = it2;
                        int i4 = 0;
                        while (i4 < i3) {
                            Object obj3 = objArr6[i4];
                            Object[] objArr7 = objArr6;
                            if (obj3 instanceof String) {
                                String str12 = (String) obj3;
                                obj3 = a.p0(str12, "<this>", str12, 63);
                            }
                            i12.add(obj3);
                            i4++;
                            i3 = 1;
                            objArr6 = objArr7;
                        }
                        String string4 = resources5.getString(R.string.club_review_changes_action_required);
                        m0.n.b.i.d(string4, "getString(id)");
                        Object[] array2 = i12.toArray(new Object[0]);
                        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                        Object[] copyOf2 = Arrays.copyOf(array2, array2.length);
                        spanned = a.L(copyOf2, copyOf2.length, string4, "java.lang.String.format(format, *args)", 63, "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )");
                    }
                    c cVar4 = new c();
                    cVar4.O(actionableNotification.c);
                    cVar4.R(clubWithAdmin3.d2);
                    cVar4.Q(clubWithAdmin3.y);
                    cVar4.P(spanned);
                    cVar4.W(actionableNotification.q);
                    cVar4.T(activityFragment.getResources().getString(R.string.learn_more));
                    cVar4.V(activityFragment.getResources().getString(R.string.ignore));
                    cVar4.S(new q(activityFragment, clubWithAdmin3, actionableNotification));
                    cVar4.U(new j(activityFragment, actionableNotification));
                    oVar.add(cVar4);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            it2 = it;
        }
        if (!d0Var.b.isEmpty()) {
            o oVar2 = this.c;
            i0.e.b.g3.m.e.c cVar5 = new i0.e.b.g3.m.e.c();
            cVar5.L(new Number[]{Integer.valueOf(d0Var.b.hashCode())});
            oVar2.add(cVar5);
        }
        return i.a;
    }
}
