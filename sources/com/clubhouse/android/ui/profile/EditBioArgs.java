package com.clubhouse.android.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: EditBioFragment.kt */
public final class EditBioArgs implements Parcelable {
    public static final Parcelable.Creator<EditBioArgs> CREATOR = new a();
    public final String c;

    /* compiled from: EditBioFragment.kt */
    public static final class a implements Parcelable.Creator<EditBioArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new EditBioArgs(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new EditBioArgs[i];
        }
    }

    public EditBioArgs(String str) {
        i.e(str, "bio");
        this.c = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditBioArgs) && i.a(this.c, ((EditBioArgs) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.x0(i0.d.a.a.a.P0("EditBioArgs(bio="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
    }
}
