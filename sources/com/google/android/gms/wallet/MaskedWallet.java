package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h0.b0.v;
import i0.h.a.b.n.x;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new x();
    public zza Y1;
    public LoyaltyWalletObject[] Z1;
    public OfferWalletObject[] a2;
    public UserAddress b2;
    public String c;
    public UserAddress c2;
    public String d;
    public InstrumentInfo[] d2;
    public String[] q;
    public String x;
    public zza y;

    public MaskedWallet() {
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.C2(parcel, 4, this.q, false);
        v.B2(parcel, 5, this.x, false);
        v.A2(parcel, 6, this.y, i, false);
        v.A2(parcel, 7, this.Y1, i, false);
        v.E2(parcel, 8, this.Z1, i, false);
        v.E2(parcel, 9, this.a2, i, false);
        v.A2(parcel, 10, this.b2, i, false);
        v.A2(parcel, 11, this.c2, i, false);
        v.E2(parcel, 12, this.d2, i, false);
        v.L2(parcel, G2);
    }

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zza, zza zza2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.c = str;
        this.d = str2;
        this.q = strArr;
        this.x = str3;
        this.y = zza;
        this.Y1 = zza2;
        this.Z1 = loyaltyWalletObjectArr;
        this.a2 = offerWalletObjectArr;
        this.b2 = userAddress;
        this.c2 = userAddress2;
        this.d2 = instrumentInfoArr;
    }
}
