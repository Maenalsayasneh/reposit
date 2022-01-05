package i0.h.a.b.c.g.j;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zau;
import com.google.android.gms.signin.internal.zak;
import i0.h.a.b.c.g.j.f;
import i0.h.a.b.c.i.g;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class e0 implements Runnable {
    public final /* synthetic */ zak c;
    public final /* synthetic */ d0 d;

    public e0(d0 d0Var, zak zak) {
        this.d = d0Var;
        this.c = zak;
    }

    public final void run() {
        d0 d0Var = this.d;
        zak zak = this.c;
        Objects.requireNonNull(d0Var);
        ConnectionResult connectionResult = zak.d;
        if (connectionResult.I0()) {
            zau zau = zak.q;
            Objects.requireNonNull(zau, "null reference");
            ConnectionResult connectionResult2 = zau.q;
            if (!connectionResult2.I0()) {
                String valueOf = String.valueOf(connectionResult2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                ((f.c) d0Var.h).b(connectionResult2);
                d0Var.g.g();
                return;
            }
            g0 g0Var = d0Var.h;
            g I0 = zau.I0();
            Set<Scope> set = d0Var.e;
            f.c cVar = (f.c) g0Var;
            Objects.requireNonNull(cVar);
            if (I0 == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                cVar.b(new ConnectionResult(4));
            } else {
                cVar.c = I0;
                cVar.d = set;
                if (cVar.e) {
                    cVar.a.b(I0, set);
                }
            }
        } else {
            ((f.c) d0Var.h).b(connectionResult);
        }
        d0Var.g.g();
    }
}
