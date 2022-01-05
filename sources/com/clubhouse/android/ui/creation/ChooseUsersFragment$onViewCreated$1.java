package com.clubhouse.android.ui.creation;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.creation.ChooseUsersFragment$onViewCreated$1", f = "ChooseUsersFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChooseUsersFragment.kt */
public final class ChooseUsersFragment$onViewCreated$1 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ChooseUsersFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChooseUsersFragment$onViewCreated$1(ChooseUsersFragment chooseUsersFragment, m0.l.c<? super ChooseUsersFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = chooseUsersFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChooseUsersFragment$onViewCreated$1 chooseUsersFragment$onViewCreated$1 = new ChooseUsersFragment$onViewCreated$1(this.d, cVar);
        chooseUsersFragment$onViewCreated$1.c = obj;
        return chooseUsersFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ChooseUsersFragment$onViewCreated$1 chooseUsersFragment$onViewCreated$1 = new ChooseUsersFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        chooseUsersFragment$onViewCreated$1.c = (String) obj;
        i iVar = i.a;
        chooseUsersFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ChooseUsersFragment chooseUsersFragment = this.d;
        k<Object>[] kVarArr = ChooseUsersFragment.r2;
        chooseUsersFragment.X0().p(new b((String) this.c));
        return i.a;
    }
}
