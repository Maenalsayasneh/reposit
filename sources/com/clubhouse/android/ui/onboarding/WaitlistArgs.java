package com.clubhouse.android.ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: WaitlistFragment.kt */
public final class WaitlistArgs implements Parcelable {
    public static final Parcelable.Creator<WaitlistArgs> CREATOR = new a();
    public final String c;

    /* compiled from: WaitlistFragment.kt */
    public static final class a implements Parcelable.Creator<WaitlistArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new WaitlistArgs(parcel.readString());
        }

        public Object[] newArray(int i) {
            return new WaitlistArgs[i];
        }
    }

    public WaitlistArgs(String str) {
        this.c = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WaitlistArgs) && i.a(this.c, ((WaitlistArgs) obj).c);
    }

    public int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return i0.d.a.a.a.w0(i0.d.a.a.a.P0("WaitlistArgs(username="), this.c, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
    }
}
