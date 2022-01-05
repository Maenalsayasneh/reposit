package com.clubhouse.android.ui.profile.reports;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.b3.b.d;
import i0.e.b.g3.u.y5.d0;
import i0.e.b.g3.u.y5.f0;
import i0.e.b.g3.u.y5.k0;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentAddDetailsViewModel.kt */
public final class ReportIncidentAddDetailsViewModel extends i0.e.b.a3.b.a<k0> {
    public static final /* synthetic */ int m = 0;
    public final Context n;
    public final UserRepo o;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsViewModel$1", f = "ReportIncidentAddDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsViewModel$1  reason: invalid class name */
    /* compiled from: ReportIncidentAddDetailsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ReportIncidentAddDetailsViewModel d;

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
                ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel = this.d;
                AnonymousClass1 r1 = new l<k0, k0>() {
                    public Object invoke(Object obj) {
                        k0 k0Var = (k0) obj;
                        i.e(k0Var, "$this$setState");
                        return k0.copy$default(k0Var, (User) null, (List) null, (String) null, (Channel) null, (String) null, (Integer) null, ((d0) cVar).a, (ReportTarget) null, 191, (Object) null);
                    }
                };
                int i = ReportIncidentAddDetailsViewModel.m;
                reportIncidentAddDetailsViewModel.m(r1);
            } else if (cVar instanceof f0) {
                final ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel2 = this.d;
                AnonymousClass3 r12 = new l<k0, m0.i>() {
                    public Object invoke(Object obj) {
                        d dVar;
                        k0 k0Var = (k0) obj;
                        i.e(k0Var, "state");
                        ReportIncidentAddDetailsViewModel reportIncidentAddDetailsViewModel = reportIncidentAddDetailsViewModel2;
                        f0 f0Var = (f0) cVar;
                        String str = f0Var.a;
                        String str2 = f0Var.b;
                        String str3 = f0Var.c;
                        Channel channel = f0Var.d;
                        Integer num = f0Var.e;
                        String str4 = f0Var.f;
                        Integer num2 = f0Var.g;
                        Integer num3 = f0Var.h;
                        String str5 = f0Var.i;
                        Uri uri = k0Var.g;
                        ContentResolver contentResolver = reportIncidentAddDetailsViewModel.n.getContentResolver();
                        if (uri == null) {
                            dVar = null;
                        } else {
                            i.d(contentResolver, "contentResolver");
                            dVar = new d(contentResolver, uri);
                        }
                        reportIncidentAddDetailsViewModel.n(new ReportIncidentAddDetailsViewModel$reportIncident$1(reportIncidentAddDetailsViewModel, str, str2, str3, num, str4, num2, num3, str5, dVar));
                        return m0.i.a;
                    }
                };
                int i2 = ReportIncidentAddDetailsViewModel.m;
                reportIncidentAddDetailsViewModel2.n(r12);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentAddDetailsViewModel(k0 k0Var, Context context, i0.e.b.f3.i.a aVar, i0.e.a.a aVar2) {
        super(k0Var);
        i.e(k0Var, "initialState");
        i.e(context, "applicationContext");
        i.e(aVar, "userComponentHandler");
        i.e(aVar2, "analytics");
        this.n = context;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        ((AmplitudeAnalytics) aVar2).a("Channel-ReportIncident");
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: ReportIncidentAddDetailsViewModel.kt */
    public static final class a implements v<ReportIncidentAddDetailsViewModel, k0> {
        public final /* synthetic */ i0.e.b.c3.h.c<ReportIncidentAddDetailsViewModel, k0> a = new i0.e.b.c3.h.c<>(ReportIncidentAddDetailsViewModel.class);

        public a() {
        }

        public ReportIncidentAddDetailsViewModel create(j0 j0Var, k0 k0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(k0Var, "state");
            return this.a.create(j0Var, k0Var);
        }

        public k0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
