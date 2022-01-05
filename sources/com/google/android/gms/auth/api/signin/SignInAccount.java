package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.a.a.d.g;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();
    @Deprecated
    public String c;
    public GoogleSignInAccount d;
    @Deprecated
    public String q;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.d = googleSignInAccount;
        v.y(str, "8.3 and 8.4 SDKs require non-null email");
        this.c = str;
        v.y(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.q = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 4, this.c, false);
        v.A2(parcel, 7, this.d, i, false);
        v.B2(parcel, 8, this.q, false);
        v.L2(parcel, G2);
    }
}
