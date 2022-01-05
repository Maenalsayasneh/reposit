package com.clubhouse.android.ui.onboarding;

import h0.u.w;
import i0.b.b.b;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$getAllFollowSuggestions$1", f = "FollowSuggestionsViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$getAllFollowSuggestions$1 extends SuspendLambda implements p<Set<? extends Integer>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ FollowSuggestionsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$getAllFollowSuggestions$1(FollowSuggestionsViewModel followSuggestionsViewModel, m0.l.c<? super FollowSuggestionsViewModel$getAllFollowSuggestions$1> cVar) {
        super(2, cVar);
        this.d = followSuggestionsViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsViewModel$getAllFollowSuggestions$1 followSuggestionsViewModel$getAllFollowSuggestions$1 = new FollowSuggestionsViewModel$getAllFollowSuggestions$1(this.d, cVar);
        followSuggestionsViewModel$getAllFollowSuggestions$1.c = obj;
        return followSuggestionsViewModel$getAllFollowSuggestions$1;
    }

    public Object invoke(Object obj, Object obj2) {
        FollowSuggestionsViewModel$getAllFollowSuggestions$1 followSuggestionsViewModel$getAllFollowSuggestions$1 = new FollowSuggestionsViewModel$getAllFollowSuggestions$1(this.d, (m0.l.c) obj2);
        followSuggestionsViewModel$getAllFollowSuggestions$1.c = (Set) obj;
        i iVar = i.a;
        followSuggestionsViewModel$getAllFollowSuggestions$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final Set set = (Set) this.c;
        FollowSuggestionsViewModel followSuggestionsViewModel = this.d;
        AnonymousClass1 r1 = new l<FollowSuggestionsState, FollowSuggestionsState>() {
            public Object invoke(Object obj) {
                FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
                m0.n.b.i.e(followSuggestionsState, "$this$setState");
                return FollowSuggestionsState.copy$default(followSuggestionsState, (w) null, (b) null, g.d0(followSuggestionsState.c, set), set, 3, (Object) null);
            }
        };
        int i = FollowSuggestionsViewModel.m;
        followSuggestionsViewModel.m(r1);
        return i.a;
    }
}
