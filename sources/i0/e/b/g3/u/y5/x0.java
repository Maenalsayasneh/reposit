package i0.e.b.g3.u.y5;

import android.net.Uri;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectSubCategoryArgs;
import com.clubhouse.android.user.model.User;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectSubCategoryViewModel.kt */
public final class x0 implements j {
    public final User a;
    public final IncidentCategory b;
    public final List<IncidentCategory> c;
    public final String d;
    public final Channel e;
    public final String f;
    public final Integer g;
    public final Uri h;
    public final ReportTarget i;

    public x0(User user, IncidentCategory incidentCategory, List<IncidentCategory> list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget) {
        i.e(incidentCategory, "parentIncidentCategory");
        i.e(list, "incidentCategories");
        i.e(reportTarget, "reportTarget");
        this.a = user;
        this.b = incidentCategory;
        this.c = list;
        this.d = str;
        this.e = channel;
        this.f = str2;
        this.g = num;
        this.h = uri;
        this.i = reportTarget;
    }

    public static x0 copy$default(x0 x0Var, User user, IncidentCategory incidentCategory, List list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget, int i2, Object obj) {
        x0 x0Var2 = x0Var;
        int i3 = i2;
        User user2 = (i3 & 1) != 0 ? x0Var2.a : user;
        IncidentCategory incidentCategory2 = (i3 & 2) != 0 ? x0Var2.b : incidentCategory;
        List list2 = (i3 & 4) != 0 ? x0Var2.c : list;
        String str3 = (i3 & 8) != 0 ? x0Var2.d : str;
        Channel channel2 = (i3 & 16) != 0 ? x0Var2.e : channel;
        String str4 = (i3 & 32) != 0 ? x0Var2.f : str2;
        Integer num2 = (i3 & 64) != 0 ? x0Var2.g : num;
        Uri uri2 = (i3 & 128) != 0 ? x0Var2.h : uri;
        ReportTarget reportTarget2 = (i3 & 256) != 0 ? x0Var2.i : reportTarget;
        Objects.requireNonNull(x0Var);
        i.e(incidentCategory2, "parentIncidentCategory");
        i.e(list2, "incidentCategories");
        i.e(reportTarget2, "reportTarget");
        return new x0(user2, incidentCategory2, list2, str3, channel2, str4, num2, uri2, reportTarget2);
    }

    public final User component1() {
        return this.a;
    }

    public final IncidentCategory component2() {
        return this.b;
    }

    public final List<IncidentCategory> component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final Channel component5() {
        return this.e;
    }

    public final String component6() {
        return this.f;
    }

    public final Integer component7() {
        return this.g;
    }

    public final Uri component8() {
        return this.h;
    }

    public final ReportTarget component9() {
        return this.i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return i.a(this.a, x0Var.a) && i.a(this.b, x0Var.b) && i.a(this.c, x0Var.c) && i.a(this.d, x0Var.d) && i.a(this.e, x0Var.e) && i.a(this.f, x0Var.f) && i.a(this.g, x0Var.g) && i.a(this.h, x0Var.h) && this.i == x0Var.i;
    }

    public int hashCode() {
        User user = this.a;
        int i2 = 0;
        int H = a.H(this.c, (this.b.hashCode() + ((user == null ? 0 : user.hashCode()) * 31)) * 31, 31);
        String str = this.d;
        int hashCode = (H + (str == null ? 0 : str.hashCode())) * 31;
        Channel channel = this.e;
        int hashCode2 = (hashCode + (channel == null ? 0 : channel.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.h;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return this.i.hashCode() + ((hashCode4 + i2) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ReportIncidentSelectSubCategoryState(user=");
        P0.append(this.a);
        P0.append(", parentIncidentCategory=");
        P0.append(this.b);
        P0.append(", incidentCategories=");
        P0.append(this.c);
        P0.append(", channelId=");
        P0.append(this.d);
        P0.append(", channel=");
        P0.append(this.e);
        P0.append(", reportedChatId=");
        P0.append(this.f);
        P0.append(", reportedMessageId=");
        P0.append(this.g);
        P0.append(", reportImageUri=");
        P0.append(this.h);
        P0.append(", reportTarget=");
        P0.append(this.i);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public x0(ReportIncidentSelectSubCategoryArgs reportIncidentSelectSubCategoryArgs) {
        this(reportIncidentSelectSubCategoryArgs.c, reportIncidentSelectSubCategoryArgs.d, (List) null, reportIncidentSelectSubCategoryArgs.q, reportIncidentSelectSubCategoryArgs.x, reportIncidentSelectSubCategoryArgs.y, reportIncidentSelectSubCategoryArgs.Y1, reportIncidentSelectSubCategoryArgs.Z1, reportIncidentSelectSubCategoryArgs.a2, 4, (f) null);
        i.e(reportIncidentSelectSubCategoryArgs, "args");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x0(com.clubhouse.android.user.model.User r13, com.clubhouse.android.data.models.local.IncidentCategory r14, java.util.List r15, java.lang.String r16, com.clubhouse.android.data.models.local.channel.Channel r17, java.lang.String r18, java.lang.Integer r19, android.net.Uri r20, com.clubhouse.android.data.models.local.ReportTarget r21, int r22, m0.n.b.f r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000a
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            r5 = r1
            goto L_0x000b
        L_0x000a:
            r5 = r15
        L_0x000b:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r16
        L_0x0014:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001a
            r7 = r2
            goto L_0x001c
        L_0x001a:
            r7 = r17
        L_0x001c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0022
            r8 = r2
            goto L_0x0024
        L_0x0022:
            r8 = r18
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r9 = r2
            goto L_0x002c
        L_0x002a:
            r9 = r19
        L_0x002c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0032
            r10 = r2
            goto L_0x0034
        L_0x0032:
            r10 = r20
        L_0x0034:
            r2 = r12
            r3 = r13
            r4 = r14
            r11 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.y5.x0.<init>(com.clubhouse.android.user.model.User, com.clubhouse.android.data.models.local.IncidentCategory, java.util.List, java.lang.String, com.clubhouse.android.data.models.local.channel.Channel, java.lang.String, java.lang.Integer, android.net.Uri, com.clubhouse.android.data.models.local.ReportTarget, int, m0.n.b.f):void");
    }
}
