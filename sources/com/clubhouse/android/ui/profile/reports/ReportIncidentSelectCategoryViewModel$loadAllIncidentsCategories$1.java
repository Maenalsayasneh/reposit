package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.remote.response.GetIncidentCategoriesResponse;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.r.n1;
import i0.e.b.g3.u.y5.p0;
import i0.e.b.g3.u.y5.q0;
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

/* compiled from: ReportIncidentSelectCategoryViewModel.kt */
public final class ReportIncidentSelectCategoryViewModel$loadAllIncidentsCategories$1 extends Lambda implements l<p0, i> {
    public final /* synthetic */ q0 c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryViewModel$loadAllIncidentsCategories$1$1", f = "ReportIncidentSelectCategoryViewModel.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryViewModel$loadAllIncidentsCategories$1$1  reason: invalid class name */
    /* compiled from: ReportIncidentSelectCategoryViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super GetIncidentCategoriesResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(p0Var, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(p0Var, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                UserRepo userRepo = q0.this.n;
                ReportTarget reportTarget = p0Var.h;
                this.c = 1;
                obj = userRepo.l((IncidentCategory) null, reportTarget, this);
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
    public ReportIncidentSelectCategoryViewModel$loadAllIncidentsCategories$1(q0 q0Var) {
        super(1);
        this.c = q0Var;
    }

    public Object invoke(Object obj) {
        final p0 p0Var = (p0) obj;
        m0.n.b.i.e(p0Var, "state");
        final q0 q0Var = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final q0 q0Var2 = this.c;
        MavericksViewModel.f(q0Var, r2, (d0) null, (m) null, new p<p0, b<? extends GetIncidentCategoriesResponse>, p0>() {
            public Object invoke(Object obj, Object obj2) {
                p0 p0Var = (p0) obj;
                final b bVar = (b) obj2;
                m0.n.b.i.e(p0Var, "$this$execute");
                m0.n.b.i.e(bVar, "it");
                if (bVar instanceof f0) {
                    q0 q0Var = q0.this;
                    AnonymousClass1 r1 = new l<p0, p0>() {
                        public Object invoke(Object obj) {
                            p0 p0Var = (p0) obj;
                            m0.n.b.i.e(p0Var, "$this$setState");
                            return p0.copy$default(p0Var, (User) null, ((GetIncidentCategoriesResponse) ((f0) bVar).b).a, (String) null, (Channel) null, (String) null, (Integer) null, (Uri) null, (ReportTarget) null, 253, (Object) null);
                        }
                    };
                    int i = q0.m;
                    q0Var.m(r1);
                } else if (bVar instanceof i0.b.b.c) {
                    q0 q0Var2 = q0.this;
                    n1 n1Var = n1.a;
                    int i2 = q0.m;
                    q0Var2.o(n1Var);
                }
                return p0Var;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
