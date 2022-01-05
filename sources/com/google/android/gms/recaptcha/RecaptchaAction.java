package com.google.android.gms.recaptcha;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.i.c;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class RecaptchaAction extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RecaptchaAction> CREATOR = new c();
    public final RecaptchaActionType c;
    public final String d;
    public final Bundle q;
    public final String x;

    public RecaptchaAction(RecaptchaActionType recaptchaActionType, String str, Bundle bundle, String str2) {
        this.c = recaptchaActionType;
        this.d = str;
        this.q = bundle;
        this.x = str2;
    }

    public final String toString() {
        if (!RecaptchaActionType.OTHER.equals(this.c.zza) || this.d.isEmpty()) {
            return this.c.zza;
        }
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 1, this.c, i, false);
        v.B2(parcel, 2, this.d, false);
        v.w2(parcel, 3, this.q, false);
        v.B2(parcel, 4, this.x, false);
        v.L2(parcel, G2);
    }

    public RecaptchaAction(RecaptchaActionType recaptchaActionType) {
        Bundle bundle = new Bundle();
        this.c = recaptchaActionType;
        this.d = "";
        this.q = bundle;
        this.x = "";
    }
}
