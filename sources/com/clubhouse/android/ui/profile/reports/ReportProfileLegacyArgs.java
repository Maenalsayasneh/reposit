package com.clubhouse.android.ui.profile.reports;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.user.model.User;
import m0.n.b.i;

/* compiled from: ReportProfileLegacyFragment.kt */
public final class ReportProfileLegacyArgs implements Parcelable {
    public static final Parcelable.Creator<ReportProfileLegacyArgs> CREATOR = new a();
    public final User c;
    public final String d;
    public final boolean q;
    public final boolean x;

    /* compiled from: ReportProfileLegacyFragment.kt */
    public static final class a implements Parcelable.Creator<ReportProfileLegacyArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            User user = (User) parcel.readParcelable(ReportProfileLegacyArgs.class.getClassLoader());
            String readString = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new ReportProfileLegacyArgs(user, readString, z2, z);
        }

        public Object[] newArray(int i) {
            return new ReportProfileLegacyArgs[i];
        }
    }

    public ReportProfileLegacyArgs(User user, String str, boolean z, boolean z2, int i) {
        int i2 = i & 2;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        i.e(user, "user");
        this.c = user;
        this.d = null;
        this.q = z;
        this.x = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportProfileLegacyArgs)) {
            return false;
        }
        ReportProfileLegacyArgs reportProfileLegacyArgs = (ReportProfileLegacyArgs) obj;
        return i.a(this.c, reportProfileLegacyArgs.c) && i.a(this.d, reportProfileLegacyArgs.d) && this.q == reportProfileLegacyArgs.q && this.x == reportProfileLegacyArgs.x;
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.q;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.x;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReportProfileLegacyArgs(user=");
        P0.append(this.c);
        P0.append(", channel=");
        P0.append(this.d);
        P0.append(", isModerator=");
        P0.append(this.q);
        P0.append(", isSpeaker=");
        return i0.d.a.a.a.C0(P0, this.x, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
    }

    public ReportProfileLegacyArgs(User user, String str, boolean z, boolean z2) {
        i.e(user, "user");
        this.c = user;
        this.d = str;
        this.q = z;
        this.x = z2;
    }
}
