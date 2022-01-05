package com.clubhouse.android.ui.activity;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.e.b.g3.j.h0;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.activity.ActivityFragment$configurePagingController$1", f = "ActivityFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ActivityFragment.kt */
public final class ActivityFragment$configurePagingController$1 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ActivityFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFragment$configurePagingController$1(ActivityFragment activityFragment, m0.l.c<? super ActivityFragment$configurePagingController$1> cVar) {
        super(2, cVar);
        this.d = activityFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ActivityFragment$configurePagingController$1 activityFragment$configurePagingController$1 = new ActivityFragment$configurePagingController$1(this.d, cVar);
        activityFragment$configurePagingController$1.c = obj;
        return activityFragment$configurePagingController$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ActivityFragment$configurePagingController$1 activityFragment$configurePagingController$1 = new ActivityFragment$configurePagingController$1(this.d, (m0.l.c) obj2);
        activityFragment$configurePagingController$1.c = (d) obj;
        i iVar = i.a;
        activityFragment$configurePagingController$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final d dVar = (d) this.c;
        this.d.N0().c.setRefreshing(dVar instanceof d.C0203d);
        if (dVar instanceof d.b) {
            final ActivityFragment activityFragment = this.d;
            v.f2(activityFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String message = ((d.b) dVar).a.getMessage();
                    if (message == null) {
                        message = activityFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(message);
                    return i.a;
                }
            });
        }
        if (dVar instanceof d.c) {
            this.d.O0().p(new h0(true));
        }
        return i.a;
    }
}
