package i0.h.c.t;

import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class q implements Runnable {
    public final FirebaseMessaging c;

    public q(FirebaseMessaging firebaseMessaging) {
        this.c = firebaseMessaging;
    }

    public void run() {
        FirebaseMessaging firebaseMessaging = this.c;
        if (firebaseMessaging.k.b()) {
            firebaseMessaging.g();
        }
    }
}
