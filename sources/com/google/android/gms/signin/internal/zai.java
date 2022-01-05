package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import i0.h.a.b.c.g.h;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class zai extends AbstractSafeParcelable implements h {
    public static final Parcelable.Creator<zai> CREATOR = new i0.h.a.b.k.b.h();
    public final List<String> c;
    public final String d;

    public zai(List<String> list, String str) {
        this.c = list;
        this.d = str;
    }

    public final Status getStatus() {
        if (this.d != null) {
            return Status.c;
        }
        return Status.y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.D2(parcel, 1, this.c, false);
        v.B2(parcel, 2, this.d, false);
        v.L2(parcel, G2);
    }
}
