package com.google.android.gms.recaptcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.i.e;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public class RecaptchaHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaHandle> CREATOR = new e();
    public final String c;
    public final String d;
    public final List<String> q;

    public RecaptchaHandle(String str, String str2, List<String> list) {
        this.c = str;
        this.d = str2;
        this.q = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.B2(parcel, 1, this.c, false);
        v.B2(parcel, 2, this.d, false);
        v.D2(parcel, 3, this.q, false);
        v.L2(parcel, G2);
    }
}
