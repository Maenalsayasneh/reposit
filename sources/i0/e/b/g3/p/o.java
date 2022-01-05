package i0.e.b.g3.p;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: HallwayFragmentDirections.kt */
public final class o implements l {
    public final ReportIncidentSelectCategoryArgs a;

    public o(ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs) {
        i.e(reportIncidentSelectCategoryArgs, "mavericksArg");
        this.a = reportIncidentSelectCategoryArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReportIncidentSelectCategoryArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ReportIncidentSelectCategoryArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ReportIncidentSelectCategoryArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_feedFragment_to_reportIncidentSelectCategoryFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.a, ((o) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionFeedFragmentToReportIncidentSelectCategoryFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
