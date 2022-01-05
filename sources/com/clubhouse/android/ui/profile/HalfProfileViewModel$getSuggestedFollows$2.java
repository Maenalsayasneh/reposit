package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.UsersInListResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.u.q4;
import i0.j.f.p.h;
import java.util.List;
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
public final class HalfProfileViewModel$getSuggestedFollows$2 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$getSuggestedFollows$2$1", f = "HalfProfileViewModel.kt", l = {464}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.HalfProfileViewModel$getSuggestedFollows$2$1  reason: invalid class name */
    /* compiled from: HalfProfileViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super List<? extends UserInList>>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(q4Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(q4Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                UserRepo userRepo = HalfProfileViewModel.this.s;
                int intValue = q4Var.a.getId().intValue();
                this.c = 1;
                obj = userRepo.n(intValue, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ((UsersInListResponse) obj).a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$getSuggestedFollows$2(HalfProfileViewModel halfProfileViewModel) {
        super(1);
        this.c = halfProfileViewModel;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (q4Var.l == null) {
            final HalfProfileViewModel halfProfileViewModel = this.c;
            AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final HalfProfileViewModel halfProfileViewModel2 = this.c;
            MavericksViewModel.f(halfProfileViewModel, r2, (d0) null, (m) null, new p<q4, b<? extends List<? extends UserInList>>, q4>() {
                public Object invoke(Object obj, Object obj2) {
                    q4 q4Var = (q4) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(q4Var, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        final List list = (List) ((f0) bVar).b;
                        HalfProfileViewModel halfProfileViewModel = HalfProfileViewModel.this;
                        AnonymousClass1 r1 = new l<q4, q4>() {
                            public Object invoke(Object obj) {
                                q4 q4Var = (q4) obj;
                                m0.n.b.i.e(q4Var, "$this$setState");
                                return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, false, (b) null, (b) null, (UserProfile) null, list, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4192255, (Object) null);
                            }
                        };
                        int i = HalfProfileViewModel.m;
                        halfProfileViewModel.m(r1);
                    }
                    return q4Var;
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
