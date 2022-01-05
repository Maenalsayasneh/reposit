package i0.h.a.b.a.a.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class g implements Parcelable.Creator<SignInAccount> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = "";
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = str;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 4) {
                str = v.N(parcel, readInt);
            } else if (i == 7) {
                googleSignInAccount = (GoogleSignInAccount) v.M(parcel, readInt, GoogleSignInAccount.CREATOR);
            } else if (i != 8) {
                v.i2(parcel, readInt);
            } else {
                str2 = v.N(parcel, readInt);
            }
        }
        v.a0(parcel, r2);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
