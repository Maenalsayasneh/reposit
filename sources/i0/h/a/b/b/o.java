package i0.h.a.b.b;

import android.os.Bundle;
import com.google.android.gms.cloudmessaging.zzp;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class o extends q<Void> {
    public o(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            b(new zzp(4, "Invalid response to one way request"));
        }
    }

    public final boolean d() {
        return true;
    }
}
