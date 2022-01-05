package i0.h.a.b.n.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class d implements Parcelable.Creator<LoyaltyPointsBalance> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r2 = v.r2(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        double d = 0.0d;
        long j = 0;
        int i2 = -1;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    i = v.G1(parcel2, readInt);
                    break;
                case 3:
                    str = v.N(parcel2, readInt);
                    break;
                case 4:
                    d = v.C1(parcel2, readInt);
                    break;
                case 5:
                    str2 = v.N(parcel2, readInt);
                    break;
                case 6:
                    j = v.H1(parcel2, readInt);
                    break;
                case 7:
                    i2 = v.G1(parcel2, readInt);
                    break;
                default:
                    v.i2(parcel2, readInt);
                    break;
            }
        }
        v.a0(parcel2, r2);
        return new LoyaltyPointsBalance(i, str, d, str2, j, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
