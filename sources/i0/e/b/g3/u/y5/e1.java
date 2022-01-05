package i0.e.b.g3.u.y5;

import android.net.Uri;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyArgs;
import com.clubhouse.android.user.model.User;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportProfileLegacyViewModel.kt */
public final class e1 implements j {
    public final User a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Uri e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e1(ReportProfileLegacyArgs reportProfileLegacyArgs) {
        this(reportProfileLegacyArgs.c, reportProfileLegacyArgs.d, reportProfileLegacyArgs.q, reportProfileLegacyArgs.x, (Uri) null, 16, (f) null);
        i.e(reportProfileLegacyArgs, "args");
    }

    public static e1 copy$default(e1 e1Var, User user, String str, boolean z, boolean z2, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            user = e1Var.a;
        }
        if ((i & 2) != 0) {
            str = e1Var.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = e1Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = e1Var.d;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            uri = e1Var.e;
        }
        Uri uri2 = uri;
        Objects.requireNonNull(e1Var);
        i.e(user, "user");
        return new e1(user, str2, z3, z4, uri2);
    }

    public final User component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final Uri component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return i.a(this.a, e1Var.a) && i.a(this.b, e1Var.b) && this.c == e1Var.c && this.d == e1Var.d && i.a(this.e, e1Var.e);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.d;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Uri uri = this.e;
        if (uri != null) {
            i = uri.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportProfileLegacyState(user=");
        P0.append(this.a);
        P0.append(", channel=");
        P0.append(this.b);
        P0.append(", isModerator=");
        P0.append(this.c);
        P0.append(", isSpeaker=");
        P0.append(this.d);
        P0.append(", photoUri=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }

    public e1(User user, String str, boolean z, boolean z2, Uri uri) {
        i.e(user, "user");
        this.a = user;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = uri;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(User user, String str, boolean z, boolean z2, Uri uri, int i, f fVar) {
        this(user, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : uri);
    }
}
