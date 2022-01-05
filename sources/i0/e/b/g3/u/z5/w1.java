package i0.e.b.g3.u.z5;

import com.clubhouse.android.data.models.local.notification.NotificationPause;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: SettingsViewModel.kt */
public final class w1 implements c {
    public final NotificationPause a;

    public w1(NotificationPause notificationPause) {
        i.e(notificationPause, "pauseTill");
        this.a = notificationPause;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && this.a == ((w1) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateNotificationPause(pauseTill=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
