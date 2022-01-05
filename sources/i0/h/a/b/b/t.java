package i0.h.a.b.b;

import android.os.Bundle;
import android.util.Log;
import i0.h.a.b.m.a;
import i0.h.a.b.m.g;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final /* synthetic */ class t implements a {
    public static final a a = new t();

    public final Object a(g gVar) {
        int i = b.a;
        if (gVar.n()) {
            return (Bundle) gVar.j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(gVar.i());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", gVar.i());
    }
}
