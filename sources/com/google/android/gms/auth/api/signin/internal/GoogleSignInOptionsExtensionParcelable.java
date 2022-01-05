package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.a.a.d.b.b;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new b();
    public final int c;
    public int d;
    public Bundle q;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.c = i;
        this.d = i2;
        this.q = bundle;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.d;
        v.J2(parcel, 2, 4);
        parcel.writeInt(i3);
        v.w2(parcel, 3, this.q, false);
        v.L2(parcel, G2);
    }
}
