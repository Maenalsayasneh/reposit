package com.clubhouse.android.ui.clubs.nominations;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.a3.q;
import i0.e.b.g3.l.a3.r;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: ClubNominationsViewModel.kt */
public final class ClubNominationsViewModel$updateIsMembershipOpen$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ ClubNominationsViewModel c;
    public final /* synthetic */ boolean d;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.nominations.ClubNominationsViewModel$updateIsMembershipOpen$1$1", f = "ClubNominationsViewModel.kt", l = {157}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.nominations.ClubNominationsViewModel$updateIsMembershipOpen$1$1  reason: invalid class name */
    /* compiled from: ClubNominationsViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(qVar, z, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(qVar, z, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = ClubNominationsViewModel.this.o;
                int intValue = new Integer(qVar.a).intValue();
                boolean z = z;
                this.c = 1;
                obj = clubRepo.A(intValue, z, this);
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
    public ClubNominationsViewModel$updateIsMembershipOpen$1(ClubNominationsViewModel clubNominationsViewModel, boolean z) {
        super(1);
        this.c = clubNominationsViewModel;
        this.d = z;
    }

    public Object invoke(Object obj) {
        final q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        final ClubNominationsViewModel clubNominationsViewModel = this.c;
        final boolean z = this.d;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ClubNominationsViewModel clubNominationsViewModel2 = this.c;
        MavericksViewModel.f(clubNominationsViewModel, r2, (d0) null, (m) null, new p<q, b<? extends EmptySuccessResponse>, q>() {
            public Object invoke(Object obj, Object obj2) {
                q qVar = (q) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(qVar, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ClubNominationsViewModel clubNominationsViewModel = ClubNominationsViewModel.this;
                    r rVar = r.a;
                    int i = ClubNominationsViewModel.m;
                    clubNominationsViewModel.o(rVar);
                }
                if (bVar instanceof i0.b.b.c) {
                    ClubNominationsViewModel clubNominationsViewModel2 = ClubNominationsViewModel.this;
                    d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                    int i2 = ClubNominationsViewModel.m;
                    clubNominationsViewModel2.o(dVar);
                }
                return qVar;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
