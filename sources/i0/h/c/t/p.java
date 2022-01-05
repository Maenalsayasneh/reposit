package i0.h.c.t;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class p implements FirebaseInstanceIdInternal.a {
    public final FirebaseMessaging a;

    public p(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public void a(String str) {
        this.a.e(str);
    }
}
