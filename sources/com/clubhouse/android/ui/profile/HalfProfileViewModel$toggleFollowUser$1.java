package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.UserRepo;
import i0.e.b.g3.u.q4;
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

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$toggleFollowUser$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileViewModel c;
    public final /* synthetic */ int d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$toggleFollowUser$1$1", f = "HalfProfileViewModel.kt", l = {418, 421}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.HalfProfileViewModel$toggleFollowUser$1$1  reason: invalid class name */
    /* compiled from: HalfProfileViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super Object>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(halfProfileViewModel, i, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(halfProfileViewModel, i, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                q4 q4Var = q4.this;
                if (q4Var.p) {
                    UserRepo userRepo = halfProfileViewModel.s;
                    int i2 = i;
                    this.c = 1;
                    if (userRepo.x(i2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    UserRepo userRepo2 = halfProfileViewModel.s;
                    int i3 = i;
                    SourceLocation sourceLocation = q4Var.b;
                    this.c = 2;
                    Object j = UserRepo.j(userRepo2, i3, sourceLocation, (Map) null, this, 4, (Object) null);
                    return j == coroutineSingletons ? coroutineSingletons : j;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else if (i == 2) {
                h.d4(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HalfProfileViewModel halfProfileViewModel = halfProfileViewModel;
            AnonymousClass1 r02 = AnonymousClass1.c;
            int i4 = HalfProfileViewModel.m;
            halfProfileViewModel.m(r02);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$toggleFollowUser$1(HalfProfileViewModel halfProfileViewModel, int i) {
        super(1);
        this.c = halfProfileViewModel;
        this.d = i;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        final HalfProfileViewModel halfProfileViewModel = this.c;
        final int i = this.d;
        MavericksViewModel.f(halfProfileViewModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        return i.a;
    }
}
