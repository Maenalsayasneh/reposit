package i0.h.a.b.a.a.d.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import h0.b0.v;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class s implements Parcelable.Creator<SignInConfiguration> {
    public final Object createFromParcel(Parcel parcel) {
        int r2 = v.r2(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < r2) {
            int readInt = parcel.readInt();
            int i = 65535 & readInt;
            if (i == 2) {
                str = v.N(parcel, readInt);
            } else if (i != 5) {
                v.i2(parcel, readInt);
            } else {
                googleSignInOptions = (GoogleSignInOptions) v.M(parcel, readInt, GoogleSignInOptions.CREATOR);
            }
        }
        v.a0(parcel, r2);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
