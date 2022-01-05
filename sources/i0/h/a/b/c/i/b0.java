package i0.h.a.b.c.i;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class b0 implements Parcelable.Creator<zat> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        Account account = null;
        int i = 0;
        int i2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i3 = 65535 & readInt;
            if (i3 == 1) {
                i = v.G1(parcel, readInt);
            } else if (i3 == 2) {
                account = (Account) v.M(parcel, readInt, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = v.G1(parcel, readInt);
            } else if (i3 != 4) {
                v.i2(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) v.M(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new zat(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
