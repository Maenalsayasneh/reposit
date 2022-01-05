package i0.h.a.b.a.a.d.b;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import i0.h.a.b.g.a.b;
import i0.h.a.b.g.a.d;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public abstract class n extends b implements o {
    public n() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public final boolean L(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) d.a(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) d.a(parcel, Status.CREATOR);
                throw new UnsupportedOperationException();
            case 102:
                n((Status) d.a(parcel, Status.CREATOR));
                break;
            case 103:
                u((Status) d.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
