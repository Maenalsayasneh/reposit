package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.User;
import m0.n.b.i;

/* compiled from: ReportProfileFragment.kt */
public final class ReportProfileArgs implements Parcelable {
    public static final Parcelable.Creator<ReportProfileArgs> CREATOR = new a();
    public final User c;
    public final String d;
    public final boolean q;
    public final boolean x;
    public final Uri y;

    /* compiled from: ReportProfileFragment.kt */
    public static final class a implements Parcelable.Creator<ReportProfileArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            User user = (User) parcel.readParcelable(ReportProfileArgs.class.getClassLoader());
            String readString = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new ReportProfileArgs(user, readString, z2, z, (Uri) parcel.readParcelable(ReportProfileArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new ReportProfileArgs[i];
        }
    }

    public ReportProfileArgs(User user, String str, boolean z, boolean z2, Uri uri, int i) {
        str = (i & 2) != 0 ? null : str;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        uri = (i & 16) != 0 ? null : uri;
        i.e(user, "user");
        this.c = user;
        this.d = str;
        this.q = z;
        this.x = z2;
        this.y = uri;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProfileArgs)) {
            return false;
        }
        ReportProfileArgs reportProfileArgs = (ReportProfileArgs) obj;
        return i.a(this.c, reportProfileArgs.c) && i.a(this.d, reportProfileArgs.d) && this.q == reportProfileArgs.q && this.x == reportProfileArgs.x && i.a(this.y, reportProfileArgs.y);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.q;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.x;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Uri uri = this.y;
        if (uri != null) {
            i = uri.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportProfileArgs(user=");
        P0.append(this.c);
        P0.append(", channel=");
        P0.append(this.d);
        P0.append(", isModerator=");
        P0.append(this.q);
        P0.append(", isSpeaker=");
        P0.append(this.x);
        P0.append(", reportImageUri=");
        P0.append(this.y);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeParcelable(this.y, i);
    }

    public ReportProfileArgs(User user, String str, boolean z, boolean z2, Uri uri) {
        i.e(user, "user");
        this.c = user;
        this.d = str;
        this.q = z;
        this.x = z2;
        this.y = uri;
    }
}
