package com.clubhouse.android.ui.clubs.invites;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.n.b.i;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubArgs implements Parcelable {
    public static final Parcelable.Creator<GrowClubArgs> CREATOR = new a();
    public final int c;
    public final GrowClubMethod d;
    public final GrowClubSource q;

    /* compiled from: GrowClubFragment.kt */
    public static final class a implements Parcelable.Creator<GrowClubArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new GrowClubArgs(parcel.readInt(), GrowClubMethod.valueOf(parcel.readString()), GrowClubSource.valueOf(parcel.readString()));
        }

        public Object[] newArray(int i) {
            return new GrowClubArgs[i];
        }
    }

    public GrowClubArgs(int i, GrowClubMethod growClubMethod, GrowClubSource growClubSource) {
        i.e(growClubMethod, "method");
        i.e(growClubSource, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c = i;
        this.d = growClubMethod;
        this.q = growClubSource;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowClubArgs)) {
            return false;
        }
        GrowClubArgs growClubArgs = (GrowClubArgs) obj;
        return this.c == growClubArgs.c && this.d == growClubArgs.d && this.q == growClubArgs.q;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        return this.q.hashCode() + ((hashCode + (Integer.hashCode(this.c) * 31)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GrowClubArgs(clubId=");
        P0.append(this.c);
        P0.append(", method=");
        P0.append(this.d);
        P0.append(", source=");
        P0.append(this.q);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
        parcel.writeString(this.q.name());
    }
}
