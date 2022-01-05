package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.n.e.g;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class TimeInterval extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new g();
    public long c;
    public long d;

    public TimeInterval() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        long j = this.c;
        v.J2(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.d;
        v.J2(parcel, 3, 8);
        parcel.writeLong(j2);
        v.L2(parcel, G2);
    }

    public TimeInterval(long j, long j2) {
        this.c = j;
        this.d = j2;
    }
}
