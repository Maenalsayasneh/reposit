package com.clubhouse.android.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.user.model.User;
import com.stripe.android.model.Stripe3ds2AuthParams;
import m0.n.b.i;

/* compiled from: HalfProfileNavigation.kt */
public final class HalfProfileArgs implements Parcelable {
    public static final Parcelable.Creator<HalfProfileArgs> CREATOR = new a();
    public final User c;
    public final SourceLocation d;
    public final boolean q;
    public final boolean x;
    public final boolean y;

    /* compiled from: HalfProfileNavigation.kt */
    public static final class a implements Parcelable.Creator<HalfProfileArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new HalfProfileArgs((User) parcel.readParcelable(HalfProfileArgs.class.getClassLoader()), SourceLocation.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new HalfProfileArgs[i];
        }
    }

    public HalfProfileArgs(User user, SourceLocation sourceLocation, boolean z, boolean z2, boolean z3) {
        i.e(user, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.c = user;
        this.d = sourceLocation;
        this.q = z;
        this.x = z2;
        this.y = z3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HalfProfileArgs)) {
            return false;
        }
        HalfProfileArgs halfProfileArgs = (HalfProfileArgs) obj;
        return i.a(this.c, halfProfileArgs.c) && this.d == halfProfileArgs.d && this.q == halfProfileArgs.q && this.x == halfProfileArgs.x && this.y == halfProfileArgs.y;
    }

    public int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        boolean z = this.q;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.x;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.y;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("HalfProfileArgs(user=");
        P0.append(this.c);
        P0.append(", source=");
        P0.append(this.d);
        P0.append(", expanded=");
        P0.append(this.q);
        P0.append(", autoJumpToEditBio=");
        P0.append(this.x);
        P0.append(", autoJumpToEditPhoto=");
        return i0.d.a.a.a.C0(P0, this.y, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d.name());
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HalfProfileArgs(User user, SourceLocation sourceLocation, boolean z, boolean z2, boolean z3, int i) {
        this(user, sourceLocation, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3);
    }
}
