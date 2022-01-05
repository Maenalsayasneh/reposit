package com.clubhouse.android.ui.clubs;

import android.os.Parcel;
import android.os.Parcelable;
import m0.n.b.i;

/* compiled from: ClubMemberSearchFragment.kt */
public final class ClubMemberSearchArgs implements Parcelable {
    public static final Parcelable.Creator<ClubMemberSearchArgs> CREATOR = new a();
    public final int c;
    public final boolean d;
    public final boolean q;

    /* compiled from: ClubMemberSearchFragment.kt */
    public static final class a implements Parcelable.Creator<ClubMemberSearchArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            int readInt = parcel.readInt();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new ClubMemberSearchArgs(readInt, z2, z);
        }

        public Object[] newArray(int i) {
            return new ClubMemberSearchArgs[i];
        }
    }

    public ClubMemberSearchArgs(int i, boolean z, boolean z2) {
        this.c = i;
        this.d = z;
        this.q = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubMemberSearchArgs)) {
            return false;
        }
        ClubMemberSearchArgs clubMemberSearchArgs = (ClubMemberSearchArgs) obj;
        return this.c == clubMemberSearchArgs.c && this.d == clubMemberSearchArgs.d && this.q == clubMemberSearchArgs.q;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.c) * 31;
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.q;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubMemberSearchArgs(clubId=");
        P0.append(this.c);
        P0.append(", isAdmin=");
        P0.append(this.d);
        P0.append(", isLeader=");
        return i0.d.a.a.a.C0(P0, this.q, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
    }
}
