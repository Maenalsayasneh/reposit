package i0.e.b.g3.u.y5;

import android.content.Context;
import android.content.res.Resources;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelViewModel$loadAllReportableChannels$1;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.c3.h.c;
import i0.j.f.p.h;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectChannelViewModel.kt */
public final class u0 extends i0.e.b.a3.b.a<t0> {
    public static final /* synthetic */ int m = 0;
    public final Resources n;
    public final UserRepo o;

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(t0 t0Var, Context context, Resources resources, i0.e.b.f3.i.a aVar) {
        super(t0Var);
        i.e(t0Var, "initialState");
        i.e(context, "applicationContext");
        i.e(resources, "resources");
        i.e(aVar, "userComponentHandler");
        this.n = resources;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        n(new ReportIncidentSelectChannelViewModel$loadAllReportableChannels$1(this));
    }

    /* compiled from: ReportIncidentSelectChannelViewModel.kt */
    public static final class a implements v<u0, t0> {
        public final /* synthetic */ c<u0, t0> a = new c<>(u0.class);

        public a() {
        }

        public u0 create(j0 j0Var, t0 t0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(t0Var, "state");
            return this.a.create(j0Var, t0Var);
        }

        public t0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
