package i0.h.a.b.c.i;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import i0.h.a.b.g.e.b;
import i0.h.a.b.g.e.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public interface g extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static abstract class a extends i0.h.a.b.g.e.a implements g {

        /* renamed from: i0.h.a.b.c.i.g$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
        public static class C0134a extends b implements g {
            public C0134a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account a() throws RemoteException {
                Parcel d0 = d0(2, L());
                Account account = (Account) c.a(d0, Account.CREATOR);
                d0.recycle();
                return account;
            }
        }

        @RecentlyNonNull
        public static g d0(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof g) {
                return (g) queryLocalInterface;
            }
            return new C0134a(iBinder);
        }
    }

    @RecentlyNonNull
    Account a() throws RemoteException;
}
