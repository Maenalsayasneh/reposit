package i0.h.a.b.g.k;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public interface m extends IInterface {
    void R(Status status, PaymentData paymentData, Bundle bundle) throws RemoteException;

    void q(Status status, boolean z, Bundle bundle) throws RemoteException;

    void y(int i, boolean z, Bundle bundle) throws RemoteException;
}
