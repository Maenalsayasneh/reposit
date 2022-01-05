package i0.e.b.g3.u.y5;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectSubCategoryFragmentDirections.kt */
public final class v0 implements l {
    public final ReportIncidentAddDetailsArgs a;

    public v0(ReportIncidentAddDetailsArgs reportIncidentAddDetailsArgs) {
        i.e(reportIncidentAddDetailsArgs, "mavericksArg");
        this.a = reportIncidentAddDetailsArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReportIncidentAddDetailsArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ReportIncidentAddDetailsArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ReportIncidentAddDetailsArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_reportIncidentSelectSubCategoryFragment_to_reportIncidentAddDetailsFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && i.a(this.a, ((v0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionReportIncidentSelectSubCategoryFragmentToReportIncidentAddDetailsFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
