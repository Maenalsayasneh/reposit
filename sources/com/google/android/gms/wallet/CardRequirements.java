package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.r;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class CardRequirements extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<CardRequirements> CREATOR = new r();
    public ArrayList<Integer> c;
    public boolean d;
    public boolean q;
    public int x;

    public CardRequirements() {
        this.d = true;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.z2(parcel, 1, this.c, false);
        boolean z = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.q;
        v.J2(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i2 = this.x;
        v.J2(parcel, 4, 4);
        parcel.writeInt(i2);
        v.L2(parcel, G2);
    }

    public CardRequirements(ArrayList<Integer> arrayList, boolean z, boolean z2, int i) {
        this.c = arrayList;
        this.d = z;
        this.q = z2;
        this.x = i;
    }
}
