package androidx.lifecycle;

import h0.q.c;
import h0.q.v;
import h0.q.w;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.e;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.f0;
import n0.a.f1;
import n0.a.h2.o;
import n0.a.m0;
import n0.a.w1;

/* compiled from: CoroutineLiveData.kt */
public final class CoroutineLiveData<T> extends w<T> {
    public c<T> b;

    public CoroutineLiveData(e eVar, long j, p<? super v<T>, ? super m0.l.c<? super i>, ? extends Object> pVar) {
        m0.n.b.i.e(eVar, "context");
        m0.n.b.i.e(pVar, "block");
        int i = f1.k;
        w1 w1Var = new w1((f1) eVar.get(f1.a.c));
        d0 d0Var = m0.a;
        this.b = new c(this, pVar, j, a.h(o.c.T().plus(eVar).plus(w1Var)), new m0.n.a.a<i>(this) {
            public final /* synthetic */ CoroutineLiveData c;

            {
                this.c = r1;
            }

            public Object invoke() {
                this.c.b = null;
                return i.a;
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(m0.l.c<? super m0.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.CoroutineLiveData$clearSource$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = (androidx.lifecycle.CoroutineLiveData$clearSource$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.d = r1
            goto L_0x0018
        L_0x0013:
            androidx.lifecycle.CoroutineLiveData$clearSource$1 r0 = new androidx.lifecycle.CoroutineLiveData$clearSource$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L_0x0033
            if (r1 != r2) goto L_0x002b
            java.lang.Object r0 = r0.x
            androidx.lifecycle.CoroutineLiveData r0 = (androidx.lifecycle.CoroutineLiveData) r0
            i0.j.f.p.h.d4(r5)
            goto L_0x0037
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            i0.j.f.p.h.d4(r5)
            r0 = r4
        L_0x0037:
            java.util.Objects.requireNonNull(r0)
            m0.i r5 = m0.i.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.CoroutineLiveData.b(m0.l.c):java.lang.Object");
    }

    public void onActive() {
        super.onActive();
        c<T> cVar = this.b;
        if (cVar != null) {
            f1 f1Var = cVar.b;
            if (f1Var != null) {
                a.o0(f1Var, (CancellationException) null, 1, (Object) null);
            }
            cVar.b = null;
            if (cVar.a == null) {
                cVar.a = a.E2(cVar.f, (e) null, (CoroutineStart) null, new BlockRunner$maybeRun$1(cVar, (m0.l.c) null), 3, (Object) null);
            }
        }
    }

    public void onInactive() {
        super.onInactive();
        c<T> cVar = this.b;
        if (cVar == null) {
            return;
        }
        if (cVar.b == null) {
            f0 f0Var = cVar.f;
            d0 d0Var = m0.a;
            cVar.b = a.E2(f0Var, o.c.T(), (CoroutineStart) null, new BlockRunner$cancel$1(cVar, (m0.l.c) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }
}
