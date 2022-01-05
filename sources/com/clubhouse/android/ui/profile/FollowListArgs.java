package com.clubhouse.android.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: FollowListFragment.kt */
public final class FollowListArgs implements Parcelable {
    public static final Parcelable.Creator<FollowListArgs> CREATOR = new a();
    public final int c;
    public final long d;
    public final FollowListType q;

    /* compiled from: FollowListFragment.kt */
    public static final class a implements Parcelable.Creator<FollowListArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new FollowListArgs(parcel.readInt(), parcel.readLong(), FollowListType.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new FollowListArgs[i];
        }
    }

    public FollowListArgs(int i, long j, FollowListType followListType, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        j = (i2 & 2) != 0 ? 0 : j;
        i.e(followListType, "listType");
        this.c = i;
        this.d = j;
        this.q = followListType;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowListArgs)) {
            return false;
        }
        FollowListArgs followListArgs = (FollowListArgs) obj;
        return this.c == followListArgs.c && this.d == followListArgs.d && this.q == followListArgs.q;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.d);
        return this.q.hashCode() + ((hashCode + (Integer.hashCode(this.c) * 31)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowListArgs(userId=");
        P0.append(this.c);
        P0.append(", notificationId=");
        P0.append(this.d);
        P0.append(", listType=");
        P0.append(this.q);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.q.name());
    }

    public FollowListArgs(int i, long j, FollowListType followListType) {
        i.e(followListType, "listType");
        this.c = i;
        this.d = j;
        this.q = followListType;
    }
}
