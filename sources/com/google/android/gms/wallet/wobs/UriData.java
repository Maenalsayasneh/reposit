package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.e.h;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class UriData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<UriData> CREATOR = new h();
    public String c;
    public String d;

    public UriData() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.L2(parcel, G2);
    }

    public UriData(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        this.c = str;
        this.d = str2;
    }
}
