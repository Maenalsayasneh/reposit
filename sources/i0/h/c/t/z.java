package i0.h.c.t;

import android.os.Bundle;
import android.util.Log;
import i0.h.a.b.m.a;
import i0.h.a.b.m.g;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class z implements a {
    public final a0 a;

    public z(a0 a0Var) {
        this.a = a0Var;
    }

    public Object a(g gVar) {
        Objects.requireNonNull(this.a);
        Bundle bundle = (Bundle) gVar.k(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null || (string = bundle.getString("unregistered")) != null) {
                return string;
            }
            String string2 = bundle.getString("error");
            if ("RST".equals(string2)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string2 != null) {
                throw new IOException(string2);
            } else {
                String valueOf = String.valueOf(bundle);
                Log.w("FirebaseMessaging", i0.d.a.a.a.y0(new StringBuilder(valueOf.length() + 21), "Unexpected response: ", valueOf), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
