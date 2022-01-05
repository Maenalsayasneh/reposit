package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.j;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new j();
    public ArrayList<String> c;

    public ShippingAddressRequirements() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.D2(parcel, 1, this.c, false);
        v.L2(parcel, G2);
    }

    public ShippingAddressRequirements(ArrayList<String> arrayList) {
        this.c = arrayList;
    }
}
