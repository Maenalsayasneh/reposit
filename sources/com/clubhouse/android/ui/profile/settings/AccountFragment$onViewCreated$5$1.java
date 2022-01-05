package com.clubhouse.android.ui.profile.settings;

import android.content.Intent;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import h0.a.f.b;
import h0.q.p;
import h0.q.q;
import i0.e.b.g3.u.w4;
import i0.e.b.g3.u.z5.n0;
import i0.e.b.g3.u.z5.s0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

/* compiled from: AccountFragment.kt */
public final class AccountFragment$onViewCreated$5$1 extends Lambda implements l<n0, i> {
    public final /* synthetic */ AccountFragment c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.AccountFragment$onViewCreated$5$1$1", f = "AccountFragment.kt", l = {90, 93}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.AccountFragment$onViewCreated$5$1$1  reason: invalid class name */
    /* compiled from: AccountFragment.kt */
    public final class AnonymousClass1 extends SuspendLambda implements m0.n.a.p<f0, c<? super i>, Object> {
        public Object c;
        public int d;

        public final c<i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1((c) obj2).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            b<Intent> bVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.d;
            if (i == 0) {
                h.d4(obj);
                AccountViewModel O0 = AccountFragment.this.O0();
                this.d = 1;
                obj = O0.q(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else if (i == 2) {
                bVar = (b) this.c;
                h.d4(obj);
                bVar.a(obj, (ActivityOptionsCompat) null);
                return i.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Intent) obj) != null) {
                AccountFragment.this.O0().p(w4.a);
                AccountFragment accountFragment = AccountFragment.this;
                b<Intent> bVar2 = accountFragment.d2;
                if (bVar2 != null) {
                    AccountViewModel O02 = accountFragment.O0();
                    this.c = bVar2;
                    this.d = 2;
                    obj = O02.q(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bVar = bVar2;
                    bVar.a(obj, (ActivityOptionsCompat) null);
                } else {
                    m0.n.b.i.m("getTwitterOAuthToken");
                    throw null;
                }
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountFragment$onViewCreated$5$1(AccountFragment accountFragment) {
        super(1);
        this.c = accountFragment;
    }

    public Object invoke(Object obj) {
        n0 n0Var = (n0) obj;
        m0.n.b.i.e(n0Var, "state");
        if (n0Var.a) {
            this.c.O0().p(s0.a);
        } else {
            p viewLifecycleOwner = this.c.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
            LifecycleCoroutineScope a = q.a(viewLifecycleOwner);
            final AccountFragment accountFragment = this.c;
            a.E2(a, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
        }
        return i.a;
    }
}
