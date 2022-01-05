package com.clubhouse.wave.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.BasicUser;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: SentWave.kt */
public final class SentWave implements Parcelable, i0.e.b.a3.e.a {
    public static final Parcelable.Creator<SentWave> CREATOR = new a();
    public final BasicUser c;
    public final int d;
    public final boolean q;
    public final OffsetDateTime x;

    /* compiled from: SentWave.kt */
    public static final class a implements Parcelable.Creator<SentWave> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new SentWave((BasicUser) parcel.readParcelable(SentWave.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, (OffsetDateTime) parcel.readSerializable());
        }

        public Object[] newArray(int i) {
            return new SentWave[i];
        }
    }

    public SentWave(BasicUser basicUser, int i, boolean z, OffsetDateTime offsetDateTime) {
        i.e(basicUser, "toUser");
        this.c = basicUser;
        this.d = i;
        this.q = z;
        this.x = offsetDateTime;
    }

    public final SentWave a(boolean z) {
        BasicUser basicUser = this.c;
        int intValue = getId().intValue();
        OffsetDateTime offsetDateTime = this.x;
        i.e(basicUser, "toUser");
        return new SentWave(basicUser, intValue, z, offsetDateTime);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentWave)) {
            return false;
        }
        SentWave sentWave = (SentWave) obj;
        return i.a(this.c, sentWave.c) && getId().intValue() == sentWave.getId().intValue() && this.q == sentWave.q && i.a(this.x, sentWave.x);
    }

    public int hashCode() {
        int i;
        int hashCode = (getId().hashCode() + (this.c.hashCode() * 31)) * 31;
        boolean z = this.q;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        OffsetDateTime offsetDateTime = this.x;
        if (offsetDateTime == null) {
            i = 0;
        } else {
            i = offsetDateTime.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SentWave(toUser=");
        P0.append(this.c);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", suspended=");
        P0.append(this.q);
        P0.append(", sent=");
        P0.append(this.x);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeSerializable(this.x);
    }

    public Integer getId() {
        return Integer.valueOf(this.d);
    }
}
