package i0.e.b.g3.u.y5;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ReportIncidentAddDetailsFragmentDirections.kt */
public final class i0 implements l {
    public final ReportIncidentThanksArgs a;

    public i0(ReportIncidentThanksArgs reportIncidentThanksArgs) {
        i.e(reportIncidentThanksArgs, "mavericksArg");
        this.a = reportIncidentThanksArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReportIncidentThanksArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ReportIncidentThanksArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ReportIncidentThanksArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_reportIncidentAddDetailsFragment_to_reportIncidentThanksFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && i.a(this.a, ((i0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionReportIncidentAddDetailsFragmentToReportIncidentThanksFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
