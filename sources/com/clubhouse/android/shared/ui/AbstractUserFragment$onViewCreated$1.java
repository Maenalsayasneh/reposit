package com.clubhouse.android.shared.ui;

import android.widget.ProgressBar;
import android.widget.TextView;
import i0.e.b.d3.k;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.shared.ui.AbstractUserFragment$onViewCreated$1", f = "AbstractUserFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: AbstractUserFragment.kt */
public final class AbstractUserFragment$onViewCreated$1 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ AbstractUserFragment<T> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractUserFragment$onViewCreated$1(AbstractUserFragment<T> abstractUserFragment, m0.l.c<? super AbstractUserFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = abstractUserFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        AbstractUserFragment$onViewCreated$1 abstractUserFragment$onViewCreated$1 = new AbstractUserFragment$onViewCreated$1(this.d, cVar);
        abstractUserFragment$onViewCreated$1.c = obj;
        return abstractUserFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        AbstractUserFragment$onViewCreated$1 abstractUserFragment$onViewCreated$1 = new AbstractUserFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        abstractUserFragment$onViewCreated$1.c = (d) obj;
        i iVar = i.a;
        abstractUserFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        d dVar = (d) this.c;
        TextView textView = this.d.S0().d;
        m0.n.b.i.d(textView, "binding.emptyView");
        k.L(textView, Boolean.valueOf(dVar instanceof d.a));
        ProgressBar progressBar = this.d.S0().f;
        m0.n.b.i.d(progressBar, "binding.loading");
        k.L(progressBar, Boolean.valueOf(dVar instanceof d.C0203d));
        this.d.S0().j.requestLayout();
        return i.a;
    }
}
