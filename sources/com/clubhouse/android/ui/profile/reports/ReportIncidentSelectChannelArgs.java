package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.User;
import m0.n.b.i;

/* compiled from: ReportIncidentSelectChannelFragment.kt */
public final class ReportIncidentSelectChannelArgs implements Parcelable {
    public static final Parcelable.Creator<ReportIncidentSelectChannelArgs> CREATOR = new a();
    public final User c;
    public final Uri d;

    /* compiled from: ReportIncidentSelectChannelFragment.kt */
    public static final class a implements Parcelable.Creator<ReportIncidentSelectChannelArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ReportIncidentSelectChannelArgs((User) parcel.readParcelable(ReportIncidentSelectChannelArgs.class.getClassLoader()), (Uri) parcel.readParcelable(ReportIncidentSelectChannelArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new ReportIncidentSelectChannelArgs[i];
        }
    }

    public ReportIncidentSelectChannelArgs(User user, Uri uri) {
        i.e(user, "user");
        this.c = user;
        this.d = uri;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportIncidentSelectChannelArgs)) {
            return false;
        }
        ReportIncidentSelectChannelArgs reportIncidentSelectChannelArgs = (ReportIncidentSelectChannelArgs) obj;
        return i.a(this.c, reportIncidentSelectChannelArgs.c) && i.a(this.d, reportIncidentSelectChannelArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Uri uri = this.d;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportIncidentSelectChannelArgs(user=");
        P0.append(this.c);
        P0.append(", reportImageUri=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
