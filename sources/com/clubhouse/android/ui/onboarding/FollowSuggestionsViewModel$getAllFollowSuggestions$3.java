package com.clubhouse.android.ui.onboarding;

import g0.a.b.b.a;
import h0.u.w;
import i0.b.b.b;
import i0.e.b.b3.b.e.j;
import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$getAllFollowSuggestions$3", f = "FollowSuggestionsViewModel.kt", l = {192}, m = "invokeSuspend")
/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$getAllFollowSuggestions$3 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ FollowSuggestionsViewModel d;

    @c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$getAllFollowSuggestions$3$1", f = "FollowSuggestionsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$getAllFollowSuggestions$3$1  reason: invalid class name */
    /* compiled from: FollowSuggestionsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<w<j>, m0.l.c<? super i>, Object> {
        public /* synthetic */ Object c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(followSuggestionsViewModel2, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(followSuggestionsViewModel2, (m0.l.c) obj2);
            r02.c = (w) obj;
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final w wVar = (w) this.c;
            FollowSuggestionsViewModel followSuggestionsViewModel = followSuggestionsViewModel2;
            AnonymousClass1 r1 = new l<FollowSuggestionsState, FollowSuggestionsState>() {
                public Object invoke(Object obj) {
                    FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
                    m0.n.b.i.e(followSuggestionsState, "$this$setState");
                    return FollowSuggestionsState.copy$default(followSuggestionsState, wVar, (b) null, (Set) null, (Set) null, 14, (Object) null);
                }
            };
            int i = FollowSuggestionsViewModel.m;
            followSuggestionsViewModel.m(r1);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$getAllFollowSuggestions$3(FollowSuggestionsViewModel followSuggestionsViewModel, m0.l.c<? super FollowSuggestionsViewModel$getAllFollowSuggestions$3> cVar) {
        super(2, cVar);
        this.d = followSuggestionsViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new FollowSuggestionsViewModel$getAllFollowSuggestions$3(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new FollowSuggestionsViewModel$getAllFollowSuggestions$3(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            FollowSuggestionsViewModel followSuggestionsViewModel = this.d;
            d<w<w<j>>> h = a.h(followSuggestionsViewModel.s, followSuggestionsViewModel.c);
            final FollowSuggestionsViewModel followSuggestionsViewModel2 = this.d;
            AnonymousClass1 r1 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (m0.r.t.a.r.m.a1.a.E0(h, r1, this) == coroutineSingletons) {
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
