package com.clubhouse.android.ui.payments;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.PaymentsRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.s.e0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: RecentPaymentsViewModel.kt */
public final class RecentPaymentsViewModel extends i0.e.b.a3.b.a<GetRecentPaymentsState> {
    public static final /* synthetic */ int m = 0;
    public final Resources n;
    public final i0.e.b.c3.i.a o;
    public final PaymentsRepo p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.payments.RecentPaymentsViewModel$1", f = "RecentPaymentsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.payments.RecentPaymentsViewModel$1  reason: invalid class name */
    /* compiled from: RecentPaymentsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ RecentPaymentsViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            c cVar = (c) this.c;
            if (cVar instanceof e0) {
                RecentPaymentsViewModel recentPaymentsViewModel = this.d;
                e0 e0Var = (e0) cVar;
                int intValue = ((Number) e0Var.a.c).intValue();
                int i = RecentPaymentsViewModel.m;
                Objects.requireNonNull(recentPaymentsViewModel);
                MavericksViewModel.f(recentPaymentsViewModel, new RecentPaymentsViewModel$acknowledgePayment$1(recentPaymentsViewModel, intValue, (String) e0Var.a.d, (m0.l.c<? super RecentPaymentsViewModel$acknowledgePayment$1>) null), (d0) null, (m) null, new RecentPaymentsViewModel$acknowledgePayment$2(recentPaymentsViewModel, intValue), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentPaymentsViewModel(GetRecentPaymentsState getRecentPaymentsState, i0.e.b.f3.i.a aVar, Resources resources) {
        super(getRecentPaymentsState);
        i.e(getRecentPaymentsState, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(resources, "resources");
        this.n = resources;
        Object L0 = h.L0(aVar, i0.e.b.c3.i.a.class);
        i.d(L0, "get(userComponentHandler, UserComponentEntryPoint::class.java)");
        i0.e.b.c3.i.a aVar2 = (i0.e.b.c3.i.a) L0;
        this.o = aVar2;
        this.p = aVar2.i();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new RecentPaymentsViewModel$loadRecentPayments$1(this, (m0.l.c<? super RecentPaymentsViewModel$loadRecentPayments$1>) null), 3, (Object) null);
    }

    /* compiled from: RecentPaymentsViewModel.kt */
    public static final class a implements v<RecentPaymentsViewModel, GetRecentPaymentsState> {
        public final /* synthetic */ i0.e.b.c3.h.c<RecentPaymentsViewModel, GetRecentPaymentsState> a = new i0.e.b.c3.h.c<>(RecentPaymentsViewModel.class);

        public a() {
        }

        public RecentPaymentsViewModel create(j0 j0Var, GetRecentPaymentsState getRecentPaymentsState) {
            i.e(j0Var, "viewModelContext");
            i.e(getRecentPaymentsState, "state");
            return this.a.create(j0Var, getRecentPaymentsState);
        }

        public GetRecentPaymentsState initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
