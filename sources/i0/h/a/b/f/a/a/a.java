package i0.h.a.b.f.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import h0.b0.v;

public final class a implements Parcelable.Creator<UserAddress> {
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
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str10 = v.N(parcel2, readInt);
                    break;
                case 12:
                    str11 = v.N(parcel2, readInt);
                    break;
                case 13:
                    str12 = v.N(parcel2, readInt);
                    break;
                case 14:
                    z = v.A1(parcel2, readInt);
                    break;
                case 15:
                    str13 = v.N(parcel2, readInt);
                    break;
                case 16:
                    str14 = v.N(parcel2, readInt);
                    break;
                default:
                    v.i2(parcel2, readInt);
                    break;
            }
        }
        v.a0(parcel2, r2);
        return new UserAddress(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAddress[i];
    }
}
