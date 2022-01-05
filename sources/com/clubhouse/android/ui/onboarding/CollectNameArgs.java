package com.clubhouse.android.ui.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.BasicUser;
import m0.n.b.i;

/* compiled from: CollectNameFragment.kt */
public final class CollectNameArgs implements Parcelable {
    public static final Parcelable.Creator<CollectNameArgs> CREATOR = new a();
    public final BasicUser c;

    /* compiled from: CollectNameFragment.kt */
    public static final class a implements Parcelable.Creator<CollectNameArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new CollectNameArgs((BasicUser) parcel.readParcelable(CollectNameArgs.class.getClassLoader()));
        }

        public Object[] newArray(int i) {
            return new CollectNameArgs[i];
        }
    }

    public CollectNameArgs() {
        this((BasicUser) null, 1);
    }

    public CollectNameArgs(BasicUser basicUser) {
        this.c = basicUser;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CollectNameArgs) && i.a(this.c, ((CollectNameArgs) obj).c);
    }

    public int hashCode() {
        BasicUser basicUser = this.c;
        if (basicUser == null) {
            return 0;
        }
        return basicUser.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CollectNameArgs(user=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
    }

    public CollectNameArgs(BasicUser basicUser, int i) {
        int i2 = i & 1;
        this.c = null;
    }
}
