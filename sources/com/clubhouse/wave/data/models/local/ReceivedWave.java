package com.clubhouse.wave.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: ReceivedWave.kt */
public final class ReceivedWave implements Parcelable, i0.e.b.a3.e.a {
    public static final Parcelable.Creator<ReceivedWave> CREATOR = new a();
    public final UserInStatus c;
    public final String d;
    public final int q;
    public final boolean x;
    public final OffsetDateTime y;

    /* compiled from: ReceivedWave.kt */
    public static final class a implements Parcelable.Creator<ReceivedWave> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            return new ReceivedWave((UserInStatus) parcel.readParcelable(ReceivedWave.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, (OffsetDateTime) parcel.readSerializable());
        }

        public Object[] newArray(int i) {
            return new ReceivedWave[i];
        }
    }

    public ReceivedWave(UserInStatus userInStatus, String str, int i, boolean z, OffsetDateTime offsetDateTime) {
        i.e(userInStatus, "fromUser");
        i.e(str, "waveId");
        this.c = userInStatus;
        this.d = str;
        this.q = i;
        this.x = z;
        this.y = offsetDateTime;
    }

    public static ReceivedWave a(ReceivedWave receivedWave, UserInStatus userInStatus, String str, int i, boolean z, OffsetDateTime offsetDateTime, int i2) {
        if ((i2 & 1) != 0) {
            userInStatus = receivedWave.c;
        }
        UserInStatus userInStatus2 = userInStatus;
        String str2 = (i2 & 2) != 0 ? receivedWave.d : null;
        if ((i2 & 4) != 0) {
            i = receivedWave.getId().intValue();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = receivedWave.x;
        }
        boolean z2 = z;
        OffsetDateTime offsetDateTime2 = (i2 & 16) != 0 ? receivedWave.y : null;
        i.e(userInStatus2, "fromUser");
        i.e(str2, "waveId");
        return new ReceivedWave(userInStatus2, str2, i3, z2, offsetDateTime2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceivedWave)) {
            return false;
        }
        ReceivedWave receivedWave = (ReceivedWave) obj;
        return i.a(this.c, receivedWave.c) && i.a(this.d, receivedWave.d) && getId().intValue() == receivedWave.getId().intValue() && this.x == receivedWave.x && i.a(this.y, receivedWave.y);
    }

    public int hashCode() {
        int i;
        int hashCode = (getId().hashCode() + i0.d.a.a.a.F(this.d, this.c.hashCode() * 31, 31)) * 31;
        boolean z = this.x;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        OffsetDateTime offsetDateTime = this.y;
        if (offsetDateTime == null) {
            i = 0;
        } else {
            i = offsetDateTime.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ReceivedWave(fromUser=");
        P0.append(this.c);
        P0.append(", waveId=");
        P0.append(this.d);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", suspended=");
        P0.append(this.x);
        P0.append(", sent=");
        P0.append(this.y);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeInt(this.q);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeSerializable(this.y);
    }

    public Integer getId() {
        return Integer.valueOf(this.q);
    }
}
