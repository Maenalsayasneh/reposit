package i0.h.a.b.n.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LabelValue;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class c implements Parcelable.Creator<LabelValueRow> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        ArrayList<LabelValue> arrayList = new ArrayList<>();
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = v.N(parcel, readInt);
            } else if (i == 3) {
                str2 = v.N(parcel, readInt);
            } else if (i != 4) {
                v.i2(parcel, readInt);
            } else {
                arrayList = v.R(parcel, readInt, LabelValue.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new LabelValueRow(str, str2, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LabelValueRow[i];
    }
}
