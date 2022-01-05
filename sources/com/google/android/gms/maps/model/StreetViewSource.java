package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.h.g.f;
import java.util.Arrays;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new f();
    public static final StreetViewSource c = new StreetViewSource(0);
    public final int d;

    static {
        Class<StreetViewSource> cls = StreetViewSource.class;
        new StreetViewSource(1);
    }

    public StreetViewSource(int i) {
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.d == ((StreetViewSource) obj).d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d)});
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i == 0) {
            str = "DEFAULT";
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i2);
        v.L2(parcel, G2);
    }
}
