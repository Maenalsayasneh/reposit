package i0.e.b.e3;

import com.clubhouse.android.notifications.PushListenerService;
import com.google.firebase.messaging.FirebaseMessagingService;
import j0.a.a.c.c.g;

/* compiled from: Hilt_PushListenerService */
public abstract class b extends FirebaseMessagingService implements j0.a.b.b {
    public volatile g Z1;
    public final Object a2 = new Object();
    public boolean b2 = false;

    public final Object U() {
        if (this.Z1 == null) {
            synchronized (this.a2) {
                if (this.Z1 == null) {
                    this.Z1 = new g(this);
                }
            }
        }
        return this.Z1.U();
    }

    public void onCreate() {
        if (!this.b2) {
            this.b2 = true;
            ((e) U()).a((PushListenerService) this);
        }
        super.onCreate();
    }
}
