package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.e.c;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class LabelValueRow extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LabelValueRow> CREATOR = new c();
    @Deprecated
    public String c;
    @Deprecated
    public String d;
    public ArrayList<LabelValue> q;

    public LabelValueRow(String str, String str2, ArrayList<LabelValue> arrayList) {
        this.c = str;
        this.d = str2;
        this.q = arrayList;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.B2(parcel, 3, this.d, false);
        v.F2(parcel, 4, this.q, false);
        v.L2(parcel, G2);
    }
}
