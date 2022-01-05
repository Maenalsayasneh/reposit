package com.clubhouse.android.ui.profile.reports;

import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.u.y5.e0;
import i0.e.b.g3.u.y5.g0;
import i0.e.b.g3.u.y5.l0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectCategoryContainerViewModel.kt */
public final class ReportIncidentSelectCategoryContainerViewModel extends i0.e.b.a3.b.a<l0> {
    public static final /* synthetic */ int m = 0;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerViewModel$1", f = "ReportIncidentSelectCategoryContainerViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerViewModel$1  reason: invalid class name */
    /* compiled from: ReportIncidentSelectCategoryContainerViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ReportIncidentSelectCategoryContainerViewModel d;

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
            if (i.a((c) this.c, e0.a)) {
                ReportIncidentSelectCategoryContainerViewModel reportIncidentSelectCategoryContainerViewModel = this.d;
                g0 g0Var = g0.a;
                int i = ReportIncidentSelectCategoryContainerViewModel.m;
                reportIncidentSelectCategoryContainerViewModel.o(g0Var);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectCategoryContainerViewModel(l0 l0Var) {
        super(l0Var);
        i.e(l0Var, "initialState");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: ReportIncidentSelectCategoryContainerViewModel.kt */
    public static final class a implements v<ReportIncidentSelectCategoryContainerViewModel, l0> {
        public final /* synthetic */ i0.e.b.c3.h.c<ReportIncidentSelectCategoryContainerViewModel, l0> a = new i0.e.b.c3.h.c<>(ReportIncidentSelectCategoryContainerViewModel.class);

        public a() {
        }

        public ReportIncidentSelectCategoryContainerViewModel create(j0 j0Var, l0 l0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(l0Var, "state");
            return this.a.create(j0Var, l0Var);
        }

        public l0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
