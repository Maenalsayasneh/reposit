package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.i.d;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class RecaptchaActionType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaActionType> CREATOR = new d();
    public static final String LOGIN = "login";
    public static final String OTHER = "other";
    public static final String SIGNUP = "signup";
    public String zza;

    public RecaptchaActionType(String str) {
        this.zza = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 1, this.zza, false);
        v.L2(parcel, G2);
    }
}
