package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.i.b0;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new b0();
    public final int c;
    public final Account d;
    public final int q;
    public final GoogleSignInAccount x;

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.c = i;
        this.d = account;
        this.q = i2;
        this.x = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        int i2 = this.c;
        v.J2(parcel, 1, 4);
        parcel.writeInt(i2);
        v.A2(parcel, 2, this.d, i, false);
        int i3 = this.q;
        v.J2(parcel, 3, 4);
        parcel.writeInt(i3);
        v.A2(parcel, 4, this.x, i, false);
        v.L2(parcel, G2);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this.c = 2;
        this.d = account;
        this.q = i;
        this.x = googleSignInAccount;
    }
}
