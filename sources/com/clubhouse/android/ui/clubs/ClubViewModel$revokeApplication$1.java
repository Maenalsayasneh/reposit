package com.clubhouse.android.ui.clubs;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.v1;
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

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$revokeApplication$1 extends Lambda implements l<v1, i> {
    public final /* synthetic */ ClubViewModel c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ int q;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$revokeApplication$1$1", f = "ClubViewModel.kt", l = {550}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.ClubViewModel$revokeApplication$1$1  reason: invalid class name */
    /* compiled from: ClubViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(v1Var, num, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(v1Var, num, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = ClubViewModel.this.q;
                Integer num = v1Var.a;
                if (num != null) {
                    int intValue = num.intValue();
                    Integer num2 = num;
                    if (num2 != null) {
                        int intValue2 = num2.intValue();
                        this.c = 1;
                        obj = clubRepo.r(intValue, intValue2, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
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
    public ClubViewModel$revokeApplication$1(ClubViewModel clubViewModel, Integer num, int i) {
        super(1);
        this.c = clubViewModel;
        this.d = num;
        this.q = i;
    }

    public Object invoke(Object obj) {
        final v1 v1Var = (v1) obj;
        m0.n.b.i.e(v1Var, "state");
        final ClubViewModel clubViewModel = this.c;
        final Integer num = this.d;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ClubViewModel clubViewModel2 = this.c;
        final int i = this.q;
        MavericksViewModel.f(clubViewModel, r2, (d0) null, (m) null, new p<v1, b<? extends EmptySuccessResponse>, v1>() {
            public Object invoke(Object obj, Object obj2) {
                v1 v1Var = (v1) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(v1Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ClubViewModel.s(ClubViewModel.this, i);
                } else if (bVar instanceof i0.b.b.c) {
                    ClubViewModel clubViewModel = ClubViewModel.this;
                    d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                    int i = ClubViewModel.m;
                    clubViewModel.o(dVar);
                }
                return v1Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
