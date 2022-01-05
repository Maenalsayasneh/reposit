package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h0.b0.v;
import i0.h.a.b.n.t;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class FullWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new t();
    public zza Y1;
    public String[] Z1;
    public UserAddress a2;
    public UserAddress b2;
    public String c;
    public InstrumentInfo[] c2;
    public String d;
    public PaymentMethodToken d2;
    public zzad q;
    public String x;
    public zza y;

    public FullWallet() {
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.A2(parcel, 4, this.q, i, false);
        v.B2(parcel, 5, this.x, false);
        v.A2(parcel, 6, this.y, i, false);
        v.A2(parcel, 7, this.Y1, i, false);
        v.C2(parcel, 8, this.Z1, false);
        v.A2(parcel, 9, this.a2, i, false);
        v.A2(parcel, 10, this.b2, i, false);
        v.E2(parcel, 11, this.c2, i, false);
        v.A2(parcel, 12, this.d2, i, false);
        v.L2(parcel, G2);
    }

    public FullWallet(String str, String str2, zzad zzad, String str3, zza zza, zza zza2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.c = str;
        this.d = str2;
        this.q = zzad;
        this.x = str3;
        this.y = zza;
        this.Y1 = zza2;
        this.Z1 = strArr;
        this.a2 = userAddress;
        this.b2 = userAddress2;
        this.c2 = instrumentInfoArr;
        this.d2 = paymentMethodToken;
    }
}
