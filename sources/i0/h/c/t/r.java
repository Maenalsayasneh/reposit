package i0.h.c.t;

import com.google.firebase.messaging.FirebaseMessaging;
import i0.h.a.b.m.e;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class r implements e {
    public final FirebaseMessaging a;

    public r(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public void onSuccess(Object obj) {
        boolean z;
        s0 s0Var = (s0) obj;
        if (this.a.k.b()) {
            if (s0Var.k.a() != null) {
                synchronized (s0Var) {
                    z = s0Var.j;
                }
                if (!z) {
                    s0Var.g(0);
                }
            }
        }
    }
}
