package com.clubhouse.android.ui.onboarding;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.ValidateNumberFragment$onCreate$6", f = "ValidateNumberFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ValidateNumberFragment.kt */
public final class ValidateNumberFragment$onCreate$6 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
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
                jVar.d(R.string.will_receive_call);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showNegativeBanner");
                jVar2.d(R.string.common_error_try_again);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ValidateNumberFragment$onCreate$6(ValidateNumberFragment validateNumberFragment, m0.l.c<? super ValidateNumberFragment$onCreate$6> cVar) {
        super(2, cVar);
        this.d = validateNumberFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ValidateNumberFragment$onCreate$6 validateNumberFragment$onCreate$6 = new ValidateNumberFragment$onCreate$6(this.d, cVar);
        validateNumberFragment$onCreate$6.c = ((Boolean) obj).booleanValue();
        return validateNumberFragment$onCreate$6;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        ValidateNumberFragment$onCreate$6 validateNumberFragment$onCreate$6 = new ValidateNumberFragment$onCreate$6(this.d, (m0.l.c) obj2);
        validateNumberFragment$onCreate$6.c = valueOf.booleanValue();
        i iVar = i.a;
        validateNumberFragment$onCreate$6.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (this.c) {
            v.f2(this.d, a.c);
        } else {
            v.f2(this.d, a.d);
        }
        return i.a;
    }
}
