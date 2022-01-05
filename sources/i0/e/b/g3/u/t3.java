package i0.e.b.g3.u;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: EditPhotoViewModel.kt */
public final class t3 implements c {
    public final Uri a;

    public t3(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        this.a = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && i.a(this.a, ((t3) obj).a);
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
