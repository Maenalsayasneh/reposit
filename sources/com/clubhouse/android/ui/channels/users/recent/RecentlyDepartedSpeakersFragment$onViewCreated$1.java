package com.clubhouse.android.ui.channels.users.recent;

import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import h0.u.w;
import i0.e.b.b3.b.e.d;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.channels.users.recent.RecentlyDepartedSpeakersFragment$onViewCreated$1", f = "RecentlyDepartedSpeakersFragment.kt", l = {63}, m = "invokeSuspend")
/* compiled from: RecentlyDepartedSpeakersFragment.kt */
public final class RecentlyDepartedSpeakersFragment$onViewCreated$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ RecentlyDepartedSpeakersFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentlyDepartedSpeakersFragment$onViewCreated$1(RecentlyDepartedSpeakersFragment recentlyDepartedSpeakersFragment, m0.l.c<? super RecentlyDepartedSpeakersFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = recentlyDepartedSpeakersFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new RecentlyDepartedSpeakersFragment$onViewCreated$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new RecentlyDepartedSpeakersFragment$onViewCreated$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            RecentlyDepartedSpeakersFragment recentlyDepartedSpeakersFragment = this.d;
            PagingDataEpoxyController<d> pagingDataEpoxyController = recentlyDepartedSpeakersFragment.t2;
            w.b bVar = w.c;
            List<UserInChannel> list = RecentlyDepartedSpeakersFragment.X0(recentlyDepartedSpeakersFragment).c;
            ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (UserInChannel dVar : list) {
                arrayList.add(new d(dVar, false, false, false, 14));
            }
            w b = bVar.b(arrayList);
            this.c = 1;
            if (pagingDataEpoxyController.submitData(b, this) == coroutineSingletons) {
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
