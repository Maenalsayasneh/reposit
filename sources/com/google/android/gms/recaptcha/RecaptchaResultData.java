package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.i.f;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public class RecaptchaResultData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaResultData> CREATOR = new f();
    public final String c;

    public RecaptchaResultData(String str) {
        this.c = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 1, this.c, false);
        v.L2(parcel, G2);
    }
}
