package i0.h.c.t;

import com.google.firebase.messaging.FirebaseMessaging;
import i0.h.c.n.a;
import i0.h.c.n.b;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class u implements b {
    public final FirebaseMessaging.a a;

    public u(FirebaseMessaging.a aVar) {
        this.a = aVar;
    }

    public void a(a aVar) {
        FirebaseMessaging.a aVar2 = this.a;
        if (aVar2.b()) {
            FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
            n0 n0Var = FirebaseMessaging.b;
            firebaseMessaging.g();
        }
    }
}
