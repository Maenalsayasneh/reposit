package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class j implements Parcelable.Creator<ShippingAddressRequirements> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            if ((65535 & readInt) != 1) {
                v.i2(parcel, readInt);
            } else {
                arrayList = v.P(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new ShippingAddressRequirements(arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ShippingAddressRequirements[i];
    }
}
