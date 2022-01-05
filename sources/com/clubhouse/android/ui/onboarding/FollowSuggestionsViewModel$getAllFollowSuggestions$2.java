package com.clubhouse.android.ui.onboarding;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$getAllFollowSuggestions$2", f = "FollowSuggestionsViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$getAllFollowSuggestions$2 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public final /* synthetic */ FollowSuggestionsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$getAllFollowSuggestions$2(FollowSuggestionsViewModel followSuggestionsViewModel, m0.l.c<? super FollowSuggestionsViewModel$getAllFollowSuggestions$2> cVar) {
        super(2, cVar);
        this.d = followSuggestionsViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        FollowSuggestionsViewModel$getAllFollowSuggestions$2 followSuggestionsViewModel$getAllFollowSuggestions$2 = new FollowSuggestionsViewModel$getAllFollowSuggestions$2(this.d, cVar);
        followSuggestionsViewModel$getAllFollowSuggestions$2.c = ((Boolean) obj).booleanValue();
        return followSuggestionsViewModel$getAllFollowSuggestions$2;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        FollowSuggestionsViewModel followSuggestionsViewModel = this.d;
        FollowSuggestionsViewModel$getAllFollowSuggestions$2 followSuggestionsViewModel$getAllFollowSuggestions$2 = new FollowSuggestionsViewModel$getAllFollowSuggestions$2(followSuggestionsViewModel, (m0.l.c) obj2);
        followSuggestionsViewModel$getAllFollowSuggestions$2.c = valueOf.booleanValue();
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        if (followSuggestionsViewModel$getAllFollowSuggestions$2.c) {
            int i = FollowSuggestionsViewModel.m;
            followSuggestionsViewModel.q(0);
        }
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (this.c) {
            FollowSuggestionsViewModel followSuggestionsViewModel = this.d;
            int i = FollowSuggestionsViewModel.m;
            followSuggestionsViewModel.q(0);
        }
        return i.a;
    }
}
