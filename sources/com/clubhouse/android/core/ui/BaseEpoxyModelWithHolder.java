package com.clubhouse.android.core.ui;

import i0.b.a.u;
import i0.e.b.a3.f.d;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;

/* compiled from: BaseEpoxyModelWithHolder.kt */
public abstract class BaseEpoxyModelWithHolder<T extends d> extends u<T> {
    public a<i> i;

    /* renamed from: I */
    public void G(int i2, T t) {
        m0.n.b.i.e(t, "holder");
        if (i2 == 5) {
            m0.r.t.a.r.m.a1.a.E2(t.a, (e) null, (CoroutineStart) null, new BaseEpoxyModelWithHolder$onVisibilityStateChanged$1(this, (c<? super BaseEpoxyModelWithHolder$onVisibilityStateChanged$1>) null), 3, (Object) null);
        }
    }

    /* renamed from: J */
    public void H(T t) {
        m0.n.b.i.e(t, "holder");
        m0.r.t.a.r.m.a1.a.p0(t.a.C(), (CancellationException) null, 1, (Object) null);
    }
}
