package com.clubhouse.android.ui.onboarding;

import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$advanceToNext$1 extends Lambda implements l<FollowSuggestionsState, i> {
    public final /* synthetic */ FollowSuggestionsViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$advanceToNext$1$1", f = "FollowSuggestionsViewModel.kt", l = {130}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$advanceToNext$1$1  reason: invalid class name */
    /* compiled from: FollowSuggestionsViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super i>, Object> {
        public int c;

        public final c<i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(followSuggestionsState, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(followSuggestionsState, (c) obj2).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                d<Set<Integer>> T3 = a.T3(FollowSuggestionsViewModel.this.q.d.g, 1);
                final FollowSuggestionsState followSuggestionsState = followSuggestionsState;
                final FollowSuggestionsViewModel followSuggestionsViewModel = FollowSuggestionsViewModel.this;
                AnonymousClass1 r1 = new p<Set<? extends Integer>, c<? super i>, Object>((c<? super AnonymousClass1>) null) {
                    public /* synthetic */ Object c;

                    public final c<i> create(Object obj, c<?> cVar) {
                        AnonymousClass1 r02 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public FollowSuggestionsViewModel$advanceToNext$1(FollowSuggestionsViewModel followSuggestionsViewModel) {
                            super(1);
                            this.c = followSuggestionsViewModel;
                        }

                        public Object invoke(Object obj) {
                            final FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
                            m0.n.b.i.e(followSuggestionsState, "state");
                            final FollowSuggestionsViewModel followSuggestionsViewModel = this.c;
                            a.E2(followSuggestionsViewModel.c, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
                            return i.a;
                        }
                    }
