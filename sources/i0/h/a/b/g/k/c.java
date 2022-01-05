package i0.h.a.b.g.k;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.wallet.zzi;
import com.google.android.gms.internal.wallet.zzk;
import com.google.android.gms.internal.wallet.zzm;
import com.google.android.gms.internal.wallet.zzo;
import com.google.android.gms.internal.wallet.zzq;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.zzan;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public class c extends Binder implements IInterface {
    public c() {
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        l lVar = (l) this;
        boolean z = false;
        switch (i) {
            case 1:
                parcel.readInt();
                MaskedWallet maskedWallet = (MaskedWallet) d.a(parcel, MaskedWallet.CREATOR);
                Bundle bundle = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 2:
                parcel.readInt();
                FullWallet fullWallet = (FullWallet) d.a(parcel, FullWallet.CREATOR);
                Bundle bundle2 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i3 = d.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                lVar.y(readInt, z, (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                parcel.readInt();
                Bundle bundle3 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 6:
                parcel.readInt();
                int i4 = d.a;
                parcel.readInt();
                Bundle bundle4 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 7:
                Status status = (Status) d.a(parcel, Status.CREATOR);
                zzi zzi = (zzi) d.a(parcel, zzi.CREATOR);
                Bundle bundle5 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 8:
                Status status2 = (Status) d.a(parcel, Status.CREATOR);
                Bundle bundle6 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 9:
                Status status3 = (Status) d.a(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                lVar.q(status3, z, (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Status status4 = (Status) d.a(parcel, Status.CREATOR);
                zzk zzk = (zzk) d.a(parcel, zzk.CREATOR);
                Bundle bundle7 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 11:
                Status status5 = (Status) d.a(parcel, Status.CREATOR);
                Bundle bundle8 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 12:
                Status status6 = (Status) d.a(parcel, Status.CREATOR);
                zzan zzan = (zzan) d.a(parcel, zzan.CREATOR);
                Bundle bundle9 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 13:
                Status status7 = (Status) d.a(parcel, Status.CREATOR);
                Bundle bundle10 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 14:
                lVar.R((Status) d.a(parcel, Status.CREATOR), (PaymentData) d.a(parcel, PaymentData.CREATOR), (Bundle) d.a(parcel, Bundle.CREATOR));
                return true;
            case 15:
                Status status8 = (Status) d.a(parcel, Status.CREATOR);
                zzq zzq = (zzq) d.a(parcel, zzq.CREATOR);
                Bundle bundle11 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 16:
                Status status9 = (Status) d.a(parcel, Status.CREATOR);
                zzm zzm = (zzm) d.a(parcel, zzm.CREATOR);
                Bundle bundle12 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 17:
                Status status10 = (Status) d.a(parcel, Status.CREATOR);
                zzo zzo = (zzo) d.a(parcel, zzo.CREATOR);
                Bundle bundle13 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            case 18:
                parcel.readInt();
                Bundle bundle14 = (Bundle) d.a(parcel, Bundle.CREATOR);
                return true;
            default:
                return false;
        }
    }
}
