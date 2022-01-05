package com.clubhouse.android.ui.profile.reports;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.user.ReportReason;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.b3.b.d;
import i0.e.b.g3.u.y5.e1;
import i0.e.b.g3.u.y5.g1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: ReportProfileLegacyViewModel.kt */
public final class ReportProfileLegacyViewModel$reportIncident$1 extends Lambda implements l<e1, i> {
    public final /* synthetic */ ReportProfileLegacyViewModel c;
    public final /* synthetic */ ReportReason d;
    public final /* synthetic */ String q;
    public final /* synthetic */ String x;
    public final /* synthetic */ d y;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportProfileLegacyViewModel$reportIncident$1$1", f = "ReportProfileLegacyViewModel.kt", l = {130}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportProfileLegacyViewModel$reportIncident$1$1  reason: invalid class name */
    /* compiled from: ReportProfileLegacyViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(e1Var, reportReason, str, str2, dVar, cVar);
        }

        public Object invoke(Object obj) {
            return ((AnonymousClass1) create((c) obj)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                UserRepo userRepo = ReportProfileLegacyViewModel.this.o;
                int intValue = e1Var.a.getId().intValue();
                String str = e1Var.b;
                ReportReason reportReason = reportReason;
                String str2 = str;
                String str3 = str2;
                d dVar = dVar;
                this.c = 1;
                obj = userRepo.v(intValue, str, reportReason, str2, str3, dVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportProfileLegacyViewModel$reportIncident$1(ReportProfileLegacyViewModel reportProfileLegacyViewModel, ReportReason reportReason, String str, String str2, d dVar) {
        super(1);
        this.c = reportProfileLegacyViewModel;
        this.d = reportReason;
        this.q = str;
        this.x = str2;
        this.y = dVar;
    }

    public Object invoke(Object obj) {
        final e1 e1Var = (e1) obj;
        m0.n.b.i.e(e1Var, "state");
        ReportProfileLegacyViewModel reportProfileLegacyViewModel = this.c;
        final ReportReason reportReason = this.d;
        final String str = this.q;
        final String str2 = this.x;
        final d dVar = this.y;
        final ReportProfileLegacyViewModel reportProfileLegacyViewModel2 = reportProfileLegacyViewModel;
        AnonymousClass1 r02 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ReportProfileLegacyViewModel reportProfileLegacyViewModel3 = this.c;
        MavericksViewModel.f(reportProfileLegacyViewModel, r02, (d0) null, (m) null, new p<e1, b<? extends EmptySuccessResponse>, e1>() {
            public Object invoke(Object obj, Object obj2) {
                e1 e1Var = (e1) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(e1Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ReportProfileLegacyViewModel reportProfileLegacyViewModel = ReportProfileLegacyViewModel.this;
                    g1 g1Var = g1.a;
                    int i = ReportProfileLegacyViewModel.m;
                    reportProfileLegacyViewModel.o(g1Var);
                }
                if (bVar instanceof i0.b.b.c) {
                    ReportProfileLegacyViewModel reportProfileLegacyViewModel2 = ReportProfileLegacyViewModel.this;
                    String message = ((i0.b.b.c) bVar).b.getMessage();
                    if (message == null) {
                        message = ReportProfileLegacyViewModel.this.n.getString(R.string.report_error);
                        m0.n.b.i.d(message, "applicationContext.getString(R.string.report_error)");
                    }
                    i0.e.b.a3.b.d dVar = new i0.e.b.a3.b.d(message);
                    int i2 = ReportProfileLegacyViewModel.m;
                    reportProfileLegacyViewModel2.o(dVar);
                }
                return e1Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
