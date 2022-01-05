package i0.h.c.t;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import i0.h.a.b.m.a;
import i0.h.a.b.m.g;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class t implements a {
    public final FirebaseMessaging a;
    public final String b;

    public t(FirebaseMessaging firebaseMessaging, String str) {
        this.a = firebaseMessaging;
        this.b = str;
    }

    public Object a(g gVar) {
        g<TContinuationResult> gVar2;
        String str;
        FirebaseMessaging firebaseMessaging = this.a;
        String str2 = this.b;
        j0 j0Var = firebaseMessaging.j;
        synchronized (j0Var) {
            gVar2 = j0Var.b.get(str2);
            if (gVar2 == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf = String.valueOf(str2);
                    if (valueOf.length() != 0) {
                        str = "Making new request for: ".concat(valueOf);
                    } else {
                        str = new String("Making new request for: ");
                    }
                    Log.d("FirebaseMessaging", str);
                }
                a0 a0Var = firebaseMessaging.i;
                gVar2 = a0Var.a(a0Var.b((String) gVar.j(), f0.b(a0Var.a), "*", new Bundle())).h(j0Var.a, new i0(j0Var, str2));
                j0Var.b.put(str2, gVar2);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(str2);
                Log.d("FirebaseMessaging", valueOf2.length() != 0 ? "Joining ongoing request for: ".concat(valueOf2) : new String("Joining ongoing request for: "));
            }
        }
        return gVar2;
    }
}
