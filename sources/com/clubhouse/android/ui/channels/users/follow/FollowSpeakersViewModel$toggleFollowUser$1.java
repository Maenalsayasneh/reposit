package com.clubhouse.android.ui.channels.users.follow;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.e.b.g3.k.w0.a.e;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: FollowSpeakersViewModel.kt */
public final class FollowSpeakersViewModel$toggleFollowUser$1 extends Lambda implements l<e, i> {
    public final /* synthetic */ FollowSpeakersViewModel c;
    public final /* synthetic */ int d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.channels.users.follow.FollowSpeakersViewModel$toggleFollowUser$1$1", f = "FollowSpeakersViewModel.kt", l = {67, 69}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.channels.users.follow.FollowSpeakersViewModel$toggleFollowUser$1$1  reason: invalid class name */
    /* compiled from: FollowSpeakersViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(i, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(i, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                if (FollowSpeakersViewModel.this.o.t(i)) {
                    UserRepo userRepo = FollowSpeakersViewModel.this.o;
                    int i2 = i;
                    this.c = 1;
                    obj = userRepo.x(i2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    UserRepo userRepo2 = FollowSpeakersViewModel.this.o;
                    int i3 = i;
                    SourceLocation sourceLocation = SourceLocation.SUGGESTED_SPEAKERS;
                    this.c = 2;
                    obj = UserRepo.j(userRepo2, i3, sourceLocation, (Map) null, this, 4, (Object) null);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return (EmptySuccessResponse) obj;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else if (i == 2) {
                h.d4(obj);
                return (EmptySuccessResponse) obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (EmptySuccessResponse) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FollowSpeakersViewModel$toggleFollowUser$1(FollowSpeakersViewModel followSpeakersViewModel, int i) {
        super(1);
        this.c = followSpeakersViewModel;
        this.d = i;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((e) obj, "state");
        final FollowSpeakersViewModel followSpeakersViewModel = this.c;
        final int i = this.d;
        MavericksViewModel.f(followSpeakersViewModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        return i.a;
    }
}
