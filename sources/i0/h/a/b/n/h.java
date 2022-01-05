package i0.h.a.b.n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import i0.h.a.b.c.g.j.l;
import i0.h.a.b.g.k.a;
import i0.h.a.b.g.k.b;
import i0.h.a.b.g.k.d;
import i0.h.a.b.g.k.k;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final /* synthetic */ class h implements l {
    public final /* synthetic */ PaymentDataRequest a;

    public /* synthetic */ h(PaymentDataRequest paymentDataRequest) {
        this.a = paymentDataRequest;
    }

    public final void a(Object obj, Object obj2) {
        Parcel obtain;
        PaymentDataRequest paymentDataRequest = this.a;
        b bVar = (b) obj;
        Bundle C = bVar.C();
        C.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        a aVar = new a((i0.h.a.b.m.h) obj2);
        try {
            k kVar = (k) bVar.u();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(kVar.b);
            d.b(obtain, paymentDataRequest);
            d.b(obtain, C);
            obtain.writeStrongBinder(aVar);
            kVar.a.transact(19, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e);
            aVar.R(Status.q, (PaymentData) null, Bundle.EMPTY);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
