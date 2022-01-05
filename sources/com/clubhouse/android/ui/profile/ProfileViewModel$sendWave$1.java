package com.clubhouse.android.ui.profile;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.wave.data.models.local.ReceivedWave;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.c5;
import i0.e.b.g3.u.n5;
import i0.e.e.k.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.profile.ProfileViewModel$sendWave$1", f = "ProfileViewModel.kt", l = {226}, m = "invokeSuspend")
/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$sendWave$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ProfileViewModel d;
    public final /* synthetic */ int q;
    public final /* synthetic */ String x;

    @c(c = "com.clubhouse.android.ui.profile.ProfileViewModel$sendWave$1$1", f = "ProfileViewModel.kt", l = {237}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.ProfileViewModel$sendWave$1$1  reason: invalid class name */
    /* compiled from: ProfileViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
        public int c;

        public final m0.l.c<i> create(m0.l.c<?> cVar) {
            return new AnonymousClass1(profileViewModel2, i4, str, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(profileViewModel2, i4, str, (m0.l.c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                a q2 = ProfileViewModel.q(profileViewModel2);
                int i2 = i4;
                String str = str;
                SourceLocation sourceLocation = SourceLocation.PROFILE;
                this.c = 1;
                if (q2.i(i2, str, sourceLocation, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$sendWave$1(ProfileViewModel profileViewModel, int i, String str, m0.l.c<? super ProfileViewModel$sendWave$1> cVar) {
        super(2, cVar);
        this.d = profileViewModel;
        this.q = i;
        this.x = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ProfileViewModel$sendWave$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ProfileViewModel$sendWave$1(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a q2 = ProfileViewModel.q(this.d);
            int i2 = this.q;
            this.c = 1;
            obj = q2.k(i2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ReceivedWave receivedWave = (ReceivedWave) obj;
        if (receivedWave != null) {
            ProfileViewModel profileViewModel = this.d;
            n5 n5Var = new n5(this.q, this.x, receivedWave.d);
            int i3 = ProfileViewModel.m;
            profileViewModel.o(n5Var);
        } else {
            final ProfileViewModel profileViewModel2 = this.d;
            final int i4 = this.q;
            final String str = this.x;
            AnonymousClass1 r3 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            final ProfileViewModel profileViewModel3 = this.d;
            MavericksViewModel.f(profileViewModel2, r3, (d0) null, (m) null, new p<c5, b<? extends i>, c5>() {
                public Object invoke(Object obj, Object obj2) {
                    c5 c5Var = (c5) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(c5Var, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof i0.b.b.c) {
                        ProfileViewModel profileViewModel = profileViewModel3;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i = ProfileViewModel.m;
                        profileViewModel.o(dVar);
                    }
                    return c5Var;
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
