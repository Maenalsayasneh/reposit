package i0.e.b.g3.u.y5;

import android.net.Uri;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.user.model.User;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentAddDetailsViewModel.kt */
public final class k0 implements j {
    public final User a;
    public final List<IncidentCategory> b;
    public final String c;
    public final Channel d;
    public final String e;
    public final Integer f;
    public final Uri g;
    public final ReportTarget h;

    public k0(User user, List<IncidentCategory> list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget) {
        i.e(list, "parentsIncidentCategories");
        i.e(reportTarget, "reportTarget");
        this.a = user;
        this.b = list;
        this.c = str;
        this.d = channel;
        this.e = str2;
        this.f = num;
        this.g = uri;
        this.h = reportTarget;
    }

    public static k0 copy$default(k0 k0Var, User user, List list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget, int i, Object obj) {
        k0 k0Var2 = k0Var;
        int i2 = i;
        User user2 = (i2 & 1) != 0 ? k0Var2.a : user;
        List list2 = (i2 & 2) != 0 ? k0Var2.b : list;
        String str3 = (i2 & 4) != 0 ? k0Var2.c : str;
        Channel channel2 = (i2 & 8) != 0 ? k0Var2.d : channel;
        String str4 = (i2 & 16) != 0 ? k0Var2.e : str2;
        Integer num2 = (i2 & 32) != 0 ? k0Var2.f : num;
        Uri uri2 = (i2 & 64) != 0 ? k0Var2.g : uri;
        ReportTarget reportTarget2 = (i2 & 128) != 0 ? k0Var2.h : reportTarget;
        Objects.requireNonNull(k0Var);
        i.e(list2, "parentsIncidentCategories");
        i.e(reportTarget2, "reportTarget");
        return new k0(user2, list2, str3, channel2, str4, num2, uri2, reportTarget2);
    }

    public final User component1() {
        return this.a;
    }

    public final List<IncidentCategory> component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final Channel component4() {
        return this.d;
    }

    public final String component5() {
        return this.e;
    }

    public final Integer component6() {
        return this.f;
    }

    public final Uri component7() {
        return this.g;
    }

    public final ReportTarget component8() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return i.a(this.a, k0Var.a) && i.a(this.b, k0Var.b) && i.a(this.c, k0Var.c) && i.a(this.d, k0Var.d) && i.a(this.e, k0Var.e) && i.a(this.f, k0Var.f) && i.a(this.g, k0Var.g) && this.h == k0Var.h;
    }

    public int hashCode() {
        User user = this.a;
        int i = 0;
        int H = a.H(this.b, (user == null ? 0 : user.hashCode()) * 31, 31);
        String str = this.c;
        int hashCode = (H + (str == null ? 0 : str.hashCode())) * 31;
        Channel channel = this.d;
        int hashCode2 = (hashCode + (channel == null ? 0 : channel.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.g;
        if (uri != null) {
            i = uri.hashCode();
        }
        return this.h.hashCode() + ((hashCode4 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportIncidentAddDetailsState(user=");
        P0.append(this.a);
        P0.append(", parentsIncidentCategories=");
        P0.append(this.b);
        P0.append(", channelId=");
        P0.append(this.c);
        P0.append(", channel=");
        P0.append(this.d);
        P0.append(", reportedChatId=");
        P0.append(this.e);
        P0.append(", reportedMessageId=");
        P0.append(this.f);
        P0.append(", reportImageUri=");
        P0.append(this.g);
        P0.append(", reportTarget=");
        P0.append(this.h);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(User user, List list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget, int i, f fVar) {
        this(user, list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : channel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : uri, reportTarget);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k0(com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsArgs r11) {
        /*
            r10 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r11, r0)
            com.clubhouse.android.user.model.User r2 = r11.c
            java.lang.String r4 = r11.q
            com.clubhouse.android.data.models.local.channel.Channel r5 = r11.x
            java.lang.String r6 = r11.y
            java.lang.Integer r7 = r11.Y1
            com.clubhouse.android.data.models.local.ReportTarget r9 = r11.a2
            android.net.Uri r8 = r11.Z1
            java.util.List<com.clubhouse.android.data.models.local.IncidentCategory> r3 = r11.d
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.y5.k0.<init>(com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsArgs):void");
    }
}
