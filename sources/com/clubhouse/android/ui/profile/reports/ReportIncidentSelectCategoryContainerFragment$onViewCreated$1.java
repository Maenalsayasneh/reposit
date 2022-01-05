package com.clubhouse.android.ui.profile.reports;

import i0.e.b.a3.b.b;
import i0.e.b.g3.u.y5.g0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerFragment$onViewCreated$1", f = "ReportIncidentSelectCategoryContainerFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ReportIncidentSelectCategoryContainerFragment.kt */
public final class ReportIncidentSelectCategoryContainerFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ReportIncidentSelectCategoryContainerFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectCategoryContainerFragment$onViewCreated$1(ReportIncidentSelectCategoryContainerFragment reportIncidentSelectCategoryContainerFragment, m0.l.c<? super ReportIncidentSelectCategoryContainerFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = reportIncidentSelectCategoryContainerFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ReportIncidentSelectCategoryContainerFragment$onViewCreated$1 reportIncidentSelectCategoryContainerFragment$onViewCreated$1 = new ReportIncidentSelectCategoryContainerFragment$onViewCreated$1(this.d, cVar);
        reportIncidentSelectCategoryContainerFragment$onViewCreated$1.c = obj;
        return reportIncidentSelectCategoryContainerFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ReportIncidentSelectCategoryContainerFragment$onViewCreated$1 reportIncidentSelectCategoryContainerFragment$onViewCreated$1 = new ReportIncidentSelectCategoryContainerFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        reportIncidentSelectCategoryContainerFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        reportIncidentSelectCategoryContainerFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (m0.n.b.i.a((b) this.c, g0.a)) {
            this.d.dismiss();
        }
        return i.a;
    }
}
