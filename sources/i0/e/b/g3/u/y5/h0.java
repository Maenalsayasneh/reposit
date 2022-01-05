package i0.e.b.g3.u.y5;

import com.clubhouse.android.data.models.local.user.ReportReason;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ReportProfileLegacyViewModel.kt */
public final class h0 implements c {
    public final ReportReason a;
    public final String b;
    public final String c;

    public h0(ReportReason reportReason, String str, String str2) {
        this.a = reportReason;
        this.b = str;
        this.c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.a == h0Var.a && i.a(this.b, h0Var.b) && i.a(this.c, h0Var.c);
    }

    public int hashCode() {
        ReportReason reportReason = this.a;
        int i = 0;
        int hashCode = (reportReason == null ? 0 : reportReason.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportIncident(incidentType=");
        P0.append(this.a);
        P0.append(", incidentDescription=");
        P0.append(this.b);
        P0.append(", email=");
        return a.w0(P0, this.c, ')');
    }
}
