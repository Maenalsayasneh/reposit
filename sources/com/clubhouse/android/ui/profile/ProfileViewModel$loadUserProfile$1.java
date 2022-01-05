package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.c5;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$loadUserProfile$1 extends Lambda implements l<c5, i> {
    public final /* synthetic */ ProfileViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.ProfileViewModel$loadUserProfile$1$1", f = "ProfileViewModel.kt", l = {377}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.ProfileViewModel$loadUserProfile$1$1  reason: invalid class name */
    /* compiled from: ProfileViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super GetProfileResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(c5Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(c5Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                UserRepo userRepo = ProfileViewModel.this.s;
                c5 c5Var = c5Var;
                Integer num = c5Var.a;
                String str = c5Var.d;
                Map<String, Object> t2 = v.t2(c5Var.c, c5Var.b);
                this.c = 1;
                obj = userRepo.p(num, str, t2, this);
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
    public ProfileViewModel$loadUserProfile$1(ProfileViewModel profileViewModel) {
        super(1);
        this.c = profileViewModel;
    }

    public Object invoke(Object obj) {
        final c5 c5Var = (c5) obj;
        m0.n.b.i.e(c5Var, "it");
        final ProfileViewModel profileViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ProfileViewModel profileViewModel2 = this.c;
        MavericksViewModel.f(profileViewModel, r2, (d0) null, (m) null, new p<c5, b<? extends GetProfileResponse>, c5>() {
            public Object invoke(Object obj, Object obj2) {
                c5 c5Var = (c5) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(c5Var, "$this$execute");
                m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                if (bVar instanceof f0) {
                    ProfileViewModel profileViewModel = ProfileViewModel.this;
                    UserProfile userProfile = ((GetProfileResponse) ((f0) bVar).b).a;
                    int i = ProfileViewModel.m;
                    Objects.requireNonNull(profileViewModel);
                    profileViewModel.m(new ProfileViewModel$updateUserProfile$1(userProfile, profileViewModel));
                } else if (bVar instanceof i0.b.b.c) {
                    ProfileViewModel profileViewModel2 = ProfileViewModel.this;
                    d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                    int i2 = ProfileViewModel.m;
                    profileViewModel2.o(dVar);
                }
                return c5.copy$default(c5Var, (Integer) null, (SourceLocation) null, (Map) null, (String) null, (BasicUser) null, (b) null, false, false, false, bVar, (b) null, (UserProfile) null, (List) null, (FollowNotificationType) null, (Integer) null, false, false, false, false, (EventInProfile) null, false, false, 4193791, (Object) null);
            }
        }, 3, (Object) null);
        return i.a;
    }
}
