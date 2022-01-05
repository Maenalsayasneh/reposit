package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.e.b.g3.u.q4;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$followUser$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileViewModel c;
    public final /* synthetic */ int d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$followUser$1$1", f = "HalfProfileViewModel.kt", l = {493}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.HalfProfileViewModel$followUser$1$1  reason: invalid class name */
    /* compiled from: HalfProfileViewModel.kt */
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
                UserRepo userRepo = HalfProfileViewModel.this.s;
                int i2 = i;
                SourceLocation sourceLocation = SourceLocation.SUGGESTED_SIMILAR;
                this.c = 1;
                obj = UserRepo.j(userRepo, i2, sourceLocation, (Map) null, this, 4, (Object) null);
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
    public HalfProfileViewModel$followUser$1(HalfProfileViewModel halfProfileViewModel, int i) {
        super(1);
        this.c = halfProfileViewModel;
        this.d = i;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        final HalfProfileViewModel halfProfileViewModel = this.c;
        final int i = this.d;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final int i2 = this.d;
        MavericksViewModel.f(halfProfileViewModel, r2, (d0) null, (m) null, new p<q4, b<? extends EmptySuccessResponse>, q4>() {
            public Object invoke(Object obj, Object obj2) {
                ArrayList arrayList;
                q4 q4Var = (q4) obj;
                m0.n.b.i.e(q4Var, "$this$execute");
                m0.n.b.i.e((b) obj2, "$noName_0");
                List<UserInList> list = q4.this.l;
                if (list == null) {
                    arrayList = null;
                } else {
                    int i = i2;
                    ArrayList arrayList2 = new ArrayList();
                    for (T next : list) {
                        if (((UserInList) next).getId().intValue() != i) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList = arrayList2;
                }
                return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, (UserProfile) null, arrayList, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4192255, (Object) null);
            }
        }, 3, (Object) null);
        return i.a;
    }
}
