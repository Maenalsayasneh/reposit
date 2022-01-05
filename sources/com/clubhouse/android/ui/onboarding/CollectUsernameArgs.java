package com.clubhouse.android.ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: CollectUsernameFragment.kt */
public final class CollectUsernameArgs implements Parcelable {
    public static final Parcelable.Creator<CollectUsernameArgs> CREATOR = new a();
    public final String c;
    public final String d;

    /* compiled from: CollectUsernameFragment.kt */
    public static final class a implements Parcelable.Creator<CollectUsernameArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new CollectUsernameArgs(parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new CollectUsernameArgs[i];
        }
    }

    public CollectUsernameArgs(String str, String str2) {
        i.e(str, "firstName");
        i.e(str2, "lastName");
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
        if (!(obj instanceof CollectUsernameArgs)) {
            return false;
        }
        CollectUsernameArgs collectUsernameArgs = (CollectUsernameArgs) obj;
        return i.a(this.c, collectUsernameArgs.c) && i.a(this.d, collectUsernameArgs.d);
    }

    public int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CollectUsernameArgs(firstName=");
        P0.append(this.c);
        P0.append(", lastName=");
        return i0.d.a.a.a.x0(P0, this.d, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
