package com.clubhouse.android.ui.activity;

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

@c(c = "com.clubhouse.android.ui.activity.ActivityFragment$onViewCreated$1", f = "ActivityFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ActivityFragment.kt */
public final class ActivityFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ActivityFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFragment$onViewCreated$1(ActivityFragment activityFragment, m0.l.c<? super ActivityFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = activityFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ActivityFragment$onViewCreated$1 activityFragment$onViewCreated$1 = new ActivityFragment$onViewCreated$1(this.d, cVar);
        activityFragment$onViewCreated$1.c = obj;
        return activityFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ActivityFragment$onViewCreated$1 activityFragment$onViewCreated$1 = new ActivityFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        activityFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        activityFragment$onViewCreated$1.invokeSuspend(iVar);
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
            final ActivityFragment activityFragment = this.d;
            v.c2(activityFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = activityFragment.getString(R.string.common_error_try_again);
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
