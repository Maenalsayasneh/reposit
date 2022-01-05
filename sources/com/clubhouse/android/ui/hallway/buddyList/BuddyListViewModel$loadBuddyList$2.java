package com.clubhouse.android.ui.hallway.buddyList;

import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$loadBuddyList$2", f = "BuddyListViewModel.kt", l = {173}, m = "invokeSuspend")
/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$loadBuddyList$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BuddyListViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$loadBuddyList$2(BuddyListViewModel buddyListViewModel, m0.l.c<? super BuddyListViewModel$loadBuddyList$2> cVar) {
        super(2, cVar);
        this.d = buddyListViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new BuddyListViewModel$loadBuddyList$2(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new BuddyListViewModel$loadBuddyList$2(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.r;
            this.c = 1;
            Object a = userRepo.n.a(this);
            if (a != coroutineSingletons) {
                a = i.a;
            }
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
