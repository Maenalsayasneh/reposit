package com.clubhouse.android.ui.onboarding;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.StartPhoneNumberAuthResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.r.a1;
import i0.e.b.g3.r.m2;
import i0.e.b.g3.r.o1;
import i0.e.b.g3.r.o2;
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

/* compiled from: ValidateNumberWithCallViewModel.kt */
public final class ValidateNumberWithCallViewModel$fallbackToSMS$1 extends Lambda implements l<o2, i> {
    public final /* synthetic */ ValidateNumberWithCallViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberWithCallViewModel$fallbackToSMS$1$1", f = "ValidateNumberWithCallViewModel.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.onboarding.ValidateNumberWithCallViewModel$fallbackToSMS$1$1  reason: invalid class name */
    /* compiled from: ValidateNumberWithCallViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super StartPhoneNumberAuthResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(o2Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(o2Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                OnboardingRepo onboardingRepo = ValidateNumberWithCallViewModel.this.o;
                String str = o2Var.a;
                Boolean bool = Boolean.TRUE;
                this.c = 1;
                obj = onboardingRepo.l(str, bool, this);
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
    public ValidateNumberWithCallViewModel$fallbackToSMS$1(ValidateNumberWithCallViewModel validateNumberWithCallViewModel) {
        super(1);
        this.c = validateNumberWithCallViewModel;
    }

    public Object invoke(Object obj) {
        final o2 o2Var = (o2) obj;
        m0.n.b.i.e(o2Var, "state");
        final ValidateNumberWithCallViewModel validateNumberWithCallViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ValidateNumberWithCallViewModel validateNumberWithCallViewModel2 = this.c;
        MavericksViewModel.f(validateNumberWithCallViewModel, r2, (d0) null, (m) null, new p<o2, b<? extends StartPhoneNumberAuthResponse>, o2>() {
            public Object invoke(Object obj, Object obj2) {
                o2 o2Var = (o2) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(o2Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    StartPhoneNumberAuthResponse startPhoneNumberAuthResponse = (StartPhoneNumberAuthResponse) ((f0) bVar).b;
                    if (startPhoneNumberAuthResponse.a) {
                        ValidateNumberWithCallViewModel validateNumberWithCallViewModel = ValidateNumberWithCallViewModel.this;
                        o1 o1Var = new o1((String) null, 1);
                        int i = ValidateNumberWithCallViewModel.m;
                        validateNumberWithCallViewModel.o(o1Var);
                    } else {
                        ValidateNumberWithCallViewModel validateNumberWithCallViewModel2 = ValidateNumberWithCallViewModel.this;
                        ValidateNumberArgs validateNumberArgs = new ValidateNumberArgs(o2Var.a, startPhoneNumberAuthResponse.c);
                        m0.n.b.i.e(validateNumberArgs, "mavericksArg");
                        a1 a1Var = new a1(new m2(validateNumberArgs));
                        int i2 = ValidateNumberWithCallViewModel.m;
                        validateNumberWithCallViewModel2.o(a1Var);
                    }
                } else if (bVar instanceof i0.b.b.c) {
                    ValidateNumberWithCallViewModel validateNumberWithCallViewModel3 = ValidateNumberWithCallViewModel.this;
                    o1 o1Var2 = new o1(((i0.b.b.c) bVar).b.getMessage());
                    int i3 = ValidateNumberWithCallViewModel.m;
                    validateNumberWithCallViewModel3.o(o1Var2);
                }
                return o2Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
