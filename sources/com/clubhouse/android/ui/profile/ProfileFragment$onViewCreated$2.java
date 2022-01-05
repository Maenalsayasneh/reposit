package com.clubhouse.android.ui.profile;

import i0.e.b.a3.b.b;
import i0.e.b.g3.u.s5;
import i0.e.b.g3.u.z3;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.ProfileFragment$onViewCreated$2", f = "ProfileFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment$onViewCreated$2 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ProfileFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileFragment$onViewCreated$2(ProfileFragment profileFragment, m0.l.c<? super ProfileFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = profileFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ProfileFragment$onViewCreated$2 profileFragment$onViewCreated$2 = new ProfileFragment$onViewCreated$2(this.d, cVar);
        profileFragment$onViewCreated$2.c = obj;
        return profileFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        ProfileFragment$onViewCreated$2 profileFragment$onViewCreated$2 = new ProfileFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        profileFragment$onViewCreated$2.c = (b) obj;
        i iVar = i.a;
        profileFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        b bVar = (b) this.c;
        if (bVar instanceof z3) {
            this.d.P0().p(new s5(((z3) bVar).a));
        }
        return i.a;
    }
}
