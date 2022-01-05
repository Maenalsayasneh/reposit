package i0.e.b.g3.u.y5;

import android.content.Context;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryViewModel$loadAllIncidentsCategories$1;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.c3.h.c;
import i0.j.f.p.h;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectCategoryViewModel.kt */
public final class q0 extends i0.e.b.a3.b.a<p0> {
    public static final /* synthetic */ int m = 0;
    public final UserRepo n;

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(p0 p0Var, Context context, i0.e.b.f3.i.a aVar) {
        super(p0Var);
        i.e(p0Var, "initialState");
        i.e(context, "applicationContext");
        i.e(aVar, "userComponentHandler");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        n(new ReportIncidentSelectCategoryViewModel$loadAllIncidentsCategories$1(this));
    }

    /* compiled from: ReportIncidentSelectCategoryViewModel.kt */
    public static final class a implements v<q0, p0> {
        public final /* synthetic */ c<q0, p0> a = new c<>(q0.class);

        public a() {
        }

        public q0 create(j0 j0Var, p0 p0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(p0Var, "state");
            return this.a.create(j0Var, p0Var);
        }

        public p0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
