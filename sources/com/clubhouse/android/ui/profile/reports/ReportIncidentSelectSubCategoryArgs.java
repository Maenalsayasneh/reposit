package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.user.model.User;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectSubCategoryFragment.kt */
public final class ReportIncidentSelectSubCategoryArgs implements Parcelable {
    public static final Parcelable.Creator<ReportIncidentSelectSubCategoryArgs> CREATOR = new a();
    public final Integer Y1;
    public final Uri Z1;
    public final ReportTarget a2;
    public final User c;
    public final IncidentCategory d;
    public final String q;
    public final Channel x;
    public final String y;

    /* compiled from: ReportIncidentSelectSubCategoryFragment.kt */
    public static final class a implements Parcelable.Creator<ReportIncidentSelectSubCategoryArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ReportIncidentSelectSubCategoryArgs((User) parcel.readParcelable(ReportIncidentSelectSubCategoryArgs.class.getClassLoader()), (IncidentCategory) parcel.readParcelable(ReportIncidentSelectSubCategoryArgs.class.getClassLoader()), parcel.readString(), (Channel) parcel.readParcelable(ReportIncidentSelectSubCategoryArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(ReportIncidentSelectSubCategoryArgs.class.getClassLoader()), ReportTarget.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new ReportIncidentSelectSubCategoryArgs[i];
        }
    }

    public ReportIncidentSelectSubCategoryArgs(User user, IncidentCategory incidentCategory, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget) {
        i.e(incidentCategory, "parentIncidentCategory");
        i.e(reportTarget, "reportTarget");
        this.c = user;
        this.d = incidentCategory;
        this.q = str;
        this.x = channel;
        this.y = str2;
        this.Y1 = num;
        this.Z1 = uri;
        this.a2 = reportTarget;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportIncidentSelectSubCategoryArgs)) {
            return false;
        }
        ReportIncidentSelectSubCategoryArgs reportIncidentSelectSubCategoryArgs = (ReportIncidentSelectSubCategoryArgs) obj;
        return i.a(this.c, reportIncidentSelectSubCategoryArgs.c) && i.a(this.d, reportIncidentSelectSubCategoryArgs.d) && i.a(this.q, reportIncidentSelectSubCategoryArgs.q) && i.a(this.x, reportIncidentSelectSubCategoryArgs.x) && i.a(this.y, reportIncidentSelectSubCategoryArgs.y) && i.a(this.Y1, reportIncidentSelectSubCategoryArgs.Y1) && i.a(this.Z1, reportIncidentSelectSubCategoryArgs.Z1) && this.a2 == reportIncidentSelectSubCategoryArgs.a2;
    }

    public int hashCode() {
        User user = this.c;
        int i = 0;
        int hashCode = (this.d.hashCode() + ((user == null ? 0 : user.hashCode()) * 31)) * 31;
        String str = this.q;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Channel channel = this.x;
        int hashCode3 = (hashCode2 + (channel == null ? 0 : channel.hashCode())) * 31;
        String str2 = this.y;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.Y1;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.Z1;
        if (uri != null) {
            i = uri.hashCode();
        }
        return this.a2.hashCode() + ((hashCode5 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportIncidentSelectSubCategoryArgs(user=");
        P0.append(this.c);
        P0.append(", parentIncidentCategory=");
        P0.append(this.d);
        P0.append(", channelId=");
        P0.append(this.q);
        P0.append(", channel=");
        P0.append(this.x);
        P0.append(", reportedChatId=");
        P0.append(this.y);
        P0.append(", reportedMessageId=");
        P0.append(this.Y1);
        P0.append(", reportImageUri=");
        P0.append(this.Z1);
        P0.append(", reportTarget=");
        P0.append(this.a2);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.q);
        parcel.writeParcelable(this.x, i);
        parcel.writeString(this.y);
        Integer num = this.Y1;
        if (num == null) {
            i2 = 0;
        } else {
            parcel.writeInt(1);
            i2 = num.intValue();
        }
        parcel.writeInt(i2);
        parcel.writeParcelable(this.Z1, i);
        parcel.writeString(this.a2.name());
    }
}
