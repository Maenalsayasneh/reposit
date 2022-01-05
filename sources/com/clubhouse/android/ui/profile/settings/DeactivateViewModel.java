package com.clubhouse.android.ui.profile.settings;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.auth.UserManager;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.u.z5.o0;
import i0.e.b.g3.u.z5.q0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: DeactivateViewModel.kt */
public final class DeactivateViewModel extends i0.e.b.a3.b.a<q0> {
    public static final /* synthetic */ int m = 0;
    public final UserManager n;
    public final UserRepo o;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.DeactivateViewModel$1", f = "DeactivateViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.DeactivateViewModel$1  reason: invalid class name */
    /* compiled from: DeactivateViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ DeactivateViewModel d;

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
            if (i.a((c) this.c, o0.a)) {
                DeactivateViewModel deactivateViewModel = this.d;
                int i = DeactivateViewModel.m;
                Objects.requireNonNull(deactivateViewModel);
                MavericksViewModel.f(deactivateViewModel, new DeactivateViewModel$deactivateAccount$1(deactivateViewModel, (m0.l.c<? super DeactivateViewModel$deactivateAccount$1>) null), (d0) null, (m) null, new DeactivateViewModel$deactivateAccount$2(deactivateViewModel), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateViewModel(q0 q0Var, UserManager userManager, i0.e.b.f3.i.a aVar) {
        super(q0Var);
        i.e(q0Var, "initialState");
        i.e(userManager, "userManager");
        i.e(aVar, "userComponentHandler");
        this.n = userManager;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: DeactivateViewModel.kt */
    public static final class a implements v<DeactivateViewModel, q0> {
        public final /* synthetic */ i0.e.b.c3.h.c<DeactivateViewModel, q0> a = new i0.e.b.c3.h.c<>(DeactivateViewModel.class);

        public a() {
        }

        public DeactivateViewModel create(j0 j0Var, q0 q0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(q0Var, "state");
            return this.a.create(j0Var, q0Var);
        }

        public q0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
