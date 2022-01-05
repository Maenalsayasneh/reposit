package i0.e.b.g3.u.y5;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectSubCategoryArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectCategoryFragmentDirections.kt */
public final class n0 implements l {
    public final ReportIncidentSelectSubCategoryArgs a;

    public n0(ReportIncidentSelectSubCategoryArgs reportIncidentSelectSubCategoryArgs) {
        i.e(reportIncidentSelectSubCategoryArgs, "mavericksArg");
        this.a = reportIncidentSelectSubCategoryArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReportIncidentSelectSubCategoryArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ReportIncidentSelectSubCategoryArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ReportIncidentSelectSubCategoryArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_reportIncidentSelectCategoryFragment_to_reportIncidentSelectSubCategoryFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && i.a(this.a, ((n0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionReportIncidentSelectCategoryFragmentToReportIncidentSelectSubCategoryFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
