package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.a.a.d.b.s;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new s();
    public final String c;
    public GoogleSignInOptions d;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        v.x(str);
        this.c = str;
        this.d = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.c.equals(signInConfiguration.c)) {
            GoogleSignInOptions googleSignInOptions = this.d;
            if (googleSignInOptions == null) {
                if (signInConfiguration.d == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.c;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        GoogleSignInOptions googleSignInOptions = this.d;
        int i3 = (i + 31) * 31;
        if (googleSignInOptions != null) {
            i2 = googleSignInOptions.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 2, this.c, false);
        v.A2(parcel, 5, this.d, i, false);
        v.L2(parcel, G2);
    }
}
