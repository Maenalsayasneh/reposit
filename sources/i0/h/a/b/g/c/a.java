package i0.h.a.b.g.c;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import i0.h.a.b.c.g.j.d0;
import i0.h.a.b.c.g.j.e0;
import i0.h.a.b.k.b.d;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class a extends Binder implements IInterface {
    public a(String str) {
        attachInterface(this, str);
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        boolean z;
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            return true;
        }
        d dVar = (d) this;
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) c.a(parcel, ConnectionResult.CREATOR);
                zaa zaa = (zaa) c.a(parcel, zaa.CREATOR);
                break;
            case 4:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                d0 d0Var = (d0) dVar;
                d0Var.c.post(new e0(d0Var, (zak) c.a(parcel, zak.CREATOR)));
                break;
            case 9:
                zai zai = (zai) c.a(parcel, zai.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
