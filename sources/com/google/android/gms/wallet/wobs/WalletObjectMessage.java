package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.e.i;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new i();
    public String c;
    public String d;
    public TimeInterval q;
    @Deprecated
    public UriData x;
    @Deprecated
    public UriData y;

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.c = str;
        this.d = str2;
        this.q = timeInterval;
        this.x = uriData;
        this.y = uriData2;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.A2(parcel, 4, this.q, i, false);
        v.A2(parcel, 5, this.x, i, false);
        v.A2(parcel, 6, this.y, i, false);
        v.L2(parcel, G2);
    }
}
