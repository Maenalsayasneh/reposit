package com.clubhouse.android.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: EditNameFragment.kt */
public final class EditNameArgs implements Parcelable {
    public static final Parcelable.Creator<EditNameArgs> CREATOR = new a();
    public final String c;
    public final String d;

    /* compiled from: EditNameFragment.kt */
    public static final class a implements Parcelable.Creator<EditNameArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new EditNameArgs(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new EditNameArgs[i];
        }
    }

    public EditNameArgs(String str, String str2) {
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
        if (!(obj instanceof EditNameArgs)) {
            return false;
        }
        EditNameArgs editNameArgs = (EditNameArgs) obj;
        return i.a(this.c, editNameArgs.c) && i.a(this.d, editNameArgs.d);
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EditNameArgs(firstName=");
        P0.append(this.c);
        P0.append(", lastName=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
