package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.b.c;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new c();
    public Intent c;

    public CloudMessage(Intent intent) {
        this.c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.A2(parcel, 1, this.c, i, false);
        v.L2(parcel, G2);
    }
}
