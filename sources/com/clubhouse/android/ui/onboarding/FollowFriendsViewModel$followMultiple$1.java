package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.e;
import i0.e.b.g3.r.e1;
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

/* compiled from: FollowFriendsViewModel.kt */
public final class FollowFriendsViewModel$followMultiple$1 extends Lambda implements l<e1, i> {
    public final /* synthetic */ FollowFriendsViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.FollowFriendsViewModel$followMultiple$1$1", f = "FollowFriendsViewModel.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.FollowFriendsViewModel$followMultiple$1$1  reason: invalid class name */
    /* compiled from: FollowFriendsViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(e1Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(e1Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                FollowFriendsViewModel.this.n.i(g.v0(e1Var.c));
                UserRepo userRepo = FollowFriendsViewModel.this.q;
                List<T> v02 = g.v0(e1Var.c);
                SourceLocation sourceLocation = SourceLocation.ONBOARDING_FRIENDS;
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
    public FollowFriendsViewModel$followMultiple$1(FollowFriendsViewModel followFriendsViewModel) {
        super(1);
        this.c = followFriendsViewModel;
    }

    public Object invoke(Object obj) {
        final e1 e1Var = (e1) obj;
        m0.n.b.i.e(e1Var, "state");
        final FollowFriendsViewModel followFriendsViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final FollowFriendsViewModel followFriendsViewModel2 = this.c;
        MavericksViewModel.f(followFriendsViewModel, r2, (d0) null, (m) null, new p<e1, b<? extends EmptySuccessResponse>, e1>() {
            public Object invoke(Object obj, Object obj2) {
                e1 e1Var = (e1) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(e1Var, "$this$execute");
                m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                if (!(bVar instanceof e)) {
                    FollowFriendsViewModel followFriendsViewModel = FollowFriendsViewModel.this;
                    int i = FollowFriendsViewModel.m;
                    followFriendsViewModel.q(false, false);
                }
                return e1Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
