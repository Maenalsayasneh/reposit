package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h0.b0.v;
import h0.f.a;
import i0.h.c.t.h0;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new h0();
    public Bundle c;
    public Map<String, String> d;

    public RemoteMessage(Bundle bundle) {
        this.c = bundle;
    }

    public Map<String, String> I0() {
        if (this.d == null) {
            Bundle bundle = this.c;
            a aVar = new a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        aVar.put(str, str2);
                    }
                }
            }
            this.d = aVar;
        }
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int G2 = v.G2(parcel, 20293);
        v.w2(parcel, 2, this.c, false);
        v.L2(parcel, G2);
    }
}
