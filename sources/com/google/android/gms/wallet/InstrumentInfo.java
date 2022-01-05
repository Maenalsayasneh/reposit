package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.u;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class InstrumentInfo extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new u();
    public String c;
    public String d;
    public int q;

    public InstrumentInfo() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = 0;
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        int i3 = this.q;
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            i2 = i3;
        }
        v.J2(parcel, 4, 4);
        parcel.writeInt(i2);
        v.L2(parcel, G2);
    }

    public InstrumentInfo(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i) {
        this.c = str;
        this.d = str2;
        this.q = i;
    }
}
