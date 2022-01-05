package com.clubhouse.android.ui.profile.reports;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.ReportTarget;
import m0.n.b.i;

/* compiled from: ReportIncidentThanksFragment.kt */
public final class ReportIncidentThanksArgs implements Parcelable {
    public static final Parcelable.Creator<ReportIncidentThanksArgs> CREATOR = new a();
    public final ReportTarget c;
    public final String d;

    /* compiled from: ReportIncidentThanksFragment.kt */
    public static final class a implements Parcelable.Creator<ReportIncidentThanksArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ReportIncidentThanksArgs(ReportTarget.valueOf(parcel.readString()), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ReportIncidentThanksArgs[i];
        }
    }

    public ReportIncidentThanksArgs(ReportTarget reportTarget, String str) {
        i.e(reportTarget, "reportTarget");
        this.c = reportTarget;
        this.d = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportIncidentThanksArgs)) {
            return false;
        }
        ReportIncidentThanksArgs reportIncidentThanksArgs = (ReportIncidentThanksArgs) obj;
        return this.c == reportIncidentThanksArgs.c && i.a(this.d, reportIncidentThanksArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportIncidentThanksArgs(reportTarget=");
        P0.append(this.c);
        P0.append(", channelId=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c.name());
        parcel.writeString(this.d);
    }
}
