package com.clubhouse.android.ui.profile.reports;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.ReportReason;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.y5.d0;
import i0.e.b.g3.u.y5.e1;
import i0.e.b.g3.u.y5.h0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportProfileLegacyViewModel.kt */
public final class ReportProfileLegacyViewModel extends i0.e.b.a3.b.a<e1> {
    public static final /* synthetic */ int m = 0;
    public final Context n;
    public final UserRepo o;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportProfileLegacyViewModel$1", f = "ReportProfileLegacyViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportProfileLegacyViewModel$1  reason: invalid class name */
    /* compiled from: ReportProfileLegacyViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ReportProfileLegacyViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final c cVar = (c) this.c;
            if (cVar instanceof d0) {
                ReportProfileLegacyViewModel reportProfileLegacyViewModel = this.d;
                AnonymousClass1 r1 = new l<e1, e1>() {
                    public Object invoke(Object obj) {
                        e1 e1Var = (e1) obj;
                        i.e(e1Var, "$this$setState");
                        return e1.copy$default(e1Var, (User) null, (String) null, false, false, ((d0) cVar).a, 15, (Object) null);
                    }
                };
                int i = ReportProfileLegacyViewModel.m;
                reportProfileLegacyViewModel.m(r1);
            } else if (cVar instanceof h0) {
                h0 h0Var = (h0) cVar;
                String str = h0Var.c;
                if (str == null || StringsKt__IndentKt.o(str)) {
                    ReportProfileLegacyViewModel reportProfileLegacyViewModel2 = this.d;
                    reportProfileLegacyViewModel2.o(new d(reportProfileLegacyViewModel2.n.getString(R.string.report_error_email)));
                } else {
                    ReportReason reportReason = h0Var.a;
                    if (reportReason == null || reportReason == ReportReason.BLANK) {
                        ReportProfileLegacyViewModel reportProfileLegacyViewModel3 = this.d;
                        reportProfileLegacyViewModel3.o(new d(reportProfileLegacyViewModel3.n.getString(R.string.report_error_reason)));
                    } else {
                        final ReportProfileLegacyViewModel reportProfileLegacyViewModel4 = this.d;
                        AnonymousClass3 r12 = new l<e1, m0.i>() {
                            public Object invoke(Object obj) {
                                i0.e.b.b3.b.d dVar;
                                e1 e1Var = (e1) obj;
                                i.e(e1Var, "state");
                                ReportProfileLegacyViewModel reportProfileLegacyViewModel = reportProfileLegacyViewModel4;
                                h0 h0Var = (h0) cVar;
                                ReportReason reportReason = h0Var.a;
                                String str = h0Var.b;
                                String str2 = h0Var.c;
                                Uri uri = e1Var.e;
                                ContentResolver contentResolver = reportProfileLegacyViewModel.n.getContentResolver();
                                if (uri == null) {
                                    dVar = null;
                                } else {
                                    i.d(contentResolver, "contentResolver");
                                    dVar = new i0.e.b.b3.b.d(contentResolver, uri);
                                }
                                reportProfileLegacyViewModel.n(new ReportProfileLegacyViewModel$reportIncident$1(reportProfileLegacyViewModel, reportReason, str, str2, dVar));
                                return m0.i.a;
                            }
                        };
                        int i2 = ReportProfileLegacyViewModel.m;
                        reportProfileLegacyViewModel4.n(r12);
                    }
                }
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportProfileLegacyViewModel(e1 e1Var, Context context, i0.e.b.f3.i.a aVar, i0.e.a.a aVar2) {
        super(e1Var);
        i.e(e1Var, "initialState");
        i.e(context, "applicationContext");
        i.e(aVar, "userComponentHandler");
        i.e(aVar2, "analytics");
        this.n = context;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        ((AmplitudeAnalytics) aVar2).a("Channel-ReportIncident");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: ReportProfileLegacyViewModel.kt */
    public static final class a implements v<ReportProfileLegacyViewModel, e1> {
        public final /* synthetic */ i0.e.b.c3.h.c<ReportProfileLegacyViewModel, e1> a = new i0.e.b.c3.h.c<>(ReportProfileLegacyViewModel.class);

        public a() {
        }

        public ReportProfileLegacyViewModel create(j0 j0Var, e1 e1Var) {
            i.e(j0Var, "viewModelContext");
            i.e(e1Var, "state");
            return this.a.create(j0Var, e1Var);
        }

        public e1 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
