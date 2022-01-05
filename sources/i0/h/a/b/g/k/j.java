package i0.h.a.b.g.k;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.internal.wallet.zzq;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class j implements Parcelable.Creator<zzq> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String[] strArr = null;
        int[] iArr = null;
        RemoteViews remoteViews = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                strArr = v.O(parcel, readInt);
            } else if (i == 2) {
                iArr = v.K(parcel, readInt);
            } else if (i == 3) {
                remoteViews = (RemoteViews) v.M(parcel, readInt, RemoteViews.CREATOR);
            } else if (i != 4) {
                v.i2(parcel, readInt);
            } else {
                bArr = v.J(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zzq(strArr, iArr, remoteViews, bArr);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
