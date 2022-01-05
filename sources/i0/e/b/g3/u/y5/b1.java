package i0.e.b.g3.u.y5;

import android.os.Bundle;
import android.os.Parcelable;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelArgs;
import com.clubhouse.app.R;
import h0.t.l;
import i0.d.a.a.a;
import java.io.Serializable;
import m0.n.b.i;

/* compiled from: ReportProfileFragmentDirections.kt */
public final class b1 implements l {
    public final ReportIncidentSelectChannelArgs a;

    public b1(ReportIncidentSelectChannelArgs reportIncidentSelectChannelArgs) {
        i.e(reportIncidentSelectChannelArgs, "mavericksArg");
        this.a = reportIncidentSelectChannelArgs;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(ReportIncidentSelectChannelArgs.class)) {
            bundle.putParcelable("mavericks:arg", this.a);
        } else if (Serializable.class.isAssignableFrom(ReportIncidentSelectChannelArgs.class)) {
            bundle.putSerializable("mavericks:arg", (Serializable) this.a);
        } else {
            throw new UnsupportedOperationException(i.k(ReportIncidentSelectChannelArgs.class.getName(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        return bundle;
    }

    public int b() {
        return R.id.action_reportProfileFragment_to_reportIncidentSelectChannelFragment;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && i.a(this.a, ((b1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ActionReportProfileFragmentToReportIncidentSelectChannelFragment(mavericksArg=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
