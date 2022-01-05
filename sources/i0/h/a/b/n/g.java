package i0.h.a.b.n;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import h0.b0.v;
import i0.h.a.b.c.g.j.l;
import i0.h.a.b.g.k.b;
import i0.h.a.b.g.k.d;
import i0.h.a.b.g.k.k;
import i0.h.a.b.g.k.o;
import i0.h.a.b.m.h;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final /* synthetic */ class g implements l {
    public final /* synthetic */ IsReadyToPayRequest a;

    public /* synthetic */ g(IsReadyToPayRequest isReadyToPayRequest) {
        this.a = isReadyToPayRequest;
    }

    public final void a(Object obj, Object obj2) {
        Parcel obtain;
        IsReadyToPayRequest isReadyToPayRequest = this.a;
        b bVar = (b) obj;
        Objects.requireNonNull(bVar);
        o oVar = new o((h) obj2);
        try {
            k kVar = (k) bVar.u();
            Bundle C = bVar.C();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(kVar.b);
            d.b(obtain, isReadyToPayRequest);
            d.b(obtain, C);
            obtain.writeStrongBinder(oVar);
            kVar.a.transact(14, obtain, (Parcel) null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Status status = Status.q;
            Bundle bundle = Bundle.EMPTY;
            v.X1(status, Boolean.FALSE, oVar.a);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
