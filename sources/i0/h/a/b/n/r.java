package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class r implements Parcelable.Creator<CardRequirements> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        boolean z = false;
        boolean z2 = true;
        ArrayList<Integer> arrayList = null;
        int i = 0;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                arrayList = v.L(parcel, readInt);
            } else if (i2 == 2) {
                z2 = v.A1(parcel, readInt);
            } else if (i2 == 3) {
                z = v.A1(parcel, readInt);
            } else if (i2 != 4) {
                v.i2(parcel, readInt);
            } else {
                i = v.G1(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new CardRequirements(arrayList, z2, z, i);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new CardRequirements[i];
    }
}
