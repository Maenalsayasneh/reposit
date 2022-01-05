package com.clubhouse.android.ui.profile;

import android.content.Context;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.android.ui.channels.ChannelNavigation;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.a3.f.j;
import i0.e.b.g3.u.i3;
import i0.e.b.g3.u.k5;
import i0.e.b.g3.u.l5;
import i0.e.b.g3.u.m5;
import i0.e.b.g3.u.n5;
import i0.e.b.g3.u.q3;
import i0.e.b.g3.u.s2;
import i0.e.b.g3.u.u4;
import i0.e.b.g3.u.v4;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.profile.ProfileFragment$onViewCreated$8", f = "ProfileFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$8 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ProfileFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ Object q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj, Object obj2) {
            super(1);
            this.c = i;
            this.d = obj;
            this.q = obj2;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                String str = ((d) ((b) this.d)).a;
                if (str == null) {
                    str = ((ProfileFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(str);
                jVar.h(Banner.Style.Negative);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.e(((ProfileFragment) this.d).getString(R.string.block_success, ((k5) ((b) this.q)).a.getName()));
                return i.a;
            } else if (i == 2) {
                j jVar3 = (j) obj;
                m0.n.b.i.e(jVar3, "$this$showBanner");
                jVar3.e(((ProfileFragment) this.d).getString(R.string.unblock_success, ((l5) ((b) this.q)).a.getName()));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$8(ProfileFragment profileFragment, m0.l.c<? super ProfileFragment$onViewCreated$8> cVar) {
        super(2, cVar);
        this.d = profileFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ProfileFragment$onViewCreated$8 profileFragment$onViewCreated$8 = new ProfileFragment$onViewCreated$8(this.d, cVar);
        profileFragment$onViewCreated$8.c = obj;
        return profileFragment$onViewCreated$8;
    }

    public Object invoke(Object obj, Object obj2) {
        ProfileFragment$onViewCreated$8 profileFragment$onViewCreated$8 = new ProfileFragment$onViewCreated$8(this.d, (m0.l.c) obj2);
        profileFragment$onViewCreated$8.c = (b) obj;
        i iVar = i.a;
        profileFragment$onViewCreated$8.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof m5) {
            ProfileFragment profileFragment = this.d;
            String str = ((m5) bVar).a;
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(str, "email");
            HalfProfileUtil$showVerifyEmailSuccessDialog$1 halfProfileUtil$showVerifyEmailSuccessDialog$1 = new HalfProfileUtil$showVerifyEmailSuccessDialog$1(profileFragment, str);
            m0.n.b.i.e(profileFragment, "<this>");
            m0.n.b.i.e(halfProfileUtil$showVerifyEmailSuccessDialog$1, "f");
            d.a aVar = new d.a(profileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            halfProfileUtil$showVerifyEmailSuccessDialog$1.invoke(aVar);
            aVar.g();
        } else if (bVar instanceof i0.e.b.a3.b.d) {
            ProfileFragment profileFragment2 = this.d;
            v.c2(profileFragment2, new a(0, bVar, profileFragment2));
        } else if (bVar instanceof e) {
            v.c2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(((e) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof k5) {
            ProfileFragment profileFragment3 = this.d;
            v.c2(profileFragment3, new a(1, profileFragment3, bVar));
        } else if (bVar instanceof l5) {
            ProfileFragment profileFragment4 = this.d;
            v.c2(profileFragment4, new a(2, profileFragment4, bVar));
        } else if (bVar instanceof i0.e.b.z2.f.e) {
            ChannelNavigation.a(this.d, (i0.e.b.z2.f.e) bVar);
        } else if (bVar instanceof n5) {
            ProfileFragment profileFragment5 = this.d;
            n5 n5Var = (n5) bVar;
            int i = n5Var.a;
            String str2 = n5Var.b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = n5Var.c;
            i0.e.b.a3.f.b bVar2 = profileFragment5.e2;
            if (bVar2 != null) {
                Context requireContext = profileFragment5.requireContext();
                m0.n.b.i.d(requireContext, "requireContext()");
                i0.e.e.m.c cVar = new i0.e.e.m.c(bVar2, requireContext);
                cVar.d(str2);
                cVar.c.b.setOnClickListener(new q3(cVar, profileFragment5, i));
                cVar.c.e.setOnClickListener(new i3(cVar, profileFragment5, i, str3));
                cVar.c.d.setOnClickListener(new s2(cVar));
                cVar.a.c(cVar);
            } else {
                m0.n.b.i.m("activityBannerHandler");
                throw null;
            }
        } else if (bVar instanceof u4) {
            ProfileFragment.N0(this.d);
        } else if (bVar instanceof v4) {
            ProfileFragment profileFragment6 = this.d;
            k<Object>[] kVarArr = ProfileFragment.Z1;
            v.v2(profileFragment6.P0(), new ProfileFragment$navigateToEditPhoto$1(profileFragment6));
        }
        return i.a;
    }
}
