package com.clubhouse.android.ui.onboarding;

import com.clubhouse.android.data.repos.OnboardingRepo;
import com.sinch.verification.flashcall.initialization.FlashCallInitializationResponseData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.r.o2;
import i0.e.b.g3.r.u1;
import i0.e.b.g3.r.v1;
import i0.j.f.p.h;
import i0.n.c.a.f.d.b;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ValidateNumberWithCallViewModel.kt */
public final class ValidateNumberWithCallViewModel extends i0.e.b.a3.b.a<o2> implements b, i0.n.c.a.d.a.b<FlashCallInitializationResponseData> {
    public static final /* synthetic */ int m = 0;
    public final i0.n.c.a.c.b.a n;
    public final OnboardingRepo o;
    public final i0.e.a.a p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberWithCallViewModel$1", f = "ValidateNumberWithCallViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.ValidateNumberWithCallViewModel$1  reason: invalid class name */
    /* compiled from: ValidateNumberWithCallViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ValidateNumberWithCallViewModel d;

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
            if (cVar instanceof v1) {
                ValidateNumberWithCallViewModel validateNumberWithCallViewModel = this.d;
                int i = ValidateNumberWithCallViewModel.m;
                Objects.requireNonNull(validateNumberWithCallViewModel);
                validateNumberWithCallViewModel.m(ValidateNumberWithCallViewModel$initiateFlashCall$1.c);
                validateNumberWithCallViewModel.n(new ValidateNumberWithCallViewModel$initiateFlashCall$2(validateNumberWithCallViewModel));
            } else if (cVar instanceof u1) {
                ValidateNumberWithCallViewModel validateNumberWithCallViewModel2 = this.d;
                int i2 = ValidateNumberWithCallViewModel.m;
                validateNumberWithCallViewModel2.q();
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberWithCallViewModel(o2 o2Var, i0.n.c.a.c.b.a aVar, OnboardingRepo onboardingRepo, i0.e.a.a aVar2) {
        super(o2Var);
        i.e(o2Var, "initialState");
        i.e(aVar, "sinchGlobalConfig");
        i.e(onboardingRepo, "repo");
        i.e(aVar2, "analytics");
        this.n = aVar;
        this.o = onboardingRepo;
        this.p = aVar2;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    public void a(Throwable th) {
        i.e(th, "t");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        o(new d(message));
        q();
    }

    public void b(i0.n.c.a.d.a.c cVar) {
        i.e((FlashCallInitializationResponseData) cVar, MessageExtension.FIELD_DATA);
    }

    public void c() {
        n(new ValidateNumberWithCallViewModel$onVerified$1(this));
    }

    public void d(Throwable th) {
        i.e(th, "t");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        o(new d(message));
        q();
    }

    public final void q() {
        n(new ValidateNumberWithCallViewModel$fallbackToSMS$1(this));
    }

    /* compiled from: ValidateNumberWithCallViewModel.kt */
    public static final class a implements v<ValidateNumberWithCallViewModel, o2> {
        public final /* synthetic */ i0.e.b.c3.h.c<ValidateNumberWithCallViewModel, o2> a = new i0.e.b.c3.h.c<>(ValidateNumberWithCallViewModel.class);

        public a() {
        }

        public ValidateNumberWithCallViewModel create(j0 j0Var, o2 o2Var) {
            i.e(j0Var, "viewModelContext");
            i.e(o2Var, "state");
            return this.a.create(j0Var, o2Var);
        }

        public o2 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
