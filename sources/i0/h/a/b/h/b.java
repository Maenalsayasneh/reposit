package i0.h.a.b.h;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h0.b0.v;
import i0.h.a.b.g.g.d;
import i0.h.a.b.h.f.a;
import i0.h.a.b.h.f.n;
import i0.h.a.b.h.f.o;
import java.util.Objects;

public final class b {
    public static boolean a = false;

    public static synchronized int a(Context context) {
        synchronized (b.class) {
            v.A(context, "Context is null");
            if (a) {
                return 0;
            }
            try {
                o a2 = n.a(context);
                try {
                    a S = a2.S();
                    Objects.requireNonNull(S, "null reference");
                    i0.h.a.b.c.m.b.b = S;
                    d B = a2.B();
                    if (i0.h.a.b.c.m.b.c == null) {
                        Objects.requireNonNull(B, "null reference");
                        i0.h.a.b.c.m.b.c = B;
                    }
                    a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.c;
            }
        }
    }
}
