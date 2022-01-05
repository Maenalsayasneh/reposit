package i0.e.b.g3.u.y5;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ReportProfileLegacyViewModel.kt */
public final class d0 implements c {
    public final Uri a;

    public d0(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.a = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && i.a(this.a, ((d0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("AddPhoto(uri=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
