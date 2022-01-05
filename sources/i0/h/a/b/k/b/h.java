package i0.h.a.b.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zai;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class h implements Parcelable.Creator<zai> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 1) {
                arrayList = v.P(parcel, readInt);
            } else if (i != 2) {
                v.i2(parcel, readInt);
            } else {
                str = v.N(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new zai(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
