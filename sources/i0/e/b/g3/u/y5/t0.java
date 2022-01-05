package i0.e.b.g3.u.y5;

import android.net.Uri;
import com.clubhouse.android.data.models.local.IncidentChannel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelArgs;
import com.clubhouse.android.user.model.User;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectChannelViewModel.kt */
public final class t0 implements j {
    public final User a;
    public final List<IncidentChannel> b;
    public final Boolean c;
    public final Uri d;

    public t0(User user, List<IncidentChannel> list, Boolean bool, Uri uri) {
        i.e(user, "user");
        i.e(list, "incidentChannels");
        this.a = user;
        this.b = list;
        this.c = bool;
        this.d = uri;
    }

    public static t0 copy$default(t0 t0Var, User user, List<IncidentChannel> list, Boolean bool, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            user = t0Var.a;
        }
        if ((i & 2) != 0) {
            list = t0Var.b;
        }
        if ((i & 4) != 0) {
            bool = t0Var.c;
        }
        if ((i & 8) != 0) {
            uri = t0Var.d;
        }
        Objects.requireNonNull(t0Var);
        i.e(user, "user");
        i.e(list, "incidentChannels");
        return new t0(user, list, bool, uri);
    }

    public final User component1() {
        return this.a;
    }

    public final List<IncidentChannel> component2() {
        return this.b;
    }

    public final Boolean component3() {
        return this.c;
    }

    public final Uri component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return i.a(this.a, t0Var.a) && i.a(this.b, t0Var.b) && i.a(this.c, t0Var.c) && i.a(this.d, t0Var.d);
    }

    public int hashCode() {
        int H = a.H(this.b, this.a.hashCode() * 31, 31);
        Boolean bool = this.c;
        int i = 0;
        int hashCode = (H + (bool == null ? 0 : bool.hashCode())) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportIncidentSelectChannelState(user=");
        P0.append(this.a);
        P0.append(", incidentChannels=");
        P0.append(this.b);
        P0.append(", isEmpty=");
        P0.append(this.c);
        P0.append(", reportImageUri=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t0(ReportIncidentSelectChannelArgs reportIncidentSelectChannelArgs) {
        this(reportIncidentSelectChannelArgs.c, (List) null, (Boolean) null, reportIncidentSelectChannelArgs.d, 6, (f) null);
        i.e(reportIncidentSelectChannelArgs, "args");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t0(User user, List list, Boolean bool, Uri uri, int i, f fVar) {
        this(user, (i & 2) != 0 ? EmptyList.c : list, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : uri);
    }
}
