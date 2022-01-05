package i0.h.a.b.n.e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class e implements Parcelable.Creator<LoyaltyPoints> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = v.N(parcel, readInt);
            } else if (i == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) v.M(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (i != 5) {
                v.i2(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) v.M(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new LoyaltyPoints(str, loyaltyPointsBalance, timeInterval);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
