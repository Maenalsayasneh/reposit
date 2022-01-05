package i0.h.c.t;

import com.google.firebase.messaging.FirebaseMessaging;
import i0.h.a.b.m.h;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class s implements Runnable {
    public final FirebaseMessaging c;
    public final h d;

    public s(FirebaseMessaging firebaseMessaging, h hVar) {
        this.c = firebaseMessaging;
        this.d = hVar;
    }

    public void run() {
        FirebaseMessaging firebaseMessaging = this.c;
        h hVar = this.d;
        Objects.requireNonNull(firebaseMessaging);
        try {
            hVar.a.q(firebaseMessaging.a());
        } catch (Exception e) {
            hVar.a.p(e);
        }
    }
}
