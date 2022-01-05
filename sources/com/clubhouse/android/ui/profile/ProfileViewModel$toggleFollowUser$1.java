package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.UserRepo;
import h0.b0.v;
import i0.e.b.g3.u.c5;
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

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$toggleFollowUser$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileViewModel c;
    public final /* synthetic */ int d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.ProfileViewModel$toggleFollowUser$1$1", f = "ProfileViewModel.kt", l = {291, 294}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.ProfileViewModel$toggleFollowUser$1$1  reason: invalid class name */
    /* compiled from: ProfileViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super Object>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(profileViewModel, i, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(profileViewModel, i, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                c5 c5Var = c5.this;
                if (c5Var.q) {
                    UserRepo userRepo = profileViewModel.s;
                    int i2 = i;
                    this.c = 1;
                    if (userRepo.x(i2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    UserRepo userRepo2 = profileViewModel.s;
                    int i3 = i;
                    SourceLocation sourceLocation = c5Var.b;
                    Map<String, Object> t2 = v.t2(c5Var.c, sourceLocation);
                    this.c = 2;
                    Object i4 = userRepo2.i(i3, sourceLocation, t2, this);
                    return i4 == coroutineSingletons ? coroutineSingletons : i4;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else if (i == 2) {
                h.d4(obj);
                return obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProfileViewModel profileViewModel = profileViewModel;
            AnonymousClass1 r02 = AnonymousClass1.c;
            int i5 = ProfileViewModel.m;
            profileViewModel.m(r02);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$toggleFollowUser$1(ProfileViewModel profileViewModel, int i) {
        super(1);
        this.c = profileViewModel;
        this.d = i;
    }

    public Object invoke(Object obj) {
        final c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "state");
        final ProfileViewModel profileViewModel = this.c;
        final int i = this.d;
        MavericksViewModel.f(profileViewModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        return i.a;
    }
}
