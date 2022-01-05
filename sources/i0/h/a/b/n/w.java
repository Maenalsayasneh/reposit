package i0.h.a.b.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import h0.b0.v;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class w implements Parcelable.Creator<LoyaltyWalletObject> {
    public final Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int r2 = v.r2(parcel);
        ArrayList<WalletObjectMessage> arrayList = new ArrayList<>();
        ArrayList<LatLng> arrayList2 = new ArrayList<>();
        ArrayList<LabelValueRow> arrayList3 = new ArrayList<>();
        ArrayList<WalletObjectMessage> arrayList4 = arrayList;
        ArrayList<LatLng> arrayList5 = arrayList2;
        ArrayList<LabelValueRow> arrayList6 = arrayList3;
        ArrayList<UriData> arrayList7 = new ArrayList<>();
        ArrayList<TextModuleData> arrayList8 = new ArrayList<>();
        ArrayList<UriData> arrayList9 = new ArrayList<>();
        int i = 0;
        boolean z = false;
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
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
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
                    i = v.G1(parcel2, readInt);
                    break;
                case 13:
                    arrayList4 = v.R(parcel2, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) v.M(parcel2, readInt, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList5 = v.R(parcel2, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = v.N(parcel2, readInt);
                    break;
                case 17:
                    str12 = v.N(parcel2, readInt);
                    break;
                case 18:
                    arrayList6 = v.R(parcel2, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = v.A1(parcel2, readInt);
                    break;
                case 20:
                    arrayList7 = v.R(parcel2, readInt, UriData.CREATOR);
                    break;
                case 21:
                    arrayList8 = v.R(parcel2, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    arrayList9 = v.R(parcel2, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) v.M(parcel2, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    v.i2(parcel2, readInt);
                    break;
            }
        }
        v.a0(parcel2, r2);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList4, timeInterval, arrayList5, str11, str12, arrayList6, z, arrayList7, arrayList8, arrayList9, loyaltyPoints);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
