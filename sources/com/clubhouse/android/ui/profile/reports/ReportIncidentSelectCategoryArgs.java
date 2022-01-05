package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.user.model.User;
import m0.n.b.i;

/* compiled from: ReportsNavigation.kt */
public final class ReportIncidentSelectCategoryArgs implements Parcelable {
    public static final Parcelable.Creator<ReportIncidentSelectCategoryArgs> CREATOR = new a();
    public final Uri Y1;
    public final ReportTarget Z1;
    public final User c;
    public final String d;
    public final Channel q;
    public final String x;
    public final Integer y;

    /* compiled from: ReportsNavigation.kt */
    public static final class a implements Parcelable.Creator<ReportIncidentSelectCategoryArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ReportIncidentSelectCategoryArgs((User) parcel.readParcelable(ReportIncidentSelectCategoryArgs.class.getClassLoader()), parcel.readString(), (Channel) parcel.readParcelable(ReportIncidentSelectCategoryArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(ReportIncidentSelectCategoryArgs.class.getClassLoader()), ReportTarget.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new ReportIncidentSelectCategoryArgs[i];
        }
    }

    public ReportIncidentSelectCategoryArgs(User user, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget) {
        i.e(reportTarget, "reportTarget");
        this.c = user;
        this.d = str;
        this.q = channel;
        this.x = str2;
        this.y = num;
        this.Y1 = uri;
        this.Z1 = reportTarget;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportIncidentSelectCategoryArgs)) {
            return false;
        }
        ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs = (ReportIncidentSelectCategoryArgs) obj;
        return i.a(this.c, reportIncidentSelectCategoryArgs.c) && i.a(this.d, reportIncidentSelectCategoryArgs.d) && i.a(this.q, reportIncidentSelectCategoryArgs.q) && i.a(this.x, reportIncidentSelectCategoryArgs.x) && i.a(this.y, reportIncidentSelectCategoryArgs.y) && i.a(this.Y1, reportIncidentSelectCategoryArgs.Y1) && this.Z1 == reportIncidentSelectCategoryArgs.Z1;
    }

    public int hashCode() {
        User user = this.c;
        int i = 0;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Channel channel = this.q;
        int hashCode3 = (hashCode2 + (channel == null ? 0 : channel.hashCode())) * 31;
        String str2 = this.x;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.y;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.Y1;
        if (uri != null) {
            i = uri.hashCode();
        }
        return this.Z1.hashCode() + ((hashCode5 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportIncidentSelectCategoryArgs(user=");
        P0.append(this.c);
        P0.append(", channelId=");
        P0.append(this.d);
        P0.append(", channel=");
        P0.append(this.q);
        P0.append(", reportedChatId=");
        P0.append(this.x);
        P0.append(", reportedMessageId=");
        P0.append(this.y);
        P0.append(", reportImageUri=");
        P0.append(this.Y1);
        P0.append(", reportTarget=");
        P0.append(this.Z1);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.q, i);
        parcel.writeString(this.x);
        Integer num = this.y;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.Y1, i);
        parcel.writeString(this.Z1.name());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReportIncidentSelectCategoryArgs(User user, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget, int i) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : channel, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : uri, reportTarget);
    }
}
