package com.clubhouse.android.ui.payments;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.PaymentsRepo;
import com.clubhouse.android.data.repos.UserRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.s.f1;
import i0.e.b.g3.s.h1;
import i0.e.b.g3.s.r0;
import i0.e.b.g3.s.x0;
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

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class PaymentsRegistrationViewModel extends i0.e.b.a3.b.a<r0> {
    public static final /* synthetic */ int m = 0;
    public final Resources n;
    public final i0.e.b.c3.i.a o;
    public final PaymentsRepo p;
    public final UserRepo q;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.payments.PaymentsRegistrationViewModel$1", f = "PaymentsRegistrationViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.payments.PaymentsRegistrationViewModel$1  reason: invalid class name */
    /* compiled from: PaymentsRegistrationViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ PaymentsRegistrationViewModel d;

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
            if (cVar instanceof x0) {
                PaymentsRegistrationViewModel paymentsRegistrationViewModel = this.d;
                int i = PaymentsRegistrationViewModel.m;
                Objects.requireNonNull(paymentsRegistrationViewModel);
                paymentsRegistrationViewModel.n(new PaymentsRegistrationViewModel$fetchPaymentRegistration$1(paymentsRegistrationViewModel));
            } else if (cVar instanceof h1) {
                PaymentsRegistrationViewModel paymentsRegistrationViewModel2 = this.d;
                String str = ((h1) cVar).a;
                int i2 = PaymentsRegistrationViewModel.m;
                Objects.requireNonNull(paymentsRegistrationViewModel2);
                MavericksViewModel.f(paymentsRegistrationViewModel2, new PaymentsRegistrationViewModel$verifyEmail$1(paymentsRegistrationViewModel2, str, (m0.l.c<? super PaymentsRegistrationViewModel$verifyEmail$1>) null), (d0) null, (m) null, new PaymentsRegistrationViewModel$verifyEmail$2(paymentsRegistrationViewModel2, str), 3, (Object) null);
            } else if (cVar instanceof f1) {
                PaymentsRegistrationViewModel paymentsRegistrationViewModel3 = this.d;
                boolean z = ((f1) cVar).a;
                int i3 = PaymentsRegistrationViewModel.m;
                Objects.requireNonNull(paymentsRegistrationViewModel3);
                MavericksViewModel.f(paymentsRegistrationViewModel3, new PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1(paymentsRegistrationViewModel3, z, (m0.l.c<? super PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$1>) null), (d0) null, (m) null, new PaymentsRegistrationViewModel$toggleReceivingPaymentsEnabled$2(z, paymentsRegistrationViewModel3), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationViewModel(r0 r0Var, i0.e.b.f3.i.a aVar, Resources resources) {
        super(r0Var);
        i.e(r0Var, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(resources, "resources");
        this.n = resources;
        Object L0 = h.L0(aVar, i0.e.b.c3.i.a.class);
        i.d(L0, "get(userComponentHandler, UserComponentEntryPoint::class.java)");
        i0.e.b.c3.i.a aVar2 = (i0.e.b.c3.i.a) L0;
        this.o = aVar2;
        this.p = aVar2.i();
        this.q = aVar2.c();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        n(new PaymentsRegistrationViewModel$fetchPaymentRegistration$1(this));
    }

    /* compiled from: PaymentsRegistrationViewModel.kt */
    public static final class a implements v<PaymentsRegistrationViewModel, r0> {
        public final /* synthetic */ i0.e.b.c3.h.c<PaymentsRegistrationViewModel, r0> a = new i0.e.b.c3.h.c<>(PaymentsRegistrationViewModel.class);

        public a() {
        }

        public PaymentsRegistrationViewModel create(j0 j0Var, r0 r0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(r0Var, "state");
            return this.a.create(j0Var, r0Var);
        }

        public r0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
