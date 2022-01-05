package i0.e.b.g3.u.y5;

import android.content.Context;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectSubCategoryViewModel$loadAllIncidentsCategories$1;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.c3.h.c;
import i0.j.f.p.h;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectSubCategoryViewModel.kt */
public final class y0 extends i0.e.b.a3.b.a<x0> {
    public static final /* synthetic */ int m = 0;
    public final UserRepo n;

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(x0 x0Var, Context context, i0.e.b.f3.i.a aVar) {
        super(x0Var);
        i.e(x0Var, "initialState");
        i.e(context, "applicationContext");
        i.e(aVar, "userComponentHandler");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).c();
        n(new ReportIncidentSelectSubCategoryViewModel$loadAllIncidentsCategories$1(this));
    }

    /* compiled from: ReportIncidentSelectSubCategoryViewModel.kt */
    public static final class a implements v<y0, x0> {
        public final /* synthetic */ c<y0, x0> a = new c<>(y0.class);

        public a() {
        }

        public y0 create(j0 j0Var, x0 x0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(x0Var, "state");
            return this.a.create(j0Var, x0Var);
        }

        public x0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
