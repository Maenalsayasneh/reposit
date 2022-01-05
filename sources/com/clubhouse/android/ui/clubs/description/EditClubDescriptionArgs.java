package com.clubhouse.android.ui.clubs.description;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: EditClubDescriptionFragment.kt */
public final class EditClubDescriptionArgs implements Parcelable {
    public static final Parcelable.Creator<EditClubDescriptionArgs> CREATOR = new a();
    public final String c;
    public final String d;

    /* compiled from: EditClubDescriptionFragment.kt */
    public static final class a implements Parcelable.Creator<EditClubDescriptionArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new EditClubDescriptionArgs(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new EditClubDescriptionArgs[i];
        }
    }

    public EditClubDescriptionArgs(String str, String str2) {
        i.e(str, "clubName");
        this.c = str;
        this.d = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditClubDescriptionArgs)) {
            return false;
        }
        EditClubDescriptionArgs editClubDescriptionArgs = (EditClubDescriptionArgs) obj;
        return i.a(this.c, editClubDescriptionArgs.c) && i.a(this.d, editClubDescriptionArgs.d);
    }

    public int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EditClubDescriptionArgs(clubName=");
        P0.append(this.c);
        P0.append(", description=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
