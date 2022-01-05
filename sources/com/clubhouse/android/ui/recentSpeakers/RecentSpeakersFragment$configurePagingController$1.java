package com.clubhouse.android.ui.recentSpeakers;

import android.widget.ProgressBar;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.recentSpeakers.RecentSpeakersFragment$configurePagingController$1", f = "RecentSpeakersFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: RecentSpeakersFragment.kt */
public final class RecentSpeakersFragment$configurePagingController$1 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ RecentSpeakersFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentSpeakersFragment$configurePagingController$1(RecentSpeakersFragment recentSpeakersFragment, m0.l.c<? super RecentSpeakersFragment$configurePagingController$1> cVar) {
        super(2, cVar);
        this.d = recentSpeakersFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        RecentSpeakersFragment$configurePagingController$1 recentSpeakersFragment$configurePagingController$1 = new RecentSpeakersFragment$configurePagingController$1(this.d, cVar);
        recentSpeakersFragment$configurePagingController$1.c = obj;
        return recentSpeakersFragment$configurePagingController$1;
    }

    public Object invoke(Object obj, Object obj2) {
        RecentSpeakersFragment$configurePagingController$1 recentSpeakersFragment$configurePagingController$1 = new RecentSpeakersFragment$configurePagingController$1(this.d, (m0.l.c) obj2);
        recentSpeakersFragment$configurePagingController$1.c = (d) obj;
        i iVar = i.a;
        recentSpeakersFragment$configurePagingController$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        d dVar = (d) this.c;
        RecentSpeakersFragment recentSpeakersFragment = this.d;
        k<Object>[] kVarArr = RecentSpeakersFragment.Z1;
        ProgressBar progressBar = recentSpeakersFragment.N0().c;
        m0.n.b.i.d(progressBar, "binding.loading");
        i0.e.b.d3.k.L(progressBar, Boolean.valueOf(dVar instanceof d.C0203d));
        if (dVar instanceof d.b) {
            final RecentSpeakersFragment recentSpeakersFragment2 = this.d;
            v.f2(recentSpeakersFragment2, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(recentSpeakersFragment2.getString(R.string.recent_speakers_error));
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
