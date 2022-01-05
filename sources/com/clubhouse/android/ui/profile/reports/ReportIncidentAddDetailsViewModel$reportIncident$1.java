package com.clubhouse.android.ui.profile.reports;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.b3.b.d;
import i0.e.b.g3.u.y5.f1;
import i0.e.b.g3.u.y5.k0;
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

/* compiled from: ReportIncidentAddDetailsViewModel.kt */
public final class ReportIncidentAddDetailsViewModel$reportIncident$1 extends Lambda implements l<k0, i> {
    public final /* synthetic */ String Y1;
    public final /* synthetic */ Integer Z1;
    public final /* synthetic */ Integer a2;
    public final /* synthetic */ String b2;
    public final /* synthetic */ ReportIncidentAddDetailsViewModel c;
    public final /* synthetic */ d c2;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;
    public final /* synthetic */ String x;
    public final /* synthetic */ Integer y;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsViewModel$reportIncident$1$1", f = "ReportIncidentAddDetailsViewModel.kt", l = {132}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsViewModel$reportIncident$1$1  reason: invalid class name */
    /* compiled from: ReportIncidentAddDetailsViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(str, str2, str3, num, str4, num2, num3, str5, dVar, cVar);
        }

        public Object invoke(Object obj) {
            return ((AnonymousClass1) create((c) obj)).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                UserRepo userRepo = ReportIncidentAddDetailsViewModel.this.o;
                String str = str;
                String str2 = str2;
                String str3 = str3;
                Integer num = num;
                String str4 = str4;
                Integer num2 = num2;
                Integer num3 = num3;
                String str5 = str5;
                d dVar = dVar;
                this.c = 1;
                obj = userRepo.d(str, str2, str3, num, str4, num2, num3, str5, dVar, this);
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
    public ReportIncidentAddDetailsViewModel$reportIncident$1(ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel, String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, d dVar) {
        super(1);
        this.c = reportIncidentAddDetailsViewModel;
        this.d = str;
        this.q = str2;
        this.x = str3;
        this.y = num;
        this.Y1 = str4;
        this.Z1 = num2;
        this.a2 = num3;
        this.b2 = str5;
        this.c2 = dVar;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((k0) obj, "state");
        ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel = this.c;
        final String str = this.d;
        final String str2 = this.q;
        final String str3 = this.x;
        final Integer num = this.y;
        final String str4 = this.Y1;
        final Integer num2 = this.Z1;
        final Integer num3 = this.a2;
        final String str5 = this.b2;
        final d dVar = this.c2;
        final ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel2 = reportIncidentAddDetailsViewModel;
        AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel3 = this.c;
        MavericksViewModel.f(reportIncidentAddDetailsViewModel, r1, (d0) null, (m) null, new p<k0, b<? extends EmptySuccessResponse>, k0>() {
            public Object invoke(Object obj, Object obj2) {
                k0 k0Var = (k0) obj;
                b bVar = (b) obj2;
                m0.n.b.i.e(k0Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel = ReportIncidentAddDetailsViewModel.this;
                    f1 f1Var = f1.a;
                    int i = ReportIncidentAddDetailsViewModel.m;
                    reportIncidentAddDetailsViewModel.o(f1Var);
                }
                if (bVar instanceof i0.b.b.c) {
                    ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel2 = ReportIncidentAddDetailsViewModel.this;
                    String message = ((i0.b.b.c) bVar).b.getMessage();
                    if (message == null) {
                        message = ReportIncidentAddDetailsViewModel.this.n.getString(R.string.report_error);
                        m0.n.b.i.d(message, "applicationContext.getString(R.string.report_error)");
                    }
                    i0.e.b.a3.b.d dVar = new i0.e.b.a3.b.d(message);
                    int i2 = ReportIncidentAddDetailsViewModel.m;
                    reportIncidentAddDetailsViewModel2.o(dVar);
                }
                return k0Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
