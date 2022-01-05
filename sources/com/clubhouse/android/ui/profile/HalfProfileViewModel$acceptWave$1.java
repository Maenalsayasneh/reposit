package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.f.e;
import i0.e.e.k.b.a;
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
public final class HalfProfileViewModel$acceptWave$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileViewModel c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String q;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$acceptWave$1$1", f = "HalfProfileViewModel.kt", l = {248}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.HalfProfileViewModel$acceptWave$1$1  reason: invalid class name */
    /* compiled from: HalfProfileViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super ChannelInRoomWithAccess>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(i, str, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(i, str, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                a q2 = HalfProfileViewModel.q(HalfProfileViewModel.this);
                int i2 = i;
                String str = str;
                SourceLocation sourceLocation = SourceLocation.PROFILE;
                this.c = 1;
                obj = q2.p(i2, str, sourceLocation, this);
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
    public HalfProfileViewModel$acceptWave$1(HalfProfileViewModel halfProfileViewModel, int i, String str) {
        super(1);
        this.c = halfProfileViewModel;
        this.d = i;
        this.q = str;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (!q4Var.h) {
            final HalfProfileViewModel halfProfileViewModel = this.c;
            final int i = this.d;
            final String str = this.q;
            AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final HalfProfileViewModel halfProfileViewModel2 = this.c;
            MavericksViewModel.f(halfProfileViewModel, r1, (d0) null, (m) null, new p<q4, b<? extends ChannelInRoomWithAccess>, q4>() {
                public Object invoke(Object obj, Object obj2) {
                    q4 q4Var = (q4) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(q4Var, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        HalfProfileViewModel halfProfileViewModel = HalfProfileViewModel.this;
                        e eVar = new e((Channel) ((f0) bVar).b, SourceLocation.PROFILE);
                        int i = HalfProfileViewModel.m;
                        halfProfileViewModel.o(eVar);
                    } else if (bVar instanceof i0.b.b.c) {
                        HalfProfileViewModel halfProfileViewModel2 = HalfProfileViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i2 = HalfProfileViewModel.m;
                        halfProfileViewModel2.o(dVar);
                    }
                    return q4.copy$default(q4Var, (User) null, (SourceLocation) null, false, false, false, false, false, bVar instanceof f, (b) null, (b) null, (UserProfile) null, (List) null, false, (FollowNotificationType) null, false, false, false, false, (Integer) null, (EventInProfile) null, false, false, 4194175, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
