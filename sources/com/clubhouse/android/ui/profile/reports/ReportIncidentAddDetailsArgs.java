package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.user.model.User;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.i;

/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsArgs implements Parcelable {
    public static final Parcelable.Creator<ReportIncidentAddDetailsArgs> CREATOR = new a();
    public final Integer Y1;
    public final Uri Z1;
    public final ReportTarget a2;
    public final User c;
    public final List<IncidentCategory> d;
    public final String q;
    public final Channel x;
    public final String y;

    /* compiled from: ReportIncidentAddDetailsFragment.kt */
    public static final class a implements Parcelable.Creator<ReportIncidentAddDetailsArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            User user = (User) parcel.readParcelable(ReportIncidentAddDetailsArgs.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(ReportIncidentAddDetailsArgs.class.getClassLoader()));
            }
            return new ReportIncidentAddDetailsArgs(user, arrayList, parcel.readString(), (Channel) parcel.readParcelable(ReportIncidentAddDetailsArgs.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (Uri) parcel.readParcelable(ReportIncidentAddDetailsArgs.class.getClassLoader()), ReportTarget.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new ReportIncidentAddDetailsArgs[i];
        }
    }

    public ReportIncidentAddDetailsArgs(User user, List<IncidentCategory> list, String str, Channel channel, String str2, Integer num, Uri uri, ReportTarget reportTarget) {
        i.e(list, "parentsIncidentCategories");
        i.e(reportTarget, "reportTarget");
        this.c = user;
        this.d = list;
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
        if (!(obj instanceof ReportIncidentAddDetailsArgs)) {
            return false;
        }
        ReportIncidentAddDetailsArgs reportIncidentAddDetailsArgs = (ReportIncidentAddDetailsArgs) obj;
        return i.a(this.c, reportIncidentAddDetailsArgs.c) && i.a(this.d, reportIncidentAddDetailsArgs.d) && i.a(this.q, reportIncidentAddDetailsArgs.q) && i.a(this.x, reportIncidentAddDetailsArgs.x) && i.a(this.y, reportIncidentAddDetailsArgs.y) && i.a(this.Y1, reportIncidentAddDetailsArgs.Y1) && i.a(this.Z1, reportIncidentAddDetailsArgs.Z1) && this.a2 == reportIncidentAddDetailsArgs.a2;
    }

    public int hashCode() {
        User user = this.c;
        int i = 0;
        int H = i0.d.a.a.a.H(this.d, (user == null ? 0 : user.hashCode()) * 31, 31);
        String str = this.q;
        int hashCode = (H + (str == null ? 0 : str.hashCode())) * 31;
        Channel channel = this.x;
        int hashCode2 = (hashCode + (channel == null ? 0 : channel.hashCode())) * 31;
        String str2 = this.y;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.Y1;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.Z1;
        if (uri != null) {
            i = uri.hashCode();
        }
        return this.a2.hashCode() + ((hashCode4 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportIncidentAddDetailsArgs(user=");
        P0.append(this.c);
        P0.append(", parentsIncidentCategories=");
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
        List<IncidentCategory> list = this.d;
        parcel.writeInt(list.size());
        for (IncidentCategory writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
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
