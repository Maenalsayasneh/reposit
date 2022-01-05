package i0.h.a.b.c.i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzc;
import h0.b0.v;
import i0.h.a.b.c.i.b;
import i0.h.a.b.g.e.c;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public interface h extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
    public static abstract class a extends i0.h.a.b.g.e.a implements h {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        public final boolean L(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            RootTelemetryConfiguration rootTelemetryConfiguration;
            if (i == 1) {
                ((b.j) this).d0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                parcel.readInt();
                Bundle bundle = (Bundle) c.a(parcel, Bundle.CREATOR);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            } else if (i != 3) {
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                zzc zzc = (zzc) c.a(parcel, zzc.CREATOR);
                b.j jVar = (b.j) this;
                b bVar = jVar.a;
                v.A(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                Objects.requireNonNull(zzc, "null reference");
                bVar.v = zzc;
                if (bVar instanceof i0.h.a.b.g.k.b) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzc.x;
                    m a = m.a();
                    if (connectionTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = null;
                    } else {
                        rootTelemetryConfiguration = connectionTelemetryConfiguration.c;
                    }
                    synchronized (a) {
                        if (rootTelemetryConfiguration == null) {
                            a.c = m.b;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = a.c;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.c < rootTelemetryConfiguration.c) {
                                a.c = rootTelemetryConfiguration;
                            }
                        }
                    }
                }
                jVar.d0(readInt, readStrongBinder, zzc.c);
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
