package com.clubhouse.android.ui.activity.overflow;

import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.activity.overflow.ActivityOverflowFragment$onViewCreated$1", f = "ActivityOverflowFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ActivityOverflowFragment.kt */
public final class ActivityOverflowFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ActivityOverflowFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOverflowFragment$onViewCreated$1(ActivityOverflowFragment activityOverflowFragment, m0.l.c<? super ActivityOverflowFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = activityOverflowFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ActivityOverflowFragment$onViewCreated$1 activityOverflowFragment$onViewCreated$1 = new ActivityOverflowFragment$onViewCreated$1(this.d, cVar);
        activityOverflowFragment$onViewCreated$1.c = obj;
        return activityOverflowFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ActivityOverflowFragment$onViewCreated$1 activityOverflowFragment$onViewCreated$1 = new ActivityOverflowFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        activityOverflowFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        activityOverflowFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof e) {
            v.c2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(((e) bVar).a);
                    return i.a;
                }
            });
        } else if (bVar instanceof d) {
            final ActivityOverflowFragment activityOverflowFragment = this.d;
            v.c2(activityOverflowFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = activityOverflowFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    jVar.h(Banner.Style.Negative);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
