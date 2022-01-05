package com.clubhouse.android.ui.onboarding;

import android.widget.Button;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.CollectNameUtil$setUpViews$4", f = "CollectNameUtil.kt", l = {}, m = "invokeSuspend")
/* compiled from: CollectNameUtil.kt */
public final class CollectNameUtil$setUpViews$4 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public final /* synthetic */ CollectNameUtil c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameUtil$setUpViews$4(CollectNameUtil collectNameUtil, m0.l.c<? super CollectNameUtil$setUpViews$4> cVar) {
        super(2, cVar);
        this.c = collectNameUtil;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new CollectNameUtil$setUpViews$4(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        CollectNameUtil$setUpViews$4 collectNameUtil$setUpViews$4 = new CollectNameUtil$setUpViews$4(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        collectNameUtil$setUpViews$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        Button button = this.c.b.e;
        m0.n.b.i.d(button, "binding.nextButton");
        k.k(button, Boolean.valueOf(CollectNameUtil.a(this.c)));
        return i.a;
    }
}
