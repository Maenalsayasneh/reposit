package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.core.ui.Banner;
import h0.b0.v;
import h0.t.q;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.u.y5.f1;
import i0.e.b.g3.u.y5.i0;
import i0.e.b.g3.u.y5.k0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment$onViewCreated$1", f = "ReportIncidentAddDetailsFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ReportIncidentAddDetailsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentAddDetailsFragment$onViewCreated$1(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment, m0.l.c<? super ReportIncidentAddDetailsFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = reportIncidentAddDetailsFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ReportIncidentAddDetailsFragment$onViewCreated$1 reportIncidentAddDetailsFragment$onViewCreated$1 = new ReportIncidentAddDetailsFragment$onViewCreated$1(this.d, cVar);
        reportIncidentAddDetailsFragment$onViewCreated$1.c = obj;
        return reportIncidentAddDetailsFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ReportIncidentAddDetailsFragment$onViewCreated$1 reportIncidentAddDetailsFragment$onViewCreated$1 = new ReportIncidentAddDetailsFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        reportIncidentAddDetailsFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        reportIncidentAddDetailsFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            v.c2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showBanner");
                    jVar.e(((d) bVar).a);
                    jVar.h(Banner.Style.Negative);
                    return i.a;
                }
            });
        } else if (m0.n.b.i.a(bVar, f1.a)) {
            ReportIncidentAddDetailsViewModel O0 = this.d.O0();
            final ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = this.d;
            v.v2(O0, new l<k0, i>() {
                public Object invoke(Object obj) {
                    k0 k0Var = (k0) obj;
                    m0.n.b.i.e(k0Var, "state");
                    ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = reportIncidentAddDetailsFragment;
                    ReportIncidentThanksArgs reportIncidentThanksArgs = new ReportIncidentThanksArgs(k0Var.h, k0Var.c);
                    m0.n.b.i.e(reportIncidentThanksArgs, "mavericksArg");
                    v.a1(reportIncidentAddDetailsFragment, new i0(reportIncidentThanksArgs), (q) null, 2);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
