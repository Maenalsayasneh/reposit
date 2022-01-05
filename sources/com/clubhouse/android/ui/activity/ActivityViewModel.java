package com.clubhouse.android.ui.activity;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.data.repos.ActivityRepo;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.UserRepo;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.j.d0;
import i0.e.b.g3.j.e0;
import i0.e.b.g3.j.f0;
import i0.e.b.g3.j.g0;
import i0.e.b.g3.j.h0;
import i0.e.b.g3.j.i0;
import i0.e.b.g3.j.j0;
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

/* compiled from: ActivityViewModel.kt */
public final class ActivityViewModel extends i0.e.b.a3.b.a<d0> {
    public static final /* synthetic */ int m = 0;
    public final ActivityRepo n;
    public final ClubRepo o;
    public final UserRepo p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.activity.ActivityViewModel$1", f = "ActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.activity.ActivityViewModel$1  reason: invalid class name */
    /* compiled from: ActivityViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ActivityViewModel d;

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
                ActivityViewModel activityViewModel = this.d;
                e0 e0Var = (e0) cVar;
                int i = e0Var.a;
                ActionableNotification actionableNotification = e0Var.b;
                int i2 = ActivityViewModel.m;
                Objects.requireNonNull(activityViewModel);
                MavericksViewModel.f(activityViewModel, new ActivityViewModel$follow$1(activityViewModel, i, (m0.l.c<? super ActivityViewModel$follow$1>) null), (n0.a.d0) null, (m) null, new ActivityViewModel$follow$2(activityViewModel, actionableNotification), 3, (Object) null);
            } else if (cVar instanceof g0) {
                ActivityViewModel activityViewModel2 = this.d;
                g0 g0Var = (g0) cVar;
                int i3 = g0Var.a;
                ActionableNotification actionableNotification2 = g0Var.b;
                int i4 = ActivityViewModel.m;
                Objects.requireNonNull(activityViewModel2);
                MavericksViewModel.f(activityViewModel2, new ActivityViewModel$joinClub$1(activityViewModel2, i3, (m0.l.c<? super ActivityViewModel$joinClub$1>) null), (n0.a.d0) null, (m) null, new ActivityViewModel$joinClub$2(activityViewModel2, actionableNotification2), 3, (Object) null);
            } else if (cVar instanceof j0) {
                ActivityViewModel.q(this.d, ((j0) cVar).a);
            } else if (cVar instanceof f0) {
                ActivityViewModel activityViewModel3 = this.d;
                ActionableNotification actionableNotification3 = ((f0) cVar).a;
                int i5 = ActivityViewModel.m;
                Objects.requireNonNull(activityViewModel3);
                MavericksViewModel.f(activityViewModel3, new ActivityViewModel$ignoreNotification$1(activityViewModel3, actionableNotification3, (m0.l.c<? super ActivityViewModel$ignoreNotification$1>) null), (n0.a.d0) null, (m) null, new ActivityViewModel$ignoreNotification$2(activityViewModel3, actionableNotification3), 3, (Object) null);
            } else if (cVar instanceof h0) {
                this.d.p.d.d.setValue(Boolean.valueOf(!((h0) cVar).a));
            } else if (cVar instanceof i0) {
                ActivityViewModel activityViewModel4 = this.d;
                int i6 = ActivityViewModel.m;
                activityViewModel4.r();
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityViewModel(d0 d0Var, i0.e.b.f3.i.a aVar, Resources resources) {
        super(d0Var);
        Class cls = i0.e.b.c3.i.a.class;
        i.e(d0Var, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(resources, "resources");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, cls)).m();
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, cls)).l();
        this.p = ((i0.e.b.c3.i.a) h.L0(aVar, cls)).c();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        r();
    }

    public static final void q(ActivityViewModel activityViewModel, ActionableNotification actionableNotification) {
        Objects.requireNonNull(activityViewModel);
        activityViewModel.n(new ActivityViewModel$updateActionableNotifications$1(activityViewModel, actionableNotification));
    }

    public final void r() {
        MavericksViewModel.f(this, new ActivityViewModel$getActionableNotifications$1(this, (m0.l.c<? super ActivityViewModel$getActionableNotifications$1>) null), (n0.a.d0) null, (m) null, new j(0, this), 3, (Object) null);
        MavericksViewModel.f(this, new ActivityViewModel$getActionableNotifications$3(this, (m0.l.c<? super ActivityViewModel$getActionableNotifications$3>) null), (n0.a.d0) null, (m) null, new j(1, this), 3, (Object) null);
        m0.r.t.a.r.m.a1.a.E2(this.c, (e) null, (CoroutineStart) null, new ActivityViewModel$getNonActionableNotifications$1(this, (m0.l.c<? super ActivityViewModel$getNonActionableNotifications$1>) null), 3, (Object) null);
    }

    /* compiled from: ActivityViewModel.kt */
    public static final class a implements v<ActivityViewModel, d0> {
        public final /* synthetic */ i0.e.b.c3.h.c<ActivityViewModel, d0> a = new i0.e.b.c3.h.c<>(ActivityViewModel.class);

        public a() {
        }

        public ActivityViewModel create(i0.b.b.j0 j0Var, d0 d0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(d0Var, "state");
            return this.a.create(j0Var, d0Var);
        }

        public d0 initialState(i0.b.b.j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
