package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.e;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: FollowSuggestionsViewModel.kt */
public final class FollowSuggestionsViewModel$followMultiple$1 extends Lambda implements l<FollowSuggestionsState, i> {
    public final /* synthetic */ FollowSuggestionsViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$followMultiple$1$1", f = "FollowSuggestionsViewModel.kt", l = {147}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.FollowSuggestionsViewModel$followMultiple$1$1  reason: invalid class name */
    /* compiled from: FollowSuggestionsViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(followSuggestionsState, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(followSuggestionsState, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                FollowSuggestionsViewModel.this.o.i(g.v0(followSuggestionsState.c));
                UserRepo userRepo = FollowSuggestionsViewModel.this.q;
                List<T> v02 = g.v0(followSuggestionsState.c);
                SourceLocation sourceLocation = SourceLocation.ONBOARDING_SUGGESTED;
                this.c = 1;
                obj = userRepo.h(v02, sourceLocation, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSuggestionsViewModel$followMultiple$1(FollowSuggestionsViewModel followSuggestionsViewModel) {
        super(1);
        this.c = followSuggestionsViewModel;
    }

    public Object invoke(Object obj) {
        final FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
        m0.n.b.i.e(followSuggestionsState, "state");
        final FollowSuggestionsViewModel followSuggestionsViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final FollowSuggestionsViewModel followSuggestionsViewModel2 = this.c;
        MavericksViewModel.f(followSuggestionsViewModel, r2, (d0) null, (m) null, new p<FollowSuggestionsState, b<? extends EmptySuccessResponse>, FollowSuggestionsState>() {
            public Object invoke(Object obj, Object obj2) {
                FollowSuggestionsState followSuggestionsState = (FollowSuggestionsState) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(followSuggestionsState, "$this$execute");
                m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                if (!(bVar instanceof e)) {
                    FollowSuggestionsViewModel followSuggestionsViewModel = FollowSuggestionsViewModel.this;
                    int size = g.v0(followSuggestionsState.c).size();
                    int i = FollowSuggestionsViewModel.m;
                    followSuggestionsViewModel.q(size);
                }
                return followSuggestionsState;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
