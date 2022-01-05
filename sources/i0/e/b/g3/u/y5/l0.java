package i0.e.b.g3.u.y5;

import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectCategoryContainerViewModel.kt */
public final class l0 implements j {
    public final ReportIncidentSelectCategoryArgs a;
    public final boolean b;

    public l0(ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs, boolean z) {
        i.e(reportIncidentSelectCategoryArgs, "args");
        this.a = reportIncidentSelectCategoryArgs;
        this.b = z;
    }

    public static l0 copy$default(l0 l0Var, ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            reportIncidentSelectCategoryArgs = l0Var.a;
        }
        if ((i & 2) != 0) {
            z = l0Var.b;
        }
        Objects.requireNonNull(l0Var);
        i.e(reportIncidentSelectCategoryArgs, "args");
        return new l0(reportIncidentSelectCategoryArgs, z);
    }

    public final ReportIncidentSelectCategoryArgs component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return i.a(this.a, l0Var.a) && this.b == l0Var.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportIncidentSelectCategoryContainerViewState(args=");
        P0.append(this.a);
        P0.append(", expanded=");
        return a.C0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs, boolean z, int i, f fVar) {
        this(reportIncidentSelectCategoryArgs, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l0(ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs) {
        this(reportIncidentSelectCategoryArgs, false, 2, (f) null);
        i.e(reportIncidentSelectCategoryArgs, "reportIncidentSelectCategoryArgs");
    }
}
