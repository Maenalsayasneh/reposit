package com.clubhouse.android.ui.profile.reports;

import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.Banner;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.d3.k;
import i0.e.b.g3.u.y5.g1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment$onViewCreated$1", f = "ReportProfileLegacyFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ReportProfileLegacyFragment.kt */
public final class ReportProfileLegacyFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ReportProfileLegacyFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportProfileLegacyFragment$onViewCreated$1(ReportProfileLegacyFragment reportProfileLegacyFragment, m0.l.c<? super ReportProfileLegacyFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = reportProfileLegacyFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ReportProfileLegacyFragment$onViewCreated$1 reportProfileLegacyFragment$onViewCreated$1 = new ReportProfileLegacyFragment$onViewCreated$1(this.d, cVar);
        reportProfileLegacyFragment$onViewCreated$1.c = obj;
        return reportProfileLegacyFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ReportProfileLegacyFragment$onViewCreated$1 reportProfileLegacyFragment$onViewCreated$1 = new ReportProfileLegacyFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        reportProfileLegacyFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        reportProfileLegacyFragment$onViewCreated$1.invokeSuspend(iVar);
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
        } else if (m0.n.b.i.a(bVar, g1.a)) {
            FrameLayout frameLayout = this.d.N0().j;
            m0.n.b.i.d(frameLayout, "binding.loading");
            k.p(frameLayout);
            ScrollView scrollView = this.d.N0().g;
            m0.n.b.i.d(scrollView, "binding.contentContainer");
            k.p(scrollView);
            ConstraintLayout constraintLayout = this.d.N0().n;
            m0.n.b.i.d(constraintLayout, "binding.successContainer");
            k.K(constraintLayout);
        }
        return i.a;
    }
}
