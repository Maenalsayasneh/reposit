package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.zza;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class n implements Parcelable.Creator<zza> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r2 = v.r2(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        boolean z = false;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 2:
                    str = v.N(parcel2, readInt);
                    break;
                case 3:
                    str2 = v.N(parcel2, readInt);
                    break;
                case 4:
                    str3 = v.N(parcel2, readInt);
                    break;
                case 5:
                    str4 = v.N(parcel2, readInt);
                    break;
                case 6:
                    str5 = v.N(parcel2, readInt);
                    break;
                case 7:
                    str6 = v.N(parcel2, readInt);
                    break;
                case 8:
                    str7 = v.N(parcel2, readInt);
                    break;
                case 9:
                    str8 = v.N(parcel2, readInt);
                    break;
                case 10:
                    str9 = v.N(parcel2, readInt);
                    break;
                case 11:
                    z = v.A1(parcel2, readInt);
                    break;
                case 12:
                    str10 = v.N(parcel2, readInt);
                    break;
                default:
                    v.i2(parcel2, readInt);
                    break;
            }
        }
        v.a0(parcel2, r2);
        return new zza(str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
