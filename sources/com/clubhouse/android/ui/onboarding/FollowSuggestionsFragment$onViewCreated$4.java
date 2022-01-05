package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import android.widget.FrameLayout;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.g3.m.f.d;
import i0.e.b.g3.r.b1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsFragment$onViewCreated$4", f = "FollowSuggestionsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsFragment.kt */
public final class FollowSuggestionsFragment$onViewCreated$4 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowSuggestionsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsFragment$onViewCreated$4(FollowSuggestionsFragment followSuggestionsFragment, m0.l.c<? super FollowSuggestionsFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = followSuggestionsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsFragment$onViewCreated$4 followSuggestionsFragment$onViewCreated$4 = new FollowSuggestionsFragment$onViewCreated$4(this.d, cVar);
        followSuggestionsFragment$onViewCreated$4.c = obj;
        return followSuggestionsFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowSuggestionsFragment$onViewCreated$4 followSuggestionsFragment$onViewCreated$4 = new FollowSuggestionsFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        followSuggestionsFragment$onViewCreated$4.c = (d) obj;
        i iVar = i.a;
        followSuggestionsFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        d dVar = (d) this.c;
        FollowSuggestionsFragment followSuggestionsFragment = this.d;
        k<Object>[] kVarArr = FollowSuggestionsFragment.Z1;
        FrameLayout frameLayout = followSuggestionsFragment.N0().d;
        m0.n.b.i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.L(frameLayout, Boolean.valueOf((dVar instanceof d.C0203d) || (dVar instanceof d.a) || (dVar instanceof d.b)));
        if (dVar instanceof d.b) {
            this.d.O0().p(b1.a);
        }
        if (dVar instanceof d.c) {
            FollowSuggestionsViewModel O0 = this.d.O0();
            final FollowSuggestionsFragment followSuggestionsFragment2 = this.d;
            v.v2(O0, new l<FollowSuggestionsState, i>() {
                public Object invoke(Object obj) {
                    FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
                    m0.n.b.i.e(followSuggestionsState, "viewState");
                    FollowSuggestionsFragment followSuggestionsFragment = followSuggestionsFragment2;
                    k<Object>[] kVarArr = FollowSuggestionsFragment.Z1;
                    Button button = followSuggestionsFragment.N0().b;
                    FollowSuggestionsFragment followSuggestionsFragment2 = followSuggestionsFragment2;
                    m0.n.b.i.e(followSuggestionsState, "<this>");
                    button.setText(followSuggestionsFragment2.getString(followSuggestionsState.c.isEmpty() ^ true ? R.string.follow : R.string.skip_this));
                    Button button2 = followSuggestionsFragment2.N0().e;
                    FollowSuggestionsFragment followSuggestionsFragment3 = followSuggestionsFragment2;
                    m0.n.b.i.e(followSuggestionsState, "<this>");
                    button2.setText(followSuggestionsFragment3.getString(followSuggestionsState.c.isEmpty() ^ true ? R.string.deselect_all : R.string.use_suggestions));
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
