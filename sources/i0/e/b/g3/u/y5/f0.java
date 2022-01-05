package i0.e.b.g3.u.y5;

import com.clubhouse.android.data.models.local.channel.Channel;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ReportIncidentAddDetailsViewModel.kt */
public final class f0 implements c {
    public final String a;
    public final String b;
    public final String c;
    public final Channel d;
    public final Integer e = null;
    public final String f;
    public final Integer g;
    public final Integer h;
    public final String i;

    public f0(String str, String str2, String str3, Channel channel, Integer num, String str4, Integer num2, Integer num3, String str5) {
        i.e(str, "category");
        i.e(str5, "target");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = channel;
        this.f = str4;
        this.g = num2;
        this.h = num3;
        this.i = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return i.a(this.a, f0Var.a) && i.a(this.b, f0Var.b) && i.a(this.c, f0Var.c) && i.a(this.d, f0Var.d) && i.a(this.e, f0Var.e) && i.a(this.f, f0Var.f) && i.a(this.g, f0Var.g) && i.a(this.h, f0Var.h) && i.a(this.i, f0Var.i);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Channel channel = this.d;
        int hashCode4 = (hashCode3 + (channel == null ? 0 : channel.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.g;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.h;
        if (num3 != null) {
            i2 = num3.hashCode();
        }
        return this.i.hashCode() + ((hashCode7 + i2) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CreateIncident(category=");
        P0.append(this.a);
        P0.append(", description=");
        P0.append(this.b);
        P0.append(", reportedChannelId=");
        P0.append(this.c);
        P0.append(", reportedChannel=");
        P0.append(this.d);
        P0.append(", reportedClubId=");
        P0.append(this.e);
        P0.append(", reportedChatId=");
        P0.append(this.f);
        P0.append(", reportedMessageId=");
        P0.append(this.g);
        P0.append(", reportedUserId=");
        P0.append(this.h);
        P0.append(", target=");
        return a.x0(P0, this.i, ')');
    }
}
