package i0.e.b.g3.u.y5;

import android.net.Uri;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import com.clubhouse.android.user.model.User;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectCategoryViewModel.kt */
public final class p0 implements j {
    public final User a;
    public final List<IncidentCategory> b;
    public final String c;
    public final Channel d;
    public final String e;
    public final Integer f;
    public final Uri g;
    public final ReportTarget h;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p0(ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs) {
        this(reportIncidentSelectCategoryArgs.c, (List) null, reportIncidentSelectCategoryArgs.d, reportIncidentSelectCategoryArgs.q, reportIncidentSelectCategoryArgs.x, reportIncidentSelectCategoryArgs.y, reportIncidentSelectCategoryArgs.Y1, reportIncidentSelectCategoryArgs.Z1, 2, (f) null);
        i.e(reportIncidentSelectCategoryArgs, "args");
    }

    public static p0 copy$default(p0 p0Var, User user, List list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget, int i, Object obj) {
        p0 p0Var2 = p0Var;
        int i2 = i;
        User user2 = (i2 & 1) != 0 ? p0Var2.a : user;
        List list2 = (i2 & 2) != 0 ? p0Var2.b : list;
        String str3 = (i2 & 4) != 0 ? p0Var2.c : str;
        Channel channel2 = (i2 & 8) != 0 ? p0Var2.d : channel;
        String str4 = (i2 & 16) != 0 ? p0Var2.e : str2;
        Integer num2 = (i2 & 32) != 0 ? p0Var2.f : num;
        Uri uri2 = (i2 & 64) != 0 ? p0Var2.g : uri;
        ReportTarget reportTarget2 = (i2 & 128) != 0 ? p0Var2.h : reportTarget;
        Objects.requireNonNull(p0Var);
        i.e(list2, "incidentCategories");
        i.e(reportTarget2, "reportTarget");
        return new p0(user2, list2, str3, channel2, str4, num2, uri2, reportTarget2);
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
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return i.a(this.a, p0Var.a) && i.a(this.b, p0Var.b) && i.a(this.c, p0Var.c) && i.a(this.d, p0Var.d) && i.a(this.e, p0Var.e) && i.a(this.f, p0Var.f) && i.a(this.g, p0Var.g) && this.h == p0Var.h;
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
        StringBuilder P0 = a.P0("ReportIncidentSelectCategoryState(user=");
        P0.append(this.a);
        P0.append(", incidentCategories=");
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

    public p0(User user, List<IncidentCategory> list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget) {
        i.e(list, "incidentCategories");
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p0(User user, List list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget, int i, f fVar) {
        this(user, (i & 2) != 0 ? EmptyList.c : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : channel, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : uri, reportTarget);
    }
}
