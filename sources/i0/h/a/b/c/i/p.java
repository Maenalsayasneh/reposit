package i0.h.a.b.c.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zao;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class p implements Parcelable.Creator<zaaa> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        int i = 0;
        ArrayList<zao> arrayList = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i2 = 65535 & readInt;
            if (i2 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i2 != 2) {
                v.i2(parcel, readInt);
            } else {
                arrayList = v.R(parcel, readInt, zao.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new zaaa(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaaa[i];
    }
}
