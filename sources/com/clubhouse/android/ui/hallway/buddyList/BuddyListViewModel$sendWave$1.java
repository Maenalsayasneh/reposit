package com.clubhouse.android.ui.hallway.buddyList;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.e.k.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.hallway.buddyList.BuddyListViewModel$sendWave$1", f = "BuddyListViewModel.kt", l = {190}, m = "invokeSuspend")
/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$sendWave$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ BuddyListViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ String x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$sendWave$1(BuddyListViewModel buddyListViewModel, int i, String str, m0.l.c<? super BuddyListViewModel$sendWave$1> cVar) {
        super(1, cVar);
        this.d = buddyListViewModel;
        this.q = i;
        this.x = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new BuddyListViewModel$sendWave$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new BuddyListViewModel$sendWave$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            BuddyListViewModel buddyListViewModel = this.d;
            int i2 = BuddyListViewModel.m;
            a r = buddyListViewModel.r();
            int i3 = this.q;
            String str = this.x;
            SourceLocation sourceLocation = SourceLocation.BUDDY_LIST;
            this.c = 1;
            if (r.i(i3, str, sourceLocation, this) == coroutineSingletons) {
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
