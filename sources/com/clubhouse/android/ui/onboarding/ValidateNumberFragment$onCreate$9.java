package com.clubhouse.android.ui.onboarding;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.app.R;
import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.f.j;
import i0.e.b.g3.r.p2;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberFragment$onCreate$9", f = "ValidateNumberFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment$onCreate$9 extends SuspendLambda implements p<p2, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ValidateNumberFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public static final a c = new a(0);
        public static final a d = new a(1);
        public final /* synthetic */ int q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.q = i;
        }

        public final Object invoke(Object obj) {
            int i = this.q;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                jVar.d(R.string.incorrect_code_max_tries);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showNegativeBanner");
                jVar2.d(R.string.incorrect_code);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberFragment$onCreate$9(ValidateNumberFragment validateNumberFragment, m0.l.c<? super ValidateNumberFragment$onCreate$9> cVar) {
        super(2, cVar);
        this.d = validateNumberFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ValidateNumberFragment$onCreate$9 validateNumberFragment$onCreate$9 = new ValidateNumberFragment$onCreate$9(this.d, cVar);
        validateNumberFragment$onCreate$9.c = obj;
        return validateNumberFragment$onCreate$9;
    }

    public Object invoke(Object obj, Object obj2) {
        ValidateNumberFragment$onCreate$9 validateNumberFragment$onCreate$9 = new ValidateNumberFragment$onCreate$9(this.d, (m0.l.c) obj2);
        validateNumberFragment$onCreate$9.c = (p2) obj;
        i iVar = i.a;
        validateNumberFragment$onCreate$9.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        p2 p2Var = (p2) this.c;
        if (p2Var.b) {
            ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-PhoneVerify-Done");
            v.a1(this.d, p2Var.e, (q) null, 2);
        } else {
            ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-PhoneVerify-Wrong");
            if (p2Var.d <= 0) {
                ((AmplitudeAnalytics) v.l(this.d)).a("Onboarding-PhoneVerify-GoBack");
                v.f2(this.d, a.c);
                ValidateNumberFragment validateNumberFragment = this.d;
                k<Object>[] kVarArr = ValidateNumberFragment.Z1;
                validateNumberFragment.N0().b.getText().clear();
                g0.a.b.b.a.G(this.d).k();
            } else {
                v.f2(this.d, a.d);
                ValidateNumberFragment validateNumberFragment2 = this.d;
                k<Object>[] kVarArr2 = ValidateNumberFragment.Z1;
                validateNumberFragment2.N0().b.getText().clear();
            }
        }
        return i.a;
    }
}
