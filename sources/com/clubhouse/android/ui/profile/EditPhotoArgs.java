package com.clubhouse.android.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: EditPhotoFragment.kt */
public final class EditPhotoArgs implements Parcelable {
    public static final Parcelable.Creator<EditPhotoArgs> CREATOR = new a();
    public final String c;

    /* compiled from: EditPhotoFragment.kt */
    public static final class a implements Parcelable.Creator<EditPhotoArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new EditPhotoArgs(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new EditPhotoArgs[i];
        }
    }

    public EditPhotoArgs(String str) {
        this.c = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EditPhotoArgs) && i.a(this.c, ((EditPhotoArgs) obj).c);
    }

    public int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.w0(i0.d.a.a.a.P0("EditPhotoArgs(photoUrl="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
    }
}
