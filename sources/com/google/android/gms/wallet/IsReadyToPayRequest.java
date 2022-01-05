package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import i0.h.a.b.n.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class IsReadyToPayRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<IsReadyToPayRequest> CREATOR = new v();
    public String Y1;
    public ArrayList<Integer> c;
    public String d;
    public String q;
    public ArrayList<Integer> x;
    public boolean y;

    public IsReadyToPayRequest() {
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = h0.b0.v.G2(parcel, 20293);
        h0.b0.v.z2(parcel, 2, this.c, false);
        h0.b0.v.B2(parcel, 4, this.d, false);
        h0.b0.v.B2(parcel, 5, this.q, false);
        h0.b0.v.z2(parcel, 6, this.x, false);
        boolean z = this.y;
        h0.b0.v.J2(parcel, 7, 4);
        parcel.writeInt(z ? 1 : 0);
        h0.b0.v.B2(parcel, 8, this.Y1, false);
        h0.b0.v.L2(parcel, G2);
    }

    public IsReadyToPayRequest(ArrayList<Integer> arrayList, String str, String str2, ArrayList<Integer> arrayList2, boolean z, String str3) {
        this.c = arrayList;
        this.d = str;
        this.q = str2;
        this.x = arrayList2;
        this.y = z;
        this.Y1 = str3;
    }
}
