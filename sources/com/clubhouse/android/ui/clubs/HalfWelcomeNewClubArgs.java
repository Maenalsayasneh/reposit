package com.clubhouse.android.ui.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import m0.n.b.i;

/* compiled from: HalfWelcomeNewClubFragment.kt */
public final class HalfWelcomeNewClubArgs implements Parcelable {
    public static final Parcelable.Creator<HalfWelcomeNewClubArgs> CREATOR = new a();
    public final ClubWithAdmin c;

    /* compiled from: HalfWelcomeNewClubFragment.kt */
    public static final class a implements Parcelable.Creator<HalfWelcomeNewClubArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new HalfWelcomeNewClubArgs((ClubWithAdmin) parcel.readParcelable(HalfWelcomeNewClubArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new HalfWelcomeNewClubArgs[i];
        }
    }

    public HalfWelcomeNewClubArgs() {
        this.c = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HalfWelcomeNewClubArgs) && i.a(this.c, ((HalfWelcomeNewClubArgs) obj).c);
    }

    public int hashCode() {
        ClubWithAdmin clubWithAdmin = this.c;
        if (clubWithAdmin == null) {
            return 0;
        }
        return clubWithAdmin.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HalfWelcomeNewClubArgs(club=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
    }

    public HalfWelcomeNewClubArgs(ClubWithAdmin clubWithAdmin) {
        this.c = clubWithAdmin;
    }
}
