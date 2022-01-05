package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class v implements Parcelable.Creator<IsReadyToPayRequest> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = h0.b0.v.r2(parcel);
        ArrayList<Integer> arrayList = null;
        String str = null;
        String str2 = null;
        ArrayList<Integer> arrayList2 = null;
        String str3 = null;
        boolean z = false;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    arrayList = h0.b0.v.L(parcel, readInt);
                    break;
                case 4:
                    str = h0.b0.v.N(parcel, readInt);
                    break;
                case 5:
                    str2 = h0.b0.v.N(parcel, readInt);
                    break;
                case 6:
                    arrayList2 = h0.b0.v.L(parcel, readInt);
                    break;
                case 7:
                    z = h0.b0.v.A1(parcel, readInt);
                    break;
                case 8:
                    str3 = h0.b0.v.N(parcel, readInt);
                    break;
                default:
                    h0.b0.v.i2(parcel, readInt);
                    break;
            }
        }
        h0.b0.v.a0(parcel, r2);
        return new IsReadyToPayRequest(arrayList, str, str2, arrayList2, z, str3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new IsReadyToPayRequest[i];
    }
}
