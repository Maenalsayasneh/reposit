package com.clubhouse.android.ui.profile;

import android.content.Intent;
import androidx.core.app.ActivityOptionsCompat;
import h0.a.f.b;
import i0.e.b.g3.u.w4;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.profile.ProfileFragment$onViewCreated$29$1$1$1", f = "ProfileFragment.kt", l = {403, 406}, m = "invokeSuspend")
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$29$1$1$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public Object c;
    public int d;
    public final /* synthetic */ ProfileFragment q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$29$1$1$1(ProfileFragment profileFragment, m0.l.c<? super ProfileFragment$onViewCreated$29$1$1$1> cVar) {
        super(2, cVar);
        this.q = profileFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ProfileFragment$onViewCreated$29$1$1$1(this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ProfileFragment$onViewCreated$29$1$1$1(this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        b<Intent> bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            ProfileViewModel P0 = this.q.P0();
            this.d = 1;
            obj = P0.r(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            bVar = (b) this.c;
            h.d4(obj);
            bVar.a(obj, (ActivityOptionsCompat) null);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Intent) obj) != null) {
            this.q.P0().p(w4.a);
            ProfileFragment profileFragment = this.q;
            b<Intent> bVar2 = profileFragment.g2;
            if (bVar2 != null) {
                ProfileViewModel P02 = profileFragment.P0();
                this.c = bVar2;
                this.d = 2;
                obj = P02.r(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
                bVar.a(obj, (ActivityOptionsCompat) null);
            } else {
                m0.n.b.i.m("getTwitterOAuthToken");
                throw null;
            }
        }
        return i.a;
    }
}
